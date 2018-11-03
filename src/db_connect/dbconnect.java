/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db_connect;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Tharindu sachintha
 */
public class dbconnect 
{
   public static Connection connect()
    {
    
    
    
        Connection conn=null;
    
        try
            {
    
                Class.forName("com.mysql.jdbc.Driver");
                conn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/itp", "athma", "1234567890");
            }
        catch(Exception e)
        {
    
            System.out.println(e);
        }
    
    return conn;
    
    
    }
}




