/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rccgstart;


import java.io.IOException;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author TOBILOBA
 */
public class viewAllMembers extends javax.swing.JFrame {

    /**
     * Creates new form viewAllMembers
     */
    public viewAllMembers() {
        initComponents();
        dbconnect.showAllMembers(membersTable);
        numOfRecords.setEditable(false);
        upload.setVisible(false);
        deleteWord.setText("Where " + deleteCriteria.getSelectedItem() +" is....");
    }
    
    DatabaseConnect dbconnect = new DatabaseConnect();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        membersTable = new javax.swing.JTable();
        memberDashboard = new javax.swing.JLabel();
        close = new javax.swing.JButton();
        addNewMember = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        searchCriteria = new javax.swing.JComboBox<>();
        searchPhrase = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        search = new javax.swing.JButton();
        back = new javax.swing.JButton();
        numOfRecords = new javax.swing.JTextField();
        selectFile = new javax.swing.JButton();
        fileName = new javax.swing.JTextField();
        upload = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        uploadLabel = new javax.swing.JLabel();
        exportDatabase = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        deleteMemberLabel = new javax.swing.JLabel();
        deleteCriteria = new javax.swing.JComboBox<>();
        deleteWord = new javax.swing.JLabel();
        deletePhrase = new javax.swing.JTextField();
        delete = new javax.swing.JButton();
        logout = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1240, 590));
        setPreferredSize(new java.awt.Dimension(1240, 590));
        setSize(new java.awt.Dimension(1240, 590));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        membersTable.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)))));
        membersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Sex", "Phone", "Address", "Date-of-Birth", "Occupation"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(membersTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 103, 823, -1));

        memberDashboard.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        memberDashboard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        memberDashboard.setText("All Members Dashoard");
        getContentPane().add(memberDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 830, 70));

        close.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        close.setText("Close");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        getContentPane().add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 540, 100, 40));

        addNewMember.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        addNewMember.setText("Add New Member");
        addNewMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewMemberActionPerformed(evt);
            }
        });
        getContentPane().add(addNewMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 540, 153, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Find A Member By:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 10, 151, 34));

        searchCriteria.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        searchCriteria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Name", "Phone Number", "Address", "DateOf Birth", "Sex", "Occupation" }));
        getContentPane().add(searchCriteria, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 50, 170, 29));

        searchPhrase.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        searchPhrase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchPhraseActionPerformed(evt);
            }
        });
        getContentPane().add(searchPhrase, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 150, 170, 32));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Search Keyword");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 110, 151, 27));

        search.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        getContentPane().add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 200, -1, 31));

        back.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, 100, 40));

        numOfRecords.setBackground(new java.awt.Color(204, 204, 204));
        numOfRecords.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        numOfRecords.setFocusCycleRoot(true);
        numOfRecords.setFocusTraversalPolicyProvider(true);
        numOfRecords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numOfRecordsActionPerformed(evt);
            }
        });
        getContentPane().add(numOfRecords, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 270, 190, 32));

        selectFile.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        selectFile.setText("Select File");
        selectFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectFileActionPerformed(evt);
            }
        });
        getContentPane().add(selectFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 410, 99, 30));

        fileName.setEditable(false);
        fileName.setText("Select a file.......");
        fileName.setAlignmentX(1.0F);
        getContentPane().add(fileName, new org.netbeans.lib.awtextra.AbsoluteConstraints(845, 370, 180, 30));

        upload.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        upload.setText("Upload");
        upload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadActionPerformed(evt);
            }
        });
        getContentPane().add(upload, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 450, -1, 30));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 320, 190, -1));

        uploadLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        uploadLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        uploadLabel.setText("<html>Upload to database from an Excel File");
        getContentPane().add(uploadLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(845, 320, 180, 50));

        exportDatabase.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        exportDatabase.setText("Export to Excel");
        exportDatabase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportDatabaseActionPerformed(evt);
            }
        });
        getContentPane().add(exportDatabase, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 540, 130, 40));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 0, 10, 590));

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 0, -1, 590));

        deleteMemberLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        deleteMemberLabel.setText("Delete Member By:");
        getContentPane().add(deleteMemberLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 20, 130, -1));

        deleteCriteria.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        deleteCriteria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Name", "Phone Number", "Address", "DateOf Birth", "Sex", "Occupation" }));
        deleteCriteria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteCriteriaActionPerformed(evt);
            }
        });
        getContentPane().add(deleteCriteria, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 50, 170, 29));

        deleteWord.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        deleteWord.setText("Delete Keyword");
        getContentPane().add(deleteWord, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 100, 180, 27));

        deletePhrase.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        deletePhrase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletePhraseActionPerformed(evt);
            }
        });
        getContentPane().add(deletePhrase, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 140, 170, 32));

        delete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        getContentPane().add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 200, -1, 31));

        logout.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        getContentPane().add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 540, 100, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Welcome().setVisible(true);
    }//GEN-LAST:event_closeActionPerformed

    private void addNewMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewMemberActionPerformed
        this.setVisible(false);
        new addNewMember().setVisible(true);
    }//GEN-LAST:event_addNewMemberActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        this.setVisible(false);
        new Welcome().setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        String searchField = searchCriteria.getSelectedItem().toString();
        String query = "";
        String keyWord = searchPhrase.getText();
        switch (searchField) {
            case "Name":
                query = "Select * from MEMBER_TABLE where name LIKE ?";
                break;
            case "Sex":
                query = "Select * from MEMBER_TABLE where sex = ?";
                break;
            case "Phone Number":
                query = "Select * from MEMBER_TABLE where phone like ?";
                break;
            case "Address":
                query = "Select * from MEMBER_TABLE where address like ?";
                break;
            case "Occupation":
                query = "Select * from MEMBER_TABLE where occupation like ?";
                break;
            default:
                query = "Select * from MEMBER_TABLE where dob like ?";
                break;
        }
        int numRows = dbconnect.searchRecord(query, keyWord, searchField, membersTable);
        if (numRows == 1)
            numOfRecords.setText("Found " + numRows + " record");
        else
        numOfRecords.setText("Found " + numRows + " records");
    }//GEN-LAST:event_searchActionPerformed

    private void searchPhraseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchPhraseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchPhraseActionPerformed

    private void numOfRecordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numOfRecordsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numOfRecordsActionPerformed

    private void selectFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectFileActionPerformed
        String file = dbconnect.openFile();
        upload.setVisible(true);
        fileName.setText(file);
    }//GEN-LAST:event_selectFileActionPerformed

    private void uploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadActionPerformed
       try{
           dbconnect.importExcel();
       } catch(Exception e) {
           JOptionPane.showMessageDialog(null, e.toString());
       }
    }//GEN-LAST:event_uploadActionPerformed

    private void exportDatabaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportDatabaseActionPerformed
        try {
            dbconnect.exportDatabase();
        } catch (IOException | SQLException e){
            System.out.println(e);
        }
    //new ExportNameAndType().setVisible(true);
    }//GEN-LAST:event_exportDatabaseActionPerformed

    private void deletePhraseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletePhraseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deletePhraseActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        String criteria = deleteCriteria.getSelectedItem().toString();
        String query;
        String deleteString = deletePhrase.getText();
        switch (criteria) {
            case "Name":
                query = "Delete from MEMBER_TABLE where name = ?";
                break;
            case "Sex":
                query = "Delete from MEMBER_TABLE where sex = ?";
                break;
            case "Phone Number":
                query = "Delete from MEMBER_TABLE where phone = ?";
                break;
            case "Address":
                query = "Delete from MEMBER_TABLE where address = ?";
                break;
            case "Occupation":
                query = "Delete from MEMBER_TABLE where occupation = ?";
                break;
            default:
                query = "Delete from MEMBER_TABLE where dob = ?";
                break;
        }
        try {
            dbconnect.deleteMember(query, criteria, deleteString, membersTable);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void deleteCriteriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteCriteriaActionPerformed
        deleteWord.setText("Where " + deleteCriteria.getSelectedItem() +" is....");
    }//GEN-LAST:event_deleteCriteriaActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        this.setVisible(false);
        new MainPage().setVisible(true);
    }//GEN-LAST:event_logoutActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                 if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                } 
                
                
            } 
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(viewAllMembers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewAllMembers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewAllMembers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewAllMembers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new viewAllMembers().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addNewMember;
    private javax.swing.JButton back;
    private javax.swing.JButton close;
    private javax.swing.JButton delete;
    private javax.swing.JComboBox<String> deleteCriteria;
    private javax.swing.JLabel deleteMemberLabel;
    private javax.swing.JTextField deletePhrase;
    private javax.swing.JLabel deleteWord;
    private javax.swing.JButton exportDatabase;
    private javax.swing.JTextField fileName;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton logout;
    private javax.swing.JLabel memberDashboard;
    private javax.swing.JTable membersTable;
    private javax.swing.JTextField numOfRecords;
    private javax.swing.JButton search;
    private javax.swing.JComboBox<String> searchCriteria;
    private javax.swing.JTextField searchPhrase;
    private javax.swing.JButton selectFile;
    private javax.swing.JButton upload;
    private javax.swing.JLabel uploadLabel;
    // End of variables declaration//GEN-END:variables
}
