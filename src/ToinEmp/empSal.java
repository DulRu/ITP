/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ToinEmp;

import db_connect.dbconnect;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import EmpMethods.EmpClass;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author Toin
 */
public class empSal extends javax.swing.JFrame {
    Connection con = null;
    PreparedStatement pst =null;
    ResultSet rs = null;
    PreparedStatement pst1 =null;
    ResultSet rs1 = null;
    PreparedStatement pst2 =null;
    ResultSet rs2 = null;
    
    
    public empSal() {
        initComponents();
        
        con = dbconnect.connect();
        
        //tableload
        tableload();
    }
    
    public void tableload()
    {
       try {
 
            String sql ="SELECT eid as EmpID,fname as Name FROM employee "; 
            pst = con.prepareStatement(sql);
           
            rs =pst.executeQuery();
            
              jTable1.setModel(DbUtils.resultSetToTableModel(rs));
                
             
    
       }
       catch(Exception e)
       {
           JOptionPane.showMessageDialog(null, "Error loading table", "Error", JOptionPane.ERROR_MESSAGE);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        eidlabel = new javax.swing.JLabel();
        namelabel = new javax.swing.JLabel();
        yearlabel = new javax.swing.JLabel();
        mnth = new javax.swing.JLabel();
        eidtxt = new javax.swing.JLabel();
        nametxt = new javax.swing.JLabel();
        mnth1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(236, 151));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Search by Name / EID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 319, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 319, 350));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        eidlabel.setForeground(new java.awt.Color(255, 255, 255));
        eidlabel.setText("EID");

        namelabel.setForeground(new java.awt.Color(255, 255, 255));
        namelabel.setText("Name");

        yearlabel.setForeground(new java.awt.Color(255, 255, 255));
        yearlabel.setText("Designation");

        mnth.setForeground(new java.awt.Color(255, 255, 255));
        mnth.setText("Type");

        eidtxt.setForeground(new java.awt.Color(255, 255, 255));
        eidtxt.setText(":-");

        nametxt.setForeground(new java.awt.Color(255, 255, 255));
        nametxt.setText(":-");

        mnth1.setForeground(new java.awt.Color(255, 255, 255));
        mnth1.setText("Section");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(":-");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText(":-");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText(":-");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(namelabel)
                    .addComponent(yearlabel)
                    .addComponent(mnth)
                    .addComponent(eidlabel)
                    .addComponent(mnth1))
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(eidtxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nametxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eidlabel)
                    .addComponent(eidtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namelabel)
                    .addComponent(nametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yearlabel)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mnth)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mnth1)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 630, 300));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Employee Salary Management");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 11, -1, -1));

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel4MouseExited(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Pay Salary");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jLabel8)
                .addContainerGap(133, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 510, 310, 40));

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

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("View All History");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel9)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 450, 140, 40));

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

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Cancel");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel10)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 450, 120, 40));

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

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Clear");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(54, 54, 54))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 450, 140, 40));

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

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Check Salary");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel7)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 450, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1142, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseEntered
            jPanel3.setBackground(new Color(0,0,0));  
    }//GEN-LAST:event_jPanel3MouseEntered

    private void jPanel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseExited
        jPanel3.setBackground(new Color(51,51,51)); 
    }//GEN-LAST:event_jPanel3MouseExited

    private void jPanel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseEntered
       jPanel4.setBackground(new Color(255,0,0));  
    }//GEN-LAST:event_jPanel4MouseEntered

    private void jPanel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseExited
        jPanel4.setBackground(new Color(51,51,51)); 
    }//GEN-LAST:event_jPanel4MouseExited

    private void jPanel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseEntered
        jPanel5.setBackground(new Color(0,0,0));  
    }//GEN-LAST:event_jPanel5MouseEntered

    private void jPanel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseExited
       jPanel5.setBackground(new Color(51,51,51)); 
    }//GEN-LAST:event_jPanel5MouseExited

    private void jPanel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseEntered
         jPanel6.setBackground(new Color(255,102,102)); 
    }//GEN-LAST:event_jPanel6MouseEntered

    private void jPanel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseExited
        jPanel6.setBackground(new Color(51,51,51)); 
    }//GEN-LAST:event_jPanel6MouseExited

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
        this.dispose();
    }//GEN-LAST:event_jPanel6MouseClicked

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
      
        String desig = null;
        String id = null;
        String type = null;
//        String salary = null;
//        String nopay = null;
//        String otrate = null;
//        String renopay = null;
//        String nopayamountS = null;
//        String totsalaryS = null;
//        String otamountS = "Notset";
        
        try {
 
            String sql ="SELECT * FROM employee "; 
            pst = con.prepareStatement(sql);
            rs =pst.executeQuery();
            
             while(rs.next()){
                 
                 id=rs.getString("eid");
                 desig =rs.getString("desig");
                 type = rs.getString("type");
              
//                 System.out.println(id);
//                 System.out.println(desig);
                 
                 
                if(type.equals("Temporary")){
                    
                    if(desig.equals("Delivery Manager")){
                    
//                        String q = "SELECT * FROM designation WHERE desig_name = '"+desig+"'";
//                        pst = con.prepareStatement(q);
//                        rs1 = pst.executeQuery();
//                        
//                        while(rs1.next()){
//                        salary = rs1.getString("temsal");
//                        nopay = rs1.getString("temnopay");
//                        otrate = rs1.getString("temot");
//                        
//                            }
//                        
//                        String emp = "SELECT * FROM employee WHERE eid = '"+id+"'";
//                        pst = con.prepareStatement(emp);
//                        rs2= pst.executeQuery();
//                        
//                        while(rs2.next()){
//                        
//                        renopay = rs2.getString("renopay");
//                        
//                            }
//                        
////                        System.out.println(salary);
////                        System.out.println(nopay);
////                        System.out.println(otrate);
////                        
////                        System.out.println(renopay);
//                        
//                        double salaryint = Double.parseDouble(salary);
//                        double nopayint = Double.parseDouble(nopay);
//                        double otrateint = Double.parseDouble(otrate);
//                        int renopayint = Integer.parseInt(renopay);
//                        
//                        double nopayamount = nopayint * renopayint;
//                        
//                       // System.out.println(nopayamount);
//                        
//                        double totsalary = salaryint - nopayamount;
//                        
//                       // System.out.println(totsalary);
//                        
//                        nopayamountS = Double.toString(nopayamount);
//                        totsalaryS = Double.toString(totsalary);
//                        
//                        Date now = new Date(); 
//                        SimpleDateFormat nowdate = new SimpleDateFormat( "yyyy-MM-dd" );
//                        String nowdateS = nowdate.format(now);
//                        //System.out.println(nowdateS);
//                        
//                       
//                        String sal = "INSERT INTO empsalary (empid,npamount,caldate,netsalary) VALUES ('"+id+"', '"+nopayamountS+"', '"+nowdateS+"', '"+totsalaryS+"')";
//                        pst2 = con.prepareStatement(sal);
//                        pst2.execute();
                        

                        EmpClass.calSalary(desig, id);
                        
                        
                        
                        
                    }else if(desig.equals("Supervisor")){
                        
                        EmpClass.calSalary(desig, id);
                        
                        //System.out.println("Temporary supervisor");
                    }else if(desig.equals("Security Manager")){
                        
                        EmpClass.calSalary(desig, id);
                        
                        
                       // System.out.println("temporary security manager");
                    }else if(desig.equals("Order Manager")){
                        
                        EmpClass.calSalary(desig, id);
                        
                        
                       // System.out.println("temporary order manager");
                    }else if(desig.equals("Maintainer")){
                        
                        EmpClass.calSalary(desig, id);
                        
                        
                        //System.out.println("temporary delivery manger");
                    }else if(desig.equals("Manager")){
                        
                        
                        EmpClass.calSalary(desig, id);
                        
                       // System.out.println("temporary maintainer");
                    }else if(desig.equals("Worker")){
                        
                        EmpClass.calSalary(desig, id);
                        
                        
                       // System.out.println("temporary maintainer");
                    }else if(desig.equals("Cashier")){
                    
                        EmpClass.calSalary(desig, id);
                    }else if(desig.equals("Cheff")){
                    
                        EmpClass.calSalary(desig, id);
                    }
                    
                    else{
                       // System.out.println("Employee designation not found!");
                }
                }
                else if(type.equals("Permanent")){
                    if(desig.equals("Delivery Manager")){
                    
                        EmpClass.calSalary(desig, id);
                       // System.out.println("Permanent manager"); 
                        
                    }else if(desig.equals("Supervisor")){
                        
                        EmpClass.calSalary(desig, id);
                        
                       // System.out.println("Done");
                    }else if(desig.equals("Security Manager")){
                        
                        EmpClass.calSalary(desig, id);
                        
                        
                       // System.out.println("Super1");
                    }else if(desig.equals("Order Manager")){
                        
                        
                        EmpClass.calSalary(desig, id);
                        
                       // System.out.println("Order manager permenent");
                    }else if(desig.equals("Maintainer")){
//                        String q = "SELECT * FROM designation WHERE desig_name = '"+desig+"'";
//                        pst = con.prepareStatement(q);
//                        rs1 = pst.executeQuery();
//                        
//                        while(rs1.next()){
//                        salary = rs1.getString("temsal");
//                        nopay = rs1.getString("temnopay");
//                        otrate = rs1.getString("temot");
//                        
//                            }
//                        
//                        String emp = "SELECT * FROM employee WHERE eid = '"+id+"'";
//                        pst = con.prepareStatement(emp);
//                        rs2= pst.executeQuery();
//                        
//                        while(rs2.next()){
//                        
//                        renopay = rs2.getString("renopay");
//                        
//                            }
//                        
////                        System.out.println(salary);
////                        System.out.println(nopay);
////                        System.out.println(otrate);
////                        
////                        System.out.println(renopay);
//                        
//                        double salaryint = Double.parseDouble(salary);
//                        double nopayint = Double.parseDouble(nopay);
//                        double otrateint = Double.parseDouble(otrate);
//                        int renopayint = Integer.parseInt(renopay);
//                        
//                        double nopayamount = nopayint * renopayint;
//                        
//                       // System.out.println(nopayamount);
//                        
//                        double totsalary = salaryint - nopayamount;
//                        
//                       // System.out.println(totsalary);
//                        
//                        nopayamountS = Double.toString(nopayamount);
//                        totsalaryS = Double.toString(totsalary);
//                        
//                        Date now = new Date(); 
//                        SimpleDateFormat nowdate = new SimpleDateFormat( "yyyy-MM-dd" );
//                        String nowdateS = nowdate.format(now);
//                        //System.out.println(nowdateS);
//                        
//                       
//                        String sal = "INSERT INTO empsalary (empid,npamount,caldate,netsalary) VALUES ('"+id+"', '"+nopayamountS+"', '"+nowdateS+"', '"+totsalaryS+"')";
//                        pst2 = con.prepareStatement(sal);
//                        pst2.execute();
//                        


                        EmpClass.calSalary(desig, id);
                        
                        
                        
                        
                        
                       // System.out.println("Super");
                    }else if(desig.equals("Manager")){
                        
                        
                        EmpClass.calSalary(desig, id);
                       // System.out.println("Super");
                    }else if(desig.equals("Worker")){
                        
                        EmpClass.calSalary(desig, id);
                        
                        //System.out.println("Super");
                    }else if(desig.equals("Cheff")){
                    
                        EmpClass.calSalary(desig, id);
                    }
                    else if(desig.equals("Cashier")){
                    
                        EmpClass.calSalary(desig, id);
                    }
                    
                    else{
                        //System.out.println("Employee designation not found!");
                }
                
                }else{
                       // System.out.println("Employee type not found!");
                }
             
                

             }
        }catch(Exception e){
            
            System.out.println(e);
        
        
        }
        
        
        
    }//GEN-LAST:event_jPanel4MouseClicked

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
       String name1=jTextField1.getText();
         try {
 
            String sql ="SELECT eid,fname FROM employee where fname LIKE'"+name1+"%' OR eid LIKE '"+name1+"%' "; 
            pst = con.prepareStatement(sql);
           
            rs =pst.executeQuery();
            
              jTable1.setModel(DbUtils.resultSetToTableModel(rs));

             
       }
       catch(Exception e)
       {
          JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       int r= jTable1.getSelectedRow( );
      
      String empid = jTable1.getValueAt(r, 0).toString();
      String fname = jTable1.getValueAt(r, 1).toString();
      eidtxt.setText(empid);
      nametxt.setText(fname);
      
      String Desig = null;
      String Type = null;
      String Sec = null;
      
      try {
            String q = "SELECT * FROM employee WHERE eid = '"+empid+"'";
            pst = con.prepareStatement(q);
            rs = pst.executeQuery();
            if(rs.next()){
                rs = pst.executeQuery();
                while(rs.next()){
                    Desig = rs.getString("desig");
                    Type = rs.getString("type");
                    Sec = rs.getString("sec");
                    
                    jLabel3.setText(Desig);
                    jLabel4.setText(Type);
                    jLabel5.setText(Sec);
                
                }
            
            }else{
                JOptionPane.showMessageDialog(null, "Couln't Done!","Error", JOptionPane.ERROR_MESSAGE);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e , "Error", JOptionPane.ERROR_MESSAGE);
        }
      
    }//GEN-LAST:event_jTable1MouseClicked

    private void jPanel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseEntered
        jPanel7.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_jPanel7MouseEntered

    private void jPanel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseExited
        jPanel7.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_jPanel7MouseExited

    private void jPanel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseClicked
       eidtxt.setText(":-");
       nametxt.setText(":-");
       jLabel3.setText(":-");
       jLabel4.setText(":-");
       jLabel5.setText(":-");
       
    }//GEN-LAST:event_jPanel7MouseClicked

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        
        String idm = eidtxt.getText();
        if(idm == ":-"){
            showMessageDialog(null,"Please select a Employee!","Error", JOptionPane.ERROR_MESSAGE);
        }else{
        
        
       checkSalary salary = new checkSalary();
       salary.eidlbl.setText(this.eidtxt.getText());
       salary.namelbl.setText(this.nametxt.getText());
       //this.dispose();
       salary.tableload(idm);
       salary.setVisible(true);
        }
    }//GEN-LAST:event_jPanel3MouseClicked

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
       salHistory salhis = new salHistory();
       salhis.setVisible(true);
    }//GEN-LAST:event_jPanel5MouseClicked

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
            java.util.logging.Logger.getLogger(empSal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(empSal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(empSal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(empSal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new empSal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel eidlabel;
    public javax.swing.JLabel eidtxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel mnth;
    private javax.swing.JLabel mnth1;
    private javax.swing.JLabel namelabel;
    private javax.swing.JLabel nametxt;
    private javax.swing.JLabel yearlabel;
    // End of variables declaration//GEN-END:variables
}
