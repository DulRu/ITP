/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Order_management;

import db_connect.dbconnect;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javafx.scene.paint.Color.color;
import static javafx.scene.paint.Color.color;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Ganador
 */
public class Invoice extends javax.swing.JFrame {

     Connection con = null;
    PreparedStatement pst = null;
    // PreparedStatement pst1 = null;
    ResultSet rs = null;
    // ResultSet rs1 = null;
    public Invoice() {
        initComponents();
        con = dbconnect.connect();
        showdate();
    }

   
 public void showdate(){
    
        Date d1 = new Date();
        SimpleDateFormat s = new SimpleDateFormat("YYYY-MM-dd");
        try {
            inDate.setDate(d1);
            } catch (Exception ex) {
            Logger.getLogger(Schedule.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }
 
  //cal amount   
    public double calamount(){
                double qty=Double.parseDouble(jTextField8.getText());
                double uniPrice=Double.parseDouble(jTextField10.getText());
                double amount;
                amount=qty*uniPrice;
                return amount;
        }
    //cal total amount
        public double caltot(){
                    double amn=calamount();
                    double Trate=Double.parseDouble(jTextField12.getText());
                    double tot=amn+(amn*Trate/100);
                    return tot;
        }
        
        public void clear(){
            //set textfield to null
                      jTextField1.setText(null);
                      jTextField2.setText(null);
                      jTextField3.setText(null);
                      jTextField4.setText(null);
//                      Indate.setText(null);
                      PO.setText(null);
                      inDate.setDate(null);
                      jTextField8.setText(null);
                      Des.setText(null);
                      jTextField10.setText(null);
                      jTextField11.setText(null);
                      jTextField12.setText(null);
                      jLabel13.setText("0.00");
                      jLabel14.setText("RS : 0.00");
                      jLabel20.setText("1.Payment is due with in 15 days ");
        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        PO = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Des = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        Ddate = new com.toedter.calendar.JDateChooser();
        inDate = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(260, 165));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 980, 0));

        jTextField1.setBackground(new java.awt.Color(153, 153, 153));
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setBorder(null);
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 320, 30));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("From");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Bill To");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        jTextField2.setBackground(new java.awt.Color(153, 153, 153));
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setBorder(null);
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 320, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ship to");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        jTextField3.setBackground(new java.awt.Color(153, 153, 153));
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setBorder(null);
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 320, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Invoice No");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, -1, -1));

        jTextField4.setBackground(new java.awt.Color(153, 153, 153));
        jTextField4.setForeground(new java.awt.Color(255, 255, 255));
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setBorder(null);
        jTextField4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField4MouseClicked(evt);
            }
        });
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 320, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Invoice Date");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("P.O No");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 220, -1, -1));

        PO.setBackground(new java.awt.Color(153, 153, 153));
        PO.setForeground(new java.awt.Color(255, 255, 255));
        PO.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PO.setBorder(null);
        PO.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                POFocusLost(evt);
            }
        });
        PO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                POMouseClicked(evt);
            }
        });
        PO.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                POKeyReleased(evt);
            }
        });
        jPanel1.add(PO, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 240, 320, 30));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Due Date");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 300, -1, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 1010, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Quantity");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, -1, -1));

        jTextField8.setBackground(new java.awt.Color(153, 153, 153));
        jTextField8.setForeground(new java.awt.Color(255, 255, 255));
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField8.setBorder(null);
        jPanel1.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 120, 30));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Description");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, -1, -1));

        Des.setBackground(new java.awt.Color(153, 153, 153));
        Des.setForeground(new java.awt.Color(255, 255, 255));
        Des.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Des.setBorder(null);
        Des.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DesMouseClicked(evt);
            }
        });
        Des.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                DesKeyReleased(evt);
            }
        });
        jPanel1.add(Des, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, 180, 30));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Unit Price");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 390, -1, -1));

        jTextField10.setBackground(new java.awt.Color(153, 153, 153));
        jTextField10.setForeground(new java.awt.Color(255, 255, 255));
        jTextField10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField10.setBorder(null);
        jTextField10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField10MouseClicked(evt);
            }
        });
        jPanel1.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 410, 120, 30));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Amount");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 390, -1, -1));

        jTextField11.setBackground(new java.awt.Color(153, 153, 153));
        jTextField11.setForeground(new java.awt.Color(255, 255, 255));
        jTextField11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField11.setBorder(null);
        jTextField11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField11MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField11MouseEntered(evt);
            }
        });
        jTextField11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField11KeyPressed(evt);
            }
        });
        jPanel1.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 410, 120, 30));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("TAX Rate");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 390, -1, -1));

        jTextField12.setBackground(new java.awt.Color(153, 153, 153));
        jTextField12.setForeground(new java.awt.Color(255, 255, 255));
        jTextField12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField12.setBorder(null);
        jTextField12.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField12FocusLost(evt);
            }
        });
        jTextField12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField12KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField12KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField12KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 410, 120, 30));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 1010, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("0.00");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 520, 120, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("RS: 0.00");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 560, 120, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Subtotal :");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 510, -1, -1));

        jComboBox1.setBackground(new java.awt.Color(204, 204, 204));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LKR", "Doller", " " }));
        jComboBox1.setBorder(null);
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 560, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Total :");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 560, -1, -1));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("ADD");
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel17MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel17MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 160, 170, 30));

        jSeparator4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 1010, 5));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Invoice");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, -1, -1));

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Terms & Conditions", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(51, 0, 255))); // NOI18N

        jLabel20.setBackground(new java.awt.Color(0, 0, 0));
        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("1.Payment is due with in 15 days ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addGap(0, 28, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 510, 390, 80));

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel4.setForeground(new java.awt.Color(0, 204, 255));

        jLabel19.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Save Invoice");
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel19MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel19MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 100, 170, 40));

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Clear");
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel21MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel21MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 200, 170, 30));

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Cancel");
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel22MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel22MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 330, 170, 30));

        jPanel7.setBackground(new java.awt.Color(51, 51, 51));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Edit ");
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel23MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel23MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 250, -1, -1));
        jPanel1.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 30, 200, -1));

        jPanel8.setBackground(new java.awt.Color(51, 51, 51));
        jPanel8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Search");
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel24MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel24MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 30, -1, 30));

        jPanel9.setBackground(new java.awt.Color(51, 51, 51));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Delete");
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel25MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel25MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel25MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 290, 170, 30));

        Ddate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DdateMouseClicked(evt);
            }
        });
        jPanel1.add(Ddate, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 320, 310, 30));
        jPanel1.add(inDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, 320, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel19MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseEntered
       jPanel4.setBackground(new Color(0,102,255));
    }//GEN-LAST:event_jLabel19MouseEntered

    private void jLabel19MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseExited
         jPanel4.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_jLabel19MouseExited

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel22MouseClicked

    private void POKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_POKeyReleased
        String po = this.PO.getText();
      
        rs=InvoiceAccess.settext(po);
        try {
            while(rs.next()){
                Des.setText(rs.getString("product_code"));
                jTextField8.setText(rs.getString("quantity"));
            }
             
        
        } catch (Exception e) {
        }
      
    }//GEN-LAST:event_POKeyReleased

    private void DesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DesKeyReleased
         String Des = this.Des.getText();
         String y=Double.toString(InvoiceAccess.unitprice(Des));
         jTextField10.setText(y);

    }//GEN-LAST:event_DesKeyReleased

    private void jTextField11KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField11KeyPressed
       // JOptionPane.showMessageDialog(null,"bbbbbbbbb");
    }//GEN-LAST:event_jTextField11KeyPressed

    private void jTextField11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField11MouseEntered
      
    }//GEN-LAST:event_jTextField11MouseEntered
   
    private void jTextField11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField11MouseClicked
       //set amount to label
        String x=jTextField8.getText();
       if(x.isEmpty())
               {
                   JOptionPane.showMessageDialog(null,"Pleace enter the quantity");
               }
       else{double am=calamount();
        String amnt = new Double(am).toString();
        jTextField11.setText(amnt);
        jLabel13.setText(amnt);
       }
       
    }//GEN-LAST:event_jTextField11MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked

       //Add data into invoice
       String PO = this.PO.getText();
    //
       String Des = this.Des.getText();
       String Qty = jTextField8.getText();
       String unit = jTextField10.getText();
       String amount = jTextField11.getText();
       String bill = jTextField2.getText();
       String ship = jTextField3.getText();
       String from = jTextField1.getText();
       String InNo = jTextField4.getText();
       String tax = jTextField12.getText();
       String sub = jLabel13.getText();
       String total = jLabel14.getText();
     //
       String status = jLabel20.getText();
       SimpleDateFormat dateFormat =new SimpleDateFormat("yyyy-MM-dd");
       Date date1=Ddate.getDate();
       Date Indate=inDate.getDate();
       
       //validation
        
        if(PO.isEmpty()|| Indate==null||Des.isEmpty()||Qty.isEmpty()||unit.isEmpty()||amount.isEmpty()||bill.isEmpty()||ship.isEmpty()||from.isEmpty()||tax.isEmpty()||total.isEmpty()||date1==null||status.isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Empty field detected!");
        }
        
      else{
            String InDate =dateFormat.format(inDate.getDate());
            String DueD =dateFormat.format(Ddate.getDate());
        boolean status1=InvoiceAccess.addInvoice(PO, InDate, Des, Qty, unit, amount, bill, ship, from, tax, sub, total, DueD, status);
        if(status1==true){

            JOptionPane.showMessageDialog(null, "Succesfully added");
        }
        else{
            JOptionPane.showMessageDialog(null, "Insertion is failed");
        }
        
        
        }
        //set invoice id to text filed 
       
     rs=InvoiceAccess.findInv(InNo);
        try {
                 while(rs.next()){
             String No=rs.getString("id");
             jTextField4.setText(No);
                }
                 
        } catch (Exception e) {
        }

       
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
            jTextField1.setText("MAS ACTIVE(pvt)Ltd");
    }//GEN-LAST:event_jTextField1MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
       //load data to Printed_invoice interface
        SimpleDateFormat dateFormat =new SimpleDateFormat("yyyy-MM-dd");
        Printed_invoice pr=new Printed_invoice();
        pr.jLabel7.setText(this.jTextField1.getText());
        pr.jLabel6.setText(this.jTextField2.getText());
        pr.jLabel2.setText(this.jTextField4.getText());
       String Indate =dateFormat.format(inDate.getDate());
       String Duedate =dateFormat.format(Ddate.getDate());
        pr.jLabel4.setText(Indate);
        pr.jLabel9.setText(this.PO.getText());
        pr.jLabel11.setText(Duedate);
        pr.jLabel19.setText(this.jTextField8.getText());
        pr.jLabel18.setText(this.Des.getText());
        pr.jLabel20.setText(this.jTextField10.getText());
        pr.jLabel14.setText(this.jLabel14.getText());
        pr.jLabel21.setText(this.jLabel20.getText());
        pr.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        int x = JOptionPane.showConfirmDialog(null, "Do you really want to update?");
        //String InNo = jLabel21.getText();
        if(x==0){

       String PO = this.PO.getText();
       String Des = this.Des.getText();
       String Qty = jTextField8.getText();
       String unit = jTextField10.getText();
       String amount = jTextField11.getText();
       String bill = jTextField2.getText();
       String ship = jTextField3.getText();
       String from = jTextField1.getText();
       String InNo = jTextField4.getText();
       String tax = jTextField12.getText();
       String sub = jLabel13.getText();
       String total = jLabel14.getText();
       String status = jLabel20.getText();
       Date in_date=inDate.getDate();
       Date d_date=Ddate.getDate();
                                                   
        
//update invoice
      
        if(PO.isEmpty()|| in_date==null||Des.isEmpty()||Qty.isEmpty()||unit.isEmpty()||amount.isEmpty()||bill.isEmpty()||ship.isEmpty()||from.isEmpty()||tax.isEmpty()||total.isEmpty()||d_date==null||status.isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Empty field detected!");
        }
        
        else{
            SimpleDateFormat dateFormat =new SimpleDateFormat("yyyy-MM-dd");
             String Indate =dateFormat.format(inDate.getDate());
             String DueD =dateFormat.format(Ddate.getDate());
              boolean status1=InvoiceAccess.updInvoice(PO, Indate, Des, Qty, unit, amount, bill, ship, from, tax, sub, total, DueD, total, InNo);
        if(status1==true){
                     JOptionPane.showMessageDialog(null,"Successfully Updated !");
                }
                else{
                    JOptionPane.showMessageDialog(null,"Updation failed , try again !");
                }

        }
        }
    }//GEN-LAST:event_jLabel23MouseClicked

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
       
        //Serach invoice data and load DB data to TextFields
        String InnNo = jTextField13.getText(); 
        String PO =jTextField13.getText(); 
        
       String POr ;
       String InNo;
       String Indate ;
       String Des;
       String Qty;
       String unit;
       String amount;
       String bill;
       String ship;
       String from;
       String tax;
       String sub;
       String total;
       String DueD;
       String status;
            //Search customer
            
            try 
            {
                String sql="SELECT * FROM invoice WHERE id LIKE '"+InnNo+"' or Order_id LIKE '"+PO+"' ";
                pst =con.prepareStatement(sql);
                rs = pst.executeQuery();
              if(rs.next()){
                  
                  rs=pst.executeQuery();
                  while(rs.next()){
                      InNo=rs.getString("id");
                      POr=rs.getString("Order_id");
                      Indate=rs.getString("date");
                      Des=rs.getString("description");
                      Qty=rs.getString("qty");
                      unit=rs.getString("unit_price");
                      amount=rs.getString("amount");
                      bill=rs.getString("bill_to");
                      ship=rs.getString("ship_to");
                      from=rs.getString("fromCom");
                      tax=rs.getString("tax_rate");
                      sub=rs.getString("sub_total");
                      total=rs.getString("total");
                      DueD=rs.getString("due_date");
                      status=rs.getString("status");
                      
                      
                      jTextField1.setText(from);
                      jTextField2.setText(bill);
                      jTextField3.setText(ship);
                      jTextField4.setText(InNo);
                             try {
            inDate.setDate( new SimpleDateFormat("yyyy-MM-dd").parse(Indate));
            } catch (ParseException ex) {
            Logger.getLogger(Schedule.class.getName()).log(Level.SEVERE, null, ex);
        }
                    
                      this.PO.setText(POr);
                      try {
            Ddate.setDate( new SimpleDateFormat("yyyy-MM-dd").parse(DueD));
            } catch (ParseException ex) {
            Logger.getLogger(Schedule.class.getName()).log(Level.SEVERE, null, ex);
        }
                      
                      jTextField8.setText(Qty);
                      this.Des.setText(Des);
                      jTextField10.setText(unit);
                      jTextField11.setText(amount);
                      jTextField12.setText(tax);
                      jLabel13.setText(sub);
                      jLabel14.setText(total);
                      jLabel20.setText(status);
                      
                  }
                  
              }
              
              else{
                  JOptionPane.showMessageDialog(null,"Not found");
              }
                
              
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            
            if(jTextField13.getText().isEmpty()){
                clear();
            }
    }//GEN-LAST:event_jLabel24MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
                    clear();
    }//GEN-LAST:event_jLabel21MouseClicked

    private void jLabel17MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseEntered
        jPanel2.setBackground(new Color(0,102,255));
    }//GEN-LAST:event_jLabel17MouseEntered

    private void jLabel17MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseExited
         jPanel2.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_jLabel17MouseExited

    private void jLabel21MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseEntered
        jPanel5.setBackground(new Color(0,102,255));
    }//GEN-LAST:event_jLabel21MouseEntered

    private void jLabel21MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseExited
       jPanel5.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_jLabel21MouseExited

    private void jLabel23MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseEntered
        jPanel7.setBackground(new Color(0,102,255));
    }//GEN-LAST:event_jLabel23MouseEntered

    private void jLabel23MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseExited
        jPanel7.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_jLabel23MouseExited

    private void jLabel22MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseEntered
        jPanel6.setBackground(new Color(0,102,255));
    }//GEN-LAST:event_jLabel22MouseEntered

    private void jLabel22MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseExited
        jPanel6.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_jLabel22MouseExited

    private void jLabel24MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseEntered
        jPanel8.setBackground(new Color(0,102,255));
    }//GEN-LAST:event_jLabel24MouseEntered

    private void jLabel24MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseExited
        jPanel8.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_jLabel24MouseExited

    private void DesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DesMouseClicked

    }//GEN-LAST:event_DesMouseClicked

    private void jTextField10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField10MouseClicked
         String sql="select * from products where procode=?";
        
        try{
            pst=con.prepareStatement(sql);
            pst.setString(1,Des.getText());
            rs=pst.executeQuery();
            
            if(rs.next()){
                
                jTextField10.setText(rs.getString("procostperunit"));
           
            }
        }
        catch(Exception e){
            
            System.out.println(e);
        }
    }//GEN-LAST:event_jTextField10MouseClicked

    private void jTextField4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField4MouseClicked
        // set invoice id to text filed 
//        String InNo = jTextField4.getText();
//     rs=InvoiceAccess.findInv(InNo);
//        try {
//                 while(rs.next()){
//             String No=rs.getString("id");
//             jTextField4.setText(No);
//                }
//                 
//        } catch (Exception e) {
//        }
    }//GEN-LAST:event_jTextField4MouseClicked

    private void jTextField12KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField12KeyReleased
         String tax = jTextField12.getText();   
        if(!tax.isEmpty()){
            if(validation.isnum(tax)==0){
                JOptionPane.showMessageDialog(null,"Can't insert letters , try again !");
            }
            else{
             double tot=caltot();
        String caltot1=new Double(tot).toString();
       jLabel14.setText(caltot1); 
            }
        }
    }//GEN-LAST:event_jTextField12KeyReleased

    private void POFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_POFocusLost
       String po = this.PO.getText();
        
      if(InvoiceAccess.isavilable(po)==0){
                JOptionPane.showMessageDialog(null,"Order is not exist");
            }
    }//GEN-LAST:event_POFocusLost

    private void jTextField12KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField12KeyTyped
        
    }//GEN-LAST:event_jTextField12KeyTyped

    private void jTextField12FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField12FocusLost
             
    }//GEN-LAST:event_jTextField12FocusLost

    private void jTextField12KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField12KeyPressed
        
    }//GEN-LAST:event_jTextField12KeyPressed

    private void jLabel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseClicked
      String In_id= jTextField4.getText();
      //String po = this.PO.getText();
        
     String PO = this.PO.getText();
       String Des = this.Des.getText();
       String Qty = jTextField8.getText();
       String unit = jTextField10.getText();
       String amount = jTextField11.getText();
       String bill = jTextField2.getText();
       String ship = jTextField3.getText();
       String from = jTextField1.getText();
       String InNo = jTextField4.getText();
       String tax = jTextField12.getText();
       String sub = jLabel13.getText();
       String total = jLabel14.getText();
       String status = jLabel20.getText();
       Date in_date=inDate.getDate();
       Date d_date=Ddate.getDate();
       
        int x = JOptionPane.showConfirmDialog(null, "Do you really want to update?");
        if(x==0){
         if(PO.isEmpty()|| in_date==null||Des.isEmpty()||Qty.isEmpty()||unit.isEmpty()||amount.isEmpty()||bill.isEmpty()||ship.isEmpty()||from.isEmpty()||tax.isEmpty()||total.isEmpty()||d_date==null||status.isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Empty field detected!");
        }
       else if(OrderAccess.isavilable(PO)==1){
                   showMessageDialog(null,"Can not be deleted ! Order is exist !", "Error", JOptionPane.ERROR_MESSAGE);
               }
         else{
                    boolean status1=InvoiceAccess.removeInvoice(In_id);
                    if(status1==true){
                        JOptionPane.showMessageDialog(null, "Successfully deleted!");
                    }
                }
       clear();
       }
    }//GEN-LAST:event_jLabel25MouseClicked

    private void jLabel25MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseEntered
       jPanel9.setBackground(new Color(0,102,255));
    }//GEN-LAST:event_jLabel25MouseEntered

    private void jLabel25MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseExited
          jPanel9.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_jLabel25MouseExited

    private void DdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DdateMouseClicked
    
    }//GEN-LAST:event_DdateMouseClicked

    private void POMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_POMouseClicked
         try {
//        SimpleDateFormat dateFormat =new SimpleDateFormat("yyyy-MM-dd");
//        String dt =dateFormat.format(inDate.getDate());
//        Date date1=new SimpleDateFormat("yyyy-MM-dd").parse(dt);
        Date date1=inDate.getDate();
        
        Calendar cal = Calendar.getInstance();
        cal.setTime(date1);
        cal.add(Calendar.DATE, 15); // add 15 days
        Date Date2 = cal.getTime();
        SimpleDateFormat dateFormat =new SimpleDateFormat("yyyy-MM-dd");
               
        //to convert Date to String, use format method of SimpleDateFormat class.
        String Date1 = dateFormat.format(Date2);
            
       try {
            Ddate.setDate( new SimpleDateFormat("yyyy-MM-dd").parse(Date1));
            } catch (ParseException ex) {
            Logger.getLogger(Invoice.class.getName()).log(Level.SEVERE, null, ex);
        }//mouseclic
         } catch (Exception e) {
             System.out.println(e);
         }
    }//GEN-LAST:event_POMouseClicked

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
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Invoice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Ddate;
    private javax.swing.JTextField Des;
    private javax.swing.JTextField PO;
    private com.toedter.calendar.JDateChooser inDate;
    private javax.swing.JComboBox<String> jComboBox1;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
