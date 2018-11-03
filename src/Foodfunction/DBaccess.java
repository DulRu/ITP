/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Foodfunction;

import db_connect.dbconnect;
import static Foodfunction.DBaccess.conn;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import net.proteanit.sql.DbUtils;


public class DBaccess {
    
    static Connection conn = dbconnect.connect();
    
    static PreparedStatement pst1 = null;
    static PreparedStatement pst2 = null;
    static PreparedStatement pst3 = null;
    static ResultSet rst1 = null;
    static ResultSet rst2 = null;
    static ResultSet rst3 = null;
    
    
    
//    private String f_id;
//    private String f_name;
//    private String f_quan;
//    private String f_lastDate;
//    
//    public DBaccess(String F_id,String F_name,String F_quan,String F_lastDate)
//    {
//        this.f_id = F_id;
//        this.f_name = F_name;
//        this.f_quan = F_quan;
//        this.f_lastDate = F_lastDate;
//    }
//    public String getfid(){
//    
//        return f_id;
//    }
//    public void setfid(String F_id){
//    
//        this.f_id= F_id;
//    }
//    public String getfname(){
//    
//        return f_name;
//    }
//    public void setfname(String F_name){
//    
//        this.f_name= F_name;
//    }
//    public String getfquan(){
//    
//        return f_quan;
//    }
//    public void setfquan(String F_quan){
//    
//        this.f_quan= F_quan;
//    }
//    public String getflastDate(){
//    
//        return f_lastDate;
//    }
//    public void setflastDate(String F_lastDate){
//    
//        this.f_lastDate= F_lastDate;
//    }
    
    public static boolean addfood(String F_id,String F_name,String F_quan,String F_lastDate)
    {
        boolean status =false;
        
        try{

            String q2 = "INSERT INTO Food (FoodID,FoodName,Quantity,LastDate) values ('"+F_id+"','"+F_name+"','"+F_quan+"','"+F_lastDate+"')";
            
            pst1 = conn.prepareStatement(q2);
            pst1.execute();
            
            status = true;
        }
        catch(Exception e){

            System.out.println(e);

        }
        
        return status;
    }
    public static boolean updatefood1(String F_id,String F_name)
    {   
        boolean status = false;
        
                try{
                    String sql = "UPDATE Food SET FoodName='"+F_name+"' WHERE FoodID='"+F_id+"'";
                    pst1 = conn.prepareStatement(sql);
                    pst1.execute();
                    
                    status = true;
                   
                }
                catch(Exception e){
                    
                    System.out.println(e);
                        
                }
        
        return status;
    }
    public static boolean updatefood2(String F_id,String F_name,String F_quan1,String F_lastDate)
    {
        boolean status = false;
        
        double v1 = 0;
        double v2 = 0;
        double vv = 0;
        
        try{    
                    String sql1 = "SELECT * FROM Food WHERE FoodID='"+F_id+"'";
                    pst1 = conn.prepareStatement(sql1);
                    rst1 = pst1.executeQuery();
                
                    
                    while(rst1.next())
                    {
                       
                        v2 = rst1.getDouble("Quantity");
                        
                    }
                        v1 = Double.parseDouble(F_quan1);
                        vv=v1+v2;
                        String v_quan2 = Double.toString(vv);
                
                        String sql = "UPDATE food SET FoodID='"+F_id+"' , FoodName='"+F_name+"' , Quantity='"+v_quan2+"' , LastDate='"+F_lastDate+"' WHERE FoodID='"+F_id+"'";
                        pst1 = conn.prepareStatement(sql);
                        pst1.execute();
                        
                        status = true;
                
                        
                }
                catch (Exception e) {
                        System.out.println(e);
                }
        
        return status;
    
    }
    public static boolean deletefood(String F_id)
    {
        boolean status = false;
        
        String sql = "DELETE from Food WHERE FoodID='"+F_id+"'";
            
            try {
                
                pst1= conn.prepareStatement(sql);
                pst1.execute();
               
            } catch (Exception e) {
                System.out.println(e);
            }
        
        return status;
    }
    public static boolean searchfood(String Search,String Name, javax.swing.JTable tbl)
    {
        boolean status = false;
        String sql = "SELECT * FROM Food WHERE FoodName LIKE '%"+Search+"%' and FoodID LIKE '"+Name+"%'";

        try {
            pst1 = conn.prepareStatement(sql);
            rst1 = pst1.executeQuery();
            status = true;
            tbl.setModel(DbUtils.resultSetToTableModel(rst1));
            
        } catch (Exception e) {
        }
        return status;
    }
    public static boolean getfood(String F_id,String F_quan1)
    {
        boolean status = false;
        
        double v2 = 0;
        double vv = 0;
        double  v1 = Double.parseDouble(F_quan1);
        
        try {
            String sql1 = "SELECT * FROM Food WHERE FoodName='"+F_id+"'";
            pst1 = conn.prepareStatement(sql1);
            rst1 = pst1.executeQuery();
               
            while(rst1.next())
            {
                v2 = rst1.getDouble("Quantity");
            }
                vv=v2-v1;
                String v_quan2 = Double.toString(vv);
                
                String sql = "UPDATE Food SET Quantity='"+v_quan2+"' WHERE FoodName='"+F_id+"'";
                pst1 = conn.prepareStatement(sql);
                pst1.execute();
                            
                status = true;
                          
            } 
            catch (Exception e) 
            {
                System.out.println(e);
            }
        
        return status;
    }
}
//-------------------------------------------------------------------------

//    public static boolean getpackage(String PWD,String desig,String Package)
//    {
//        boolean status = false;
//            
//            
//
//        return status;
//    }
//    public static boolean packc(int x,int y,)