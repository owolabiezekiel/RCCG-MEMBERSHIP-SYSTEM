/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rccgstart;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRichTextString;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

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
    private static String absolutePathhh;
    private static String extension;

    String currentPassword = "";

    public DatabaseConnect() {
        try {
            Class.forName("org.h2.Driver");
            connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
            // JOptionPane.showMessageDialog(null, "Database Connection Successful!");
        } catch (ClassNotFoundException | SQLException el) {
            JOptionPane.showMessageDialog(null, el.toString());
        }
    }

    public void createAdminTable() {
        try {
            dmd = connection.getMetaData();
            result = dmd.getTables(null, null, "ADMIN_TABLE", null);
            if (result.next()) {
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
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Member_Table Was Not Created Successfully" + e);
        }
    }

    public boolean isFirstTime() {
        try {
            String checkFirst = "select * from ADMIN_TABLE";
            pStatement = connection.prepareStatement(checkFirst);
            result = pStatement.executeQuery();
            if (result.next()) {
                System.out.printf("Admin Table is not empty");
                //JOptionPane.showMessageDialog(null, "There is one or more admin already");
                return false;
            } else {
                return true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Unable To Create Admin Table" + e);
        }
        return false;
    }

    public void addFirstAdmin() {
        try {
            String query = "insert into ADMIN_TABLE values(?,?)";
            pStatement = connection.prepareStatement(query);
            pStatement.setString(1, "admin");
            pStatement.setString(2, "admin");
            int success = pStatement.executeUpdate();
            if (success > 0) {
                JOptionPane.showMessageDialog(null, "first Admin created successfully with username and password 'admin'");
                //new addNewMember().setVisible(false);
                //new viewAllMembers().setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Unable To Add New Member");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Unable To Add New Member" + e);
        }
    }

    public void setExtension(String ext) {
        extension = ext;
    }

    public String getExtension() {
        return extension;
    }

    public void setAbsolutePathhh(String path) {
        absolutePathhh = path;
    }

    public String getAbsolutePathhh() {
        return absolutePathhh;
    }

    public void createMemberTable() {
        try {
            dmd = connection.getMetaData();
            result = dmd.getTables(null, null, "MEMBER_TABLE", null);
            if (result.next()) {
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
        } catch (SQLException e) {
            //Handle exception code
            JOptionPane.showMessageDialog(null, "Member_Table Was Not Created Successfully" + e);
        }
    }

    public boolean adminValidate(String username, String password) {
        try {
            String validate = "select * from ADMIN_TABLE where username=? and password=?";
            pStatement = connection.prepareStatement(validate);
            pStatement.setString(1, username);
            pStatement.setString(2, password);
            result = pStatement.executeQuery();
            if (result.next()) {
                //JOptionPane.showMessageDialog(null, "Admin Logged In Successfully");
                currentAdmin = username;
                currentPassword = password;
                new Welcome().setVisible(true);
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Invalid Username & Password combination");
                return false;
            }
        } catch (SQLException e) {
            //Handle exception code
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }

    public void addAdminQuery(String username, String password) {
        try {
            System.out.println("Current Admin: " + currentAdmin);
            if ((username.length() <= 0 || password.length() <= 0)) {
                JOptionPane.showMessageDialog(null, "Admin username and password fields cannot be empty");
                return;
            }
            String checkFirst = "select * from ADMIN_TABLE where username=? and password=?";
            pStatement = connection.prepareStatement(checkFirst);
            pStatement.setString(1, username);
            pStatement.setString(2, password);
            result = pStatement.executeQuery();
            if (result.next()) {
                JOptionPane.showMessageDialog(null, "An Admin with the same credentials already exists");
            } else {
                String query = "insert into ADMIN_TABLE values(?,?)";
                pStatement = connection.prepareStatement(query);
                pStatement.setString(1, username);
                pStatement.setString(2, password);
                int success = pStatement.executeUpdate();
                if (success > 0) {
                    JOptionPane.showMessageDialog(null, "New admin created successfully");
                } else {
                    JOptionPane.showMessageDialog(null, "Unable to create new admin");
                }
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Unable to create new admin" + e);
        }
    }

    public void updatePassword(String newPassword, String username) {
        try {
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
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public boolean addNewMember(String name, String sex, String phone, String address, String dob, String occupation) {
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
            if (result.next()) {
                System.out.printf("Already exists: %s\t\t%s\t%s\t%s\t\t%s\t%s\n", name, sex, phone, address, dob, occupation);
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
                if (success > 0) {
                    JOptionPane.showMessageDialog(null, "New Member Added successfully");
                    return true;
                } else {
                    JOptionPane.showMessageDialog(null, "Unable To Add New Member");
                    return false;
                }
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Unable To Add New Member" + e);
        }
        return false;
    }

    public void showAllMembers(JTable table) {
        String query = "select * from MEMBER_TABLE";
        try {
            pStatement = connection.prepareStatement(query);
            result = pStatement.executeQuery();
            while (table.getRowCount() > 0) {
                ((DefaultTableModel) table.getModel()).removeRow(0);
            }
            int columns = result.getMetaData().getColumnCount();
            while (result.next()) {
                Object[] row = new Object[columns];
                for (int i = 1; i <= columns; i++) {
                    row[i - 1] = result.getObject(i);
                }
                ((DefaultTableModel) table.getModel()).insertRow(result.getRow() - 1, row);
            }
            result.close();
            pStatement.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error Occured: " + e);
        }
    }

    public void refreshDB(JTable table) {
        showAllMembers(table);
    }

    public String openFile() {
        FileNameExtensionFilter fft = new FileNameExtensionFilter("CSV files", "csv", "xlsx", "xls");
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Select an Excel File to Upload");
        fileChooser.addChoosableFileFilter(fft);
        if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            File chosenFile = fileChooser.getSelectedFile();
            String absolutePath = chosenFile.getAbsolutePath();
            setExtension(absolutePath.substring(absolutePath.indexOf(".") + 1));
            setAbsolutePathhh(absolutePath);
            return chosenFile.getAbsolutePath();
        } else {
            return "No file selected";
        }
    }

    ////http://index-of.org/archives/957
    public int searchRecord(String query, String keyWord, String searchField, JTable table) {
        int rows = 0;
        try {
            pStatement = connection.prepareStatement(query);
            if (searchField.equals("Sex")) {
                pStatement.setString(1, keyWord);
            } else {
                pStatement.setString(1, "%" + keyWord + "%");
            }
            result = pStatement.executeQuery();
            while (table.getRowCount() > 0) {
                ((DefaultTableModel) table.getModel()).removeRow(0);
            }
            int columns = result.getMetaData().getColumnCount();
            while (result.next()) {
                Object[] row = new Object[columns];
                for (int i = 1; i <= columns; i++) {
                    row[i - 1] = result.getObject(i);
                }
                ((DefaultTableModel) table.getModel()).insertRow(result.getRow() - 1, row);
            }
            result.close();
            pStatement.close();
            rows = table.getRowCount();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error Occured: " + e);
        }
        return rows;
    }

    public void exportDatabase() throws IOException, SQLException, FileNotFoundException {
        try {
            Thread exportThread = new Thread() {
                public void run() {
                    System.out.println("Thread Started successfully");
                    try (XSSFWorkbook xlsWorkbook = new XSSFWorkbook()) {
                        System.out.println("WorkBook Created successfully");
                        XSSFSheet xlsSheet = xlsWorkbook.createSheet("Member Database");
                        short rowIndex = 0;

                        // Execute SQL query
                        PreparedStatement stmt = connection.prepareStatement("select * from MEMBER_TABLE");
                        ResultSet rs = stmt.executeQuery();

                        ResultSetMetaData colInfo = rs.getMetaData();
                        List<String> colNames = new ArrayList<>();
                        XSSFRow titleRow = xlsSheet.createRow(rowIndex++);
                        int colCount = colInfo.getColumnCount();
                        
                        System.out.println("Gotten Data from Database successfully");
                        for (int i = 1; i <= colCount; i++) {
                            colNames.add(colInfo.getColumnName(i));
                            titleRow.createCell((short) (i - 1)).setCellValue(
                                    new XSSFRichTextString(colInfo.getColumnName(i)));
                            xlsSheet.setColumnWidth((short) (i - 1), (short) 4000);
                        }
                        // Save all the data from the database table rows
                        System.out.println("Writing data to Excel file...");
                        while (rs.next()) {
                            XSSFRow dataRow = xlsSheet.createRow(rowIndex++);
                            short colIndex = 0;
                            for (String colName : colNames) {
                                dataRow.createCell(colIndex++).setCellValue(
                                        new XSSFRichTextString(rs.getString(colName)));
                            }
                        }
                        xlsWorkbook.write(new FileOutputStream(System.getProperty("user.home") + "\\Desktop\\rccgdatabasetoexcel.xlsx"));
                        
                    } catch (IOException | SQLException ex) {
                        Logger.getLogger(DatabaseConnect.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    System.out.println("rccgdatabasetoexcel.xlsx written successfully");
                    System.out.println("Thread ended successfully");
                }
            };
            exportThread.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void importExcel() throws Exception {
        FileInputStream file = new FileInputStream(getAbsolutePathhh());
        int numberOfMembers = 0;
        int numberOfDuplicates = 0;
        
        switch (extension) {
            case "xlsx": {
                XSSFWorkbook workbook = new XSSFWorkbook(file);  //create a new workbook from the file selected 
                XSSFSheet sheet = workbook.getSheetAt(0); // get the first sheet
                Row row;
                for (int i = 1; i <= sheet.getLastRowNum(); i++) {
                    row = sheet.getRow(i);
                    String name = row.getCell(0).getStringCellValue();
                    String sex = row.getCell(1).getStringCellValue();
                    String phone = row.getCell(2).getStringCellValue();
                    String address = row.getCell(3).getStringCellValue();
                    String dob = row.getCell(4).getStringCellValue();
                    String occupation = row.getCell(5).getStringCellValue();

                    if (!addNewMember(name, sex, phone, address, dob, occupation)) {
                        numberOfDuplicates++;
                    }
                    numberOfMembers++;
                }
                break;
            }
            case "xls": {
                HSSFWorkbook workbook = new HSSFWorkbook(file);  //create a new workbook from the file selected 
                HSSFSheet sheet = workbook.getSheetAt(0); // get the first sheet
                Row row;
                for (int i = 1; i <= sheet.getLastRowNum(); i++) {
                    row = sheet.getRow(i);
                    String name = row.getCell(0).getStringCellValue();
                    String sex = row.getCell(1).getStringCellValue();
                    String phone = row.getCell(2).getStringCellValue();
                    String address = row.getCell(3).getStringCellValue();
                    String dob = row.getCell(4).getStringCellValue();
                    String occupation = row.getCell(5).getStringCellValue();

                    if (!addNewMember(name, sex, phone, address, dob, occupation)) {
                        numberOfDuplicates++;
                    }
                    numberOfMembers++;
                }
                
                break;
            }
            
            
            default:
                JOptionPane.showMessageDialog(null, "Chosen file is not of a supported format. \nPlease make sure it is a"
                        + "Microsoft Excel file with extension of \"xlsx\" or \"xls\"");
                break;
        }
        JOptionPane.showMessageDialog(null, "Found " + numberOfMembers +" records and " + numberOfDuplicates + " duplicates");
    }

    public void deleteMember(String query, String criteria, String delKey, JTable table) throws Exception {
        pStatement = connection.prepareStatement(query);
        pStatement.setString(1, delKey);
        int success = pStatement.executeUpdate();
        if (success > 0) {
            JOptionPane.showMessageDialog(null, "Member record deleted successfully");
        } else {
            JOptionPane.showMessageDialog(null, "Member record failed to delete");
        }
        refreshDB(table);
    }
}
