/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventory1;

import db_connect.dbconnect;
import static db_connect.dbconnect.connect;

import java.awt.Color;
import javax.swing.table.TableModel;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import Inventory1.Validations;


/**
 *
 * @author Dharshika
 */
public class RawMaterials extends javax.swing.JFrame {
    Connection con = null;
    PreparedStatement pst = null;
    PreparedStatement pst1 = null;
    ResultSet rs = null;
    ResultSet rs1 = null;
    String ImgPath = null;
    /**
     * Creates new form RawMaterials
     */
    public RawMaterials() {
        initComponents();
        con= dbconnect.connect();
        fillcombo ();
        showjTable();//Visibel after form loaded
    }



    private void fillcombo ()
           
    {
        try {
            
            String sql ="Select * from rawcategory";
            pst=con.prepareStatement(sql);
            rs =pst.executeQuery();
            while(rs.next())
            
            {
                
                
                String cat = rs.getNString("rawcategory");
                cmb_category.addItem(cat);
            
            
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        
        
    }
    @SuppressWarnings("unchecked")
     void  loadSubCat(){
    
    try {
            
            cmb_subcategory.removeAllItems();
            String sql ="Select * from rawsubcategory where rawcategory ='"+cmb_category.getSelectedItem().toString()+"' ";
            pst1=con.prepareStatement(sql);
            rs1 =pst1.executeQuery();
            while(rs1.next())
            
            {
                
                
                String subcat = rs1.getNString("rawsubcategory");
                cmb_subcategory.addItem(subcat);
               
            
            } 
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    
    
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        cmb_category = new javax.swing.JComboBox();
        cmb_subcategory = new javax.swing.JComboBox();
        txt_name = new javax.swing.JTextField();
        cmb_unitmeasure = new javax.swing.JComboBox();
        txt_startinv = new javax.swing.JTextField();
        txt_reorder = new javax.swing.JTextField();
        txt_costperunit = new javax.swing.JTextField();
        cmb_color = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        lbl_code = new javax.swing.JLabel();
        lbl_image = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbl_namealert = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
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
        panel_search = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        panel_upload = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_inv = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(230, 150));
        setMaximizedBounds(new java.awt.Rectangle(0, 125, 0, 0));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(1130, 610));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Raw Material Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        cmb_category.setBackground(new java.awt.Color(153, 153, 153));
        cmb_category.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmb_category.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_categoryItemStateChanged(evt);
            }
        });
        cmb_category.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_categoryActionPerformed(evt);
            }
        });

        cmb_subcategory.setBackground(new java.awt.Color(153, 153, 153));
        cmb_subcategory.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txt_name.setBackground(new java.awt.Color(153, 153, 153));
        txt_name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        cmb_unitmeasure.setBackground(new java.awt.Color(153, 153, 153));
        cmb_unitmeasure.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmb_unitmeasure.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Meter", "Number", "Bundle" }));
        cmb_unitmeasure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_unitmeasureActionPerformed(evt);
            }
        });

        txt_startinv.setBackground(new java.awt.Color(153, 153, 153));
        txt_startinv.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_startinv.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_startinvFocusLost(evt);
            }
        });
        txt_startinv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_startinvActionPerformed(evt);
            }
        });
        txt_startinv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_startinvKeyTyped(evt);
            }
        });

        txt_reorder.setBackground(new java.awt.Color(153, 153, 153));
        txt_reorder.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_reorder.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_reorderFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_reorderFocusLost(evt);
            }
        });
        txt_reorder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_reorderActionPerformed(evt);
            }
        });
        txt_reorder.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_reorderKeyTyped(evt);
            }
        });

        txt_costperunit.setBackground(new java.awt.Color(153, 153, 153));
        txt_costperunit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_costperunit.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_costperunitFocusLost(evt);
            }
        });
        txt_costperunit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_costperunitActionPerformed(evt);
            }
        });
        txt_costperunit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_costperunitKeyTyped(evt);
            }
        });

        cmb_color.setBackground(new java.awt.Color(153, 153, 153));
        cmb_color.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmb_color.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Blue", "Black", "Grey", "Purple", "Beige", "White" }));
        cmb_color.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_colorItemStateChanged(evt);
            }
        });

        lbl_code.setForeground(new java.awt.Color(51, 51, 51));
        lbl_code.setText("jLabel9");

        lbl_image.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Rs");

        lbl_namealert.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl_namealert.setForeground(new java.awt.Color(51, 51, 51));
        lbl_namealert.setText("!");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Category");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Subcategory");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Color");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Name");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Unit/measure");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Starting Inventory");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Re order Level");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Cost/unit");

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

        panel_search.setBackground(new java.awt.Color(51, 51, 51));
        panel_search.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        panel_search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_searchMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_searchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel_searchMouseExited(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Search");

        javax.swing.GroupLayout panel_searchLayout = new javax.swing.GroupLayout(panel_search);
        panel_search.setLayout(panel_searchLayout);
        panel_searchLayout.setHorizontalGroup(
            panel_searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_searchLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel24)
                .addContainerGap(61, Short.MAX_VALUE))
        );
        panel_searchLayout.setVerticalGroup(
            panel_searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_searchLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_upload.setBackground(new java.awt.Color(51, 51, 51));
        panel_upload.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        panel_upload.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_uploadMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_uploadMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel_uploadMouseExited(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Upload Image");

        javax.swing.GroupLayout panel_uploadLayout = new javax.swing.GroupLayout(panel_upload);
        panel_upload.setLayout(panel_uploadLayout);
        panel_uploadLayout.setHorizontalGroup(
            panel_uploadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_uploadLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel25)
                .addContainerGap(71, Short.MAX_VALUE))
        );
        panel_uploadLayout.setVerticalGroup(
            panel_uploadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_uploadLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel10))
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panel_add, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmb_category, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmb_subcategory, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmb_color, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmb_unitmeasure, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_startinv, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addComponent(lbl_namealert, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl_image, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_reorder, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txt_costperunit, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel9)))
                                .addGap(129, 129, 129)
                                .addComponent(panel_upload, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel_update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel_delete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel_refresh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44)
                .addComponent(lbl_code)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panel_update, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(cmb_category, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(cmb_subcategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(cmb_color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(cmb_unitmeasure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txt_startinv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7)))
                                    .addComponent(jLabel1)
                                    .addComponent(lbl_image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(118, 118, 118)
                                .addComponent(lbl_namealert, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_reorder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_costperunit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9)))
                            .addComponent(panel_upload, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(lbl_code))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(panel_add, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(panel_cancel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(panel_delete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(panel_refresh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(panel_search, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable_inv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Category", "Sub Category", "Name", "Color", "Units of measure", "Starting Inventory", "Re order Level", "Cost/Unit", "Stock Qty", "Status", "image"
            }
        ));
        jTable_inv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_invMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_inv);
        if (jTable_inv.getColumnModel().getColumnCount() > 0) {
            jTable_inv.getColumnModel().getColumn(11).setMinWidth(120);
            jTable_inv.getColumnModel().getColumn(11).setPreferredWidth(150);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1076, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public ArrayList<RawmaterialsModel> getInventoryList()
    {
        ArrayList<RawmaterialsModel> inventoryList=new ArrayList<>();
        Connection connection = connect();
        String query="Select * from rawmaterials";
        
        Statement st;
        ResultSet rs;
        
        try {
            st=connection.createStatement();
            rs=st.executeQuery(query);
            RawmaterialsModel invmodel;
            
            while(rs.next())
            {
                invmodel=new RawmaterialsModel(rs.getInt("code"), rs.getString("category"), rs.getString("subcategory"), rs.getString("name"), rs.getString("color"), rs.getString("unitmeasure"), rs.getDouble("startinginv"), rs.getDouble("reorder"), rs.getDouble("cost"), rs.getDouble("stockqty"), rs.getString("orderstatus"),rs.getBytes("image"));
                inventoryList.add(invmodel);
            }
                    
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return inventoryList;
    }
    
    public void showjTable()
    {
        ArrayList<RawmaterialsModel> listdata=getInventoryList();
        DefaultTableModel model =(DefaultTableModel)jTable_inv.getModel();
        
        Object [] row=new Object[12];
        for(int i = 0;i<listdata.size();i++)
        {
            row[0]=listdata.get(i).getCode();
            row[1]=listdata.get(i).getCategory();
            row[2]=listdata.get(i).getSubcategory();
            row[3]=listdata.get(i).getName();
            row[4]=listdata.get(i).getColor();
            row[5]=listdata.get(i).getUnitmeasure();
            row[6]=listdata.get(i).getStartinv();
            row[7]=listdata.get(i).getReorder();
            row[8]=listdata.get(i).getCost();
            row[9]=listdata.get(i).getStockqty();
            row[10]=listdata.get(i).getOrderstatus();
            row[11]=listdata.get(i).getMyImage();
                        
           


            
            model.addRow(row);
        }
    
    }
    
    public ImageIcon ResizeImage(String imagePath, byte[] pic)
{
                ImageIcon myImage = null;

                if(imagePath != null)
            {
                myImage = new ImageIcon(imagePath);
            }
                else{
                        myImage = new ImageIcon(pic);
                    }

            Image img = myImage.getImage();
            Image img2 = img.getScaledInstance(lbl_image.getWidth(), lbl_image.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon image = new ImageIcon(img2);
            return image;

}
   
    
    
    //when clicked the table  row appears on form
    private void jTable_invMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_invMouseClicked
        
        try{
        int i=jTable_inv.getSelectedRow();
        TableModel model=jTable_inv.getModel();
       
        lbl_code.setText(model.getValueAt(i, 0).toString());
        cmb_category.setSelectedItem(model.getValueAt(i, 1).toString());
        cmb_subcategory.setSelectedItem(model.getValueAt(i, 2).toString());
        txt_name.setText(model.getValueAt(i, 3).toString());
        cmb_color.setSelectedItem(model.getValueAt(i, 4).toString());
        cmb_unitmeasure.setSelectedItem(model.getValueAt(i, 5).toString());
        txt_startinv.setText(model.getValueAt(i, 6).toString());
        txt_reorder.setText(model.getValueAt(i, 7).toString());
        txt_costperunit.setText(model.getValueAt(i, 8).toString());
        
        
       
//      BufferedImage buff=null;
//      ImageIcon imgicon =null;
//      Blob blob =(Blob) model.getValueAt(i, 11);
//      InputStream is =blob.getBinaryStream();
//      buff=ImageIO.read(is);
//      imgicon=new ImageIcon(buff.getScaledInstance(lbl_image.getWidth(),lbl_image.getHeight(),java.awt.Image.SCALE_SMOOTH));
//      lbl_image.setIcon(imgicon);
        } 
        
        
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
      
         
    }//GEN-LAST:event_jTable_invMouseClicked

    
    
    
    
    
    
    
    private void cmb_categoryItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_categoryItemStateChanged
        
       
    }//GEN-LAST:event_cmb_categoryItemStateChanged

    
  
    
    private void cmb_categoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_categoryActionPerformed
        loadSubCat();
    }//GEN-LAST:event_cmb_categoryActionPerformed

    private void cmb_colorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_colorItemStateChanged
      
    }//GEN-LAST:event_cmb_colorItemStateChanged

    private void cmb_unitmeasureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_unitmeasureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_unitmeasureActionPerformed

    private void txt_startinvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_startinvActionPerformed
 if(Validations.isnum(txt_startinv.getText())==0) //isnum method
         {
            showMessageDialog(null,"Please enter valid value in startin inventory field!");
            txt_startinv.setForeground(new Color(255,0,0));
            txt_startinv.setForeground(new Color(255,0,0));
         } 
        //double startinv = Double.parseDouble(txt_startinv.getText());
  
      else if(Validations.minus(Double.parseDouble(txt_startinv.getText()))==0) //isnum method
         {
            showMessageDialog(null,"Negative value not allowed in startin inventory field!");
            txt_startinv.setForeground(new Color(255,0,0));
            txt_startinv.setForeground(new Color(255,0,0));
         }         
    }//GEN-LAST:event_txt_startinvActionPerformed

    private void txt_reorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_reorderActionPerformed
 if(Validations.isnum(txt_reorder.getText())==0) //isnum method
         {
            showMessageDialog(null,"Please enter valid Reorder Level!");
            txt_reorder.setForeground(new Color(255,0,0));
            txt_reorder.setForeground(new Color(255,0,0));
         } 
   
 else if(Validations.minus(Double.parseDouble(txt_reorder.getText()))==0) //isnum method
         {
            showMessageDialog(null,"Negative value not allowed in Reorder Level field!");
            txt_reorder.setForeground(new Color(255,0,0));
            txt_reorder.setForeground(new Color(255,0,0));
         }        
        
    }//GEN-LAST:event_txt_reorderActionPerformed

    private void txt_costperunitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_costperunitActionPerformed
       if(Validations.isnum(txt_costperunit.getText())==0) //isnum method
         {
            showMessageDialog(null,"Please enter valid cost value !");
            txt_costperunit.setForeground(new Color(255,0,0));
            
         } 
         
          else if(Validations.minus(Double.parseDouble(txt_costperunit.getText()))==0) //isnum method
         {
            showMessageDialog(null,"Negative value not allowed in cost field !");
            txt_costperunit.setForeground(new Color(255,0,0));
            
         }  
          
    }//GEN-LAST:event_txt_costperunitActionPerformed

    private void panel_addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_addMouseClicked
         String color = (String) cmb_color.getSelectedItem();
         String name =txt_name.getText();
         String sub =(String)cmb_subcategory.getSelectedItem();                   
         String cat =(String)cmb_category.getSelectedItem();
         String unim =(String)cmb_unitmeasure.getSelectedItem();
         String startinv =txt_startinv.getText();
         String reorder =txt_reorder.getText();
         String cost =txt_costperunit.getText();
        String uniquename=name+" "+sub+" "+color+" "+cat;
         
         
         
         
         
         
         
           if(found(uniquename)==0){
          showMessageDialog(null,"Raw material Details already added!");
          ClearField();
              
          }
         
             
        else if(((String)cmb_category.getSelectedItem()).isEmpty() || ((String)cmb_subcategory.getSelectedItem()).isEmpty() || (txt_name.getText()).isEmpty() || ((String) cmb_color.getSelectedItem()).isEmpty() || ((String)cmb_unitmeasure.getSelectedItem()).isEmpty() || (txt_startinv.getText()).isEmpty()|| txt_reorder.getText().isEmpty()|| txt_costperunit.getText().isEmpty()){
        
            showMessageDialog(null,"Enter all essential data!", "Error", JOptionPane.ERROR_MESSAGE);
        }
          
        else{ 
            
        try{
         int x = JOptionPane.showConfirmDialog(null,"Do you want to add new record?");
        
        if(x==0)
        {
            
             
            InputStream img = new FileInputStream(new File(ImgPath));
            String query="INSERT INTO `rawmaterials`(`category`, `subcategory`, `name`, `color`, `unitmeasure`,`startinginv`,`reorder`,`cost`,`stockqty`,`orderstatus`,`image`) "
                               + "VALUES ('"+cmb_category.getSelectedItem()+"','"+cmb_subcategory.getSelectedItem()+"','"+name+" "+sub+" "+color+" "+cat+"','"+cmb_color.getSelectedItem()+"','"+cmb_unitmeasure.getSelectedItem()+"','"+txt_startinv.getText()+"','"+txt_reorder.getText()+"','"+txt_costperunit.getText()+"','"+txt_startinv.getText()+"','NO','"+(img)+"')";
            executeSqlQuery(query, "Insert");
                     
          
                
                
               
        }
        else if( x==1) {
                  
                  ClearField();
              }
        
       }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
           
     } 
        
         System.out.println("Image => "+ImgPath);
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
         if(((String)cmb_category.getSelectedItem()).isEmpty() || ((String)cmb_subcategory.getSelectedItem()).isEmpty() || (txt_name.getText()).isEmpty() || ((String) cmb_color.getSelectedItem()).isEmpty() || ((String)cmb_unitmeasure.getSelectedItem()).isEmpty() || (txt_startinv.getText()).isEmpty()|| txt_reorder.getText().isEmpty()|| txt_costperunit.getText().isEmpty()){
        
            showMessageDialog(null,"Enter all essential data!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if(x==0)
        {
        
        String query="UPDATE `rawmaterials` SET `category`='"+cmb_category.getSelectedItem()+"',`subcategory`='"+cmb_subcategory.getSelectedItem()+"',`name`='"+txt_name.getText()+"',`color`='"+cmb_color.getSelectedItem()+"',`unitmeasure`='"+cmb_unitmeasure.getSelectedItem()+"',`startinginv`='"+txt_startinv.getText()+"',`reorder`='"+txt_reorder.getText()+"',`cost`='"+txt_costperunit.getText()+"' WHERE `code`='"+lbl_code.getText()+"'";
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
        
        String query="DELETE FROM `rawmaterials` WHERE `code`='"+lbl_code.getText()+"'";
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

    private void panel_searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_searchMouseClicked
          SearchRawmaterialsbyName ra = new SearchRawmaterialsbyName();
                  ra.setVisible(true);
    }//GEN-LAST:event_panel_searchMouseClicked

    private void panel_searchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_searchMouseEntered
        panel_search.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_panel_searchMouseEntered

    private void panel_searchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_searchMouseExited
         panel_search.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_panel_searchMouseExited

    private void panel_uploadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_uploadMouseClicked
          JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new File(System.getProperty("user.home")));

        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.images", "jpg","png");
        file.addChoosableFileFilter(filter);
        int result = file.showSaveDialog(null);
        if(result == JFileChooser.APPROVE_OPTION)
        {
            File selectedFile = file.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            lbl_image.setIcon(ResizeImage(path, null));
            ImgPath = path;
}
else{
System.out.println("No File Selected");
} 
    }//GEN-LAST:event_panel_uploadMouseClicked

    private void panel_uploadMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_uploadMouseEntered
      panel_upload.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_panel_uploadMouseEntered

    private void panel_uploadMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_uploadMouseExited
          panel_upload.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_panel_uploadMouseExited

    private void txt_startinvKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_startinvKeyTyped
        txt_startinv.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_txt_startinvKeyTyped

    private void txt_costperunitKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_costperunitKeyTyped
         txt_costperunit.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_txt_costperunitKeyTyped

    private void txt_reorderKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_reorderKeyTyped
         txt_reorder.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_txt_reorderKeyTyped

    private void txt_startinvFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_startinvFocusLost
      
//       if(Validations.isnum(txt_startinv.getText())==0) //isnum method
//         {
//            showMessageDialog(null,"Please enter valid value in startin inventory field!");
//            txt_startinv.setForeground(new Color(255,0,0));
//            txt_startinv.setForeground(new Color(255,0,0));
//         } 
//        //double startinv = Double.parseDouble(txt_startinv.getText());
//  
//      else if(Validations.minus(Double.parseDouble(txt_startinv.getText()))==0) //isnum method
//         {
//            showMessageDialog(null,"Negative value not allowed in startin inventory field!");
//            txt_startinv.setForeground(new Color(255,0,0));
//            txt_startinv.setForeground(new Color(255,0,0));
//         }  
  
    }//GEN-LAST:event_txt_startinvFocusLost

    private void txt_reorderFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_reorderFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_reorderFocusGained

    private void txt_reorderFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_reorderFocusLost
      
       
//  if(Validations.isnum(txt_reorder.getText())==0) //isnum method
//         {
//            showMessageDialog(null,"Please enter valid Reorder Level!");
//            txt_reorder.setForeground(new Color(255,0,0));
//            txt_reorder.setForeground(new Color(255,0,0));
//         } 
//   double reorder = Double.parseDouble(txt_reorder.getText());
//  if(Validations.minus(reorder)==0) //isnum method
//         {
//            showMessageDialog(null,"Negative value not allowed in Reorder Level field!");
//            txt_reorder.setForeground(new Color(255,0,0));
//            txt_reorder.setForeground(new Color(255,0,0));
//         }  
//        
    }//GEN-LAST:event_txt_reorderFocusLost

    private void txt_costperunitFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_costperunitFocusLost
          
//    if(Validations.isnum(txt_costperunit.getText())==0) //isnum method
//         {
//            showMessageDialog(null,"Please enter number value !");
//            txt_costperunit.setForeground(new Color(255,0,0));
//            
//         } 
//   double cost = Double.parseDouble(txt_costperunit.getText());
//  if(Validations.minus(cost)==0) //isnum method
//         {
//            showMessageDialog(null,"Negative value not allowed !");
//            txt_costperunit.setForeground(new Color(255,0,0));
//            
//         }  
      
    }//GEN-LAST:event_txt_costperunitFocusLost

    public void ClearField()
    {
        txt_name.setText(null);
        txt_costperunit.setText(null);
        txt_reorder.setText(null);
        txt_startinv.setText(null);
        lbl_image.setIcon(null);
        cmb_category.removeAll();
        
        cmb_color.removeAll();
        cmb_subcategory.removeAll();
        cmb_unitmeasure.removeAll();
        
        
    }
    
     public int found(String m)
    {
        int a=1;
        
        if(!m.isEmpty())
        {
            
            String query = "SELECT * FROM rawmaterials ";
            try {
                Connection connection = connect();
                Statement st;
                ResultSet rs;
              
            st=connection.createStatement();
            rs=st.executeQuery(query);
                while(rs.next())
                {
                    String name = rs.getString("name");
                    
                    if(m.equals(name))
                    {
                        a=0;
                    }
                }
                
            } catch (Exception e) {
                
               JOptionPane.showMessageDialog(null, e);
            }
        }        
        return a;
    }

    
    
    
     //query execution main method
     public void executeSqlQuery(String query,String message)
     {
         Connection conn= connect();
         Statement st;
         try {
              st=con.createStatement();
              if((st.executeUpdate(query))==1)
              {
                  // data get refresh after query runs 
                  DefaultTableModel model = (DefaultTableModel)jTable_inv.getModel();
                  model.setRowCount(0);
                  showjTable();
                                    
                  // message box
                  JOptionPane.showMessageDialog(null, "Data "+message+" Successfully");
                  ClearField();
              }else{
                  JOptionPane.showMessageDialog(null, "Data "+message+" Failed");
              }
         } catch (Exception e) {
             JOptionPane.showMessageDialog(null, e);
            
         }
         
     }

    
     
     
    
    
     
     
     
     
     
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
            java.util.logging.Logger.getLogger(RawMaterials.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RawMaterials.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RawMaterials.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RawMaterials.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RawMaterials().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmb_category;
    private javax.swing.JComboBox cmb_color;
    private javax.swing.JComboBox cmb_subcategory;
    private javax.swing.JComboBox cmb_unitmeasure;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_inv;
    private javax.swing.JLabel lbl_code;
    private javax.swing.JLabel lbl_image;
    private javax.swing.JLabel lbl_namealert;
    private javax.swing.JPanel panel_add;
    private javax.swing.JPanel panel_cancel;
    private javax.swing.JPanel panel_delete;
    private javax.swing.JPanel panel_refresh;
    private javax.swing.JPanel panel_search;
    private javax.swing.JPanel panel_update;
    private javax.swing.JPanel panel_upload;
    private javax.swing.JTextField txt_costperunit;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_reorder;
    private javax.swing.JTextField txt_startinv;
    // End of variables declaration//GEN-END:variables
}
