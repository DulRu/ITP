/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmpMethods;

import db_connect.dbconnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author Toin
 */
public class EmpClass {
    
    static Connection con = dbconnect.connect();
    static PreparedStatement pst = null;
    static ResultSet rs = null;
    static PreparedStatement pst1 = null;
    static ResultSet rs1 = null;
    static PreparedStatement pst2 = null;
    static ResultSet rs2 = null;
    
    public static boolean addNewSection(String mname,String mdesciption,String mreg_date,String mm_id){
     boolean status=false;
     
     
     String qry = "INSERT INTO section (sec_name,description,reg_date,machi_type) VALUES ('"+mname+"', '"+mdesciption+"', '"+mreg_date+"', '"+mm_id+"')";
            try {
                pst=con.prepareStatement(qry);
                pst.execute();
                status=true;
            } catch (SQLException ex) {
                showMessageDialog(null,ex,"Error", JOptionPane.ERROR_MESSAGE);
                status=false;
            }
     return status;
    }
    
    public static boolean updateSection(String mname,String mdesciption,String mreg_date,String mm_id){
    
    boolean status=false;
     
     
     String qry = "UPDATE section SET description = '"+mdesciption+"', reg_date = '"+mreg_date+"', machi_type = '"+mm_id+"' WHERE sec_name = '"+mname+"'";
            try {
                pst=con.prepareStatement(qry);
                pst.execute();
                status=true;
            } catch (SQLException ex) {
                showMessageDialog(null,ex,"Error", JOptionPane.ERROR_MESSAGE);
                status=false;
            }
     return status;
    
    
    }
    
    public static boolean deleteSection(String mname){
    
    boolean status=false;
     
     
     String qry = "DELETE FROM section WHERE sec_name = '"+mname+"'";
            try {
                pst=con.prepareStatement(qry);
                pst.execute();
                status=true;
            } catch (SQLException ex) {
                showMessageDialog(null,ex,"Error", JOptionPane.ERROR_MESSAGE);
                status=false;
            }
     return status;
    
    
    }
    
    public static void calSalary(String mdesig, String mid){
        
        String salary = null;
        String nopay = null;
        String otrate = null;
        String renopay = null;
        String nopayamountS = null;
        String totsalaryS = null;
        String otamountS = "Notset";
        
        try{
                        String q = "SELECT * FROM designation WHERE desig_name = '"+mdesig+"'";
                        pst = con.prepareStatement(q);
                        rs1 = pst.executeQuery();
                        
                        while(rs1.next()){
                        salary = rs1.getString("temsal");
                        nopay = rs1.getString("temnopay");
                        otrate = rs1.getString("temot");
                        
                            }
                        
                        String emp = "SELECT * FROM employee WHERE eid = '"+mid+"'";
                        pst = con.prepareStatement(emp);
                        rs2= pst.executeQuery();
                        
                        while(rs2.next()){
                        
                        renopay = rs2.getString("renopay");
                        
                            }
                        
                        double salaryint = Double.parseDouble(salary);
                        double nopayint = Double.parseDouble(nopay);
                        double otrateint = Double.parseDouble(otrate);
                        int renopayint = Integer.parseInt(renopay);
                        
                        double nopayamount = nopayint * renopayint;
                        double totsalary = salaryint - nopayamount;
                        
                        nopayamountS = Double.toString(nopayamount);
                        totsalaryS = Double.toString(totsalary);
                        
                        Date now = new Date(); 
                        SimpleDateFormat nowdate = new SimpleDateFormat( "yyyy-MM-dd" );
                        String nowdateS = nowdate.format(now);
                       
                        String sal = "INSERT INTO empsalary (empid,npamount,caldate,netsalary) VALUES ('"+mid+"', '"+nopayamountS+"', '"+nowdateS+"', '"+totsalaryS+"')";
                        pst2 = con.prepareStatement(sal);
                        pst2.execute();
                        
        }catch(Exception e){
            showMessageDialog(null,e,"Error", JOptionPane.ERROR_MESSAGE);
        }
                        
     }
    
    
    
}
