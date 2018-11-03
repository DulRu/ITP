
package Maintaince;

import db_connect.dbconnect;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showConfirmDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import net.proteanit.sql.DbUtils;
import MTfunction.mtfunction;
import MTfunction.mtvalidation;
import java.text.ParseException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dulangi Rathnayaka
 */
public class OutSourse extends javax.swing.JFrame {

    //db connect    
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;//table click
    
    public OutSourse() {
        initComponents();
        
        con = dbconnect.connect();
        OutsourseID.setText(mtfunction.getNextID("OSID", "outsourse", "OS", con)); //primary key auto increment
        
        //db connect
        
        
        //tableload
        tableload();
    }
   
    
    public void tableload(){
    
    try{
    
        String sql = "SELECT * FROM outsourse";
        pst = con.prepareStatement(sql);
        rs = pst.executeQuery();
        
        OutsourceTable.setModel(DbUtils.resultSetToTableModel(rs));
    }catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void clearfield(){
       MachineID.setText(null);
       MachineType.setSelectedIndex(0);
       OutsourseID.setText(mtfunction.getNextID("OSID", "outsourse", "OS10", con)); //primary key auto increment
       date1.setDate(null);
       date2.setDate(null);
       Deposite.setText(null);
       Charges.setText(null);
       Vendor.setText(null); 
       Address.setText(null);
       ContactNo.setText(null); 
    
    }
    
   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Deposite = new javax.swing.JTextField();
        Charges = new javax.swing.JTextField();
        Vendor = new javax.swing.JTextField();
        ContactNo = new javax.swing.JTextField();
        MachineType = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        OutsourceTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel13 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        MachineID = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        Address = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        OutsourseSearch = new javax.swing.JTextField();
        OutsourseID = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        date1 = new com.toedter.calendar.JDateChooser();
        date2 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(231, 151));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1128, 608));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("  Out Source Machine ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 183, 29));

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Machine ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 119, -1));

        jLabel3.setBackground(new java.awt.Color(51, 51, 51));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Machine Type");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 148, 119, -1));

        jLabel5.setBackground(new java.awt.Color(51, 51, 51));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Outsourse ID");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 119, -1));

        jLabel6.setBackground(new java.awt.Color(51, 51, 51));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Rented Date");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 119, -1));

        jLabel7.setBackground(new java.awt.Color(51, 51, 51));
        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Return Date");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 119, -1));

        jLabel10.setBackground(new java.awt.Color(51, 51, 51));
        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Charges(Per day)");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 150, 119, -1));

        jLabel11.setBackground(new java.awt.Color(51, 51, 51));
        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Vendor");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 200, 91, -1));

        jLabel12.setBackground(new java.awt.Color(51, 51, 51));
        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Contact No.");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 310, 119, -1));

        Deposite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepositeActionPerformed(evt);
            }
        });
        jPanel1.add(Deposite, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 90, 261, -1));

        Charges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChargesActionPerformed(evt);
            }
        });
        jPanel1.add(Charges, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 150, 261, -1));

        Vendor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                VendorFocusLost(evt);
            }
        });
        Vendor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VendorActionPerformed(evt);
            }
        });
        jPanel1.add(Vendor, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 200, 261, -1));

        ContactNo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ContactNoFocusLost(evt);
            }
        });
        ContactNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContactNoActionPerformed(evt);
            }
        });
        jPanel1.add(ContactNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 310, 261, -1));

        MachineType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select  Machine Type", "Canteen", "Cutting", "Finishing", "Office", "Other", "Security", "Sewing", " " }));
        jPanel1.add(MachineType, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 145, 261, -1));

        OutsourceTable.setBackground(new java.awt.Color(102, 102, 102));
        OutsourceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Machine ID", "Machine Type", "Outsourse ID", "Rented Date", "Return Date", "Deposite", "Charges (per day)", "Vendor", "Address", "Contact"
            }
        ));
        OutsourceTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OutsourceTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(OutsourceTable);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 1100, 150));

        jLabel4.setBackground(new java.awt.Color(51, 51, 51));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Deposite");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 90, 73, -1));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, 10, 260));

        jPanel13.setBackground(new java.awt.Color(51, 51, 51));
        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel13MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel13MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel13MouseExited(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Add");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 160, 40));

        jPanel18.setBackground(new java.awt.Color(51, 51, 51));
        jPanel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel18MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel18MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel18MouseExited(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText(" Update");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, 160, 40));

        jPanel14.setBackground(new java.awt.Color(51, 51, 51));
        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel14MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel14MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel14MouseExited(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText(" Delete");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 380, 160, 40));

        jPanel15.setBackground(new java.awt.Color(51, 51, 51));
        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel15MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel15MouseExited(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Generate Report");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 380, 160, 40));

        jPanel16.setBackground(new java.awt.Color(51, 51, 51));
        jPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel16MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel16MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel16MouseExited(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Cancel");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 380, 160, 40));

        jPanel17.setBackground(new java.awt.Color(51, 51, 51));
        jPanel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel17MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel17MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel17MouseExited(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Refresh");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel29)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 380, 160, 40));

        jSeparator1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 75, 1040, -1));

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
        jPanel1.add(MachineID, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 261, -1));

        jLabel14.setBackground(new java.awt.Color(51, 51, 51));
        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Address");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 260, 119, -1));

        Address.setText("                            ");
        Address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddressActionPerformed(evt);
            }
        });
        jPanel1.add(Address, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 260, 261, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Search by Machine ID/Outsourse ID");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 60, 170, -1));

        OutsourseSearch.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        OutsourseSearch.setForeground(new java.awt.Color(51, 51, 51));
        OutsourseSearch.setText("Search");
        OutsourseSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OutsourseSearchActionPerformed(evt);
            }
        });
        OutsourseSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                OutsourseSearchKeyReleased(evt);
            }
        });
        jPanel1.add(OutsourseSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 60, 210, 20));

        OutsourseID.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(OutsourseID, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 140, 20));

        jPanel10.setBackground(new java.awt.Color(153, 153, 153));
        jPanel10.setMinimumSize(new java.awt.Dimension(74, 16));
        jPanel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel10MouseExited(evt);
            }
        });
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Bill Details");
        jPanel10.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 0, 60, 20));

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 150, 100, 20));
        jPanel1.add(date1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 260, -1));
        jPanel1.add(date2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 260, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1119, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DepositeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepositeActionPerformed
        Charges.grabFocus();
    }//GEN-LAST:event_DepositeActionPerformed

    private void ChargesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChargesActionPerformed
        Vendor.grabFocus();
    }//GEN-LAST:event_ChargesActionPerformed

    private void VendorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VendorActionPerformed
        Address.grabFocus();
    }//GEN-LAST:event_VendorActionPerformed

    private void ContactNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContactNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ContactNoActionPerformed

    private void jPanel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel16MouseClicked
        this.dispose();
    }//GEN-LAST:event_jPanel16MouseClicked

    private void jPanel13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel13MouseExited
       jPanel13.setBackground(new Color (51,51,51)); 
    }//GEN-LAST:event_jPanel13MouseExited

    private void jPanel18MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel18MouseExited
        jPanel18.setBackground(new Color (51,51,51));
    }//GEN-LAST:event_jPanel18MouseExited

    private void jPanel14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel14MouseEntered
        jPanel14.setBackground(new Color (0,0,0));
    }//GEN-LAST:event_jPanel14MouseEntered

    private void jPanel14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel14MouseExited
        jPanel14.setBackground(new Color (51,51,51));
    }//GEN-LAST:event_jPanel14MouseExited

    private void jPanel15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel15MouseEntered
        jPanel15.setBackground(new Color (0,0,0));
    }//GEN-LAST:event_jPanel15MouseEntered

    private void jPanel16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel16MouseExited
         jPanel16.setBackground(new Color (51,51,51));
    }//GEN-LAST:event_jPanel16MouseExited

    private void jPanel17MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel17MouseExited
         jPanel17.setBackground(new Color (51,51,51));
    }//GEN-LAST:event_jPanel17MouseExited

    private void jPanel17MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel17MouseEntered
        jPanel17.setBackground(new Color (0,0,0));
    }//GEN-LAST:event_jPanel17MouseEntered

    private void jPanel16MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel16MouseEntered
        jPanel16.setBackground(new Color (0,0,0));
    }//GEN-LAST:event_jPanel16MouseEntered

    private void jPanel15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel15MouseExited
         jPanel15.setBackground(new Color (51,51,51));
    }//GEN-LAST:event_jPanel15MouseExited

    private void jPanel18MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel18MouseEntered
        jPanel18.setBackground(new Color (0,0,0));
    }//GEN-LAST:event_jPanel18MouseEntered

    private void jPanel13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel13MouseEntered
        jPanel13.setBackground(new Color (0,0,0));
    }//GEN-LAST:event_jPanel13MouseEntered

    private void MachineIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MachineIDActionPerformed
        MachineType.grabFocus();
    }//GEN-LAST:event_MachineIDActionPerformed

    private void AddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddressActionPerformed
       ContactNo.grabFocus();
    }//GEN-LAST:event_AddressActionPerformed

    private void jPanel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel13MouseClicked
        String mid = MachineID.getText();
        String mtype = MachineType.getSelectedItem().toString();
        String osid = OutsourseID.getText();
        String deposite = Deposite.getText();
        String charges = Charges.getText();
        String vendor = Vendor.getText();
        String address = Address.getText();
        String phone = ContactNo.getText();
        Date Date1=date1.getDate();
        Date Date2=date2.getDate();
       
        
         if(mid.isEmpty() || mtype.isEmpty() ||  Date1==null || Date2==null ||deposite.isEmpty() || charges.isEmpty()|| vendor.isEmpty() || address.isEmpty() || phone.isEmpty()){
        
            showMessageDialog(null,"Enter all essential data!", "Error", JOptionPane.ERROR_MESSAGE);
        }
         
          //only num validation
        else if(mtvalidation.isdouble(deposite)==0) {
            
            showMessageDialog(null,"Letters are not allowed Deposite field", "Error", JOptionPane.ERROR_MESSAGE);
            Deposite.setText(null);
        }
        
        //only num validation
         else if(mtvalidation.isdouble(charges)==0) {
            
            showMessageDialog(null,"Letters are not allowed Charges field", "Error", JOptionPane.ERROR_MESSAGE);
            Charges.setText(null);
        }
         
         //only letters validation
        else if(mtvalidation.isLetter(vendor)==0)
         {
             showMessageDialog(null,"digits are not allowed  vendor field", "Error", JOptionPane.ERROR_MESSAGE);
             Vendor.setText(null);
         }
         
         //phone validation
      
         
                else if(mtvalidation.isdouble(phone)==0) //isnum method
                {
                    showMessageDialog(null,"Letters are not allowed in Contact Number", "Error", JOptionPane.ERROR_MESSAGE);
                    ContactNo.setText(null);
                }
                else if((phone.length()<10))
                {
                    showMessageDialog(null,"Not enough digits in Contact Number", "Error", JOptionPane.ERROR_MESSAGE);
                    ContactNo.setText(null);
                }
                else if((phone.length()>10))
                {
                    showMessageDialog(null,"Only 10 digits allowed in Contact Number", "Error", JOptionPane.ERROR_MESSAGE);
                    ContactNo.setText(null);
                }
        
         
         
        
        else {
        
        try {
            SimpleDateFormat dateformat =new SimpleDateFormat("yyyy-MM-dd");
            String rentdate = dateformat.format(date1.getDate());
            String rdate = dateformat.format(date2.getDate());
            //insert
            String f = "INSERT INTO outsourse (MID,Mtype,OSID,rentdate,rdate,deposite,charges,vendor,address,phone) VALUES ('"+mid+"', '"+mtype+"', '"+osid+"','"+rentdate+"', '"+rdate+"', '"+deposite+"', '"+charges+"','"+vendor+"', '"+address+"', '"+phone+"')";
            pst = con.prepareStatement(f);
            pst.execute();
             OutsourseID.setText(mtfunction.getNextID("OSID", "outsourse", "OS", con)); //primary key auto increment

            //load table
            tableload();
            
            showMessageDialog(null, "Succesfully added.");

        } catch (Exception e) {
            showMessageDialog(null,e);
        }
      }
    }//GEN-LAST:event_jPanel13MouseClicked

    private void jPanel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel18MouseClicked
         int x = showConfirmDialog(null,"Do you want to Update this");
        
        if(x==0)
        {
             String mid = MachineID.getText();
             String mtype = MachineType.getSelectedItem().toString();
             String osid = OutsourseID.getText();
             String deposite = Deposite.getText();
             String charges = Charges.getText();
             String vendor = Vendor.getText();
             String address = Address.getText();
             String phone = ContactNo.getText();
             Date Date1=date1.getDate();
             Date Date2=date2.getDate();
            
            
            
            
             if(mid.isEmpty() || mtype.isEmpty() ||  Date1==null || Date2==null || deposite.isEmpty() || charges.isEmpty()|| vendor.isEmpty() || address.isEmpty() || phone.isEmpty()){
        
            showMessageDialog(null,"Enter all essential data!", "Error", JOptionPane.ERROR_MESSAGE);
        }
         
          //only num validation
        else if(mtvalidation.isdouble(deposite)==0) {
            
            showMessageDialog(null,"Letters are not allowed Deposite field", "Error", JOptionPane.ERROR_MESSAGE);
            Deposite.setText(null);
        }
        
        //only num validation
         else if(mtvalidation.isdouble(charges)==0) {
            
            showMessageDialog(null,"Letters are not allowed Charges field", "Error", JOptionPane.ERROR_MESSAGE);
            Charges.setText(null);
        }
         
         //only letters validation
        else if(mtvalidation.isLetter(vendor)==0)
         {
             showMessageDialog(null,"digits are not allowed  vendor field", "Error", JOptionPane.ERROR_MESSAGE);
             Vendor.setText(null);
         }
         
         //phone validation
      
         
                else if(mtvalidation.isdouble(phone)==0) //isnum method
                {
                    showMessageDialog(null,"Letters are not allowed in Contact Number", "Error", JOptionPane.ERROR_MESSAGE);
                    ContactNo.setText(null);
                }
                else if((phone.length()<10))
                {
                    showMessageDialog(null,"Not enough digits in Contact Number", "Error", JOptionPane.ERROR_MESSAGE);
                    ContactNo.setText(null);
                }
                else if((phone.length()>10))
                {
                    showMessageDialog(null,"Only 10 digits allowed in Contact Number", "Error", JOptionPane.ERROR_MESSAGE);
                    ContactNo.setText(null);
                }
        
         
        else {
            
            try {
                SimpleDateFormat dateformat =new SimpleDateFormat("yyyy-MM-dd");
                String rentdate = dateformat.format(date1.getDate());
                String rdate = dateformat.format(date2.getDate());
                String sql = "UPDATE outsourse  SET  MID='"+mid+"' , Mtype='"+mtype+"' , OSID='"+osid+"' , rentdate='"+rentdate+"', rdate='"+rdate+"' , deposite='"+deposite+"' , charges='"+charges+"' , vendor='"+vendor+"', address='"+address+"', phone='"+phone+"' WHERE OSID='"+osid+"'";
                pst = con.prepareStatement(sql);
                pst.execute();
                
                tableload();
                
            } catch (Exception e) {
                System.out.println(e);
            }
        
          }
        }
    }//GEN-LAST:event_jPanel18MouseClicked

    private void jPanel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel14MouseClicked
           //delete 
        int x = showConfirmDialog(null,"Do you want to Delete this");
        
        if(x==0)
        {
            String osid = OutsourseID.getText();
            
            String sql = "DELETE from outsourse WHERE OSID='"+osid+"'";
            
            try {
                
                pst = con.prepareStatement(sql);
                pst.execute();
                
                tableload();
                
                
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        
       clearfield();
      
    }//GEN-LAST:event_jPanel14MouseClicked

    private void OutsourceTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OutsourceTableMouseClicked
        int r = OutsourceTable.getSelectedRow();
        
       String mid = OutsourceTable.getValueAt(r, 0).toString();
       String mtype= OutsourceTable.getValueAt(r, 1).toString();
       String osid = OutsourceTable.getValueAt(r, 2).toString();
       try {
            date1.setDate( new SimpleDateFormat("yyyy-MM-dd").parse(OutsourceTable.getValueAt(r, 3).toString()));
            date2.setDate( new SimpleDateFormat("yyyy-MM-dd").parse(OutsourceTable.getValueAt(r, 4).toString()));
        } catch (ParseException ex) {
            Logger.getLogger(Insurance_Details.class.getName()).log(Level.SEVERE, null, ex);
        }
       String deposite= OutsourceTable.getValueAt(r, 5).toString();
       String charges = OutsourceTable.getValueAt(r, 6).toString();
       String vendor = OutsourceTable.getValueAt(r, 7).toString();
       String address = OutsourceTable.getValueAt(r, 8).toString();
       String phone = OutsourceTable.getValueAt(r, 9).toString();
        
       MachineID.setText(mid);
       MachineType.setSelectedItem(mtype);
       OutsourseID.setText(osid);
       Deposite.setText(deposite);
       Charges.setText(charges);
       Vendor.setText(vendor);
       Address.setText(address);
       ContactNo.setText(phone);
       
        
    }//GEN-LAST:event_OutsourceTableMouseClicked

    private void jPanel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel17MouseClicked
         //refresh
        clearfield();
        
        tableload();
    }//GEN-LAST:event_jPanel17MouseClicked

    private void ContactNoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ContactNoFocusLost
        //phone validation
        String phone = ContactNo.getText();
        if(phone.isEmpty()){
                    showMessageDialog(null,"Contact No. field is null");
         }
         else 
        if(mtvalidation.isdouble(phone)==0) //isnum method
                {
                    showMessageDialog(null,"Letters are not allowed in Contact Number");
                    ContactNo.setText(null);
                }
        else if((phone.length()<10))
                {
                    showMessageDialog(null,"Not enough digits in Contact Number");
                    ContactNo.setText(null);
                }
        else if((phone.length()>10))
                {
                    showMessageDialog(null,"Only 10 digits allowed in Contact Number");
                    ContactNo.setText(null);
                }
    }//GEN-LAST:event_ContactNoFocusLost

    private void OutsourseSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OutsourseSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OutsourseSearchActionPerformed

    private void OutsourseSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_OutsourseSearchKeyReleased
        String search=OutsourseSearch.getText();
        try {

            String sql ="SELECT mid,osid FROM outsourse where mid LIKE'"+search+"%' OR osid LIKE '"+search+"%' ";
            pst = con.prepareStatement(sql);

            rs =pst.executeQuery();

            OutsourceTable.setModel(DbUtils.resultSetToTableModel(rs));

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_OutsourseSearchKeyReleased

    private void VendorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_VendorFocusLost
        //only letters validation
         String vendor = Vendor.getText();
         if(mtvalidation.isLetter(vendor)==0)
         {
             showMessageDialog(null,"Can't use digits in Vendor field");
         }
    }//GEN-LAST:event_VendorFocusLost

    private void jPanel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseClicked
        Bill_details id=new Bill_details();
        
        
        String charges = Charges.getText();
        String deposite = Deposite.getText();
        
        double Charges = Double.parseDouble(charges);
        double Deposite = Double.parseDouble(deposite);
        
       
        
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
        
        Date d1 = null;
        Date d2 = null;
        
        try {
            d1 = f.parse(f.format(date1.getDate()));
            d2 = f.parse(f.format(date2.getDate()));
        } catch (Exception e) {
            System.out.println(e);
        }
        
        double diff = d2.getTime()- d1.getTime();
        
        double hours = diff/(60.0*60.0*1000.0);
        int days = (int) (hours/24);
        
        double OSamount = (days*Charges)+Deposite;
        String osamount = Double.toString(OSamount);
        
        id.MachineID.setText(this.MachineID.getText());
        id.OutsourceAmount.setText(osamount);
        id.setVisible(true);
        
//        System.out.println(OSamount);
    }//GEN-LAST:event_jPanel10MouseClicked

    private void jPanel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseEntered
        jPanel10.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_jPanel10MouseEntered

    private void jPanel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseExited
        jPanel10.setBackground(new Color(153,153,153));
    }//GEN-LAST:event_jPanel10MouseExited

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
            java.util.logging.Logger.getLogger(OutSourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OutSourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OutSourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OutSourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OutSourse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Address;
    private javax.swing.JTextField Charges;
    private javax.swing.JTextField ContactNo;
    private javax.swing.JTextField Deposite;
    private javax.swing.JTextField MachineID;
    private javax.swing.JComboBox MachineType;
    private javax.swing.JTable OutsourceTable;
    private javax.swing.JLabel OutsourseID;
    private javax.swing.JTextField OutsourseSearch;
    private javax.swing.JTextField Vendor;
    private com.toedter.calendar.JDateChooser date1;
    private com.toedter.calendar.JDateChooser date2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
