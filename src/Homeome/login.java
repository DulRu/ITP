/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Homeome;

import java.awt.Color;
import java.awt.color.*;
import Homeome.loginvalid;
import db_connect.dbconnect;
import Inventory1.I_Main;
import Maintaince.M_Main;
import Order_management.main;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import Order_management.validation;
import ToinEmp.empMain;
import cashier.Cashier2;
import chef.Chef;
import delivery.management.DeliveryMain;
import static javax.swing.JOptionPane.showMessageDialog;
import security_managment.Main;


/**
 *
 * @author Ganador
 */
public class login extends javax.swing.JFrame {

    static PreparedStatement pst = null;
    static PreparedStatement pst2 = null;
   // PreparedStatement pst1 = null;
    static ResultSet rs = null;
    static ResultSet rs2 = null;
    static Connection con= dbconnect.connect();
    public login() {
        initComponents();
        user.setBackground(new Color(0,0,0,0));
        pwd.setBackground(new Color(0,0,0,0));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        close = new javax.swing.JLabel();
        pwd = new javax.swing.JPasswordField();
        sign = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Homeome/download.png"))); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeMouseExited(evt);
            }
        });
        getContentPane().add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, -1, -1));

        pwd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pwd.setForeground(new java.awt.Color(255, 255, 255));
        pwd.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pwd.setBorder(null);
        getContentPane().add(pwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 280, 50));

        sign.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Homeome/sign2.png"))); // NOI18N
        sign.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signMouseExited(evt);
            }
        });
        getContentPane().add(sign, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 163, 280, 50));

        user.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        user.setForeground(new java.awt.Color(255, 255, 255));
        user.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        user.setBorder(null);
        getContentPane().add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 280, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Homeome/new login.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void signMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signMouseEntered
        sign.setIcon(new javax.swing.ImageIcon(getClass().getResource("sign.png")));
    }//GEN-LAST:event_signMouseEntered

    private void signMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signMouseExited
        sign.setIcon(new javax.swing.ImageIcon(getClass().getResource("sign2.png")));
    }//GEN-LAST:event_signMouseExited

    private void signMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signMouseClicked
        String Uname=user.getText();
        String Pass=pwd.getText();
        
        if(Uname.isEmpty()){
            showMessageDialog(null,"please enter user name!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if(Pass.isEmpty()){
            showMessageDialog(null,"please enter password!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if(loginvalid.validate_login(Uname,Pass)==1){
             empMain m = new empMain();
             m.setVisible(true);
             this.dispose();
        }
        else if(loginvalid.validate_login(Uname,Pass)==2){
             main ord = new main();
             ord.setVisible(true);
             this.dispose();
        }
        else if(loginvalid.validate_login(Uname,Pass)==3){
             M_Main main = new M_Main();
             main.setVisible(true);
             this.dispose();
        }
        else if(loginvalid.validate_login(Uname,Pass)==4){
             I_Main main1 = new I_Main();
             main1.setVisible(true);
             this.dispose();
        }
        
        else if(loginvalid.validate_login(Uname,Pass)==5){
             DeliveryMain Dmain = new DeliveryMain();
             Dmain.setVisible(true);
             this.dispose();
        }

        else if(loginvalid.validate_login(Uname,Pass)==6){
             Main smain = new Main();
             smain.setVisible(true);
             this.dispose();
        }

        else if(loginvalid.validate_login(Uname,Pass)==7){
             Chef cmain = new Chef();
             cmain.setVisible(true);
             this.dispose();
        }

        else if(loginvalid.validate_login(Uname,Pass)==8){
             Cashier2 ca_main = new Cashier2();
             ca_main.setVisible(true);
             this.dispose();
        }
        else{
          
            showMessageDialog(null,"Login failed!", "Error", JOptionPane.ERROR_MESSAGE);
      
        }
        
        
//         
       
    }//GEN-LAST:event_signMouseClicked

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
       this.dispose();
    }//GEN-LAST:event_closeMouseClicked

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
         close.setIcon(new javax.swing.ImageIcon(getClass().getResource("download2.png")));
    }//GEN-LAST:event_closeMouseEntered

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
         close.setIcon(new javax.swing.ImageIcon(getClass().getResource("download.png")));
    }//GEN-LAST:event_closeMouseExited

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel close;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField pwd;
    private javax.swing.JLabel sign;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
