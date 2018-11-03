/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cashier;

import db_connect.dbconnect;
import Foodfunction.DBaccess;
import Foodfunction.Func;
import Foodfunction.validation;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Yasitha Milan
 */
public class Vegitable extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rst = null;
    
    public Vegitable() {
        initComponents();
        
        conn = dbconnect.connect();
        tableload1();
        showdate();

        
    }
    public void showdate(){
    
        Date d1 = new Date();
        SimpleDateFormat s = new SimpleDateFormat("YYYY-MM-dd");
        jTextField4.setText(s.format(d1));
    }
   
    
    public void tableload1(){
    
        try{
        
            String sql = "SELECT FoodID as 'Vegi Id',FoodName as 'Vegi Name',Quantity,LastDate FROM Food where FoodID like 'v%'";
            pst = conn.prepareStatement(sql);
            rst = pst.executeQuery();
            
            jTable1.setModel(DbUtils.resultSetToTableModel(rst));
        }
        catch(Exception e){
            
            System.out.println(e);
        }
    }
    public int found(String m)
    {
        int a=1;
        
        if(!m.isEmpty())
        {
            
            String sql = "SELECT FoodName FROM Food";
            try {
                pst = conn.prepareStatement(sql);
                rst = pst.executeQuery();
                while(rst.next())
                {
                    String name = rst.getString("FoodName");
                    
                    if(m.equals(name))
                    {
                        a=0;
                    }
                }
                
            } catch (Exception e) {
                
                System.out.println(e);
            }
        }        
        return a;
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Searchbox = new javax.swing.JTextField();
        Search = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        ADD = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        Update = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        Delete = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        Refresh = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel11 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(461, 244));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        jPanel1.setPreferredSize(new java.awt.Dimension(871, 424));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Vegitables");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 27, -1, -1));

        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(719, 140, 132, 40));

        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 240, 132, 37));

        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(749, 190, 60, 40));

        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(719, 285, 132, 37));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("kg");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(813, 191, -1, 36));
        jPanel1.add(Searchbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 334, 118, 37));

        Search.setBackground(new java.awt.Color(102, 102, 102));
        Search.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        Search.setForeground(new java.awt.Color(102, 102, 102));
        Search.setPreferredSize(new java.awt.Dimension(124, 37));
        Search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SearchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SearchMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SearchMousePressed(evt);
            }
        });

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Search");

        javax.swing.GroupLayout SearchLayout = new javax.swing.GroupLayout(Search);
        Search.setLayout(SearchLayout);
        SearchLayout.setHorizontalGroup(
            SearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel10)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        SearchLayout.setVerticalGroup(
            SearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jPanel1.add(Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 334, -1, -1));

        ADD.setBackground(new java.awt.Color(51, 51, 51));
        ADD.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        ADD.setForeground(new java.awt.Color(51, 153, 255));
        ADD.setPreferredSize(new java.awt.Dimension(124, 37));
        ADD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ADDMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ADDMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ADDMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ADDMousePressed(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ADD");

        javax.swing.GroupLayout ADDLayout = new javax.swing.GroupLayout(ADD);
        ADD.setLayout(ADDLayout);
        ADDLayout.setHorizontalGroup(
            ADDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ADDLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel7)
                .addContainerGap(55, Short.MAX_VALUE))
        );
        ADDLayout.setVerticalGroup(
            ADDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jPanel1.add(ADD, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, -1, -1));

        Update.setBackground(new java.awt.Color(51, 51, 51));
        Update.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        Update.setPreferredSize(new java.awt.Dimension(124, 37));
        Update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                UpdateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                UpdateMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                UpdateMousePressed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("UPDATE");

        javax.swing.GroupLayout UpdateLayout = new javax.swing.GroupLayout(Update);
        Update.setLayout(UpdateLayout);
        UpdateLayout.setHorizontalGroup(
            UpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpdateLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        UpdateLayout.setVerticalGroup(
            UpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jPanel1.add(Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 330, -1, -1));

        Delete.setBackground(new java.awt.Color(51, 51, 51));
        Delete.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        Delete.setPreferredSize(new java.awt.Dimension(124, 37));
        Delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DeleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DeleteMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DeleteMousePressed(evt);
            }
        });

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("DELETE");

        javax.swing.GroupLayout DeleteLayout = new javax.swing.GroupLayout(Delete);
        Delete.setLayout(DeleteLayout);
        DeleteLayout.setHorizontalGroup(
            DeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DeleteLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel9)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        DeleteLayout.setVerticalGroup(
            DeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jPanel1.add(Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 330, -1, -1));

        Refresh.setBackground(new java.awt.Color(51, 51, 51));
        Refresh.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        Refresh.setForeground(new java.awt.Color(51, 51, 51));
        Refresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RefreshMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RefreshMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RefreshMouseExited(evt);
            }
        });
        Refresh.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Refresh");
        Refresh.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 1, 47, 26));

        jPanel1.add(Refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(572, 370, 120, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 107, 571, 180));

        jPanel11.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(599, 117, 10, -1));

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("FoodName");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, -1, -1));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Foodname");
        jLabel12.setAlignmentX(10.0F);
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(612, 140, 90, 40));

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("FoodId");
        jLabel13.setName(""); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 90, 90, 40));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Quanitity");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(612, 194, 90, 36));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Last Date");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(612, 236, 90, 38));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Reserved Date");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(612, 280, 90, 40));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 90, 90, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteMouseExited
        
        int r = jTable1.getSelectedRow();
        if(r>=0){
        String v_id = jTable1.getValueAt(r,0).toString();
        jLabel2.setText(null);
        
        Delete.setBackground(new Color (51,51,51));
        }
        else
        {
            Delete.setBackground(new Color (51,51,51));
        }
    }//GEN-LAST:event_DeleteMouseExited

    private void DeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteMouseEntered
        
        int r = jTable1.getSelectedRow();
        if(r>=0){
        String v_id = jTable1.getValueAt(r,0).toString();
        jLabel2.setText(v_id);
        
        Delete.setBackground(new Color (255,102,102));
        }
        else
        {
            Delete.setBackground(new Color (255,102,102));
        }
   
        
        
    }//GEN-LAST:event_DeleteMouseEntered

    private void UpdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateMouseExited
        
       int r = jTable1.getSelectedRow();
        if(r>=0){
        String v_id = jTable1.getValueAt(r,0).toString();
        jLabel2.setText(null);
        
        Update.setBackground(new Color (51,51,51));
        }
        else
        {
            Update.setBackground(new Color (51,51,51));
        }
        
    }//GEN-LAST:event_UpdateMouseExited

    private void UpdateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateMouseEntered
       
        int r = jTable1.getSelectedRow();
        if(r>=0){
        String v_id = jTable1.getValueAt(r,0).toString();
        jLabel2.setText(v_id);
        
        Update.setBackground(new Color (255,102,102));
        }
        else
        {
            Update.setBackground(new Color (255,102,102));
        }
    }//GEN-LAST:event_UpdateMouseEntered

    private void ADDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ADDMousePressed
        ADD.setBackground(new Color (51,153,255));
    }//GEN-LAST:event_ADDMousePressed

    private void ADDMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ADDMouseExited

        ADD.setBackground(new Color (51,51,51));
        jLabel2.setText(null);
    }//GEN-LAST:event_ADDMouseExited

    private void ADDMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ADDMouseEntered
        
        
        ADD.setBackground(new Color (255,102,102));
        jLabel2.setText(Func.getNextID("FoodID", "Food", "V", conn));
        
    }//GEN-LAST:event_ADDMouseEntered

    private void ADDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ADDMouseClicked

        String v_id = jLabel2.getText();
        String v_name = jTextField1.getText();
        String v_quan = jTextField2.getText();
        String v_lastDate = jTextField4.getText();
       

        if(v_name.isEmpty() || v_quan.isEmpty())
        {
            showMessageDialog(null,"Enter essential Data");
            jTextField2.setText(null);
            jTextField1.setText(null);
        }
        else if(validation.width(v_name)==0)
        {
            showMessageDialog(null,"No more than 10 letters for Food Name");
            jTextField1.setText(null);
        }
        else if(validation.isLetter(v_name)==0)
        {
            showMessageDialog(null,"No Numbers are allowed for Food Name ");
            jTextField1.setText(null);
        }
        
        else if(validation.isnumber(v_quan)==0)
        {
            showMessageDialog(null,"No letters are allowed ");
            jTextField2.setText(null);
        }
        else if(found(v_name)==0)
        {
            showMessageDialog(null,"This "+v_name+" is already in System ");
            jTextField1.setText(null);
            jTextField2.setText(null);
        }
        else{
            
            boolean status = DBaccess.addfood(v_id, v_name, v_quan, v_lastDate);
            
            if(status==true)
            {
                tableload1();
                jLabel2.setText(Func.getNextID("FoodID", "Food", "V", conn));
                jTextField2.setText(null);
                jTextField1.setText(null);
                showMessageDialog(null,"Successfully Added");
            }
        
    } 
        jTextField3.setText(null);
    }//GEN-LAST:event_ADDMouseClicked

    private void SearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchMouseExited
        Search.setBackground(new Color (51,51,51));
    }//GEN-LAST:event_SearchMouseExited

    private void SearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchMouseEntered
        Search.setBackground(new Color (0,0,0));
    }//GEN-LAST:event_SearchMouseEntered

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void UpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateMouseClicked

        String v_id = jLabel2.getText();
        String v_name = jTextField1.getText();
        String v_quan1 =jTextField2.getText();
        String v_lastDate = jTextField4.getText();
        
        if(v_name.isEmpty())
        {
            showMessageDialog(null,"Select from table");
            jTextField1.setText(null);
        }
        else if(validation.width(v_name)==0)
        {
            showMessageDialog(null,"No more than 10 letters for Food Name");
            jTextField1.setText(null);
        }
        else if(validation.isLetter(v_name)==0)
        {
            showMessageDialog(null,"No Numbers are allowed for Food Name ");
            jTextField1.setText(null);
        }
        
        else if(validation.isnumber(v_quan1)==0)
        {
            showMessageDialog(null,"No letters are allowed ");
            jTextField2.setText(null);
        }
        else
        {
                
            if( v_quan1.isEmpty())
            {
                boolean status = DBaccess.updatefood1(v_id, v_name);
                
                if(status==true)
                {
                    tableload1();
                    showMessageDialog(null,"Successfully Food Name Updated");    
                }    
            }
            else
            {
                boolean status = DBaccess.updatefood2(v_id, v_name, v_quan1, v_lastDate);
                
                if(status==true)
                {
                    tableload1();
                    showMessageDialog(null,"Successfully Updated");
                }
            }
        jLabel2.setText(null);
        jTextField1.setText(null);
        jTextField2.setText(null);
        jTextField3.setText(null);
    }//GEN-LAST:event_UpdateMouseClicked
    }
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
        int r = jTable1.getSelectedRow();

        
        String v_id = jTable1.getValueAt(r,0).toString();
        String v_name  = jTable1.getValueAt(r, 1).toString();

        String v_lastDate  = jTable1.getValueAt(r, 3).toString();
        
        jLabel2.setText(v_id);
        jTextField1.setText(v_name);

        jTextField3.setText(v_lastDate);
    }//GEN-LAST:event_jTable1MouseClicked

    private void DeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteMouseClicked
        
        
        
        int x = JOptionPane.showConfirmDialog(null,"Do you want to Delete this");
        
        if(x==0)
        {
            String v_id = jLabel2.getText();
            
            boolean status = DBaccess.deletefood(v_id);
            
            if(status=true)
            {
                tableload1();
                jLabel2.setText(Func.getNextID("FoodID", "Food", "V", conn));
            }
        }
        
        jTextField1.setText(null);
        jTextField2.setText(null);
        jTextField3.setText(null);
    }//GEN-LAST:event_DeleteMouseClicked

    private void RefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RefreshMouseClicked
        jLabel2.setText(null);
        jTextField1.setText(null);
        jTextField2.setText(null);
        jTextField3.setText(null);
        Searchbox.setText(null);
        
        tableload1();
    }//GEN-LAST:event_RefreshMouseClicked

    private void RefreshMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RefreshMouseEntered
        
        Refresh.setBackground(new Color (0,0,0));
    }//GEN-LAST:event_RefreshMouseEntered

    private void RefreshMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RefreshMouseExited
        Refresh.setBackground(new Color (51,51,51));
    }//GEN-LAST:event_RefreshMouseExited

    private void SearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchMouseClicked
          String search = Searchbox.getText();
          String name = "v";

        if(search.isEmpty())
        {
            showMessageDialog(null,"Eneter Vegi Name");
        }
        else
        {
            boolean status = DBaccess.searchfood(search, name, jTable1);
            
            if(status==true)
            {
               
                Searchbox.setText(null);
            }
        }
    }//GEN-LAST:event_SearchMouseClicked

    private void UpdateMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateMousePressed
        Update.setBackground(new Color (51,153,255));
    }//GEN-LAST:event_UpdateMousePressed

    private void DeleteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteMousePressed
        Delete.setBackground(new Color (51,153,255));
    }//GEN-LAST:event_DeleteMousePressed

    private void SearchMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchMousePressed
        Search.setBackground(new Color (51,153,255));
    }//GEN-LAST:event_SearchMousePressed

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
            java.util.logging.Logger.getLogger(Vegitable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vegitable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vegitable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vegitable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vegitable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ADD;
    private javax.swing.JPanel Delete;
    private javax.swing.JPanel Refresh;
    private javax.swing.JPanel Search;
    private javax.swing.JTextField Searchbox;
    private javax.swing.JPanel Update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
