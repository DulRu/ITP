/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cashier;
import db_connect.dbconnect;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import net.proteanit.sql.DbUtils;
import Foodfunction.Func; 
import Foodfunction.validation;

import net.proteanit.sql.DbUtils;

/**
 *
 * @author Yasitha Milan
 */
public class Bill extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst1 = null;
    PreparedStatement pst2 = null;
    PreparedStatement pst3 = null;
    ResultSet rst1 = null;
    ResultSet rst2 = null;
    ResultSet rst3 = null;
    
    public Bill() {
        initComponents();
        conn = dbconnect.connect();
        tableload1();
        tableload2();
        tableload3();
    }

    public void tableload1(){
    
        try{
        
            String sql = "SELECT FoodID,FoodName FROM Food";
            pst1= conn.prepareStatement(sql);
            rst1 = pst1.executeQuery();
            
            jTable1.setModel(DbUtils.resultSetToTableModel(rst1));
        }
        catch(Exception e){
            
            System.out.println(e);
        }
    }
    
    public void tableload2(){
    
        try{
        
            String sql = "SELECT FoodName,bQuantity,price from bill";
            pst2= conn.prepareStatement(sql);
            rst2 = pst2.executeQuery();
            
            jTable3.setModel(DbUtils.resultSetToTableModel(rst2));
        }
        catch(Exception e){
            
            System.out.println(e);
        }
    }
    public void tableload3(){
    
        try{
        
            String sql = "SELECT vehino,finalprice,trnasport,total,date FROM finalbill";
            pst3= conn.prepareStatement(sql);
            rst3 = pst3.executeQuery();
            
            jTable2.setModel(DbUtils.resultSetToTableModel(rst3));
        }
        catch(Exception e){
            
            System.out.println(e);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        price = new javax.swing.JTextField();
        trnsprice = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        foodid = new javax.swing.JLabel();
        foodname = new javax.swing.JLabel();
        searchbox = new javax.swing.JTextField();
        quantity1 = new javax.swing.JTextField();
        Search = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        Add = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        vehino = new javax.swing.JTextField();
        generate = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(230, 150));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        jPanel1.setPreferredSize(new java.awt.Dimension(1130, 610));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 92, 330, 490));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("FoodId");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 61, 32));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("FoodName");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, 69, 31));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Quantity");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, 60, 30));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Price");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, 60, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Create Bill");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 22, 126, 26));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Transport Price");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 310, -1, 20));

        price.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceActionPerformed(evt);
            }
        });
        jPanel1.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 310, 100, 30));

        trnsprice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        trnsprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trnspriceActionPerformed(evt);
            }
        });
        jPanel1.add(trnsprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 310, 110, 30));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 370, 410, 210));

        foodid.setForeground(new java.awt.Color(204, 204, 204));
        foodid.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        foodid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));
        jPanel1.add(foodid, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 100, 30));

        foodname.setForeground(new java.awt.Color(255, 255, 255));
        foodname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        foodname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));
        jPanel1.add(foodname, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, 100, 30));

        searchbox.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        searchbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchboxActionPerformed(evt);
            }
        });
        jPanel1.add(searchbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 90, 30));

        quantity1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        quantity1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantity1ActionPerformed(evt);
            }
        });
        jPanel1.add(quantity1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, 100, 30));

        Search.setBackground(new java.awt.Color(51, 51, 51));
        Search.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
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
        });

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Search");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7MouseExited(evt);
            }
        });

        javax.swing.GroupLayout SearchLayout = new javax.swing.GroupLayout(Search);
        Search.setLayout(SearchLayout);
        SearchLayout.setHorizontalGroup(
            SearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel7)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        SearchLayout.setVerticalGroup(
            SearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SearchLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, 100, 30));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, 320, 210));

        Add.setBackground(new java.awt.Color(51, 51, 51));
        Add.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        Add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddMouseExited(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Add");

        javax.swing.GroupLayout AddLayout = new javax.swing.GroupLayout(Add);
        Add.setLayout(AddLayout);
        AddLayout.setHorizontalGroup(
            AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        AddLayout.setVerticalGroup(
            AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        jPanel1.add(Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 310, 100, 30));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(702, 110, 10, 240));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Vehicle No:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 260, 60, 20));

        vehino.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        vehino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vehinoActionPerformed(evt);
            }
        });
        jPanel1.add(vehino, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 250, 110, 30));

        generate.setBackground(new java.awt.Color(51, 51, 51));
        generate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        generate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                generateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                generateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                generateMouseExited(evt);
            }
        });

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Genarate");

        javax.swing.GroupLayout generateLayout = new javax.swing.GroupLayout(generate);
        generate.setLayout(generateLayout);
        generateLayout.setHorizontalGroup(
            generateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(generateLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel10)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        generateLayout.setVerticalGroup(
            generateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(generate, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 310, 110, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceActionPerformed

    private void trnspriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trnspriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_trnspriceActionPerformed

    private void quantity1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantity1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantity1ActionPerformed

    private void SearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchMouseEntered
        Search.setBackground(new Color (0,0,0));
    }//GEN-LAST:event_SearchMouseEntered

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
       
    }//GEN-LAST:event_jLabel7MouseExited

    private void SearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchMouseExited
        Search.setBackground(new Color (51,51,51));
    }//GEN-LAST:event_SearchMouseExited

    private void searchboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchboxActionPerformed

    private void SearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchMouseClicked
         String search = searchbox.getText();

        if(search.isEmpty())
        {
            showMessageDialog(null,"Eneter Vegi Name");
        }
        else
        {
            String sql = "SELECT * FROM Food WHERE FoodName LIKE '%"+search+"%'";

            try {
                pst1 = conn.prepareStatement(sql);
                rst1 = pst1.executeQuery();
                jTable1.setModel(DbUtils.resultSetToTableModel(rst1));
            
                searchbox.setText(null);
            } 
            catch (Exception e) {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_SearchMouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int r = jTable1.getSelectedRow();

        
        String v_id = jTable1.getValueAt(r,0).toString();
        String v_name  = jTable1.getValueAt(r, 1).toString();
        
        foodid.setText(v_id);
        foodname.setText(v_name);

    }//GEN-LAST:event_jTable1MouseClicked

    private void AddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMouseEntered
        Add.setBackground(new Color (0,0,0));
    }//GEN-LAST:event_AddMouseEntered

    private void AddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMouseExited
         Add.setBackground(new Color (51,51,51));
    }//GEN-LAST:event_AddMouseExited

    private void vehinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vehinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vehinoActionPerformed

    private void generateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generateMouseEntered
       generate.setBackground(new Color (0,0,0));
    }//GEN-LAST:event_generateMouseEntered

    private void generateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generateMouseExited
       generate.setBackground(new Color (51,51,51));
    }//GEN-LAST:event_generateMouseExited

    private void AddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMouseClicked
        String fname = foodname.getText();
        String squan = quantity1.getText();
        String sprice = price.getText();

        if(squan.isEmpty() || sprice.isEmpty())
        {
            showMessageDialog(null,"Enter essential Data");
        }
        else if(validation.isnumber(squan)==0)
        {
            showMessageDialog(null,"No letters are allowed ");
            quantity1.setText(null);
        }
        else if(validation.isnumber(sprice)==0)
        {
            showMessageDialog(null,"No letters are allowed "); 
            price.setText(null);
        }
        else{
        try{

            String q2 = "INSERT INTO Bill (FoodName,bQuantity,price) values ('"+fname+"','"+squan+"','"+sprice+"')";
                    pst1 = conn.prepareStatement(q2);
                    pst1.execute();
                    quantity1.setText(null);
                    price.setText(null);
                    foodid.setText(null);
                    foodname.setText(null);
                    tableload2();
                    showMessageDialog(null,"Successfully Added");
                    
        }
        catch(Exception e){

            System.out.println(e);

        }
    }
    }//GEN-LAST:event_AddMouseClicked

    private void generateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generateMouseClicked
        String trans = trnsprice.getText();
        String vno = vehino.getText();
        
        double v1 = Double.parseDouble(trans);
        double v2=0;
        
        if(trans.isEmpty() || vno.isEmpty())
        {
            showMessageDialog(null,"Enter essential Data");
        }
        else if(validation.isnumber(trans)==0)
        {
            showMessageDialog(null,"No letters are allowed ");
            price.setText(null);
        }
        else{
            
            Date d1 = new Date();
            SimpleDateFormat s = new SimpleDateFormat("YYYY-MM-dd");
            
            try {
                String q = "SELECT SUM(price) FROM bill";
                pst2 = conn.prepareStatement(q);
                rst2 = pst2.executeQuery();
            
                while(rst2.next())
                {   
                    v2=rst2.getDouble("SUM(price)");
                }
                
                
                String full = Double.toString(v2);
                double vv =v1+v2;
                String total = Double.toString(vv);
                
                String q2 = "INSERT INTO finalbill (vehino,finalprice,trnasport,total,Date) values ('"+vno+"','"+full+"','"+trans+"','"+total+"','"+s.format(d1)+"')";
                pst2 = conn.prepareStatement(q2);
                pst2.execute();
                tableload3();
                
                quantity1.setText(null);
                price.setText(null);
                
                
                String sql = "DELETE FROM bill";
                pst1 = conn.prepareStatement(sql);
                pst1.execute();
                tableload2();
             
                } 
                catch (Exception e) 
                {
                    System.out.println(e);
                }
        }
    }//GEN-LAST:event_generateMouseClicked

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
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bill().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Add;
    private javax.swing.JPanel Search;
    private javax.swing.JLabel foodid;
    private javax.swing.JLabel foodname;
    private javax.swing.JPanel generate;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField price;
    private javax.swing.JTextField quantity1;
    private javax.swing.JTextField searchbox;
    private javax.swing.JTextField trnsprice;
    private javax.swing.JTextField vehino;
    // End of variables declaration//GEN-END:variables
}
