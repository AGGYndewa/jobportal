/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobportal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author super
 */
public class SignUp extends javax.swing.JFrame {

    /**
     * Creates new form SignUp
     */
    public SignUp() {
        initComponents();
    }
     Connection conn=null;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        passwordl = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        edu = new javax.swing.JTextField();
        phonenumber = new javax.swing.JTextField();
        fullname = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        address = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        fullname1 = new javax.swing.JTextField();
        passwords = new javax.swing.JPasswordField();
        passwords1 = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 102, 51));
        jPanel1.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("LOGIN");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(60, 40, 270, 80);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("PASSWORD:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(30, 280, 110, 50);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("USERNAME:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(20, 160, 110, 50);
        jPanel1.add(username);
        username.setBounds(50, 210, 290, 50);

        jButton2.setText("LOGIN");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(210, 440, 130, 50);
        jPanel1.add(passwordl);
        passwordl.setBounds(50, 350, 300, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 10, 390, 520);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SIGN UP");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(490, 30, 270, 80);

        jLabel2.setText("EDUCATIONAL LEVEL:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(430, 200, 190, 40);

        jLabel3.setText("PHONE NUMBER:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(450, 390, 190, 40);

        jLabel5.setText("CONFIRM PASSWORD:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(690, 210, 190, 40);
        getContentPane().add(edu);
        edu.setBounds(440, 250, 200, 30);

        phonenumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phonenumberActionPerformed(evt);
            }
        });
        getContentPane().add(phonenumber);
        phonenumber.setBounds(450, 440, 200, 30);

        fullname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullnameActionPerformed(evt);
            }
        });
        getContentPane().add(fullname);
        fullname.setBounds(440, 160, 200, 30);

        jButton1.setText("SIGN UP");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(780, 470, 120, 50);
        getContentPane().add(address);
        address.setBounds(450, 340, 200, 40);

        jLabel4.setText("ADDRESS:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(440, 290, 190, 40);

        jLabel9.setText("FULL NAME:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(430, 120, 190, 40);

        fullname1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullname1ActionPerformed(evt);
            }
        });
        getContentPane().add(fullname1);
        fullname1.setBounds(440, 160, 200, 30);
        getContentPane().add(passwords);
        passwords.setBounds(690, 250, 200, 40);
        getContentPane().add(passwords1);
        passwords1.setBounds(690, 160, 200, 40);

        jLabel10.setText("PASSWORD:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(680, 120, 190, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fullnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fullnameActionPerformed

    private void phonenumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phonenumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phonenumberActionPerformed

    private void fullname1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullname1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fullname1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // TODO add your handling code here:
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/job","root","");
            String sql="INSERT INTO user(FullName,EducationalLevel,Address,PhoneNumber,Password) VALUES(?,?,?,?,?)";
            PreparedStatement pst=conn.prepareStatement(sql);
            pst.setString(1,fullname.getText());
            pst.setString(2,edu.getText());
            pst.setString(3,address.getText());
            pst.setString(4,phonenumber.getText());
            pst.setString(5,passwords.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Registered Succesfuly");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
      try{
 
           conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/job","root","");
        String sql="SELECT*FROM user WHERE FullName=? AND Password=?";
            PreparedStatement pst=conn.prepareStatement(sql);
            pst.setString(1,username.getText());
            pst.setString(2,passwordl.getText());
            ResultSet rs=pst.executeQuery();
            if(rs.next())
            {
                  JOptionPane.showMessageDialog(null,"Login sucessfully");
            }
            else{
                JOptionPane.showMessageDialog(null,"Password or  is wrong");            }
          
        } catch (Exception ex) {
           JOptionPane.showMessageDialog(null,ex);   
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JTextField edu;
    private javax.swing.JTextField fullname;
    private javax.swing.JTextField fullname1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField passwordl;
    private javax.swing.JPasswordField passwords;
    private javax.swing.JPasswordField passwords1;
    private javax.swing.JTextField phonenumber;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}