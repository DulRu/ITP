/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Foodfunction;

//import FoodDB.dbconnect;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;




public class validation {
    
//    static Connection conn = null;
//    static PreparedStatement pst = null;
//    static ResultSet rst = null;
    
    public validation(){
        
//        conn = dbconnect.connect();
    
    }
    
    public  static int isnumber(String m)
    {
        int a = 1;
        
        if(!m.isEmpty())
        {
            for(int i=0;i<m.length();i++)
            {
                if(!Character.isDigit(m.charAt(i)))
                {
                    a=0;
                }
            }
        }
        
        return a;
    }
    public static int isLetter(String m)
    {
        int a = 1;
        
        if(!m.isEmpty())
        {
            for(int i=0;i<m.length();i++)
            {
                if(!Character.isLetter(m.charAt(i)))
                {
                    a=0;
                }
                
            }
        }
        return a;
    }
    public static int width(String m)
    {
        int a=1;
        
        if(!m.isEmpty())
        {
            if(m.length()>=15)
            {
                a =0;
            }
        }
        return a;
    }
//    public static int found(String m)
//    {
//        int a=1;
//        
//        if(!m.isEmpty())
//        {
//            
//            String sql = "SELECT FoodName FROM Food";
//            try {
//                pst = conn.prepareStatement(sql);
//                rst = pst.executeQuery();
//                while(rst.next())
//                {
//                    String name = rst.getString("FoodName");
//                    
//                    if(m.equals(name))
//                    {
//                        a=0;
//                    }
//                }
//                
//            } catch (Exception e) {
//                
//                System.out.println(e);
//            }
//        }        
//        return a;
//    }
    
}
