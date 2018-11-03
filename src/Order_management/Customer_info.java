/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Order_management;

import db_connect.dbconnect;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import Order_management.validation;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author Ganador
 */
public class Customer_info extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pst = null;
   // PreparedStatement pst1 = null;
    ResultSet rs = null;
   // ResultSet rs1 = null;
    public Customer_info() {
        initComponents();
        con= dbconnect.connect();
        tableload();
    }

     public void tableload(){
        
        try {
            String sql = "SELECT * FROM customer";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
     

   
   public void clear(){
       fname.setText(null);
        lname.setText(null);
        add1.setText(null);
        add2.setText(null);
        city.setText(null);
        state.setText(null);
        zip.setText(null);
        country.setSelectedIndex(0);
        company.setText(null);
        phone.setText(null);
        temail.setText(null);
        fax.setText(null);
        jLabel22.setText(null);
        Jemail.setText(null);
       jLabel21.setText(null);
       jLabel25.setText(null);
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel2 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        Jemail = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        state = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        add1 = new javax.swing.JTextField();
        add2 = new javax.swing.JTextField();
        city = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        zip = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        fax = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        company = new javax.swing.JTextField();
        temail = new javax.swing.JTextField();
        phone = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        country = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel23 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        clear = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setLocation(new java.awt.Point(250, 175));
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.setMinimumSize(new java.awt.Dimension(1320, 678));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setForeground(new java.awt.Color(204, 0, 0));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 240, 240, 30));

        jLabel25.setForeground(new java.awt.Color(204, 0, 0));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 324, 230, 20));

        Jemail.setForeground(new java.awt.Color(204, 0, 0));
        Jemail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(Jemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 280, 240, 30));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jSeparator1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 1010, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fax");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 330, 110, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("State");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 90, -1));

        state.setBackground(new java.awt.Color(153, 153, 153));
        state.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        state.setForeground(new java.awt.Color(255, 255, 255));
        state.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        state.setBorder(null);
        jPanel2.add(state, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 260, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("First Name");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        fname.setBackground(new java.awt.Color(153, 153, 153));
        fname.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        fname.setForeground(new java.awt.Color(255, 255, 255));
        fname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fname.setBorder(null);
        fname.setCaretColor(new java.awt.Color(255, 255, 255));
        fname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fnameMouseClicked(evt);
            }
        });
        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });
        jPanel2.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 260, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Last Name");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        lname.setBackground(new java.awt.Color(153, 153, 153));
        lname.setForeground(new java.awt.Color(255, 255, 255));
        lname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lname.setBorder(null);
        lname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lnameMouseClicked(evt);
            }
        });
        jPanel2.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 260, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Address Line 1");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Address Line 2");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("City");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 90, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Customer ID");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Zip");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, 80, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Country");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, 80, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Company Name");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, 110, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Phone Number");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, 110, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Email");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 290, 110, -1));

        add1.setBackground(new java.awt.Color(153, 153, 153));
        add1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        add1.setForeground(new java.awt.Color(255, 255, 255));
        add1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add1.setBorder(null);
        jPanel2.add(add1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 260, 30));

        add2.setBackground(new java.awt.Color(153, 153, 153));
        add2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        add2.setForeground(new java.awt.Color(255, 255, 255));
        add2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add2.setBorder(null);
        jPanel2.add(add2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 260, 30));

        city.setBackground(new java.awt.Color(153, 153, 153));
        city.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        city.setForeground(new java.awt.Color(255, 255, 255));
        city.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        city.setBorder(null);
        jPanel2.add(city, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 260, 30));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 260, 20));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 260, 30));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 260, 30));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 260, 30));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 260, 40));
        jPanel2.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 260, 40));

        zip.setBackground(new java.awt.Color(153, 153, 153));
        zip.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        zip.setForeground(new java.awt.Color(255, 255, 255));
        zip.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        zip.setBorder(null);
        jPanel2.add(zip, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 120, 260, 30));
        jPanel2.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 150, 260, 20));

        fax.setBackground(new java.awt.Color(153, 153, 153));
        fax.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        fax.setForeground(new java.awt.Color(255, 255, 255));
        fax.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fax.setBorder(null);
        fax.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                faxMouseClicked(evt);
            }
        });
        jPanel2.add(fax, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 320, 260, 30));
        jPanel2.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 230, 260, 30));

        jSeparator11.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 270, 260, 30));
        jPanel2.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 310, 260, 20));
        jPanel2.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 350, 260, 30));

        company.setBackground(new java.awt.Color(153, 153, 153));
        company.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        company.setForeground(new java.awt.Color(255, 255, 255));
        company.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        company.setBorder(null);
        jPanel2.add(company, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 200, 260, 30));

        temail.setBackground(new java.awt.Color(153, 153, 153));
        temail.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        temail.setForeground(new java.awt.Color(255, 255, 255));
        temail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        temail.setBorder(null);
        temail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                temailMouseClicked(evt);
            }
        });
        jPanel2.add(temail, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 280, 260, 30));

        phone.setBackground(new java.awt.Color(153, 153, 153));
        phone.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        phone.setForeground(new java.awt.Color(255, 255, 255));
        phone.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        phone.setBorder(null);
        phone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                phoneMouseClicked(evt);
            }
        });
        jPanel2.add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 240, 260, 30));

        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("NO");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 90, 20));

        country.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        country.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select county", "Sri Lanka", "UK", "USA" }));
        jPanel2.add(country, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 160, 260, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Customer Id", "First Name", "Last Name", "Address Line 1", "Address Line 2", "City", "State", "Zip Code", "Country", "Company Name", "Phone Number", "Email", "Fax"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 1060, 140));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Customer Details");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, -1, -1));

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setBackground(new java.awt.Color(153, 153, 153));
        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("ADD Customer");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 200, 40));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 220, 40));

        jLabel14.setBackground(new java.awt.Color(153, 153, 153));
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("ADD Customer");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel14MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel14MouseExited(evt);
            }
        });
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 130, 30));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 160, 30));

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setBackground(new java.awt.Color(153, 153, 153));
        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Delete Customer");
        jPanel7.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 200, 40));

        jPanel6.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 220, 40));

        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setBackground(new java.awt.Color(153, 153, 153));
        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Delete Customer");
        jPanel9.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 200, 40));

        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setBackground(new java.awt.Color(153, 153, 153));
        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Delete Customer");
        jPanel10.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 200, 40));

        jPanel9.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 220, 40));

        jPanel6.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 220, 40));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Remove customer");
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
        jPanel6.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 140, 30));

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, 160, 30));

        jPanel8.setBackground(new java.awt.Color(51, 51, 51));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        clear.setBackground(new java.awt.Color(153, 153, 153));
        clear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        clear.setForeground(new java.awt.Color(255, 255, 255));
        clear.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clear.setText("Clear");
        clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clearMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(clear, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(clear, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 380, 160, 30));

        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel2.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 120, 220, 30));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Search");
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 170, -1, -1));

        jPanel12.setBackground(new java.awt.Color(51, 51, 51));
        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel26.setBackground(new java.awt.Color(153, 153, 153));
        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Update Cutomer");
        jLabel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel26MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel26MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel26MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 380, 160, 30));

        jPanel14.setBackground(new java.awt.Color(51, 51, 51));
        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel30.setBackground(new java.awt.Color(153, 153, 153));
        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Cancel");
        jLabel30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel30MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel30MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel30MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 380, 160, 30));

        jLabel27.setForeground(new java.awt.Color(204, 0, 0));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 240, 240, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1130, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameActionPerformed

    private void jLabel14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseExited
        jPanel4.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_jLabel14MouseExited

    private void jLabel14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseEntered
        jPanel4.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_jLabel14MouseEntered

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        String FName = fname.getText();
        String LName = lname.getText();
        String add1 = this.add1.getText();
        String add2 = this.add2.getText();
        String city = this.city.getText();
        String state = this.state.getText();
        String zip = this.zip.getText();
        String country = (String) this.country.getSelectedItem();
        String company = this.company.getText();
        String phone = this.phone.getText();
        String email = temail.getText();
        String fax = this.fax.getText();
        
        //validations
          if(FName.isEmpty()||add1.isEmpty() || add2.isEmpty() || city.isEmpty() || 
                  country.isEmpty() || phone.isEmpty() ||email.isEmpty()||fax.isEmpty() )
        {
             JOptionPane.showMessageDialog(null,"Empty field detected!");
             
        }
           if(validation.isletters(FName)==0){
              fname.setText(null);
            fname.setText(" ! Enter Only characters");
          }
           if(validation.isletters(LName)==0){
              lname.setText(null);
            lname.setText(" ! Enter Only characters");
          }
        
          
          if(validation.checkemail(email)==0)
                {
                    temail.setText(null);
                     Jemail.setText(" ! invalied email");
               }
          if(fax.length()<10 ||validation.isnum(fax)==0)
            {
           this.fax.setText(null);
           jLabel25.setText(" ! Enter valid fax"); 
                
            }
          else if(phone.length()<10 ||validation.isnum(phone)==0 ) 
            {
            this.phone.setText(null);
            jLabel22.setText(" ! Enter your valid mobile Number");
            }
       
        
        //add details
        else{

        boolean status=CusAccess.addcus(FName, LName, add1, add2, city, state, zip, country, company, phone, email, fax);
        
         if(status==true){
                        JOptionPane.showMessageDialog(null,"Successfully Inserted!");
                    }else{
                        JOptionPane.showMessageDialog(null, "Insertion Failed!");
                    }

        
        clear();
        tableload();
        
        }
       
    
        
      
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseEntered
       jPanel6.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_jLabel15MouseEntered

    private void jLabel15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseExited
        jPanel6.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_jLabel15MouseExited

    private void clearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseEntered
        jPanel8.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_clearMouseEntered

    private void clearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseExited
        jPanel8.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_clearMouseExited

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void phoneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_phoneMouseClicked
      jLabel22.setText(null);
    }//GEN-LAST:event_phoneMouseClicked

    private void temailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_temailMouseClicked
         Jemail.setText(null);
    }//GEN-LAST:event_temailMouseClicked

    private void jLabel26MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseEntered
        jPanel12.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_jLabel26MouseEntered

    private void jLabel26MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseExited
         jPanel12.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_jLabel26MouseExited

    private void jLabel30MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel30MouseEntered
       jPanel14.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_jLabel30MouseEntered

    private void jLabel30MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel30MouseExited
         jPanel14.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_jLabel30MouseExited

    private void jLabel30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel30MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel30MouseClicked

    private void clearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseClicked
     
        clear();
       
       tableload();
    }//GEN-LAST:event_clearMouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        int x = JOptionPane.showConfirmDialog(null, "Do you really want to delete this?");
          String FName = fname.getText();
        String LName = lname.getText();
        String add1 = this.add1.getText();
        String add2 = this.add2.getText();
        String city = this.city.getText();
        String state = this.state.getText();
        String zip = this.zip.getText();
        String country = (String) this.country.getSelectedItem();
        String company = this.company.getText();
        String phone = this.phone.getText();
        String email = temail.getText();
        String fax = this.fax.getText();
        
        if(x==0){
            String cid = jLabel21.getText();
            boolean status=CusAccess.removecus(cid);
            if(FName.isEmpty()||add1.isEmpty() || add2.isEmpty() || city.isEmpty() || 
                  country.isEmpty() || phone.isEmpty() ||email.isEmpty()||fax.isEmpty() )
        {
             JOptionPane.showMessageDialog(null,"Empty field detected!");
             
        }
            else if(status==true){
                 JOptionPane.showMessageDialog(null, "Succesfully deleted.");
            }
            else{
                JOptionPane.showMessageDialog(null, "can't be deleted.");
            }
                
               
                tableload();
                clear();
        }
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
        //table load into textfield
        
        int r = jTable1.getSelectedRow();
        String Cid = jTable1.getValueAt(r, 0).toString();
        String FName = jTable1.getValueAt(r, 1).toString();
        String LName = jTable1.getValueAt(r, 2).toString();
        String add1 = jTable1.getValueAt(r, 3).toString();
        String add2 = jTable1.getValueAt(r, 4).toString();
        String city = jTable1.getValueAt(r, 5).toString();
        String state = jTable1.getValueAt(r, 6).toString();
        String zip = jTable1.getValueAt(r, 7).toString();
        String country = jTable1.getValueAt(r, 8).toString();;
        String company = jTable1.getValueAt(r, 9).toString();
        String phone =jTable1.getValueAt(r, 10).toString();
        String email = jTable1.getValueAt(r, 11).toString();
        String fax = jTable1.getValueAt(r, 12).toString();
        
        jLabel21.setText(Cid);
         fname.setText(FName);
        lname.setText(LName);
        this.add1.setText(add1);
        this.add2.setText(add2);
        this.city.setText(city);
        this.state.setText(state);
        this.zip.setText(zip);
        this.country.setSelectedItem(country);
        this.company.setText(company);
        this.phone.setText(phone);
        temail.setText(email);
        this.fax.setText(fax);
         
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void faxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_faxMouseClicked
         jLabel25.setText(null);
    }//GEN-LAST:event_faxMouseClicked

    private void jLabel26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseClicked
        int x = JOptionPane.showConfirmDialog(null, "Do you really want to update?");
        String cid = jLabel21.getText();
        if(x==0){

        String FName = fname.getText();
        String LName = lname.getText();
        String add1 = this.add1.getText();
        String add2 = this.add2.getText();
        String city = this.city.getText();
        String state = this.state.getText();
        String zip = this.zip.getText();
        String country = (String) this.country.getSelectedItem();
        String company = this.company.getText();
        String phone = this.phone.getText();
        String email = temail.getText();
        String fax = this.fax.getText();
        
         //validations//update customer
          if(FName.isEmpty()||add1.isEmpty() || add2.isEmpty() || city.isEmpty() || 
                  country.isEmpty() || phone.isEmpty() ||email.isEmpty()||fax.isEmpty() )
        {
             JOptionPane.showMessageDialog(null,"Empty field detected!");
             
        }
          else if(validation.isletters(FName)==0){
              fname.setText(null);
            fname.setText(" ! Enter Only characters");
            fname.setForeground(Color.red);
          }
           else if(validation.isletters(LName)==0){
              lname.setText(null);
            lname.setText(" ! Enter Only characters");
              fname.setForeground(Color.red);
          }
        
          else if(phone.length()<10 ||validation.isnum(phone)==0 ) 
            {
            this.phone.setText(null);
            jLabel22.setText(" ! Enter more than 10 characters");
            }
          else if(validation.checkemail(email)==0)
                {
                    temail.setText(null);
                     Jemail.setText(" ! invalied email");
               }
          else if(fax.length()<10 ||validation.isnum(fax)==0)
            {
           this.fax.setText(null);
           jLabel25.setText(" !not enough characters"); 
                
            }
       
        
        //add details
        else{
             boolean status=CusAccess.addcus(FName, LName, add1, add2, city, state, zip, country, company, phone, email, fax);
        
                if(status==true){
                        JOptionPane.showMessageDialog(null,"Successfully Updated!");
                    }else{
                        JOptionPane.showMessageDialog(null, "Updation Failed!");
                    }
            


            //load table
           tableload();
           clear();
            
        }
    }//GEN-LAST:event_jLabel26MouseClicked
    }
    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
        
        String cid = search.getText();  
        if(cid.isEmpty()){
             showMessageDialog(null, "search field is emplty","Error",JOptionPane.ERROR_MESSAGE);
         }
         else{
             boolean status=CusAccess.searchcus(cid, jTable1);
             if(status==true){
             search.setText(null);
             }
             else{
                 showMessageDialog(null, "result not found","Error",JOptionPane.ERROR_MESSAGE);
                 search.setText(null);
             }
                 
         }

    }//GEN-LAST:event_jLabel24MouseClicked

    private void lnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lnameMouseClicked
        lname.setText(null);
    }//GEN-LAST:event_lnameMouseClicked

    private void fnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fnameMouseClicked
         fname.setText(null);
    }//GEN-LAST:event_fnameMouseClicked

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
            java.util.logging.Logger.getLogger(Customer_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer_info().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Jemail;
    private javax.swing.JTextField add1;
    private javax.swing.JTextField add2;
    private javax.swing.JTextField city;
    private javax.swing.JLabel clear;
    private javax.swing.JTextField company;
    private javax.swing.JComboBox<String> country;
    private javax.swing.JTextField fax;
    private javax.swing.JTextField fname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField lname;
    private javax.swing.JTextField phone;
    private javax.swing.JTextField search;
    private javax.swing.JTextField state;
    private javax.swing.JTextField temail;
    private javax.swing.JTextField zip;
    // End of variables declaration//GEN-END:variables
}
