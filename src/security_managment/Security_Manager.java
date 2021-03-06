/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package security_managment;

import db_connect.dbconnect;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Tharindu sachintha
 */
public class Security_Manager extends javax.swing.JFrame {

    Connection con=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    
    String Visitor;
    String Name;
    String dependent;
    String reason;
    String status;
    String card;
    int telephone;
    String Date;
    /**
     * Creates new form Security_Manager
     */
    public Security_Manager() {
        initComponents();
        con=dbconnect.connect();
        SetTable();
        
    }
    void reset()
    {
                vid.setText(null);
                nme.setText(null);
                depen.setText(null);
                resn.setSelectedIndex(0);
                stat.setText(null);
                tele.setText(null);
                crd.setText(null);
                date.setDate(null);
                sea.setText(null);
    }
    void setStatus()
    {
             dependent=depen.getText();
        
        String sql="select eid from employee where eid=?";
        try{
            pst=con.prepareStatement(sql);
            pst.setString(1,depen.getText());
            rs=pst.executeQuery();
            
            if(rs.next())
            {
                if(dependent.equals(rs.getString("eid")))
                {
                    stat.setText("Aprove");
                }
                
            }
            else
            {
                stat.setText("notAprove");
            }
        }
        catch(Exception e)
        {
            
        }
    }
    void SetTable()
    {
            String sql="Select idvisitor,name,status,card,telephoneno,dependent,purpose,date from visitor ";
            
            try{
                pst=con.prepareStatement(sql);
                rs=pst.executeQuery();
                
                table.setModel(DbUtils.resultSetToTableModel(rs));
            }
            catch(Exception e)
            {
            
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        vid = new javax.swing.JTextField();
        tele = new javax.swing.JTextField();
        depen = new javax.swing.JTextField();
        crd = new javax.swing.JTextField();
        sea = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        stat = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        resn = new javax.swing.JComboBox<>();
        date = new com.toedter.calendar.JDateChooser();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        nme = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(165, 130));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1230, 800));
        setSize(new java.awt.Dimension(1180, 640));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 610));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Visitor Name ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Status");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 110, -1, -1));

        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Reason");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, -1, -1));

        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Dependent");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, -1, -1));

        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("Card");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(776, 179, -1, -1));
        jPanel1.add(vid, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 142, -1));

        tele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teleActionPerformed(evt);
            }
        });
        tele.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                teleKeyPressed(evt);
            }
        });
        jPanel1.add(tele, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 142, -1));

        depen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                depenMouseEntered(evt);
            }
        });
        depen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                depenKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                depenKeyReleased(evt);
            }
        });
        jPanel1.add(depen, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 196, -1));

        crd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crdActionPerformed(evt);
            }
        });
        jPanel1.add(crd, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 170, 180, -1));
        jPanel1.add(sea, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, 190, 30));

        jLabel11.setForeground(new java.awt.Color(240, 240, 240));
        jLabel11.setText("Date");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 80, 20));

        stat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                statMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                statMouseEntered(evt);
            }
        });
        jPanel1.add(stat, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 110, 180, -1));
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1175, 222, -1, -1));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
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

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Search");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 290, -1, 30));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
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

        jLabel8.setBackground(new java.awt.Color(0, 51, 204));
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Update Visitor");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 110, 30));

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));
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

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Delete Visitor");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 110, 30));

        jPanel5.setBackground(new java.awt.Color(102, 102, 102));
        jPanel5.setForeground(new java.awt.Color(255, 255, 255));
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

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Add Visitor");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 110, 30));

        jPanel6.setBackground(new java.awt.Color(102, 102, 102));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("SECURITY MANAGER");
        jPanel6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 270, 30));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, 50));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Visitor ID", "Visitor Name", "Status", "Card", "Telephone no", "Dependent", "Reason", "Date"
            }
        ));
        table.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tableAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane2.setViewportView(table);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 980, 200));

        resn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Reason", "Meet friend or relation", "watch process of company(outside)", "watch process of company(inside)", " " }));
        resn.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                resnItemStateChanged(evt);
            }
        });
        jPanel1.add(resn, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, -1, -1));

        date.setDateFormatString("yyyy,MM,dd");
        jPanel1.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 140, -1));

        jLabel16.setForeground(new java.awt.Color(240, 240, 240));
        jLabel16.setText("Telephone Number");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 120, -1));

        jLabel17.setForeground(new java.awt.Color(240, 240, 240));
        jLabel17.setText("Visitor ID");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 74, -1));
        jPanel1.add(nme, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 142, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1250, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void teleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teleActionPerformed

    private void crdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_crdActionPerformed

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
    
    //Visitor=vid.getText();
    Name=nme.getText();
    dependent=depen.getText();
    
    status=stat.getText();
    card=crd.getText();
    telephone=Integer.parseInt(tele.getText());
    reason = resn.getSelectedItem().toString();
    
    SimpleDateFormat sd = new SimpleDateFormat("yyyy,MM,dd");
     Calendar cal = Calendar.getInstance();
       String datee=(sd.format(cal.getTime()));
    
    //Date=sd.format(date.getDate());
    
    
    try{
        
        String sql="INSERT INTO visitor(name,telephoneno,purpose,card,dependent,status,date)"
                    +"VALUES('"+Name+"','"+telephone+"','"+reason+"','"+card+"','"+dependent+"','"+status+"','"+datee+"')";
            pst=con.prepareStatement(sql);
            
            
            if(tele.getBackground()==Color.red || tele.getText().length()<10 )
            {
                JOptionPane.showMessageDialog(null,"Wrong Telephone number");
                tele.setText(null);
                
            }
            else if(tele.getBackground()==Color.WHITE)
            {
                 
                pst.execute(sql);
                SetTable();
                reset();
                
                JOptionPane.showMessageDialog(null,"Succeess");
            
            }
          
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(null,"Error");
    }
    
   
    SetTable();
// TODO add your handling code here:
    }//GEN-LAST:event_jPanel5MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseClicked

    private void depenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_depenMouseEntered
        // TODO add your handling code here:    
    }//GEN-LAST:event_depenMouseEntered

    private void statMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_statMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_statMouseClicked

    private void statMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_statMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_statMouseEntered

    private void depenKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_depenKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_depenKeyPressed

    private void depenKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_depenKeyReleased
        // TODO add your handling code here:
        setStatus();
    }//GEN-LAST:event_depenKeyReleased

    private void resnItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_resnItemStateChanged
        // TODO add your handling code here:
        reason=(String)resn.getSelectedItem();
        
        if(reason.equals("Meet friend or relation"))
        {
            crd.setText("Green Card");
        }
        else if(reason.equals("watch process of company(outside)"))
        {
            crd.setText("Yellow Card");
        }
        else if(reason.equals("watch process of company(inside)"))
        {
            crd.setText("Red Card");
        }
        else
        {
            crd.setText(null);
        }
    }//GEN-LAST:event_resnItemStateChanged

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        // TODO add your handling code here:
        String sql="select * from visitor where idvisitor=? ";
               
        try{
           pst=con.prepareStatement(sql);
           pst.setString(1,sea.getText());
           rs=pst.executeQuery();
           
           if(rs.next())
           {
                vid.setText(rs.getString("idvisitor"));
                nme.setText(rs.getString("name"));
                depen.setText(rs.getString("dependent"));
                resn.setSelectedItem(rs.getString("purpose"));
                stat.setText(rs.getString("status"));
                crd.setText(rs.getString("card"));
                tele.setText(rs.getString("telephoneno"));
                date.setDate(rs.getDate("date"));
           }
           else
           {
               JOptionPane.showMessageDialog(null,"Invalid Visitor ID");
               reset();
           }
        }
        catch(Exception e)
        {
        
        }
    }//GEN-LAST:event_jPanel2MouseClicked

    private void tableAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tableAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_tableAncestorAdded

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        // TODO add your handling code here:
        String sql="update visitor set name=?,telephoneno=?,purpose=?,card=?,dependent=?,status=?,date=? where idvisitor=?";
        
        try{
            pst=con.prepareStatement(sql);
            
            SimpleDateFormat sd=new SimpleDateFormat("yyyy-MM-dd");
            
            pst.setString(1,nme.getText());
            pst.setString(2,tele.getText());
            pst.setString(3, (String)resn.getSelectedItem());
            pst.setString(4,crd.getText());
            pst.setString(5,depen.getText());
            pst.setString(6,stat.getText());
            pst.setString(7,sd.format(date.getDate()));
            
            pst.setString(8,vid.getText());
            
           
            
            if(tele.getBackground()==Color.red || tele.getText().length()<10 )
            {
                JOptionPane.showMessageDialog(null,"Wrong Telephone number");
                tele.setText(null);
                
            }
            else if(tele.getBackground()==Color.WHITE)
            {
                 pst.executeUpdate();
            
                SetTable();
                reset();
                
                JOptionPane.showMessageDialog(null,"Succeess");
            
            }
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
            
    }//GEN-LAST:event_jPanel3MouseClicked

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        // TODO add your handling code here:
           String sql="delete from visitor where idvisitor=?";
        
        try{
            pst=con.prepareStatement(sql);
            pst.setString(1,sea.getText());
            
            int msg=JOptionPane.showConfirmDialog(null,"Do you need to delete Visitor :"+sea.getText(), "close",JOptionPane.YES_OPTION,JOptionPane.NO_OPTION);
            
            if(msg==JOptionPane.YES_OPTION)
            {
                pst.executeUpdate();
            }
        }
        catch(Exception e)
        {
        
        }
        SetTable();
        reset();
        
        
        
    }//GEN-LAST:event_jPanel4MouseClicked

    private void teleKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_teleKeyPressed
        // TODO add your handling code here:

        if(evt.getKeyCode()>=KeyEvent.VK_0 && evt.getKeyCode()<=KeyEvent.VK_9 || evt.getKeyCode()==KeyEvent.VK_BACK_SPACE)
        {
            if(tele.getText().length()>9)
            {
                if(evt.getKeyCode()==KeyEvent.VK_BACK_SPACE)
                {
                    tele.setEditable(true);
                }
                else
                {
                    tele.setBackground(Color.white);
                    tele.setEditable(false);
                }
            }
            else 
            {
                tele.setBackground(Color.white);
                tele.setEditable(true);
            }
        }
        else
        {
            tele.setEditable(false);
            tele.setBackground(Color.red);
        }
                                    


    }//GEN-LAST:event_teleKeyPressed

    private void jPanel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseEntered
        // TODO add your handling code here:
        jPanel3.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_jPanel3MouseEntered

    private void jPanel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseEntered
        // TODO add your handling code here:
        jPanel5.setBackground(new Color(0,0,0));
        
    }//GEN-LAST:event_jPanel5MouseEntered

    private void jPanel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseEntered
        // TODO add your handling code here:
        jPanel4.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_jPanel4MouseEntered

    private void jPanel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseEntered
        // TODO add your handling code here:
        jPanel2.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_jPanel2MouseEntered

    private void jPanel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseExited
        // TODO add your handling code here:
         jPanel5.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_jPanel5MouseExited

    private void jPanel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseExited
        // TODO add your handling code here:
         jPanel3.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_jPanel3MouseExited

    private void jPanel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseExited
        // TODO add your handling code here:
         jPanel4.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_jPanel4MouseExited

    private void jPanel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseExited
        // TODO add your handling code here:
         jPanel2.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_jPanel2MouseExited

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
            java.util.logging.Logger.getLogger(Security_Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Security_Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Security_Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Security_Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Security_Manager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField crd;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JTextField depen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nme;
    private javax.swing.JComboBox<String> resn;
    private javax.swing.JTextField sea;
    private javax.swing.JTextField stat;
    private javax.swing.JTable table;
    private javax.swing.JTextField tele;
    private javax.swing.JTextField vid;
    // End of variables declaration//GEN-END:variables
}
