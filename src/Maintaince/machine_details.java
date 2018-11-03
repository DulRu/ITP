
package Maintaince;

import db_connect.dbconnect;
import java.awt.Color;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import MTfunction.mtfunction;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showConfirmDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import net.proteanit.sql.DbUtils;
import MTfunction.mtvalidation;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dulangi Rathnayaka
 */
public class machine_details extends javax.swing.JFrame {

  //db connect    
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;//table click
    
    public machine_details() {
        initComponents();
        
         //db connect
        con = dbconnect.connect();
        MachineID.setText(mtfunction.getNextID("MID", "mdetails", "M", con)); //primary key auto increment
        
        
        
        //tableload
        tableload();
    }
     public void tableload(){
    
    try{
    
        String sql = "SELECT * FROM mdetails";
        pst = con.prepareStatement(sql);
        rs = pst.executeQuery();
        
        MachineTable.setModel(DbUtils.resultSetToTableModel(rs));
    }catch (Exception e) {
            System.out.println(e);
        }
    }
    
     
     //clearfield
     public void clearfield(){
             MachineID.setText(mtfunction.getNextID("MID", "mdetails", "M", con)); //primary key auto increment
             MachineName.setText(null);
             MachineType.setSelectedIndex(0);
             Model.setText(null);
             Description.setText(null);
             date1.setDate(null);
             Vender.setText(null);
             CompanyName.setText(null);
             CompanyID.setText(null); 
     
     }
     
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        MachineName = new javax.swing.JTextField();
        Model = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Description = new javax.swing.JTextArea();
        CompanyID = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        MachineType = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        MachineTable = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel17 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        CompanyName = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        Vender = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        MachineSearch = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        MachineID = new javax.swing.JLabel();
        date1 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(231, 151));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setMinimumSize(new java.awt.Dimension(1128, 608));
        jPanel1.setPreferredSize(new java.awt.Dimension(1114, 590));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("     Machine  Details");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(483, 30, 180, 29));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Machine ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 92, 119, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Machine Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 119, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Model");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 119, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Description");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 119, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Vender");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 130, 119, 20));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Warranty Details");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 280, 119, -1));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Insurance Details");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 330, 119, -1));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Machine Type");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 119, -1));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Company ID");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 230, 119, -1));

        MachineName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                MachineNameFocusLost(evt);
            }
        });
        MachineName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MachineNameActionPerformed(evt);
            }
        });
        jPanel1.add(MachineName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 261, -1));

        Model.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModelActionPerformed(evt);
            }
        });
        jPanel1.add(Model, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 261, -1));

        Description.setColumns(20);
        Description.setRows(5);
        jScrollPane1.setViewportView(Description);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 261, 30));

        CompanyID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompanyIDActionPerformed(evt);
            }
        });
        jPanel1.add(CompanyID, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 230, 270, -1));

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));
        jPanel4.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel4.setMinimumSize(new java.awt.Dimension(104, 17));
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
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText(" Waranty");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 0, 60, 20));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 280, 100, 20));

        jPanel5.setBackground(new java.awt.Color(153, 153, 153));
        jPanel5.setMinimumSize(new java.awt.Dimension(74, 16));
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
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Add New");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 0, -1, 20));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, 100, 20));

        MachineType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Machine Type", "Canteen", "Cutting", "Finishing", "Office", "Other", "Security", "Sewing" }));
        MachineType.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                MachineTypeFocusGained(evt);
            }
        });
        MachineType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MachineTypeActionPerformed(evt);
            }
        });
        jPanel1.add(MachineType, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 261, -1));

        MachineTable.setBackground(new java.awt.Color(102, 102, 102));
        MachineTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Machine ID", "Machine Name", "Machine Type", "Model", "Description", "Reg. Date", "Vendor", "Company Name", "Company ID"
            }
        ));
        MachineTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MachineTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(MachineTable);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 1110, 180));

        jSeparator1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 75, 1040, -1));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, 10, 230));

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
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 370, -1, 40));

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
                .addGap(54, 54, 54)
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 370, -1, 40));

        jPanel20.setBackground(new java.awt.Color(51, 51, 51));
        jPanel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel20MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel20MouseExited(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Generate Report");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel27)
                .addContainerGap())
        );

        jPanel1.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 370, 160, 40));

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
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Add");
        jPanel13.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 35, -1));

        jPanel1.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 160, 40));

        jPanel21.setBackground(new java.awt.Color(51, 51, 51));
        jPanel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel21MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel21MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel21MouseExited(evt);
            }
        });
        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText(" Update");
        jPanel21.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 57, -1));

        jPanel1.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 160, 40));

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
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText(" Delete");
        jPanel14.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 50, 23));

        jPanel1.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, 160, 40));

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Company Name");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 180, 119, -1));

        CompanyName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                CompanyNameFocusLost(evt);
            }
        });
        CompanyName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompanyNameActionPerformed(evt);
            }
        });
        jPanel1.add(CompanyName, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 180, 270, -1));

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Registration Date");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 90, 119, -1));

        Vender.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                VenderFocusLost(evt);
            }
        });
        Vender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VenderActionPerformed(evt);
            }
        });
        jPanel1.add(Vender, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 130, 270, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Search by Machine ID/Machine Type");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 60, 170, -1));

        MachineSearch.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        MachineSearch.setForeground(new java.awt.Color(51, 51, 51));
        MachineSearch.setText("Search");
        MachineSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MachineSearchActionPerformed(evt);
            }
        });
        MachineSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                MachineSearchKeyReleased(evt);
            }
        });
        jPanel1.add(MachineSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 60, 220, 20));

        jPanel6.setBackground(new java.awt.Color(153, 153, 153));
        jPanel6.setMinimumSize(new java.awt.Dimension(74, 16));
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
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Insurance");
        jPanel6.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 0, -1, 20));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 330, 100, 20));

        MachineID.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(MachineID, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 160, 20));

        date1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                date1FocusLost(evt);
            }
        });
        jPanel1.add(date1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 90, 270, -1));

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

    
    private void MachineNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MachineNameActionPerformed
        MachineType.grabFocus();
    }//GEN-LAST:event_MachineNameActionPerformed

    private void ModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModelActionPerformed
        Description.grabFocus();
    }//GEN-LAST:event_ModelActionPerformed

    private void CompanyIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompanyIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CompanyIDActionPerformed

    private void MachineTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MachineTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MachineTypeActionPerformed

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        M_type id;
        id = new M_type();
        id.setVisible(true);       
    }//GEN-LAST:event_jPanel5MouseClicked

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        Warranty_Details id=new Warranty_Details();
       
        
        id.MachineID.setText(this.MachineID.getText());
        id.setVisible(true);
    }//GEN-LAST:event_jPanel4MouseClicked

    private void jPanel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel21MouseClicked
        int x = showConfirmDialog(null,"Do you want to Update this");
        
        if(x==0)
        {
             String mid = MachineID.getText();
             String mname = MachineName.getText();
             String mtype = MachineType.getSelectedItem().toString();
             String model = Model.getText();
             String description = Description.getText();
             String vendor = Vender.getText();
             String cname = CompanyName.getText();
             String cid = CompanyID.getText();
             Date Date1=date1.getDate();
            
            
            
            
             //isempty
        if(mname.isEmpty() || mtype.isEmpty() || model.isEmpty() || description.isEmpty() ||  Date1==null ||  vendor.isEmpty() || cname.isEmpty() ||  cid.isEmpty()){
        
            JOptionPane.showMessageDialog(null,"Enter all essential data!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
              //only letters validation
        else if(mtvalidation.isLetter(mname)==0)
         {
             showMessageDialog(null,"Only Letters are allowed in Machine Name field", "Error", JOptionPane.ERROR_MESSAGE);
             MachineName.setText(null);
         }
        
         //only letters validation
        else if(mtvalidation.isLetter(vendor)==0)
         {
             showMessageDialog(null,"Only Letters are allowed in vendor field", "Error", JOptionPane.ERROR_MESSAGE);
             Vender.setText(null);
         }
        
        //only letters validation
        else if(mtvalidation.isLetter(cname)==0)
         {
             showMessageDialog(null,"Only Letters are allowed in company name field", "Error", JOptionPane.ERROR_MESSAGE);
             CompanyName.setText(null);
         }
        
        else {
            
            try {
                SimpleDateFormat dateformat =new SimpleDateFormat("yyyy-MM-dd");
                String regdate = dateformat.format(date1.getDate());
                String sql = "UPDATE mdetails SET  MID='"+mid+"' , Mname='"+mname+"' , Mtype='"+mtype+"' , model='"+model+"', description='"+description+"' , regdate='"+regdate+"' , vendor='"+vendor+"' , Cname='"+cname+"', CID='"+cid+"' WHERE MID='"+mid+"'";
                pst = con.prepareStatement(sql);
                pst.execute();
                
                tableload();
                
            } catch (Exception e) {
                System.out.println(e);
            }
        }
       }
// clearfield();
    
    }//GEN-LAST:event_jPanel21MouseClicked

    private void jPanel21MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel21MouseEntered
       jPanel21.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_jPanel21MouseEntered

    private void jPanel21MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel21MouseExited
       jPanel21.setBackground(new Color(51,51,51)); 
    }//GEN-LAST:event_jPanel21MouseExited

    private void jPanel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel16MouseClicked
        this.dispose();
    }//GEN-LAST:event_jPanel16MouseClicked

    private void jPanel14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel14MouseEntered
        jPanel14.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_jPanel14MouseEntered

    private void jPanel14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel14MouseExited
        jPanel14.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_jPanel14MouseExited

    private void jPanel17MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel17MouseEntered
        jPanel17.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_jPanel17MouseEntered

    private void jPanel17MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel17MouseExited
        jPanel17.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_jPanel17MouseExited

    private void jPanel16MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel16MouseEntered
       jPanel16.setBackground(new Color(0,0,0)); 
    }//GEN-LAST:event_jPanel16MouseEntered

    private void jPanel16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel16MouseExited
        jPanel16.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_jPanel16MouseExited

    private void jPanel20MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel20MouseEntered
        jPanel20.setBackground(new Color(0,0,0)); 
    }//GEN-LAST:event_jPanel20MouseEntered

    private void jPanel20MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel20MouseExited
       jPanel20.setBackground(new Color(51,51,51));  
    }//GEN-LAST:event_jPanel20MouseExited

    private void jPanel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseEntered
        jPanel4.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_jPanel4MouseEntered

    private void jPanel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseEntered
        jPanel5.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_jPanel5MouseEntered

    private void jPanel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseExited
        jPanel4.setBackground(new Color(153,153,153));
    }//GEN-LAST:event_jPanel4MouseExited

    private void jPanel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseExited
        jPanel5.setBackground(new Color(153,153,153));
    }//GEN-LAST:event_jPanel5MouseExited

    private void jPanel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel17MouseClicked
       //refresh
        clearfield();
        
        tableload();
    }//GEN-LAST:event_jPanel17MouseClicked

    private void jPanel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel14MouseClicked
         //delete 
        int x = showConfirmDialog(null,"Do you want to Delete this");
        
        if(x==0)
        {
            String mid = MachineID.getText();
            
            String sql = "DELETE from mdetails WHERE MID='"+mid+"'";
            
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

    private void MachineTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MachineTableMouseClicked
       int r = MachineTable.getSelectedRow();
        
       String mid = MachineTable.getValueAt(r, 0).toString();
       String mname= MachineTable.getValueAt(r, 1).toString();
       String mtype = MachineTable.getValueAt(r, 2).toString();
       String model    = MachineTable.getValueAt(r, 3).toString();
       String description = MachineTable.getValueAt(r, 4).toString();
        try {
            date1.setDate( new SimpleDateFormat("yyyy-MM-dd").parse(MachineTable.getValueAt(r, 5).toString()));
        } catch (ParseException ex) {
            Logger.getLogger(Insurance_Details.class.getName()).log(Level.SEVERE, null, ex);
        }
       String vendor = MachineTable.getValueAt(r, 6).toString();
       String cname= MachineTable.getValueAt(r, 7).toString();
       String cid = MachineTable.getValueAt(r, 8).toString();
        
        
       MachineID.setText(mid);
       MachineName.setText(mname);
       MachineType.setSelectedItem(mtype);
       Model.setText(model);
       Description.setText(description);
       Vender.setText(vendor);
       CompanyName.setText(cname);
       CompanyID.setText(cid);
        
    }//GEN-LAST:event_MachineTableMouseClicked

    private void MachineSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MachineSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MachineSearchActionPerformed

    private void MachineSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MachineSearchKeyReleased
        String search=MachineSearch.getText();
        try {

            String sql ="SELECT * FROM mdetails where mid LIKE'"+search+"%' OR mtype LIKE '"+search+"%' ";
            pst = con.prepareStatement(sql);

            rs =pst.executeQuery();

            MachineTable.setModel(DbUtils.resultSetToTableModel(rs));

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_MachineSearchKeyReleased

    
    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
        Insurance_Details id= new Insurance_Details();
        id.MachineID.setText(this.MachineID.getText());
        id.setVisible(true); 
    }//GEN-LAST:event_jPanel6MouseClicked

    private void jPanel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseEntered
        jPanel6.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_jPanel6MouseEntered

    private void jPanel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseExited
        jPanel6.setBackground(new Color(153,153,153));
    }//GEN-LAST:event_jPanel6MouseExited

    private void MachineTypeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_MachineTypeFocusGained
       MachineType.removeAllItems();
        
        //set values to machine type combo box from db
        
        try {
            String sql = "SELECT DISTINCT mtype FROM mtype";
            pst = con.prepareStatement(sql);
            
            rs = pst.executeQuery();
            
            while(rs.next()){
            
                String mtype1 = rs.getString("mtype");
                MachineType.addItem(mtype1);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error" , JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_MachineTypeFocusGained

    private void MachineNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_MachineNameFocusLost
         //only letters validation
         String mname = MachineName.getText();
         if(mtvalidation.isLetter(mname)==0)
         {
             showMessageDialog(null,"Can't use digits in Machine Name field");
         }
    }//GEN-LAST:event_MachineNameFocusLost

    private void CompanyNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CompanyNameFocusLost
            //only letters validation
         String cname = CompanyName.getText();
         if(mtvalidation.isLetter(cname)==0)
         {
             showMessageDialog(null,"Can't use digits in company Name field");
         }
    }//GEN-LAST:event_CompanyNameFocusLost

    private void VenderFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_VenderFocusLost
        //only letters validation
         String vendor = Vender.getText();
         if(mtvalidation.isLetter(vendor)==0)
         {
             showMessageDialog(null,"Can't use digits in Vendor field");
         }
    }//GEN-LAST:event_VenderFocusLost

    private void VenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VenderActionPerformed
        CompanyName.grabFocus();
    }//GEN-LAST:event_VenderActionPerformed

    private void CompanyNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompanyNameActionPerformed
        CompanyID.grabFocus();
    }//GEN-LAST:event_CompanyNameActionPerformed

    private void jPanel13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel13MouseExited
        jPanel13.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_jPanel13MouseExited

    private void jPanel13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel13MouseEntered
        jPanel13.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_jPanel13MouseEntered

    private void jPanel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel13MouseClicked

        //insert
        String mid = MachineID.getText();
        String mname = MachineName.getText();
        String mtype = MachineType.getSelectedItem().toString();
        String model = Model.getText();
        String description = Description.getText();
        String vendor = Vender.getText();
        String cname = CompanyName.getText();
        String cid = CompanyID.getText();
        Date Date1=date1.getDate();
        
        
          
       
      
        if(mname.isEmpty() || mtype.isEmpty() || model.isEmpty() || description.isEmpty() ||  Date1==null || vendor.isEmpty() || cname.isEmpty() ||  cid.isEmpty()){

            JOptionPane.showMessageDialog(null,"Enter all essential data!", "Error", JOptionPane.ERROR_MESSAGE);
        }

        //only letters validation
        else if(mtvalidation.isLetter(mname)==0)
        {
            showMessageDialog(null,"Only Letters are allowed in Machine Name field", "Error", JOptionPane.ERROR_MESSAGE);
            MachineName.setText(null);
        }

        //only letters validation
        else if(mtvalidation.isLetter(vendor)==0)
        {
            showMessageDialog(null,"Only Letters are allowed in vendor field", "Error", JOptionPane.ERROR_MESSAGE);
            Vender.setText(null);
        }

        //only letters validation
        else if(mtvalidation.isLetter(cname)==0)
        {
            showMessageDialog(null,"Only Letters are allowed in company name field", "Error", JOptionPane.ERROR_MESSAGE);
            CompanyName.setText(null);
        }

        else {
            try {
                SimpleDateFormat dateformat =new SimpleDateFormat("yyyy-MM-dd");
                String regdate = dateformat.format(date1.getDate());
                String h = "INSERT INTO mdetails (MID,Mname,Mtype,model,description,regdate,vendor,Cname,CID) VALUES ('"+mid+"', '"+mname+"', '"+mtype+"', '"+model+"', '"+description+"', '"+regdate+"', '"+vendor+"', '"+cname+"', '"+cid+"')";
                pst = con.prepareStatement(h);
                pst.execute();
                MachineID.setText(mtfunction.getNextID("MID", "mdetails", "M", con)); //primary key auto increment

                //load table
                tableload();

                JOptionPane.showMessageDialog(null, "Succesfully added.");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,e);
            }
        }
    }//GEN-LAST:event_jPanel13MouseClicked

    private void date1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_date1FocusLost
       
//        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
//        
//        Date d1 = null;
//        
//        
//        try {
//            d1 = f.parse(f.format(date1.getDate()));
//            
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//        
//        double diff = d1.getTime();
// 
//        String osamount = Double.toString(diff);
//        
//        if(osamount.isEmpty())
//        {
//                showMessageDialog(null,"uuuuuu", "Error", JOptionPane.ERROR_MESSAGE); 
//        }
    }//GEN-LAST:event_date1FocusLost

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
            java.util.logging.Logger.getLogger(machine_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(machine_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(machine_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(machine_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new machine_details().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CompanyID;
    private javax.swing.JTextField CompanyName;
    private javax.swing.JTextArea Description;
    private javax.swing.JLabel MachineID;
    private javax.swing.JTextField MachineName;
    private javax.swing.JTextField MachineSearch;
    private javax.swing.JTable MachineTable;
    private javax.swing.JComboBox MachineType;
    private javax.swing.JTextField Model;
    private javax.swing.JTextField Vender;
    private com.toedter.calendar.JDateChooser date1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
