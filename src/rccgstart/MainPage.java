/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rccgstart;
import javax.swing.JOptionPane;



/**
 *
 * @author TOBILOBA
 * @version 1.0
 */
public class MainPage extends javax.swing.JFrame {

    /**
     * Creates new form MainPage
     */
   
    public MainPage() {
        initComponents();
        this.setVisible(true);
        adminLoginPanel.setVisible(false);
         dbconnect.createAdminTable();
         dbconnect.createMemberTable();
         boolean firstTime = dbconnect.isFirstTime();
         if (firstTime){
             dbconnect.addFirstAdmin();
         }
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

        welcomeText = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        iAmAnAdmin = new javax.swing.JButton();
        adminLoginPanel = new javax.swing.JPanel();
        adminUsername = new javax.swing.JLabel();
        adminPassword = new javax.swing.JLabel();
        adminUserField = new javax.swing.JTextField();
        adminSignIn = new javax.swing.JButton();
        adminPassField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(300, 100));
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 700));

        welcomeText.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        welcomeText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcomeText.setText("Welcome To RCCG Memberhip System");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Are you an admin? (only an admin can use this system)");

        iAmAnAdmin.setText("I am an admin, Sign me in");
        iAmAnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iAmAnAdminActionPerformed(evt);
            }
        });

        adminLoginPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        adminUsername.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        adminUsername.setText("Admin Username");

        adminPassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        adminPassword.setText("Admin Password");

        adminUserField.setToolTipText("Admin Username");

        adminSignIn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        adminSignIn.setText("Sign me in");
        adminSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminSignInActionPerformed(evt);
            }
        });

        adminPassField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminPassFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout adminLoginPanelLayout = new javax.swing.GroupLayout(adminLoginPanel);
        adminLoginPanel.setLayout(adminLoginPanelLayout);
        adminLoginPanelLayout.setHorizontalGroup(
            adminLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminLoginPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(adminLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(adminSignIn)
                    .addGroup(adminLoginPanelLayout.createSequentialGroup()
                        .addGroup(adminLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(adminUsername)
                            .addComponent(adminPassword))
                        .addGap(45, 45, 45)
                        .addGroup(adminLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(adminUserField)
                            .addComponent(adminPassField, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE))))
                .addGap(79, 79, 79))
        );
        adminLoginPanelLayout.setVerticalGroup(
            adminLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminLoginPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(adminLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminUserField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminUsername))
                .addGap(30, 30, 30)
                .addGroup(adminLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminPassword)
                    .addComponent(adminPassField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(adminSignIn)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(95, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(welcomeText, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(adminLoginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(iAmAnAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(84, 84, 84))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(welcomeText, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(iAmAnAdmin)
                .addGap(18, 18, 18)
                .addComponent(adminLoginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iAmAnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iAmAnAdminActionPerformed
        // TODO add your handling code here:
        adminLoginPanel.setVisible(true);
        
    }//GEN-LAST:event_iAmAnAdminActionPerformed

    private void adminSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminSignInActionPerformed
        // TODO add your handling code here:
         boolean state = dbconnect.adminValidate(adminUserField.getText(), adminPassField.getText().toString());
         if (state){
             dbconnect.currentAdmin = adminUserField.getText();
             this.setVisible(false);
             System.out.println("Current Admin: " + dbconnect.currentAdmin);
         }
         
    }//GEN-LAST:event_adminSignInActionPerformed

    private void adminPassFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminPassFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminPassFieldActionPerformed

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
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel adminLoginPanel;
    private javax.swing.JPasswordField adminPassField;
    private javax.swing.JLabel adminPassword;
    private javax.swing.JButton adminSignIn;
    private javax.swing.JTextField adminUserField;
    private javax.swing.JLabel adminUsername;
    private javax.swing.JButton iAmAnAdmin;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel welcomeText;
    // End of variables declaration//GEN-END:variables
}

