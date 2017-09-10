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
 */
public final class addNewMember extends javax.swing.JFrame {

    /**
     * Creates new form addNewMember
     */
    public addNewMember() {
        initComponents();
        populateDate();
    }
    
    DatabaseConnect dbconnect = new DatabaseConnect();
     public void populateDate(){
        for(int i=1; i <= 31; i++){
           selectDay.addItem(i);
        }
        for(int i=2017; i >= 1950; i--){
            selectYear.addItem(i);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addNewMember = new javax.swing.JLabel();
        newName = new javax.swing.JLabel();
        newSex = new javax.swing.JLabel();
        newAddress = new javax.swing.JLabel();
        newPhone = new javax.swing.JLabel();
        newDOB = new javax.swing.JLabel();
        newOccupation = new javax.swing.JLabel();
        newNameField = new javax.swing.JTextField();
        newPhoneField = new javax.swing.JTextField();
        newAddressField = new javax.swing.JTextField();
        newOccuField = new javax.swing.JTextField();
        addNewMenber = new javax.swing.JButton();
        day = new javax.swing.JLabel();
        selectDay = new javax.swing.JComboBox<>();
        month = new javax.swing.JLabel();
        selectMonth = new javax.swing.JComboBox<>();
        year = new javax.swing.JLabel();
        selectYear = new javax.swing.JComboBox<>();
        selectSex = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        addNewMember.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        addNewMember.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addNewMember.setText("Add A New Member");

        newName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        newName.setText("Name");

        newSex.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        newSex.setText("Sex");

        newAddress.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        newAddress.setText("Address");

        newPhone.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        newPhone.setText("Phone Number");

        newDOB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        newDOB.setText("Date-Of-Birth");

        newOccupation.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        newOccupation.setText("Occupation");

        newNameField.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        newPhoneField.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        newAddressField.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        newOccuField.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        addNewMenber.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        addNewMenber.setText("Add Member");
        addNewMenber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewMenberActionPerformed(evt);
            }
        });

        day.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        day.setText("Date");

        selectDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectDayActionPerformed(evt);
            }
        });

        month.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        month.setText("Month");

        selectMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        year.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        year.setText("Year");

        selectSex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        selectSex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectSexActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(addNewMember, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(newName, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(newSex, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(newAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(newPhone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(newDOB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(newOccupation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(newNameField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(newAddressField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(newPhoneField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(newOccuField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(day)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(selectDay, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(month)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(selectMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(year)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(selectYear, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(selectSex, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(addNewMenber, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(152, 152, 152))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addNewMember, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(newName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newSex, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectSex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newPhoneField, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newAddressField, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(day)
                        .addComponent(year)
                        .addComponent(month)
                        .addComponent(selectDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(selectMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(selectYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(newDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newOccuField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newOccupation, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(addNewMenber, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addNewMenberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewMenberActionPerformed

        String name = newNameField.getText();
        String sex = selectSex.getSelectedItem().toString();
        String phone = newPhoneField.getText();
        String address = newAddressField.getText();
        String dob = selectDay.getSelectedItem().toString() + "-" + selectMonth.getSelectedItem();
        dob += "-" + selectYear.getSelectedItem();
        String occupation = newOccuField.getText();
        if(name.length() <= 0 || phone.length() <= 0 || address.length() <= 0 || occupation.length() <= 0){
            JOptionPane.showMessageDialog(null, "No Field Must Be Left Empty");
            return;
        }
        dbconnect.addNewMember(name, sex, phone, address, dob, occupation);
        newNameField.setText("");
        newPhoneField.setText("");
        newAddressField.setText("");
        newOccuField.setText("");
    }//GEN-LAST:event_addNewMenberActionPerformed

    private void selectDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectDayActionPerformed

    }//GEN-LAST:event_selectDayActionPerformed

    private void selectSexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectSexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectSexActionPerformed

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
            java.util.logging.Logger.getLogger(addNewMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addNewMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addNewMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addNewMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new addNewMember().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addNewMember;
    private javax.swing.JButton addNewMenber;
    private javax.swing.JLabel day;
    private javax.swing.JLabel month;
    private javax.swing.JLabel newAddress;
    private javax.swing.JTextField newAddressField;
    private javax.swing.JLabel newDOB;
    private javax.swing.JLabel newName;
    private javax.swing.JTextField newNameField;
    private javax.swing.JTextField newOccuField;
    private javax.swing.JLabel newOccupation;
    private javax.swing.JLabel newPhone;
    private javax.swing.JTextField newPhoneField;
    private javax.swing.JLabel newSex;
    private javax.swing.JComboBox<Integer> selectDay;
    private javax.swing.JComboBox<String> selectMonth;
    private javax.swing.JComboBox<String> selectSex;
    private javax.swing.JComboBox<Integer> selectYear;
    private javax.swing.JLabel year;
    // End of variables declaration//GEN-END:variables
}
