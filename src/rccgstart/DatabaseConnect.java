/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rccgstart;
import java.io.File;
import java.io.FileFilter;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TOBILOBA
 */
public class DatabaseConnect {
     Connection connection = null;
     DatabaseMetaData dmd;
     ResultSet result;
     PreparedStatement pStatement;
     public static String currentAdmin = "";
     String currentPassword ="";
     public DatabaseConnect(){
     try{
            Class.forName("org.h2.Driver");
            connection = DriverManager.getConnection("jdbc:h2:~/test", "admin", "admin");
            // JOptionPane.showMessageDialog(null, "Database Connection Successful!");
        }
        catch(ClassNotFoundException | SQLException el){
            JOptionPane.showMessageDialog(null, el.toString());
        }
    }
    public void createAdminTable(){
         try {
             dmd = connection.getMetaData();
             result = dmd.getTables(null, null, "ADMIN_TABLE", null);
             if(result.next()){
                 // Do Nothing Because it means the the table already exists 
                 //JOptionPane.showMessageDialog(null, "ADMIN_TABLE Exists");
             } else {
                 String createAdminTable = "create table ADMIN_TABLE ("
                         + "username varchar2(50), " 
                         + "password varchar2(12))";
                 pStatement = connection.prepareStatement(createAdminTable);
                 pStatement.executeUpdate();
                 JOptionPane.showMessageDialog(null, "Admin_Table Created Successfully");
             }
         } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Member_Table Was Not Created Successfully" + e);
         }
    }
     
     public void createMemberTable(){
        try{
             dmd = connection.getMetaData();
             result = dmd.getTables(null, null, "MEMBER_TABLE", null);
             if(result.next()){
                 // Do Nothing Because it means the the table already exists 
                 //JOptionPane.showMessageDialog(null, "Member_Table Exists");
             } else {
                 String createMemberTable = "create table MEMBER_TABLE ("
                         + "name varchar_IGNORECASE(50), " 
                         + "sex varchar_IGNORECASE(12), "
                         + "phone varchar_IGNORECASE(20), "
                         + "address varchar_IGNORECASE(250), "
                         + "dob varchar_IGNORECASE(30), "
                         + "occupation varchar_IGNORECASE(30))";
                 
                 pStatement = connection.prepareStatement(createMemberTable);
                 pStatement.executeUpdate();
                 JOptionPane.showMessageDialog(null, "Member_Table Created Successfully");
             }
         } catch (Exception e){
             //Handle exception code
             JOptionPane.showMessageDialog(null, "Member_Table Was Not Created Successfully" + e);
         }
     }
     
     public boolean adminValidate(String username, String password){
         try {
             String validate = "select * from ADMIN_TABLE where username=? and password=?";
             pStatement = connection.prepareStatement(validate);
             pStatement.setString(1, username);
             pStatement.setString(2, password);
             result = pStatement.executeQuery();
             if (result.next()){
                 //JOptionPane.showMessageDialog(null, "Admin Logged In Successfully");
                 currentAdmin = username;
                 currentPassword = password;
                 new Welcome().setVisible(true);
                 return true;
             }
             else {
                 JOptionPane.showMessageDialog(null, "Invalid Username & Password combination");
                 return false;
             }
         } catch (Exception e){
             //Handle exception code
             JOptionPane.showMessageDialog(null, e);
             return false;
         }
     }
     
     public void addAdminQuery(String username, String password){
         try {
             System.out.println("Current Admin: " + currentAdmin);
             if((username.length()<= 0 || password.length() <= 0)){
                 JOptionPane.showMessageDialog(null, "Admin username and password fields cannot be empty");
                 return;
             }
             String checkFirst = "select * from ADMIN_TABLE where username=? and password=?";
             pStatement = connection.prepareStatement(checkFirst);
             pStatement.setString(1, username);
             pStatement.setString(2, password);
             result = pStatement.executeQuery();
             if (result.next()){
                 JOptionPane.showMessageDialog(null, "An Admin with the same credentials already exists");
             } else {
                 String query = "insert into ADMIN_TABLE values(?,?)";
                 pStatement = connection.prepareStatement(query);
                 pStatement.setString(1, username);
                 pStatement.setString(2, password);
                 int success = pStatement.executeUpdate();
                 if (success > 0){
                     JOptionPane.showMessageDialog(null, "New admin created successfully");
                 } else {
                     JOptionPane.showMessageDialog(null, "Unable to create new admin");
                 }
             }
             
         } catch (Exception e){
             JOptionPane.showMessageDialog(null, "Unable to create new admin" + e);
         }
     }
     
     public void updatePassword(String newPassword, String username){
         try{
             String query = "update ADMIN_TABLE SET password=? WHERE username=?";
              System.out.println(username);
             pStatement = connection.prepareStatement(query);
             pStatement.setString(1, newPassword);
             pStatement.setString(2, username);
             //pStatement.setString(3, currentPassword);
             int success = pStatement.executeUpdate();
             if (success > 0) {
                 JOptionPane.showMessageDialog(null, "Password Updated Successfully!");
             } else {
                 JOptionPane.showMessageDialog(null, "Password Could Not Be Updated");
             }
         } catch(SQLException e){
             JOptionPane.showMessageDialog(null, e);
         }
     }
     
     
     public boolean addNewMember(String name, String sex, String phone, String address, String dob, String occupation){
         try {
             String checkFirst = "select * from MEMBER_TABLE where name=? and sex=? and phone=? and address=? and dob=? and occupation=?";
             pStatement = connection.prepareStatement(checkFirst);
             pStatement.setString(1, name);
             pStatement.setString(2, sex);
             pStatement.setString(3, phone);
             pStatement.setString(4, address);
             pStatement.setString(5, dob);
             pStatement.setString(6, occupation);
             result = pStatement.executeQuery();
             if (result.next()){
                 JOptionPane.showMessageDialog(null, "This Member Already Exists");
                 return false;
             } else {
                 String query = "insert into MEMBER_TABLE values(?,?,?,?,?,?)";
                 pStatement = connection.prepareStatement(query);
                pStatement.setString(1, name);
                pStatement.setString(2, sex);
                pStatement.setString(3, phone);
                pStatement.setString(4, address);
                pStatement.setString(5, dob);
                pStatement.setString(6, occupation);
                 int success = pStatement.executeUpdate();
                 if (success > 0){
                     JOptionPane.showMessageDialog(null, "New Member Added successfully");
                     new addNewMember().setVisible(false);
                     new viewAllMembers().setVisible(true);
                     return true;
                 } else {
                     JOptionPane.showMessageDialog(null, "Unable To Add New Member");
                     return false;
                 }
             }
             
         } catch (Exception e){
             JOptionPane.showMessageDialog(null, "Unable To Add New Member" + e);
         }
         return false;
     }
     
    public void showAllMembers(JTable table){
        String query = "select * from MEMBER_TABLE";
        try{
            pStatement = connection.prepareStatement(query);
            result = pStatement.executeQuery();
            while(table.getRowCount() > 0) {
                ((DefaultTableModel) table.getModel()).removeRow(0);
            }
            int columns = result.getMetaData().getColumnCount();
            while(result.next()){
            Object[] row = new Object[columns];
            for (int i = 1; i <= columns; i++)
            {  
                row[i - 1] = result.getObject(i);
            }
            ((DefaultTableModel) table.getModel()).insertRow(result.getRow()-1,row);
            }
            result.close();
            pStatement.close();
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error Occured: " + e);
        }
    }
      
    public void refreshDB(JTable table){
        showAllMembers(table);
    }
    
    public String openFile(){
        FileNameExtensionFilter fft = new FileNameExtensionFilter("CSV files", "csv", "xlsx");
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Select an Excel File to Upload");
        fileChooser.addChoosableFileFilter(fft);
        if(fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION){
            File chosenFile = fileChooser.getSelectedFile();
            return chosenFile.getAbsolutePath();
        } else {
            return "No file selected";
        }
    }
    
    public int searchRecord(String query, String keyWord, String searchField, JTable table){
        int rows = 0;
        try{
            pStatement = connection.prepareStatement(query);
            pStatement.setString(1, "%" + keyWord + "%");
            result = pStatement.executeQuery();
            while(table.getRowCount() > 0) {
                ((DefaultTableModel) table.getModel()).removeRow(0);
            }
            int columns = result.getMetaData().getColumnCount();
            while(result.next()){
            Object[] row = new Object[columns];
            for (int i = 1; i <= columns; i++)
            {  
                row[i - 1] = result.getObject(i);
            }
            ((DefaultTableModel) table.getModel()).insertRow(result.getRow()-1,row);
            }
            result.close();
            pStatement.close();
            rows =table.getRowCount();
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error Occured: " + e);
        }
        return rows;
    }
}