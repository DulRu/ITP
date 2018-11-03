/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventory1;

import db_connect.dbconnect;
import static db_connect.dbconnect.connect;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Dharshika
 */
public class Validations {
    
    
     public static int isnum(String aa){
       
          int a=1; 
        {
            for(int x=0;x<aa.length();x++)
            {
                if(!Character.isDigit(aa.charAt(x)))
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
            if((m.length()>8)||(m.length()<8))
            {
                a =0;
            }
        }
        return a;
    }
        
         public static int minus(double aa){
       
          int a=1; 
        {
           
                if(aa<0)
                {
                    
                    a=0;
                }
          

        } 
       return a;
   }
         
    
    
}
