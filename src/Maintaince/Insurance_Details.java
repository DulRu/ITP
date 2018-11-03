
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
import java.text.ParseException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.JOptionPane.showMessageDialog;
//import MTfunction.mtvalidation;
/**
 *
 * @author Dulangi Rathnayaka
 */
public class Insurance_Details extends javax.swing.JFrame {
//db connect    
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;//table click

    
    public Insurance_Details() {
        initComponents();
    
        
        //db connect
        con = dbconnect.connect();
        InsuranceCode.setText(mtfunction.getNextID("Insu_Code", "insurance", "I", con));//primary key auto increment
        
        
        //tableload
        tableload();
    }
    
    public void tableload(){
    
    try{
    
        String sql = "SELECT * FROM insurance";
        pst = con.prepareStatement(sql);
        rs = pst.executeQuery();
        
        InsuranceTable.setModel(DbUtils.resultSetToTableModel(rs));
    }catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void clearfield(){

        InsuranceCode.setText(mtfunction.getNextID("Insu_Code", "insurance", "I", con));//primary key auto increment
        MachineID.setText(null);
        InsuranceValue.setText(null);
        CompanyRegNo.setText(null);
        PolicyNo.setText(null);
        Premium.setText(null);
        date.setDate(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        InsuranceValue = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        CompanyRegNo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        PolicyNo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        Premium = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        InsuranceTable = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel7 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        InsuranceCode = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        InsuranceSearch = new javax.swing.JTextField();
        date = new com.toedter.calendar.JDateChooser();
        MachineID = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(231, 151));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Insurance code");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 119, 119, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("    Insurance Details");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, 183, 29));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Machine ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 157, 119, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Insurance Value");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 195, 119, -1));

        InsuranceValue.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        InsuranceValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsuranceValueActionPerformed(evt);
            }
        });
        jPanel1.add(InsuranceValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 195, 261, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Renewal Date");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 236, 119, -1));

        CompanyRegNo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CompanyRegNo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                CompanyRegNoFocusLost(evt);
            }
        });
        CompanyRegNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompanyRegNoActionPerformed(evt);
            }
        });
        jPanel1.add(CompanyRegNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 120, 261, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Company Register No.");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 120, 130, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Policy No:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 160, 119, -1));

        PolicyNo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PolicyNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PolicyNoActionPerformed(evt);
            }
        });
        jPanel1.add(PolicyNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 160, 261, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Premium");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 200, 119, -1));

        Premium.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Premium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PremiumActionPerformed(evt);
            }
        });
        jPanel1.add(Premium, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 200, 261, -1));

        InsuranceTable.setBackground(new java.awt.Color(102, 102, 102));
        InsuranceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Insurance Code", "Machine ID", "Insurance Value", "Renewal Date", "company", "Policy No.", "Premium"
            }
        ));
        InsuranceTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InsuranceTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(InsuranceTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 1090, 200));

        jSeparator1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 75, 1060, -1));

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel5MouseExited(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText(" Add");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel14)
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addContainerGap())
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 160, 40));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
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

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText(" Update");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 160, 40));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel3MouseExited(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText(" Delete");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, 160, 40));

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel6MouseExited(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Generate Report");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 340, 160, 40));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, 10, 230));

        jPanel7.setBackground(new java.awt.Color(51, 51, 51));
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
                .addGap(52, 52, 52)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 340, -1, 40));

        jPanel8.setBackground(new java.awt.Color(51, 51, 51));
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
                .addGap(52, 52, 52)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 340, -1, 40));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("<");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel15MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel15MouseExited(evt);
            }
        });
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, -1));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 210, -1));

        InsuranceCode.setForeground(new java.awt.Color(255, 255, 255));
        InsuranceCode.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(InsuranceCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 170, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Search by Machine ID/Insurance Code");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 60, 180, -1));

        InsuranceSearch.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        InsuranceSearch.setForeground(new java.awt.Color(51, 51, 51));
        InsuranceSearch.setText("Search");
        InsuranceSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsuranceSearchActionPerformed(evt);
            }
        });
        InsuranceSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                InsuranceSearchKeyReleased(evt);
            }
        });
        jPanel1.add(InsuranceSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 60, 220, 20));
        jPanel1.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 260, -1));

        MachineID.setForeground(new java.awt.Color(255, 255, 255));
        MachineID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(MachineID, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 170, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1128, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InsuranceValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsuranceValueActionPerformed
         date.grabFocus();
    }//GEN-LAST:event_InsuranceValueActionPerformed

    private void CompanyRegNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompanyRegNoActionPerformed
        PolicyNo.grabFocus();
    }//GEN-LAST:event_CompanyRegNoActionPerformed

    private void PolicyNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PolicyNoActionPerformed
        Premium.grabFocus();
    }//GEN-LAST:event_PolicyNoActionPerformed

    private void PremiumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PremiumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PremiumActionPerformed

    private void jPanel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseEntered
      jPanel5.setBackground(new Color (0,0,0));
    }//GEN-LAST:event_jPanel5MouseEntered

    private void jPanel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseExited
       jPanel5.setBackground(new Color (51,51,51));
    }//GEN-LAST:event_jPanel5MouseExited

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        String insu_code = InsuranceCode.getText();
        String mid = MachineID.getText();
        String insu_value = InsuranceValue.getText();
        String company = CompanyRegNo.getText();
        String policy_num = PolicyNo.getText();
        String premium = Premium.getText();
        Date Date1=date.getDate();
        
      
         if(mid.isEmpty() || insu_value.isEmpty() ||  Date1==null || company.isEmpty() || policy_num.isEmpty() || premium.isEmpty()){
        
            showMessageDialog(null,"Enter all essential data!", "Error", JOptionPane.ERROR_MESSAGE);
        }
         else if(mtvalidation.isdouble(insu_value)==0)
         {
             showMessageDialog(null,"Letters are not allowed Insurance Value field", "Error", JOptionPane.ERROR_MESSAGE);
             InsuranceValue.setText(null);
         }
         else if(mtvalidation.isdouble(premium)==0)
         {
             showMessageDialog(null,"Letters are not allowed Premium field", "Error", JOptionPane.ERROR_MESSAGE);
             Premium.setText(null);
         }
        else {
        
        try {
            SimpleDateFormat dateformat =new SimpleDateFormat("yyyy-MM-dd");
            String ren_date = dateformat.format(date.getDate());
            String d = "INSERT INTO insurance (Insu_Code,MID,Insu_value,Renewal_Date,Company,PolicyNo,Premium) VALUES ('"+insu_code+"','"+mid+"', '"+insu_value+"', '"+ren_date+"', '"+company+"', '"+policy_num+"', '"+premium+"')";
            pst = con.prepareStatement(d);
            pst.execute();
            InsuranceCode.setText(mtfunction.getNextID("Insu_Code", "insurance", "I", con));//primary key auto increment

            //load table
            tableload();
            
            JOptionPane.showMessageDialog(null, "Succesfully added.");

        } catch (Exception e) {
            showMessageDialog(null,e);
        }
         }
        //refresh
//            clearfield();
          
        
    }//GEN-LAST:event_jPanel5MouseClicked

    private void InsuranceTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InsuranceTableMouseClicked
       
         int r = InsuranceTable.getSelectedRow();
        
       String insu_code = InsuranceTable.getValueAt(r, 0).toString();
       String mid = InsuranceTable.getValueAt(r, 1).toString();
       String insu_value = InsuranceTable.getValueAt(r, 2).toString();
        try {
            date.setDate( new SimpleDateFormat("yyyy-MM-dd").parse(InsuranceTable.getValueAt(r, 3).toString()));
        } catch (ParseException ex) {
            Logger.getLogger(Insurance_Details.class.getName()).log(Level.SEVERE, null, ex);
        }
       String company = InsuranceTable.getValueAt(r, 4).toString();
       String policy_num = InsuranceTable.getValueAt(r, 5).toString();
       String premium = InsuranceTable.getValueAt(r, 6).toString();
        
        
        InsuranceCode.setText(insu_code);
        MachineID.setText(mid);
        InsuranceValue.setText(insu_value);
       
        CompanyRegNo.setText(company);
        PolicyNo.setText(policy_num);
        Premium.setText(premium);
        
    }//GEN-LAST:event_InsuranceTableMouseClicked

    private void jPanel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseClicked
        this.dispose();
    }//GEN-LAST:event_jPanel8MouseClicked

    private void jPanel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseEntered
       jPanel2.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_jPanel2MouseEntered

    private void jPanel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseEntered
       jPanel3.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_jPanel3MouseEntered

    private void jPanel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseEntered
       jPanel6.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_jPanel6MouseEntered

    private void jPanel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseEntered
       jPanel8.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_jPanel8MouseEntered

    private void jPanel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseEntered
        jPanel7.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_jPanel7MouseEntered

    private void jPanel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseExited
       jPanel2.setBackground(new Color (51,51,51));
    }//GEN-LAST:event_jPanel2MouseExited

    private void jPanel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseExited
        jPanel3.setBackground(new Color (51,51,51));
    }//GEN-LAST:event_jPanel3MouseExited

    private void jPanel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseExited
        jPanel6.setBackground(new Color (51,51,51));
    }//GEN-LAST:event_jPanel6MouseExited

    private void jPanel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseExited
        jPanel8.setBackground(new Color (51,51,51));
    }//GEN-LAST:event_jPanel8MouseExited

    private void jPanel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseExited
        jPanel7.setBackground(new Color (51,51,51));
    }//GEN-LAST:event_jPanel7MouseExited

    private void jPanel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseClicked
            //refresh
            
            tableload();
    }//GEN-LAST:event_jPanel7MouseClicked

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        //delete 
        int x = JOptionPane.showConfirmDialog(null,"Do you want to Delete this");
        
        if(x==0)
        {
            String insu_code = InsuranceCode.getText();
            
            String sql = "DELETE from insurance WHERE insu_code='"+insu_code+"'";
            
            try {
                
                pst = con.prepareStatement(sql);
                pst.execute();
                
                tableload();
                
                
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        
           clearfield();
    }//GEN-LAST:event_jPanel3MouseClicked

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
         int x = JOptionPane.showConfirmDialog(null,"Do you want to Update this");
        
        if(x==0)
        {
            String insu_code = InsuranceCode.getText();
            String mid = MachineID.getText();
            String insu_value = InsuranceValue.getText();
            String company = CompanyRegNo.getText();
            String policy_num = PolicyNo.getText();
            String premium = Premium.getText();
            Date Date1=date.getDate();
            
          
           
            
             if(mid.isEmpty() || insu_value.isEmpty() ||  Date1==null || company.isEmpty() || policy_num.isEmpty() || premium.isEmpty()){
        
                showMessageDialog(null,"Enter all essential data!", "Error", JOptionPane.ERROR_MESSAGE);
             }
                else if(mtvalidation.isdouble(insu_value)==0)
                 {
                    showMessageDialog(null,"Letters are not allowed Insurance Value field", "Error", JOptionPane.ERROR_MESSAGE);
                    InsuranceValue.setText(null);
                    }
                   else if(mtvalidation.isdouble(premium)==0)
                    {
             showMessageDialog(null,"Letters are not allowed Premium field", "Error", JOptionPane.ERROR_MESSAGE);
             Premium.setText(null);
                    }
            else {
            
                try {
                    
                SimpleDateFormat dateformat =new SimpleDateFormat("yyyy-MM-dd");
                String ren_date = dateformat.format(date.getDate());
                 String sql = "UPDATE insurance SET  Insu_Code='"+insu_code+"' ,MID='"+mid+"' , Insu_Value='"+insu_value+"' ,Renewal_Date = '"+ren_date+"', Company='"+company+"' , PolicyNo='"+policy_num+"' , Premium='"+premium+"' WHERE Insu_Code='"+insu_code+"'";
                pst = con.prepareStatement(sql);
                pst.execute();
                
                tableload();
                
                } catch (Exception e) {
                System.out.println(e);
            }
        }
        }
//            clearfield();
    }//GEN-LAST:event_jPanel2MouseClicked

    private void CompanyRegNoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CompanyRegNoFocusLost
      
    }//GEN-LAST:event_CompanyRegNoFocusLost

    private void InsuranceSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsuranceSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InsuranceSearchActionPerformed

    private void InsuranceSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_InsuranceSearchKeyReleased
        String search=InsuranceSearch.getText();
        try {

            String sql ="SELECT mid,insu_code FROM insurance where mid LIKE'"+search+"%' OR insu_code LIKE '"+search+"%' ";
            pst = con.prepareStatement(sql);

            rs =pst.executeQuery();

            InsuranceTable.setModel(DbUtils.resultSetToTableModel(rs));

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_InsuranceSearchKeyReleased

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
       this.hide();
       machine_details m1=new machine_details();
       m1.setVisible(true);
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseEntered
        jLabel15.setBackground(new Color (0,0,0));
    }//GEN-LAST:event_jLabel15MouseEntered

    private void jLabel15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseExited
        jLabel15.setBackground(new Color (51,51,51));
    }//GEN-LAST:event_jLabel15MouseExited

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
            java.util.logging.Logger.getLogger(Insurance_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Insurance_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Insurance_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Insurance_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Insurance_Details().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CompanyRegNo;
    private javax.swing.JLabel InsuranceCode;
    private javax.swing.JTextField InsuranceSearch;
    private javax.swing.JTable InsuranceTable;
    private javax.swing.JTextField InsuranceValue;
    public javax.swing.JLabel MachineID;
    private javax.swing.JTextField PolicyNo;
    private javax.swing.JTextField Premium;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
