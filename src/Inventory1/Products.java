/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventory1;
import db_connect.dbconnect;
import static db_connect.dbconnect.connect;

import java.awt.Color;
import java.awt.event.ItemEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Dharshika
 */
public class Products extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pst = null;
    PreparedStatement pst1 = null;
    ResultSet rs = null;
    ResultSet rs1 = null;
    public Products() {
        con= dbconnect.connect();
        initComponents();
        fillcombo ();
        showjTable();
    }
 private void fillcombo ()
    
            
    {
        try {
            
            
            String sql ="Select * from procategory";
            pst=con.prepareStatement(sql);
            rs =pst.executeQuery();
            while(rs.next())
            
            {
                
                
                String cat = rs.getNString("procategory");
                cmb_productcategory.addItem(cat);
            
            
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        
        
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_procost = new javax.swing.JTextField();
        cmb_productcategory = new javax.swing.JComboBox<>();
        cmb_prosubcategory = new javax.swing.JComboBox<>();
        cmb_size = new javax.swing.JComboBox<>();
        cmb_color = new javax.swing.JComboBox<>();
        lbl_procode = new javax.swing.JLabel();
        cmb_prounitmeasure = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        panel_add = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        panel_update = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        panel_delete = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        panel_cancel = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        panel_refresh = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_pro = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(230, 150));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Product Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Category");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Subcategory");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Size");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Color");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Units of measure");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cost/unit");

        txt_procost.setBackground(new java.awt.Color(204, 204, 204));
        txt_procost.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_procost.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_procostFocusLost(evt);
            }
        });
        txt_procost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_procostActionPerformed(evt);
            }
        });
        txt_procost.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_procostKeyTyped(evt);
            }
        });

        cmb_productcategory.setBackground(new java.awt.Color(204, 204, 204));
        cmb_productcategory.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmb_productcategory.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_productcategoryItemStateChanged(evt);
            }
        });
        cmb_productcategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_productcategoryActionPerformed(evt);
            }
        });

        cmb_prosubcategory.setBackground(new java.awt.Color(204, 204, 204));
        cmb_prosubcategory.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmb_prosubcategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_prosubcategoryActionPerformed(evt);
            }
        });

        cmb_size.setBackground(new java.awt.Color(204, 204, 204));
        cmb_size.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmb_size.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "S", "L", "XL", "XXL", "XXL" }));

        cmb_color.setBackground(new java.awt.Color(204, 204, 204));
        cmb_color.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmb_color.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Blue", "Black", "Grey", "White", "Brown" }));

        lbl_procode.setBackground(new java.awt.Color(51, 51, 51));
        lbl_procode.setForeground(new java.awt.Color(51, 51, 51));
        lbl_procode.setText("procode");

        cmb_prounitmeasure.setBackground(new java.awt.Color(204, 204, 204));
        cmb_prounitmeasure.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmb_prounitmeasure.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single Unit" }));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Rs");

        panel_add.setBackground(new java.awt.Color(51, 51, 51));
        panel_add.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        panel_add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_addMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_addMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel_addMouseExited(evt);
            }
        });
        panel_add.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Add");
        panel_add.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 30, 20));

        panel_update.setBackground(new java.awt.Color(51, 51, 51));
        panel_update.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        panel_update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_updateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_updateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel_updateMouseExited(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText(" Update");

        javax.swing.GroupLayout panel_updateLayout = new javax.swing.GroupLayout(panel_update);
        panel_update.setLayout(panel_updateLayout);
        panel_updateLayout.setHorizontalGroup(
            panel_updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_updateLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel12)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        panel_updateLayout.setVerticalGroup(
            panel_updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_updateLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_delete.setBackground(new java.awt.Color(51, 51, 51));
        panel_delete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        panel_delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_deleteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_deleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel_deleteMouseExited(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText(" Delete");

        javax.swing.GroupLayout panel_deleteLayout = new javax.swing.GroupLayout(panel_delete);
        panel_delete.setLayout(panel_deleteLayout);
        panel_deleteLayout.setHorizontalGroup(
            panel_deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_deleteLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel20)
                .addContainerGap(60, Short.MAX_VALUE))
        );
        panel_deleteLayout.setVerticalGroup(
            panel_deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_deleteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_cancel.setBackground(new java.awt.Color(51, 51, 51));
        panel_cancel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        panel_cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_cancelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_cancelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel_cancelMouseExited(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Cancel");

        javax.swing.GroupLayout panel_cancelLayout = new javax.swing.GroupLayout(panel_cancel);
        panel_cancel.setLayout(panel_cancelLayout);
        panel_cancelLayout.setHorizontalGroup(
            panel_cancelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_cancelLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel23)
                .addContainerGap(66, Short.MAX_VALUE))
        );
        panel_cancelLayout.setVerticalGroup(
            panel_cancelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_cancelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_refresh.setBackground(new java.awt.Color(51, 51, 51));
        panel_refresh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        panel_refresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_refreshMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_refreshMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel_refreshMouseExited(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Refresh");

        javax.swing.GroupLayout panel_refreshLayout = new javax.swing.GroupLayout(panel_refresh);
        panel_refresh.setLayout(panel_refreshLayout);
        panel_refreshLayout.setHorizontalGroup(
            panel_refreshLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_refreshLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel22)
                .addContainerGap(61, Short.MAX_VALUE))
        );
        panel_refreshLayout.setVerticalGroup(
            panel_refreshLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_refreshLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGap(62, 62, 62)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmb_prounitmeasure, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmb_productcategory, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(486, 486, 486)
                                .addComponent(lbl_procode))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txt_procost, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7))
                            .addComponent(cmb_color, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmb_prosubcategory, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmb_size, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(panel_add, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel_update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel_delete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel_refresh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(lbl_procode))
                    .addComponent(cmb_productcategory, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmb_prosubcategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmb_size, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmb_color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(cmb_prounitmeasure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_procost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panel_update, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panel_add, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(panel_cancel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(panel_delete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(panel_refresh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jTable_pro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Category", "Subcategory", "Size", "Color", "Unit/measure", "Cost/unit"
            }
        ));
        jTable_pro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_proMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_pro);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 943, Short.MAX_VALUE))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     
      
    
    
    private void cmb_productcategoryItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_productcategoryItemStateChanged
      
    }//GEN-LAST:event_cmb_productcategoryItemStateChanged

    private void jTable_proMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_proMouseClicked
         int i=jTable_pro.getSelectedRow();
        TableModel model=jTable_pro.getModel();
       
        lbl_procode.setText(model.getValueAt(i, 0).toString());
        cmb_productcategory.setSelectedItem(model.getValueAt(i, 1).toString());
       
        cmb_prosubcategory.setSelectedItem(model.getValueAt(i, 2).toString());
        cmb_size.setSelectedItem(model.getValueAt(i, 3).toString());
        cmb_color.setSelectedItem(model.getValueAt(i, 4).toString());
        cmb_prounitmeasure.setSelectedItem(model.getValueAt(i, 5).toString());
        txt_procost.setText(model.getValueAt(i, 6).toString());
        
    }//GEN-LAST:event_jTable_proMouseClicked

    private void cmb_prosubcategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_prosubcategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_prosubcategoryActionPerformed

    void loadSubCat()
    {
        try {
             
            cmb_prosubcategory.removeAllItems();
            String sql ="Select * from prosubcategory where procategory ='"+cmb_productcategory.getSelectedItem().toString()+"' ";
            pst1=con.prepareStatement(sql);
            rs1 =pst1.executeQuery();
            while(rs1.next())
            
            {
                
                
                String subcat = rs1.getNString("prosubcategory");
                cmb_prosubcategory.addItem(subcat);
                
            
            } 
            
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, e);
        }
    }
    private void cmb_productcategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_productcategoryActionPerformed


        loadSubCat();
        
    }//GEN-LAST:event_cmb_productcategoryActionPerformed

    private void panel_addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_addMouseClicked
        String category =(String)cmb_productcategory.getSelectedItem();
        String subcategory=(String)cmb_prosubcategory.getSelectedItem();
        String size=(String)cmb_size.getSelectedItem();
        String color =(String)cmb_color.getSelectedItem();
        
        
        String catfirstletter =category.length()<1?category:category.substring(0,1);
        String subcatfirstletter =subcategory.length()<1?subcategory:subcategory.substring(0,1);
        
        
        
  
        
        
        
       if((txt_procost.getText()).isEmpty()){
        
            showMessageDialog(null,"Enter all essential data!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
      else{
        int x = JOptionPane.showConfirmDialog(null,"Do you want to add new record?");
        
        if(x==0)
        {
        
        
        String query="INSERT INTO `products`(`procode`,`procategory`, `prosubcategory`, `size`, `color`, `prounitmeasure`,`procostperunit`) " + "VALUES ('"+catfirstletter+" "+subcatfirstletter+" "+size+" "+color+"','"+cmb_productcategory.getSelectedItem()+"','"+cmb_prosubcategory.getSelectedItem()+"','"+cmb_size.getSelectedItem()+"','"+cmb_color.getSelectedItem()+"','"+cmb_prounitmeasure.getSelectedItem()+"','"+txt_procost.getText()+"')";
        executeSqlQuery(query, "Insert");
        }
        else if( x==1) {

            ClearField();
        }
                }
    }//GEN-LAST:event_panel_addMouseClicked

    private void panel_addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_addMouseEntered
        panel_add.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_panel_addMouseEntered

    private void panel_addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_addMouseExited
        panel_add.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_panel_addMouseExited

    private void panel_updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_updateMouseClicked
        int x = JOptionPane.showConfirmDialog(null,"Do you want to Update record?");
        if((txt_procost.getText()).isEmpty()){
        
            showMessageDialog(null,"Enter all essential data!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if(x==0)
        {

             String query="UPDATE `products` SET `procategory`='"+cmb_productcategory.getSelectedItem()+"',`prosubcategory`='"+cmb_prosubcategory.getSelectedItem()+"',`size`='"+cmb_size.getSelectedItem()+"',`color`='"+cmb_color.getSelectedItem()+"',`prounitmeasure`='"+cmb_prounitmeasure.getSelectedItem()+"',`procostperunit`='"+txt_procost.getText()+"',`procostperunit`='"+txt_procost.getText()+"'WHERE `procode`='"+lbl_procode.getText()+"'";
             executeSqlQuery(query, "Update");

        }
        else if( x==1) {

            ClearField();
        }

    }//GEN-LAST:event_panel_updateMouseClicked

    private void panel_updateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_updateMouseEntered
        panel_update.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_panel_updateMouseEntered

    private void panel_updateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_updateMouseExited
        panel_update.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_panel_updateMouseExited

    private void panel_deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_deleteMouseClicked
        int x = JOptionPane.showConfirmDialog(null,"Do you want to Delete record ?");

        if(x==0)
        {
        String query="DELETE FROM `products` WHERE `procode`='"+lbl_procode.getText()+"'";
        executeSqlQuery(query, "Delete");

        }
        else if( x==1) {

            ClearField();
        }

    }//GEN-LAST:event_panel_deleteMouseClicked

    private void panel_deleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_deleteMouseEntered
        panel_delete.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_panel_deleteMouseEntered

    private void panel_deleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_deleteMouseExited
        panel_delete.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_panel_deleteMouseExited

    private void panel_cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_cancelMouseClicked
        this.dispose();
    }//GEN-LAST:event_panel_cancelMouseClicked

    private void panel_cancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_cancelMouseEntered
        panel_cancel.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_panel_cancelMouseEntered

    private void panel_cancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_cancelMouseExited
        panel_cancel.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_panel_cancelMouseExited

    private void panel_refreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_refreshMouseClicked
        ClearField();
    }//GEN-LAST:event_panel_refreshMouseClicked

    private void panel_refreshMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_refreshMouseEntered
        panel_refresh.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_panel_refreshMouseEntered

    private void panel_refreshMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_refreshMouseExited
        panel_refresh.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_panel_refreshMouseExited

    private void txt_procostFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_procostFocusLost
        
        
         
    }//GEN-LAST:event_txt_procostFocusLost

    private void txt_procostKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_procostKeyTyped
         txt_procost.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_txt_procostKeyTyped

    private void txt_procostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_procostActionPerformed
            //double cost = Double.parseDouble(txt_procost.getText());
        if(Validations.isnum(txt_procost.getText())==0) //isnum method
         {
            showMessageDialog(null,"Please enter valid Product cost!");
            txt_procost.setForeground(new Color(255,0,0));
            txt_procost.setForeground(new Color(255,0,0));
         } 
       
  
      else if(Validations.minus(Double.parseDouble(txt_procost.getText()))==0) //isnum method
         {
            showMessageDialog(null,"Negative value not allowed in Product cost field!");
            txt_procost.setForeground(new Color(255,0,0));
            txt_procost.setForeground(new Color(255,0,0));
         }  
    }//GEN-LAST:event_txt_procostActionPerformed

    
   
    
    
    
     public ArrayList<ProductsModel> getProductsList()
    {
        ArrayList<ProductsModel> productslist=new ArrayList<>();
        Connection connection = connect();
        String query="Select * from products";
        
        Statement st;
        ResultSet rs;
        
        try {
            st=connection.createStatement();
            rs=st.executeQuery(query);
            ProductsModel promodel;
            
            while(rs.next())
            {
                
                
                promodel=new ProductsModel(rs.getString("procode"), rs.getString("procategory"), rs.getString("prosubcategory"), rs.getString("size"), rs.getString("color"), rs.getString("prounitmeasure"), rs.getDouble("procostperunit"));
                productslist.add(promodel);
            }
                    
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return productslist;
    }
     
      public void showjTable()
    {
        ArrayList<ProductsModel> listdata=getProductsList();
        DefaultTableModel model =(DefaultTableModel)jTable_pro.getModel();
        
        Object [] row=new Object[7];
        for(int i = 0;i<listdata.size();i++)
        {
            row[0]=listdata.get(i).getProcode();
            row[1]=listdata.get(i).getProcategory();
            row[2]=listdata.get(i).getProsubcategory();
            row[3]=listdata.get(i).getSize();
            row[4]=listdata.get(i).getColor();
            row[5]=listdata.get(i).getProunitmeasure();
            row[6]=listdata.get(i).getProcostunit();
          
            
            model.addRow(row);
        }
    
    }
      public void ClearField()
    {
        cmb_productcategory.setSelectedItem(null);
        cmb_prosubcategory.setSelectedItem(null);
        cmb_size.setSelectedItem(null);
        cmb_color.setSelectedItem(null);
        cmb_prounitmeasure.setSelectedItem(null);
        txt_procost.setText(null);
        
    }
      
        public void executeSqlQuery(String query,String message)
     {
         Connection conn= connect();
         Statement st;
         try {
              st=con.createStatement();
              if((st.executeUpdate(query))==1)
              {
                  // data get refresh after query runs 
                  DefaultTableModel model = (DefaultTableModel)jTable_pro.getModel();
                  model.setRowCount(0);
                  showjTable();
                  
                  
                  // message box
                  JOptionPane.showMessageDialog(null, "Data "+message+" Successfully");
                  ClearField();
              }else{
                  JOptionPane.showMessageDialog(null, "Data "+message+" Failed");
              }
         } catch (Exception e) {
             JOptionPane.showMessageDialog(null,"Product Details already added !" );
         }
     
     }
     
     
     
     
    
        //main method
   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Products().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmb_color;
    private javax.swing.JComboBox<String> cmb_productcategory;
    private javax.swing.JComboBox<String> cmb_prosubcategory;
    private javax.swing.JComboBox<String> cmb_prounitmeasure;
    private javax.swing.JComboBox<String> cmb_size;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_pro;
    private javax.swing.JLabel lbl_procode;
    private javax.swing.JPanel panel_add;
    private javax.swing.JPanel panel_cancel;
    private javax.swing.JPanel panel_delete;
    private javax.swing.JPanel panel_refresh;
    private javax.swing.JPanel panel_update;
    private javax.swing.JTextField txt_procost;
    // End of variables declaration//GEN-END:variables
}
