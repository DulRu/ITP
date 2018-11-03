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

/**
 *
 * @author Ganador
 */
public class InvoiceAccess {
    
    static PreparedStatement pst = null;
   // PreparedStatement pst1 = null;
    static ResultSet rs = null;
    static Connection con= dbconnect.connect();
    
    public static boolean addInvoice(String PO,String Indate,String Des,String Qty,String unit,String amount,String bill,String ship,String from,String tax,String sub,String total,String DueD,String status){
        boolean status1=false;
        try {
            String d = "insert into invoice (order_id,date,description,qty,unit_price,amount,bill_to,ship_to,fromCom,tax_rate,sub_total,total,due_date,status) values ('"+PO+"','"+Indate+"','"+Des+"','"+Qty+"','"+unit+"','"+amount+"','"+bill+"','"+ship+"','"+from+"','"+tax+"','"+sub+"','"+total+"','"+DueD+"','"+status+"')";
            pst = con.prepareStatement(d);
            pst.execute();
            status1=true;
        } catch (Exception e) {
            System.out.println(e);
        }
        return status1;
    }
    
    public static ResultSet findInv(String InNo){
        
         
        try {
            String sql="SELECT * FROM invoice WHERE id LIKE '%"+InNo+"%'";
                pst =con.prepareStatement(sql);
                rs = pst.executeQuery();
                
        } catch (Exception e) {
        }
        return rs;
    }
    
    public static ResultSet settext(String OID){
        try {
            String sql="SELECT * FROM orders WHERE Order_id= '"+OID+"'";
             pst =con.prepareStatement(sql);
             rs = pst.executeQuery();
        } catch (Exception e) {
            System.out.println(e);
        }
        return rs;
    }
  public static boolean updInvoice(String PO,String Indate,String Des,String Qty,String unit,String amount,String bill,String ship,String from,String tax,String sub,String total,String DueD,String status,String InNo){
        boolean status1=false;
        try {
            String sql = "UPDATE invoice SET order_id='"+PO+"',date='"+Indate+"',description='"+Des+"',qty='"+Qty+"',unit_price='"+unit+"',amount='"+amount+"',bill_to='"+bill+"',ship_to='"+ship+"',fromCom='"+from+"',tax_rate='"+tax+"',sub_total='"+sub+"',total='"+total+"',due_date='"+DueD+"',status='"+status+"' WHERE id ='"+InNo+"'";
            pst = con.prepareStatement(sql);
            pst.execute();
            status1=true;
        } catch (Exception e) {
            System.out.println(e);
        }
        return status1;
    }
public static double unitprice(String OID){
    double price=0.0;
    try {
         String sql="select procostperunit from products where procode='"+OID+"'";
         pst=con.prepareStatement(sql);
            //pst.setString(1,Des.getText());
            rs=pst.executeQuery();
            while(rs.next()){
                String x=rs.getString("procostperunit");
                price=Double.parseDouble(x);
            }
    } catch (Exception e) {
    }
    return price;
}

public static int isavilable(String OID){
    int a=0;
                 try{
                        
                  String sql1 ="SELECT Order_id FROM orders"; 
                  
                        pst = con.prepareStatement(sql1);
                        rs =pst.executeQuery();
                        
                        
                        while(rs.next()){
                          String Cus=rs.getString("Order_id");
                            
                            if(OID.equals(Cus)){
                                
                                a=1;
                                }
              
                            }
                        
             }
                 
             catch(Exception e){
                 System.out.println(e);
                     }
                 return a;
        }
  public static boolean removeInvoice(String In_id){
        boolean status=false;
        try {
            String sql = "DELETE FROM invoice WHERE id = '"+In_id+"'";            
            pst = con.prepareStatement(sql);
            pst.execute();
            status=true;
             } 
             catch (Exception e) {
                    System.out.println(e);
             }
             
             return status;
    }
}
    
