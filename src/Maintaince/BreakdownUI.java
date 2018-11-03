package Maintaince;

import db_connect.dbconnect;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import net.proteanit.sql.DbUtils;
import MTfunction.mtfunction;
import MTfunction.mtvalidation;
import emp_Login.YLogin;
import java.util.Date;
import static javax.swing.JOptionPane.showMessageDialog;

//import MTfunction.mtvalidation;
/**
 *
 * @author Dulangi Rathnayaka
 */

public class BreakdownUI extends javax.swing.JFrame {
    //db connect    
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;//table click
    
    public BreakdownUI() {
        initComponents();
        
        //db connect
        con = dbconnect.connect();
        BreakdownID.setText(mtfunction.getNextID("BID", "breakdown", "BD", con)); //primary key auto increment
   
    
    
        
        //tableload
        tableload();
    }

     public void tableload(){
    
    try{
    
        String sql = "SELECT * FROM breakdown";
        pst = con.prepareStatement(sql);
        rs = pst.executeQuery();
        

    }catch (Exception e) {
            System.out.println(e);
        }
    }
     
     //email validation
      public int checkemail(){
          int x=1;
            String Emaill = EmpEmail.getText();
            String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
            if((!Emaill.matches(ePattern))&&(!Emaill.isEmpty())){
                   x=0;
               }
               return x;
      }
    
    //refresh
      public void clearfield(){
            MachineID.setText(null);
            EmployeeID.setText(null);
            EmpEmail.setText(null);
            BreakdownID.setText(mtfunction.getNextID("BID", "breakdown", "BD", con)); //primary key auto increment
            MachineType.setSelectedIndex(0);
            Description.setText(null);
            date1.setDate(null);
      
      
      }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        MachineID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Description = new javax.swing.JTextArea();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        EmployeeID = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        EmpEmail = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        MachineType = new javax.swing.JComboBox();
        BreakdownID = new javax.swing.JLabel();
        date1 = new com.toedter.calendar.JDateChooser();
        jPanel9 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(300, 150));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(750, 500));

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Enter Broken Machine Details ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 240, 29));

        MachineID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                MachineIDFocusLost(evt);
            }
        });
        MachineID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MachineIDActionPerformed(evt);
            }
        });
        jPanel1.add(MachineID, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 261, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Machine ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 119, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Description");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 100, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Employee ID");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 119, -1));

        Description.setColumns(20);
        Description.setRows(5);
        jScrollPane1.setViewportView(Description);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 261, 40));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Machine Type");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 100, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Date");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 100, -1));

        EmployeeID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                EmployeeIDFocusLost(evt);
            }
        });
        EmployeeID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmployeeIDActionPerformed(evt);
            }
        });
        jPanel1.add(EmployeeID, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 261, -1));

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel2MouseExited(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Send");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 40, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, 200, 40));

        jPanel8.setBackground(new java.awt.Color(0, 51, 51));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel8MouseExited(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Cancel");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel23)
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel23)
                .addContainerGap())
        );

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, 200, 40));

        jPanel7.setBackground(new java.awt.Color(0, 51, 51));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel7MouseExited(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Refresh");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel22)
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel22)
                .addContainerGap())
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 280, 200, 40));

        EmpEmail.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
                EmpEmailAncestorRemoved(evt);
            }
        });
        EmpEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                EmpEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                EmpEmailFocusLost(evt);
            }
        });
        EmpEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EmpEmailMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                EmpEmailMouseReleased(evt);
            }
        });
        EmpEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpEmailActionPerformed(evt);
            }
        });
        jPanel1.add(EmpEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 261, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 51, 51));
        jLabel24.setText("Breakdown ID");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 110, -1));

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Emp Email");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 119, -1));

        MachineType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Machine Type", "Canteen", "Cutting", "Finishing", "Office", "Other", "Security", "Sewing" }));
        MachineType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MachineTypeActionPerformed(evt);
            }
        });
        jPanel1.add(MachineType, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 260, -1));

        BreakdownID.setForeground(new java.awt.Color(0, 51, 51));
        jPanel1.add(BreakdownID, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 470, 160, 20));
        jPanel1.add(date1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, 260, -1));

        jPanel9.setBackground(new java.awt.Color(0, 51, 51));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel9MouseExited(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Logout");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel26)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel26)
                .addContainerGap())
        );

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 410, 100, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 748, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MachineIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MachineIDActionPerformed
         EmployeeID.grabFocus();
    }//GEN-LAST:event_MachineIDActionPerformed

    private void EmployeeIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmployeeIDActionPerformed
        EmpEmail.grabFocus();
    }//GEN-LAST:event_EmployeeIDActionPerformed

    private void jPanel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseClicked
        this.dispose();
    }//GEN-LAST:event_jPanel8MouseClicked

    private void jPanel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseEntered
        jPanel2.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_jPanel2MouseEntered

    private void jPanel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseEntered
        jPanel8.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_jPanel8MouseEntered

    private void jPanel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseExited
         jPanel8.setBackground(new Color(0,51,51));
    }//GEN-LAST:event_jPanel8MouseExited

    private void jPanel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseEntered
        jPanel7.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_jPanel7MouseEntered

    private void jPanel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseExited
        jPanel7.setBackground(new Color(0,51,51));
    }//GEN-LAST:event_jPanel7MouseExited

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        String mid = MachineID.getText();
        String EID = EmployeeID.getText();
        String email = EmpEmail.getText();
        String bid = BreakdownID.getText();
        String mtype = MachineType.getSelectedItem().toString();
        String description = Description.getText();
        Date Date1=date1.getDate();
        String designation=null;
        
       
        if(mid.isEmpty() || EID.isEmpty() || email.isEmpty() || mtype.isEmpty() || description.isEmpty() ||  Date1==null){
        
            showMessageDialog(null,"Enter all essential data!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
                  
            try{
                
        int Eid = Integer.parseInt(EID);       
        String sql= "SELECT * FROM employee WHERE eid = '"+Eid+"'";
        pst = con.prepareStatement(sql);
        rs = pst.executeQuery();
        
        while(rs.next()){
            designation=rs.getString("desig");
        }
        if(designation.isEmpty()){
            showMessageDialog(null, "Employee is not in database", "Error", JOptionPane.ERROR_MESSAGE);
        
        }
        
        
        else if(designation.equals("Maintainer") || designation.equals("Order Manager") || designation.equals("Delivery Manager") || designation.equals("Manager"))
        {
           
        
                 SimpleDateFormat dateformat =new SimpleDateFormat("yyyy-MM-dd");
                 String date = dateformat.format(date1.getDate());
                 String c = "INSERT INTO breakdown (MID,EID,email,BID,Mtype,description,date) VALUES ('"+mid+"', '"+EID+"', '"+email+"','"+bid+"', '"+mtype+"', '"+description+"', '"+date+"')";
                 pst = con.prepareStatement(c);
                 pst.execute();
                 BreakdownID.setText(mtfunction.getNextID("BID", "breakdown", "BD", con)); //primary key auto increment

                //load table
                 tableload();
            
                 showMessageDialog(null, "Succesfully send.");

         
        }
         else{
            showMessageDialog(null, "Invalid Employee ID.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        }catch (Exception e) {
            showMessageDialog(null, e);
        }
            
                   
        
        }
    

                
        
            
           
    }//GEN-LAST:event_jPanel2MouseClicked

    private void jPanel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseExited
        jPanel2.setBackground(new Color(0,51,51));
    }//GEN-LAST:event_jPanel2MouseExited

    private void EmpEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpEmailActionPerformed
      MachineType.grabFocus();
    }//GEN-LAST:event_EmpEmailActionPerformed

    private void jPanel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseClicked
         //refresh
        clearfield();
            
        tableload();
    }//GEN-LAST:event_jPanel7MouseClicked

    private void MachineTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MachineTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MachineTypeActionPerformed

    private void EmpEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EmpEmailFocusLost
         //email vali
              if(checkemail()==0)
                {
                   showMessageDialog(null,"invalied email");
                   EmpEmail.setText(null);
               } 
    }//GEN-LAST:event_EmpEmailFocusLost

    private void EmployeeIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EmployeeIDFocusLost

    }//GEN-LAST:event_EmployeeIDFocusLost

    private void EmpEmailMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmpEmailMouseExited
        
    }//GEN-LAST:event_EmpEmailMouseExited

    private void EmpEmailMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmpEmailMouseReleased
        
    }//GEN-LAST:event_EmpEmailMouseReleased

    private void EmpEmailAncestorRemoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_EmpEmailAncestorRemoved
       
    }//GEN-LAST:event_EmpEmailAncestorRemoved

    private void EmpEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EmpEmailFocusGained
       
    }//GEN-LAST:event_EmpEmailFocusGained

    private void MachineIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_MachineIDFocusLost
         String Mid = MachineID.getText();
         
        if(!Mid.isEmpty()){
            
            if(mtvalidation.isavailable(Mid)==0){
            showMessageDialog(null, "This Machine is not exists!", "Error", JOptionPane.ERROR_MESSAGE);
                        MachineID.setText(null);
            }
        }
    }//GEN-LAST:event_MachineIDFocusLost

    private void jPanel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseClicked

        YLogin id = new YLogin();
        id.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jPanel9MouseClicked

    private void jPanel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseEntered
        jPanel9.setBackground(new Color(200,0,0));
    }//GEN-LAST:event_jPanel9MouseEntered

    private void jPanel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseExited
        jPanel9.setBackground(new Color(0,51,51));
    }//GEN-LAST:event_jPanel9MouseExited

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
            java.util.logging.Logger.getLogger(BreakdownUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BreakdownUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BreakdownUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BreakdownUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BreakdownUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BreakdownID;
    private javax.swing.JTextArea Description;
    private javax.swing.JTextField EmpEmail;
    private javax.swing.JTextField EmployeeID;
    private javax.swing.JTextField MachineID;
    private javax.swing.JComboBox MachineType;
    private com.toedter.calendar.JDateChooser date1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
