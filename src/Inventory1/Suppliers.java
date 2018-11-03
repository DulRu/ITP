/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventory1;

import db_connect.dbconnect;
import static db_connect.dbconnect.connect;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ItemEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;




/**
 *
 * @author Dharshika
 */
public class Suppliers extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pst = null;
    PreparedStatement pst1 = null;
    ResultSet rs = null;
    ResultSet rs1 = null;
     
   
    public Suppliers() {
        initComponents();
        con= dbconnect.connect();
        
    Connection con = null;
    PreparedStatement pst = null;
    PreparedStatement pst1 = null;
    ResultSet rs = null;
    ResultSet rs1 = null;
    fillcombo ();
        showjTable();
       
    }
    

   @SuppressWarnings("unchecked")
    private void fillcombo ()
    
            
    {
        try {
            
            
            String sql ="Select * from rawcategory";
            pst=con.prepareStatement(sql);
            rs =pst.executeQuery();
            while(rs.next())
            
            {
                
                
                String cat = rs.getNString("rawcategory");
                cmb_itemcat.addItem(cat);
            
            
            }
            
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, e);
        }
        
        
        
    }
    
  
           
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel13 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel16 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_buissname = new javax.swing.JTextField();
        txt_contactname = new javax.swing.JTextField();
        txt_address = new javax.swing.JTextField();
        txt_phone = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        txt_website = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        cmb_itemcat = new javax.swing.JComboBox();
        cmb_itemsubcat = new javax.swing.JComboBox();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txt_accountno = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_notes = new javax.swing.JTextField();
        lbl_suppid = new javax.swing.JLabel();
        lbl_emailalert = new javax.swing.JLabel();
        lbl_phonevalid = new javax.swing.JLabel();
        lbl_accountnoalert = new javax.swing.JLabel();
        add = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        update = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        delete = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        cancle = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        refresh1 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        cmb_country = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_supplier = new javax.swing.JTable();

        jLabel13.setText("jLabel13");

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel16.setText("jLabel16");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(230, 150));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setPreferredSize(new java.awt.Dimension(1095, 768));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Supplier Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Supplier ID");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Business Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Contact Name");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Country");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Address");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Phone");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Email");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Web site");

        txt_buissname.setBackground(new java.awt.Color(204, 204, 204));
        txt_buissname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txt_contactname.setBackground(new java.awt.Color(204, 204, 204));
        txt_contactname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txt_address.setBackground(new java.awt.Color(204, 204, 204));
        txt_address.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_addressActionPerformed(evt);
            }
        });

        txt_phone.setBackground(new java.awt.Color(204, 204, 204));
        txt_phone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_phoneActionPerformed(evt);
            }
        });
        txt_phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_phoneKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_phoneKeyTyped(evt);
            }
        });

        txt_email.setBackground(new java.awt.Color(204, 204, 204));
        txt_email.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_emailFocusLost(evt);
            }
        });
        txt_email.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txt_emailMouseExited(evt);
            }
        });
        txt_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_emailActionPerformed(evt);
            }
        });
        txt_email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_emailKeyTyped(evt);
            }
        });

        txt_website.setBackground(new java.awt.Color(204, 204, 204));
        txt_website.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_website.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_websiteMouseClicked(evt);
            }
        });
        txt_website.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_websiteKeyPressed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Item Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Item Category");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Item Subcategory");

        cmb_itemcat.setBackground(new java.awt.Color(204, 204, 204));
        cmb_itemcat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmb_itemcat.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_itemcatItemStateChanged(evt);
            }
        });
        cmb_itemcat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_itemcatActionPerformed(evt);
            }
        });

        cmb_itemsubcat.setBackground(new java.awt.Color(204, 204, 204));
        cmb_itemsubcat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmb_itemsubcat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_itemsubcatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addComponent(cmb_itemcat, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(37, 37, 37)
                        .addComponent(cmb_itemsubcat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(19, 19, 19))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(cmb_itemcat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmb_itemsubcat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Account Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Account No");

        txt_accountno.setBackground(new java.awt.Color(204, 204, 204));
        txt_accountno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_accountno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_accountnoFocusLost(evt);
            }
        });
        txt_accountno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_accountnoActionPerformed(evt);
            }
        });
        txt_accountno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_accountnoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_accountnoKeyTyped(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Notes");

        txt_notes.setBackground(new java.awt.Color(204, 204, 204));
        txt_notes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_notes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_notesKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11))
                .addGap(32, 32, 32)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(txt_accountno, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(txt_notes, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_accountno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(txt_notes, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        lbl_suppid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_suppid.setForeground(new java.awt.Color(255, 255, 255));
        lbl_suppid.setText("ID");

        lbl_emailalert.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        lbl_emailalert.setForeground(new java.awt.Color(51, 51, 51));
        lbl_emailalert.setText("!");

        lbl_phonevalid.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        lbl_phonevalid.setForeground(new java.awt.Color(51, 51, 51));
        lbl_phonevalid.setText("!");

        lbl_accountnoalert.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        lbl_accountnoalert.setForeground(new java.awt.Color(51, 51, 51));
        lbl_accountnoalert.setText("!");

        add.setBackground(new java.awt.Color(51, 51, 51));
        add.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addMouseExited(evt);
            }
        });

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Add");

        javax.swing.GroupLayout addLayout = new javax.swing.GroupLayout(add);
        add.setLayout(addLayout);
        addLayout.setHorizontalGroup(
            addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel15)
                .addContainerGap(73, Short.MAX_VALUE))
        );
        addLayout.setVerticalGroup(
            addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        update.setBackground(new java.awt.Color(51, 51, 51));
        update.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updateMouseExited(evt);
            }
        });

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText(" Update");

        javax.swing.GroupLayout updateLayout = new javax.swing.GroupLayout(update);
        update.setLayout(updateLayout);
        updateLayout.setHorizontalGroup(
            updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel17)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        updateLayout.setVerticalGroup(
            updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        delete.setBackground(new java.awt.Color(51, 51, 51));
        delete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteMouseExited(evt);
            }
        });

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText(" Delete");

        javax.swing.GroupLayout deleteLayout = new javax.swing.GroupLayout(delete);
        delete.setLayout(deleteLayout);
        deleteLayout.setHorizontalGroup(
            deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel20)
                .addContainerGap(61, Short.MAX_VALUE))
        );
        deleteLayout.setVerticalGroup(
            deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cancle.setBackground(new java.awt.Color(51, 51, 51));
        cancle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        cancle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancleMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancleMouseExited(evt);
            }
        });

        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Cancel");

        javax.swing.GroupLayout cancleLayout = new javax.swing.GroupLayout(cancle);
        cancle.setLayout(cancleLayout);
        cancleLayout.setHorizontalGroup(
            cancleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cancleLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel25)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        cancleLayout.setVerticalGroup(
            cancleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cancleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        refresh1.setBackground(new java.awt.Color(51, 51, 51));
        refresh1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        refresh1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refresh1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                refresh1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                refresh1MouseExited(evt);
            }
        });

        jLabel23.setBackground(new java.awt.Color(255, 255, 255));
        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Refresh");

        javax.swing.GroupLayout refresh1Layout = new javax.swing.GroupLayout(refresh1);
        refresh1.setLayout(refresh1Layout);
        refresh1Layout.setHorizontalGroup(
            refresh1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(refresh1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel23)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        refresh1Layout.setVerticalGroup(
            refresh1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(refresh1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cmb_country.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sri Lanka", "India", "China", "Pakistan" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(59, 59, 59)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_contactname, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                            .addComponent(txt_buissname)
                            .addComponent(lbl_suppid)
                            .addComponent(cmb_country, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(72, 72, 72)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(65, 65, 65))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6))
                                .addGap(59, 59, 59)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_website, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_emailalert, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txt_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_phonevalid, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt_address, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cancle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(refresh1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_accountnoalert, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txt_address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_suppid)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_buissname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(lbl_phonevalid))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_contactname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(lbl_emailalert))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txt_website, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9))
                    .addComponent(cmb_country, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(lbl_accountnoalert)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancle, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refresh1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jTable_supplier.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Bussiness name", "Contact name", "Country", "Category", "Subcategory", "Address", "Phone", "email", "website", "Accountno", "notes"
            }
        ));
        jTable_supplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_supplierMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_supplier);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 924, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(186, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1130, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
     void  loadSubCat(){
    
    try {
            
            cmb_itemsubcat.removeAllItems();
            String sql ="Select * from rawsubcategory where rawcategory ='"+cmb_itemcat.getSelectedItem().toString()+"' ";
            pst1=con.prepareStatement(sql);
            rs1 =pst1.executeQuery();
            while(rs1.next())
            
            {
                
                
                String subcat = rs1.getNString("rawsubcategory");
                cmb_itemsubcat.addItem(subcat);
               
            
            } 
            
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, e);
        }
    
    
    }  
    
    
   
    
    
    
    
    
    
    
    
    private void jTable_supplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_supplierMouseClicked
       
        txt_phone.setForeground(new Color(51,51,51));
        txt_email.setForeground(new Color(51,51,51));
        txt_accountno.setForeground(new Color(51,51,51));
        
        
        int i=jTable_supplier.getSelectedRow();
        TableModel model=jTable_supplier.getModel();
        
        lbl_suppid.setText(model.getValueAt(i, 0).toString());
        txt_buissname.setText(model.getValueAt(i, 1).toString());
        txt_contactname.setText(model.getValueAt(i, 2).toString());
        cmb_country.setSelectedItem(model.getValueAt(i, 3).toString());
        cmb_itemcat.setSelectedItem(model.getValueAt(i, 4).toString());
        cmb_itemsubcat.setSelectedItem(model.getValueAt(i, 5).toString());
        
        txt_address.setText(model.getValueAt(i, 6).toString());
        txt_phone.setText(model.getValueAt(i, 7).toString());
        txt_email.setText(model.getValueAt(i, 8).toString());
        txt_website.setText(model.getValueAt(i, 9).toString());
        txt_accountno.setText(model.getValueAt(i, 10).toString());
       
        txt_notes.setText(model.getValueAt(i, 11).toString());
        
        
        
        
    }//GEN-LAST:event_jTable_supplierMouseClicked

    private void txt_phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_phoneActionPerformed

    }//GEN-LAST:event_txt_phoneActionPerformed

   
    
    
    private void cmb_itemcatItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_itemcatItemStateChanged
         
    }//GEN-LAST:event_cmb_itemcatItemStateChanged

    private void cmb_itemcatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_itemcatActionPerformed
      loadSubCat();
    }//GEN-LAST:event_cmb_itemcatActionPerformed

    private void txt_emailMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_emailMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_emailMouseExited

    private void txt_websiteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_websiteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_websiteMouseClicked

    private void cmb_itemsubcatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_itemsubcatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_itemsubcatActionPerformed

    private void txt_addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_addressActionPerformed

    private void txt_phoneKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_phoneKeyReleased
         if(Validations.isnum(txt_phone.getText())==0) //isnum method
         {
             showMessageDialog(null,"No letters are allowed in phone no!", "Error", JOptionPane.ERROR_MESSAGE);
            txt_phone.setForeground(new Color(255,0,0));
           
         }
    }//GEN-LAST:event_txt_phoneKeyReleased

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked

        String cat =(String)cmb_itemcat.getSelectedItem();
        String subcat =(String)cmb_itemsubcat.getSelectedItem();
        String country =(String)cmb_country.getSelectedItem();

        if( txt_buissname.getText().isEmpty() || txt_contactname.getText().isEmpty() || country.isEmpty() ||txt_address.getText().isEmpty() || txt_phone.getText().isEmpty() ||  txt_email.getText().isEmpty()|| txt_website.getText().isEmpty() ||   cat.isEmpty()||   subcat.isEmpty()|| txt_accountno.getText().isEmpty()|| txt_notes.getText().isEmpty()){

            showMessageDialog(null,"Enter all essential data!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
        int x = JOptionPane.showConfirmDialog(null,"Do you want to add new record?");

        if(x==0)
        {

            String query="INSERT INTO `suppliers`(`businessname`, `contactname`, `country`, `address`, `phone`, `email`, `website`, `itemcategory`, `itemsubcategory`, `accountno`,  `notes`)"
            +"VALUES ('"+txt_buissname.getText()+"','"+txt_contactname.getText()+"','"+cmb_country.getSelectedItem()+"','"+txt_address.getText()+"','"+txt_phone.getText()+"','"+txt_email.getText()+"','"+txt_website.getText()+"','"+cmb_itemcat.getSelectedItem()+"','"+cmb_itemsubcat.getSelectedItem()+"','"+txt_accountno.getText()+"','"+txt_notes.getText()+"')";
            executeSqlQuery(query, "Insert");

        }
        else if( x==1) {

            ClearField();
        }
        }
    }//GEN-LAST:event_addMouseClicked

    private void addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseEntered
        add.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_addMouseEntered

    private void addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseExited
        add.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_addMouseExited

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
         String cat =(String)cmb_itemcat.getSelectedItem();
        String subcat =(String)cmb_itemsubcat.getSelectedItem();
        String country =(String)cmb_country.getSelectedItem();
        int x = JOptionPane.showConfirmDialog(null,"Do you want to update record?");
        if( txt_buissname.getText().isEmpty() || txt_contactname.getText().isEmpty() || country.isEmpty() ||txt_address.getText().isEmpty() || txt_phone.getText().isEmpty() ||  txt_email.getText().isEmpty()|| txt_website.getText().isEmpty() ||   cat.isEmpty()||   subcat.isEmpty()|| txt_accountno.getText().isEmpty()|| txt_notes.getText().isEmpty()){

            showMessageDialog(null,"Enter all essential data!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if(x==0)
        {

            String query ="UPDATE `suppliers` SET `businessname`='"+txt_buissname.getText()+"',`contactname`='"+txt_contactname.getText()+"',`country`='"+cmb_country.getSelectedItem()+"',`address`='"+txt_address.getText()+"',`phone`='"+txt_phone.getText()+"',`email`='"+txt_email.getText()+"',`website`='"+txt_website.getText()+"',`itemcategory`='"+cmb_itemcat.getSelectedItem()+"',`itemsubcategory`='"+cmb_itemsubcat.getSelectedItem()+"',`accountno`='"+txt_accountno.getText()+"',`notes`='"+txt_notes.getText()+"' WHERE `supplierid`='"+lbl_suppid.getText()+"'";

            executeSqlQuery(query, "Update");

        }
        else if( x==1) {

            ClearField();
        }
    }//GEN-LAST:event_updateMouseClicked

    private void updateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseEntered
        update.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_updateMouseEntered

    private void updateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseExited
        update.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_updateMouseExited

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
        //delete
        int x = JOptionPane.showConfirmDialog(null,"Do you want to Delete record?");

        if(x==0)
        {

            String query="DELETE FROM `suppliers` WHERE `supplierid`='"+lbl_suppid.getText()+"'";
            executeSqlQuery(query, "Delete");

        }
        else if( x==1) {

            ClearField();
        }
    }//GEN-LAST:event_deleteMouseClicked

    private void deleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseEntered
        delete.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_deleteMouseEntered

    private void deleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseExited
        delete.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_deleteMouseExited

    private void cancleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancleMouseClicked
        this.dispose();
    }//GEN-LAST:event_cancleMouseClicked

    private void cancleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancleMouseEntered
        cancle.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_cancleMouseEntered

    private void cancleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancleMouseExited
        cancle.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_cancleMouseExited

    private void refresh1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refresh1MouseClicked
        ClearField();
    }//GEN-LAST:event_refresh1MouseClicked

    private void refresh1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refresh1MouseEntered
        refresh1.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_refresh1MouseEntered

    private void refresh1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refresh1MouseExited
        refresh1.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_refresh1MouseExited

    private void txt_websiteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_websiteKeyPressed
     
    }//GEN-LAST:event_txt_websiteKeyPressed

    private void txt_accountnoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_accountnoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_accountnoKeyPressed

    private void txt_notesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_notesKeyPressed
           
    }//GEN-LAST:event_txt_notesKeyPressed

    private void txt_phoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_phoneKeyTyped
        txt_phone.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_txt_phoneKeyTyped

    private void txt_emailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_emailKeyTyped
        txt_email.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_txt_emailKeyTyped

    private void txt_accountnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_accountnoKeyTyped
        txt_accountno.setForeground(new Color(51,51,51));
        
    }//GEN-LAST:event_txt_accountnoKeyTyped

    private void txt_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_emailActionPerformed
        txt_email.setForeground(new Color(51,51,51));
           
        Emailvalidator emailValidator = new Emailvalidator();
       if(!emailValidator.validate(txt_email.getText().trim()))
                                            {
                                            
                                            
                                                                   

                                                                     showMessageDialog(null,"Please Enter valid Email address!");
                                                                     
                                                                    txt_email.setForeground(new Color(255,0,0));
                                            }           
    }//GEN-LAST:event_txt_emailActionPerformed

    private void txt_accountnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_accountnoActionPerformed
 txt_accountno.setForeground(new Color(51,51,51));
            lbl_accountnoalert.setForeground(new Color(51,51,51));
            
             if(Validations.isnum(txt_accountno.getText())==0) //isnum method
                                                    {
                                                            showMessageDialog(null,"No letters  allowed in Account Number!");
                                                             txt_accountno.setForeground(new Color(255,0,0));
                                                              
                                                    }    
             else if(Validations.width(txt_accountno.getText())==0){
                                                    
                                                    
                                                     showMessageDialog(null," Account Number should contain 8 digits!");
                                                             txt_accountno.setForeground(new Color(255,0,0));
                                                              
                                                    
                                                    }            
    }//GEN-LAST:event_txt_accountnoActionPerformed

    private void txt_emailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_emailFocusLost
//        Emailvalidator emailValidator = new Emailvalidator();
//       if(!emailValidator.validate(txt_email.getText().trim()))
//                                            {
//                                            
//                                            
//                                                                   
//
//                                                                     showMessageDialog(null,"Please Enter valid Email address");
//                                                                     
//                                                                    txt_email.setForeground(new Color(255,0,0));
//                                            }    
    }//GEN-LAST:event_txt_emailFocusLost

    private void txt_accountnoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_accountnoFocusLost
        txt_accountno.setForeground(new Color(51,51,51));
            lbl_accountnoalert.setForeground(new Color(51,51,51));
            
             if(Validations.isnum(txt_accountno.getText())==0) //isnum method
                                                    {
                                                            showMessageDialog(null,"No letters  allowed in Account Number!");
                                                             txt_accountno.setForeground(new Color(255,0,0));
                                                              
                                                    }    
             else if(Validations.width(txt_accountno.getText())==0){
                                                    
                                                    
                                                     showMessageDialog(null," Account Number should contain 8 digits!");
                                                             txt_accountno.setForeground(new Color(255,0,0));
                                                              
                                                    
                                                    }  
    }//GEN-LAST:event_txt_accountnoFocusLost
   
      
    
    public ArrayList<Suppliersmodel> getSuppliersList()
    {
        ArrayList<Suppliersmodel> supplierslist=new ArrayList<>();
        Connection connection = connect();
        String query="Select * from suppliers";
        
        Statement st;
        ResultSet rs;
        
        try {
            st=connection.createStatement();
            rs=st.executeQuery(query);
            Suppliersmodel supmodel;
            
            while(rs.next())
            {
                supmodel=new Suppliersmodel(rs.getInt("supplierid"),rs.getString("businessname"), rs.getString("contactname"), rs.getString("country"), rs.getString("address"), rs.getString("phone"), rs.getString("email"),rs.getString("website"),rs.getString("itemcategory"),rs.getString("itemsubcategory"),rs.getString("accountno"),rs.getString("notes"));
                supplierslist.add(supmodel);
            }
                    
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return supplierslist;
    }  
    
   
    
    
    
    
    
     public void showjTable()
    {
        ArrayList<Suppliersmodel> listdata=getSuppliersList();
        DefaultTableModel model =(DefaultTableModel)jTable_supplier.getModel();
        
        Object [] row=new Object[14];
        for(int i = 0;i<listdata.size();i++)
        {
            row[0]=listdata.get(i).getSupplierid();
            row[1]=listdata.get(i).getBusinessname();
            row[2]=listdata.get(i).getContactname();
            row[3]=listdata.get(i).getCountry();
            row[4]=listdata.get(i).getItemcategory();
            row[5]=listdata.get(i).getItemsubcategory();
           
            row[6]=listdata.get(i).getAddress();
            row[7]=listdata.get(i).getPhone();
            row[8]=listdata.get(i).getEmail();
            row[9]=listdata.get(i).getWebsite();
            row[10]=listdata.get(i).getAccountno();
                      row[11]=listdata.get(i).getNotes();
            
            
          
            
            model.addRow(row);
        }
    
    }
      public void ClearField()
    {
        
        lbl_suppid.setText(null);
        txt_buissname.setText(null);
        txt_contactname.setText(null);
        cmb_country.removeAll();
        
        
        txt_address.setText(null);
        txt_phone.setText(null);
        txt_email.setText(null);
        txt_website.setText(null);
        txt_accountno.setText(null);
       
        txt_notes.setText(null);
        
        
    }
    
    
    
    public void executeSqlQuery(String query,String message)
     {
         Connection conn= connect();
         Statement st;
         try {
               
              {
               st=con.createStatement();
              
               
                    
                  if((st.executeUpdate(query))==1)
              {
                  // data get refresh after query runs 
                  DefaultTableModel model = (DefaultTableModel)jTable_supplier.getModel();
                  model.setRowCount(0);
                  showjTable();
                                    
                  // message box
                  JOptionPane.showMessageDialog(null, "Data "+message+" Successfully");
                  ClearField();
              }else{
                  JOptionPane.showMessageDialog(null, "Data "+message+" Failed");
              }  
                    
                    
                }                          
              
                                                             
                                                                            
                                                                            
                                
                
                                 
               
                
         } catch (Exception e) {
             JOptionPane.showMessageDialog(null, e);
         }
     
     }
    //only num
//   public int isnum(String aa){
//       
//          int a=1; 
//        {
//            for(int x=0;x<aa.length();x++)
//            {
//                if(!Character.isDigit(aa.charAt(x)))
//                {
//                    
//                    a=0;
//                }
//            }
//
//        } 
//       return a;
//   }
    
//     public int width(String m)
//    {
//        int a=1;
//        
//        if(!m.isEmpty())
//        {
//            if(m.length()>=15)
//            {
//                a =0;
//            }
//        }
//        return a;
//    }
    
    
   
    
//     public void executeSqlQuery2(String query,String message)
//     {
//         Connection conn= connect();
//         Statement st;
//         try {
//               
//                    
//                            st=con.createStatement();
//                           
//              
//                            Emailvalidator emailValidator = new Emailvalidator();
//               
//                            if(emailValidator.validate(txt_email.getText().trim())&&isnum(txt_phone.getText())==1 &&isnum(txt_accountno.getText())==1 && width(txt_accountno.getText())==1)
//                                         
//                                        {
//                    
//                                                    if((st.executeUpdate(query))==1)
//                                                                     {
//                 
//                                                                        DefaultTableModel model = (DefaultTableModel)jTable_supplier.getModel();
//                                                                        model.setRowCount(0);
//                                                                        showjTable();
//                                    
//                  
//                                                                         JOptionPane.showMessageDialog(null, "Data "+message+" Successfully");
//                                                                          ClearField();
//                                                                           lbl_phonevalid.setForeground(new Color(51,51,51));
//                                                                             lbl_accountnoalert.setForeground(new Color(51,51,51));
//                                                                             lbl_emailalert.setForeground(new Color(51,51,51));
//                                                                              txt_phone.setForeground(new Color(0,0,0));
//                                                                               txt_email.setForeground(new Color(0,0,0));
//                                                                                txt_accountno.setForeground(new Color(0,0,0));
//                  
//                                                                        }
//              
//                                        }
//                
//                
//                            else{
//                                       
//                
//                
//                                        
//                                            if(!emailValidator.validate(txt_email.getText().trim()))
//                                            {
//                                            
//                                            
//                                                                    lbl_emailalert.setForeground(new Color(255,0,0));
//                                                                    txt_email.setForeground(new Color(255,0,0));
//
//                                                                      showMessageDialog(null,"email is invalid");
//                                            }  
//                                        
//                                        
//                                            
//                                 
//              
//                                                             
//                                                if(isnum(txt_phone.getText())==0) //isnum method
//                                                    {
//                                                            showMessageDialog(null,"no letters are allowed in mobile Number");
//                                                             txt_phone.setForeground(new Color(255,0,0));
//                                                              lbl_phonevalid.setForeground(new Color(255,0,0));
//                                                    }
//                                                else if((txt_phone.getText().length()>10)&&(!txt_phone.getText().isEmpty()))
//                                                    {
//                                                             showMessageDialog(null,"no more than 10 digits in mobile Number");
//                                                              txt_phone.setForeground(new Color(255,0,0));
//                                                               lbl_phonevalid.setForeground(new Color(255,0,0));
//                                                     }
//                                                 else if((txt_phone.getText().length()<10)&&(!txt_phone.getText().isEmpty()))
//                                                     {
//                                                              showMessageDialog(null,"not enough digits in mobile Number");
//                                                               txt_phone.setForeground(new Color(255,0,0));
//                                                                lbl_phonevalid.setForeground(new Color(255,0,0));
//                                                      }                                           
//                                                   if(isnum(txt_accountno.getText())==0) //isnum method
//                                                    {
//                                                            showMessageDialog(null,"no letters are allowed in Account Number");
//                                                             txt_accountno.setForeground(new Color(255,0,0));
//                                                              lbl_accountnoalert.setForeground(new Color(255,0,0));
//                                                    }                         
//                             
//                                                    JOptionPane.showMessageDialog(null, "Data "+message+" Failed");
//                                                    
//                                                    if(width(txt_accountno.getText())==0){
//                                                    
//                                                    
//                                                     showMessageDialog(null," Account Number should contain 8 digits");
//                                                             txt_accountno.setForeground(new Color(255,0,0));
//                                                              lbl_accountnoalert.setForeground(new Color(255,0,0));
//                                                    
//                                                    }
//                                                    
//                                                    
//                                                    
//                                                    
//                       }     
//               
//                
//         } catch (Exception e) {
//             JOptionPane.showMessageDialog(null, e);
//         }
//     
//     }
//    
    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Suppliers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel add;
    private javax.swing.JPanel cancle;
    private javax.swing.JComboBox<String> cmb_country;
    private javax.swing.JComboBox cmb_itemcat;
    private javax.swing.JComboBox cmb_itemsubcat;
    private javax.swing.JPanel delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_supplier;
    private javax.swing.JLabel lbl_accountnoalert;
    private javax.swing.JLabel lbl_emailalert;
    private javax.swing.JLabel lbl_phonevalid;
    private javax.swing.JLabel lbl_suppid;
    private javax.swing.JPanel refresh1;
    private javax.swing.JTextField txt_accountno;
    private javax.swing.JTextField txt_address;
    private javax.swing.JTextField txt_buissname;
    private javax.swing.JTextField txt_contactname;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_notes;
    private javax.swing.JTextField txt_phone;
    private javax.swing.JTextField txt_website;
    private javax.swing.JPanel update;
    // End of variables declaration//GEN-END:variables
}
