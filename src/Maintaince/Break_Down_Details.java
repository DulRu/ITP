package Maintaince;

import db_connect.dbconnect;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showConfirmDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import net.proteanit.sql.DbUtils;
import MTfunction.mtfunction;
import MTfunction.mtvalidation;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.JOptionPane.showMessageDialog;
//import MTfunction.mtvalidation;
/**
 *
 * @author Dulangi Rathnayaka
 */

public class Break_Down_Details extends javax.swing.JFrame {
    //db connect    
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;//table click
    
    public Break_Down_Details() {
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
        
        BreakdownTable.setModel(DbUtils.resultSetToTableModel(rs));
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
        jScrollPane2 = new javax.swing.JScrollPane();
        BreakdownTable = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        EmployeeID = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        EmpEmail = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        MachineType = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        BreakdownSearch = new javax.swing.JTextField();
        BreakdownID = new javax.swing.JLabel();
        date1 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(231, 151));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Breakdown Details");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(507, 21, 183, 29));

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
        jPanel1.add(MachineID, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 261, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Machine ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 102, 119, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Description");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 170, 119, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Employee ID");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 119, -1));

        Description.setColumns(20);
        Description.setRows(5);
        jScrollPane1.setViewportView(Description);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 170, 261, 50));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Machine Type");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 100, 119, -1));

        BreakdownTable.setBackground(new java.awt.Color(102, 102, 102));
        BreakdownTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Machine ID", "Emp ID", "Emp Email", "Breakdown ID", "Machine Type", "Description", " Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        BreakdownTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BreakdownTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(BreakdownTable);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 1100, 200));

        jSeparator1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 75, 1060, -1));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, 10, 230));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Date");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 250, 100, -1));

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
        jPanel1.add(EmployeeID, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 261, -1));

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
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Add");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 30, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 160, 40));

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
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel20)
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, 160, 40));

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 340, 160, 40));

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
                .addGap(55, 55, 55)
                .addComponent(jLabel23)
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 340, -1, 40));

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
                .addComponent(jLabel22)
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 340, -1, 40));

        jPanel9.setBackground(new java.awt.Color(51, 51, 51));
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

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText(" Update");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel10)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 160, 40));

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
        jPanel1.add(EmpEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 261, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Breakdown ID");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 119, -1));

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Emp Email");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 119, -1));

        MachineType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Machine Type", "Canteen", "Cutting", "Finishing", "Office", "Other", "Security", "Sewing" }));
        MachineType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MachineTypeActionPerformed(evt);
            }
        });
        jPanel1.add(MachineType, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 100, 261, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Search by Machine ID/Breakdown ID");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 60, 170, -1));

        BreakdownSearch.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        BreakdownSearch.setForeground(new java.awt.Color(51, 51, 51));
        BreakdownSearch.setText("Search");
        BreakdownSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BreakdownSearchActionPerformed(evt);
            }
        });
        BreakdownSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BreakdownSearchKeyReleased(evt);
            }
        });
        jPanel1.add(BreakdownSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 60, 220, 20));

        BreakdownID.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(BreakdownID, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 160, 20));
        jPanel1.add(date1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 250, 260, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1128, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
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

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel6MouseClicked

    private void jPanel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseEntered
         jPanel6.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_jPanel6MouseEntered

    private void jPanel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseExited
         jPanel6.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_jPanel6MouseExited

    private void jPanel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseEntered
        jPanel8.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_jPanel8MouseEntered

    private void jPanel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseExited
         jPanel8.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_jPanel8MouseExited

    private void jPanel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseEntered
        jPanel7.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_jPanel7MouseEntered

    private void jPanel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseExited
        jPanel7.setBackground(new Color(51,51,51));
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
        
       
        if(mid.isEmpty() || EID.isEmpty() || email.isEmpty() || mtype.isEmpty() || description.isEmpty() ||  Date1==null ){
        
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
            
                 showMessageDialog(null, "Succesfully added.");

         
        }
         else{
            showMessageDialog(null, "Invalid Employee ID.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        }catch (Exception e) {
            showMessageDialog(null, e);
        }
            
                   
        
        }
    

                
        
            
           
    }//GEN-LAST:event_jPanel2MouseClicked

    private void BreakdownTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BreakdownTableMouseClicked
       int r = BreakdownTable.getSelectedRow();
        
       String mid = BreakdownTable.getValueAt(r, 0).toString();
       String eid= BreakdownTable.getValueAt(r, 1).toString();
       String email = BreakdownTable.getValueAt(r, 2).toString();
       String bid = BreakdownTable.getValueAt(r, 3).toString();
       String mtype    = BreakdownTable.getValueAt(r, 4).toString();
       String description = BreakdownTable.getValueAt(r, 5).toString();
       try {
            date1.setDate( new SimpleDateFormat("yyyy-MM-dd").parse(BreakdownTable.getValueAt(r, 6).toString()));
        } catch (ParseException ex) {
            Logger.getLogger(Insurance_Details.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       //String cname= jTable1.getValueAt(r, 7).toString();
       //String cid = jTable1.getValueAt(r, 8).toString();
        
        
       MachineID.setText(mid);
       EmployeeID.setText(eid);
       EmpEmail.setText(email);
       BreakdownID.setText(bid);
       MachineType.setSelectedItem(mtype);
       Description.setText(description);
       //jTextField6.setText(cname);
       //jTextField5.setText(cid);
        
    }//GEN-LAST:event_BreakdownTableMouseClicked

    private void jPanel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseEntered
         jPanel9.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_jPanel9MouseEntered

    private void jPanel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseEntered
         jPanel3.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_jPanel3MouseEntered

    private void jPanel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseExited
        jPanel2.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_jPanel2MouseExited

    private void jPanel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseExited
       jPanel9.setBackground(new Color(51,51,51)); 
    }//GEN-LAST:event_jPanel9MouseExited

    private void jPanel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseExited
       jPanel3.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_jPanel3MouseExited

    private void EmpEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpEmailActionPerformed
      MachineType.grabFocus();
    }//GEN-LAST:event_EmpEmailActionPerformed

    private void jPanel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseClicked
        int x = showConfirmDialog(null,"Do you want to Update this");
        
        if(x==0)
        {

              String mid = MachineID.getText();
              String EID = EmployeeID.getText();
              String email = EmpEmail.getText();
              String bid = BreakdownID.getText();
              String mtype = MachineType.getSelectedItem().toString();
              String description = Description.getText();
              Date Date1=date1.getDate();
              String designation=null;
             
             
              
              if(mid.isEmpty() || EID.isEmpty() || email.isEmpty() || mtype.isEmpty() || description.isEmpty() ||  Date1==null ){
        
            showMessageDialog(null,"Enter all essential data!", "Error", JOptionPane.ERROR_MESSAGE);
        }
              else{
          try {
            
              
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
            String qry = "UPDATE breakdown SET  MID='"+mid+"' ,EID='"+EID+"', email='"+email+"' , BID='"+bid+"' , Mtype='"+mtype+"' , description='"+description+"' , date='"+date+"' WHERE BID='"+bid+"'";
            pst = con.prepareStatement(qry);
            pst.execute();
                
                tableload();
                
                
                
                
        }
        else{
            showMessageDialog(null, "Invalid Employee ID.", "Error", JOptionPane.ERROR_MESSAGE);
        }
            } catch (Exception e) {
                showMessageDialog(null, e);
            }
              }
        }
    }//GEN-LAST:event_jPanel9MouseClicked

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
         //delete 
        int x = showConfirmDialog(null,"Do you want to Delete this");
        
        if(x==0)
        {
            String bid = BreakdownID.getText();
            
            String sql = "DELETE from breakdown WHERE BID='"+bid+"'";
            
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

    private void jPanel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseClicked
         //refresh
        clearfield();
            
        tableload();
    }//GEN-LAST:event_jPanel7MouseClicked

    private void MachineTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MachineTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MachineTypeActionPerformed

    private void BreakdownSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BreakdownSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BreakdownSearchActionPerformed

    private void BreakdownSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BreakdownSearchKeyReleased
        String search=BreakdownSearch.getText();
        try {

            String sql ="SELECT mid,bid FROM breakdown where mid LIKE'"+search+"%' OR bid LIKE '"+search+"%' ";
            pst = con.prepareStatement(sql);

            rs =pst.executeQuery();

            BreakdownTable.setModel(DbUtils.resultSetToTableModel(rs));

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BreakdownSearchKeyReleased

    private void EmpEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EmpEmailFocusLost
         //email vali
              if(checkemail()==0)
                {
                   showMessageDialog(null,"invalied email");
                   EmpEmail.setText(null);
               } 
    }//GEN-LAST:event_EmpEmailFocusLost

    private void EmployeeIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EmployeeIDFocusLost
//        String EID = EmployeeID.getText();
//        try{
//                
//            int Eid = Integer.parseInt(EID);       
//            String sql= "SELECT * FROM employee WHERE eid = '"+Eid+"'";
//            pst = con.prepareStatement(sql);
//            rs = pst.executeQuery();
//        
//            while(rs.next()){
//                designation=rs.getString("desig");
//             }
//            if(designation.isEmpty()){
//                showMessageDialog(null, "Employee is not in database", "Error", JOptionPane.ERROR_MESSAGE);
//        
//            }
//        
//        
//            else if (designation.equals("Maintainer") || designation.equals("Order Manager") || designation.equals("Delivery Manager") || designation.equals("Manager"))
//        {
//            showMessageDialog(null, "Invalid Employee ID.", "Error", JOptionPane.ERROR_MESSAGE);
//        }
//           
//        }catch (Exception e) {
//            showMessageDialog(null, e);
//        }
//        
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
            java.util.logging.Logger.getLogger(Break_Down_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Break_Down_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Break_Down_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Break_Down_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Break_Down_Details().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BreakdownID;
    private javax.swing.JTextField BreakdownSearch;
    private javax.swing.JTable BreakdownTable;
    private javax.swing.JTextArea Description;
    private javax.swing.JTextField EmpEmail;
    private javax.swing.JTextField EmployeeID;
    private javax.swing.JTextField MachineID;
    private javax.swing.JComboBox MachineType;
    private com.toedter.calendar.JDateChooser date1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
