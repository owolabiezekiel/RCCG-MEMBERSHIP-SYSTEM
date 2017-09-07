/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rccgstart;

/**
 *
 * @author TOBILOBA
 */
public class adminArea extends javax.swing.JFrame {

    /**
     * Creates new form adminArea
     */
    public adminArea() {
        initComponents();
        addAdminPanel.setVisible(false);
       
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

        backToWelcome = new javax.swing.JButton();
        addAdminPanel = new javax.swing.JPanel();
        newAdminUsername = new javax.swing.JTextField();
        newAdminPass = new javax.swing.JTextField();
        createAdmin = new javax.swing.JButton();
        passwordLabel = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        updatePassLabel = new javax.swing.JLabel();
        passwordUpdate = new javax.swing.JTextField();
        updatePassword = new javax.swing.JButton();
        addAdminButton = new javax.swing.JButton();
        editAdminButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(300, 100));
        setResizable(false);

        backToWelcome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        backToWelcome.setText("Back");
        backToWelcome.setToolTipText("Back to welcome page");
        backToWelcome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToWelcomeActionPerformed(evt);
            }
        });

        addAdminPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        newAdminUsername.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        newAdminPass.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        createAdmin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        createAdmin.setText("Add Admin");
        createAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAdminActionPerformed(evt);
            }
        });

        passwordLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        passwordLabel.setText("Password");

        userLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        userLabel.setText("Username");

        updatePassLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        updatePassLabel.setText("Update Current Admin Password");

        passwordUpdate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        updatePassword.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        updatePassword.setText("Update Password");
        updatePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatePasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addAdminPanelLayout = new javax.swing.GroupLayout(addAdminPanel);
        addAdminPanel.setLayout(addAdminPanelLayout);
        addAdminPanelLayout.setHorizontalGroup(
            addAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addAdminPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(addAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(newAdminUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                        .addComponent(newAdminPass)
                        .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(userLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(addAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addAdminPanelLayout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(addAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(addAdminPanelLayout.createSequentialGroup()
                                .addComponent(passwordUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(24, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addAdminPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(updatePassLabel)
                                .addGap(47, 47, 47))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addAdminPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(updatePassword)
                        .addGap(76, 76, 76))))
            .addGroup(addAdminPanelLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(createAdmin)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        addAdminPanelLayout.setVerticalGroup(
            addAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addAdminPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(addAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updatePassLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(passwordUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(newAdminUsername))
                .addGap(5, 5, 5)
                .addGroup(addAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updatePassword))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newAdminPass, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(createAdmin)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        addAdminButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        addAdminButton.setText("Add New Admin");
        addAdminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAdminButtonActionPerformed(evt);
            }
        });

        editAdminButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        editAdminButton.setText("Edit Admin Properties");
        editAdminButton.setToolTipText("change admin password");
        editAdminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editAdminButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(addAdminButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(editAdminButton)
                .addGap(78, 78, 78))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backToWelcome)
                    .addComponent(addAdminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(194, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addAdminButton)
                    .addComponent(editAdminButton))
                .addGap(18, 18, 18)
                .addComponent(addAdminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(backToWelcome)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addAdminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAdminButtonActionPerformed
        // TODO add your handling code here:
        addAdminPanel.setVisible(true);
        hideEditAdminProperties();
        showAddNewAdmin();
    }//GEN-LAST:event_addAdminButtonActionPerformed

    private void editAdminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editAdminButtonActionPerformed
        // TODO add your handling code here:
        addAdminPanel.setVisible(true);
         hideAddNewAdmin();
        showEditAdminProperties();
    }//GEN-LAST:event_editAdminButtonActionPerformed

    private void backToWelcomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToWelcomeActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Welcome().setVisible(true);
    }//GEN-LAST:event_backToWelcomeActionPerformed

    private void createAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAdminActionPerformed
        // TODO add your handling code here:
        dbconnect.addAdminQuery(newAdminUsername.getText(), newAdminPass.getText());
    }//GEN-LAST:event_createAdminActionPerformed

    private void updatePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatePasswordActionPerformed
        // TODO add your handling code here:
        dbconnect.updatePassword(passwordUpdate.getText(), dbconnect.currentAdmin);
    }//GEN-LAST:event_updatePasswordActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(adminArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminArea().setVisible(true);
            }
        });
    }
     public void hideAddNewAdmin(){
         userLabel.setVisible(false);
         newAdminUsername.setVisible(false);
         passwordLabel.setVisible(false);
         newAdminPass.setVisible(false);
         createAdmin.setVisible(false);                 
     }
     public void hideEditAdminProperties(){
         passwordUpdate.setVisible(false);
         updatePassword.setVisible(false);
         updatePassLabel.setVisible(false);
     }
     
     public void showAddNewAdmin(){
         userLabel.setVisible(true);
         newAdminUsername.setVisible(true);
         passwordLabel.setVisible(true);
         newAdminPass.setVisible(true);
         createAdmin.setVisible(true);                 
     }
     public void showEditAdminProperties(){
         passwordUpdate.setVisible(true);
         updatePassword.setVisible(true);
         updatePassLabel.setVisible(true);
     }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addAdminButton;
    private javax.swing.JPanel addAdminPanel;
    private javax.swing.JButton backToWelcome;
    private javax.swing.JButton createAdmin;
    private javax.swing.JButton editAdminButton;
    private javax.swing.JTextField newAdminPass;
    private javax.swing.JTextField newAdminUsername;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JTextField passwordUpdate;
    private javax.swing.JLabel updatePassLabel;
    private javax.swing.JButton updatePassword;
    private javax.swing.JLabel userLabel;
    // End of variables declaration//GEN-END:variables
}
