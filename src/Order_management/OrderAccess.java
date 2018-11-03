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
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Ganador
 */
public class OrderAccess {
    
     static PreparedStatement pst = null;
   // PreparedStatement pst1 = null;
    static ResultSet rs = null;
    static Connection con= dbconnect.connect();
    
    
    public static int isavilable(String cus){
    int a=0;
                 try{
                        
                  String sql1 ="SELECT id FROM customer"; 
                  
                        pst = con.prepareStatement(sql1);
                        rs =pst.executeQuery();
                        
                        
                        while(rs.next()){
                          String Cus=rs.getString("id");
                            
                            if(cus.equals(Cus)){
                                
                                a=1;
                                }
              
                            }
                        
             }
                 
             catch(Exception e){
                 System.out.println(e);
                     }
                 return a;
        }
     public static boolean addOrder(String Pcode,String Cid,String PQ,String Fabcode,String Fabdes,String OrdDate,String delDate ){
           
             boolean status=false;
             try {
                 
                 String d = "insert into orders(product_code,cus_id,quantity,facbri_code,fabric_des,Order_date,delivery_date) values ('"+Pcode+"','"+Cid+"','"+PQ+"','"+Fabcode+"','"+Fabdes+"','"+OrdDate+"','"+delDate+"')";
            pst = con.prepareStatement(d);
            pst.execute();
            status=true;
             } 
             catch (Exception e) {
             }
             
             return status;
     }
     
    public static boolean removeOrder(String orID){
        boolean status=false;
        try {
            String sql = "DELETE FROM orders WHERE Order_id = '"+orID+"'";            
            pst = con.prepareStatement(sql);
            pst.execute();
            status=true;
             } 
             catch (Exception e) {
                    System.out.println(e);
             }
             
             return status;
    }
    
    public static boolean updateOrder(String Pcode,String Cid,String PQ,String Fabcode,String Fabdes,String OrdDate,String delDate,String OId )
    {
        boolean status=false;
        try {
            String sql = "UPDATE orders SET product_code= '"+Pcode+"', cus_id= '"+Cid+"', quantity= '"+PQ+"', facbri_code= '"+Fabcode+"',fabric_des= '"+Fabdes+"', Order_date= '"+OrdDate+"', delivery_date= '"+delDate+"' WHERE Order_id = '"+OId+"'";
                pst = con.prepareStatement(sql);
                pst.execute();
                status=true;
        } catch (Exception e) {
        }
        return status;
    }
    public static boolean searchcus(String orID,javax.swing.JTable t1){
        boolean status=false;
        try {
           String sql="SELECT * FROM orders WHERE Order_id LIKE '%"+orID+"%'";           
            pst =con.prepareStatement(sql);
            rs = pst.executeQuery();
            t1.setModel(DbUtils.resultSetToTableModel(rs));
            status=true;
             } 
             catch (Exception e) {
             }
             
             return status;
    }
    
}
