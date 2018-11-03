/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Homeome;

import db_connect.dbconnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 * 
 * 
 *
 * @author Ganador
 */
public class loginvalid {
    
    static PreparedStatement pst = null;
   // PreparedStatement pst1 = null;
    static ResultSet rs = null;
    static Connection con= dbconnect.connect();
    
    
     public static  int validate_login(String username,String password) {
       int a=0;
        try{             
       
    String Uname=null;
    String Pass=null;
    String desig=null; 
           String sql="Select usrname,passwrd,desig from employee where usrname='"+username+"'and passwrd='"+password+"'";
          
            pst =con.prepareStatement(sql);
            rs = pst.executeQuery();
   
            while(rs.next()){
                Uname=rs.getString("usrname");
                Pass=rs.getString("passwrd");
                desig=rs.getString("desig");
               
                 if(desig.equals("Manager")) {
                    a=1;
                    
                    }
                 else if(desig.equals("Order Manager")) {
                    a=2;
                    
                    }
                 else if(desig.equals("Maintainer")) {
                    a=3;
                    
                    }
                 else if(desig.equals("Supervisor")) {
                    a=4;
                    
                    }
                 else if(desig.equals("Delivery Manager")) {
                    a=5;
                    
                    }
                 else if(desig.equals("Security Manager")) {
                    a=6;
                    
                    }
                 else if(desig.equals("Cheff")) {
                    a=7;
                    
                    }
                 else if(desig.equals("Cashier")) {
                    a=8;
                    
                    }
            } 
//      String sql2 = "Select desig From login where username='"+Uname+"' and password = '"+Pass+"'";
//      pst = con.prepareStatement(sql2);
//      rs = pst.executeQuery();                                                        
//      while(rs.next()){
//          desig=rs.getString("desig");
//          System.out.println(desig);
//      }                          
      
        }
            
       
     
        catch(Exception e){
            e.printStackTrace();
        }  

 return a;  
}
     

}

