/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Order_management;


import db_connect.dbconnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import net.proteanit.sql.DbUtils;

public class scheduleAccess {
    
   static PreparedStatement pst = null;
    // PreparedStatement pst1 = null;
  static  ResultSet rs = null;
 static Connection con= dbconnect.connect();
    
    
    public static boolean addschdule(String OrId,String des,String Ordate,String deldate){
        boolean status1=false;
        try {
            String d = "insert into schedule (order_id,description,start_date,end_date) values ('"+OrId+"','"+des+"','"+Ordate+"','"+deldate+"')";
            pst = con.prepareStatement(d);
            pst.execute();
            status1=true;
        } catch (Exception e) {
            System.out.println(e);
        }
        return status1;
    }
    
    public static int isavilable(String OID){
    int a=0;
                 try{
                        
                  String sql1 ="SELECT Order_id FROM orders"; 
                  
                        pst = con.prepareStatement(sql1);
                        rs =pst.executeQuery();
                        
                        
                        while(rs.next()){
                          String Oid=rs.getString("Order_id");
                            
                            if(OID.equals(Oid)){
                                
                                a=1;
                                }
              
                            }
                        
             }
                 
             catch(Exception e){
                 System.out.println(e);
                     }
                 return a;
        } 
    public static boolean removeSchedule(String SchId){
        boolean status=false;
        try {
             String sql = "DELETE FROM schedule WHERE schedule_id = '"+SchId+"'";          
            pst = con.prepareStatement(sql);
            pst.execute();
            status=true;
             } 
             catch (Exception e) {
             }
             
             return status;
    }
    
     public static boolean Updschdule(String OrId,String des,String Ordate,String deldate,String schId){
        boolean status1=false;
        try {
            String sql = "UPDATE schedule SET order_id= '"+OrId+"',description='"+des+"',start_date='"+deldate+"',end_date='"+Ordate+"' WHERE schedule_id = '"+schId+"'";
            pst = con.prepareStatement(sql);
            pst.execute();
            status1=true;
        } catch (Exception e) {
            System.out.println(e);
        }
        return status1;
    }
     
     public static boolean searchSche(String ordate,String deldate, javax.swing.JTable jTable1){
        boolean status=false;
        
        try {
           String sql="SELECT * FROM schedule WHERE start_date between '"+ordate+"' and '"+deldate+"'";      
            pst =con.prepareStatement(sql);
            rs = pst.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            status=true;
            
             } 
             catch (Exception e) {
             }
             
             return status;
    }
}


