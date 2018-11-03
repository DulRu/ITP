
package MTfunction;

import db_connect.dbconnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author Dulangi Rathnayaka
 */
public class mtvalidation {
    //Connection con = null;
   static Connection con = dbconnect.connect();
  static  PreparedStatement pst = null;
   static ResultSet rs = null;//table click
  
    public  static int isdouble(String m)
    {
        int a = 1;
        
        if(!m.isEmpty())
        {
            for(int i=0;i<m.length();i++)
            {
                if(Character.isLetter(m.charAt(i)))
                {
                    a=0;
                }
            }
        }
        
        return a;
    }
    
     public static int isnumber(String aa){
       
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
    public static int isLetter(String mm)
    {
        int a = 1;
        
        if(!mm.isEmpty())
        {
            for(int i=0;i<mm.length();i++)
            {
                if((mm.charAt(i)==' ') || (mm.charAt(i)=='&'))
                {
                }
                 
                else if(!Character.isLetter(mm.charAt(i)))
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
    
    public static int checkNIC(String Nic){
    
        int a=1; 
        {
            for(int x=0;x<9;x++)
            {
                if(!Character.isDigit(Nic.charAt(x)))
                {
                    
                    a=0;
                }
            }

        } 
       return a;
    }
   public static int isavailable(String mid){
        
        int a=0;
    try {
                
                String sql = "SELECT * FROM mdetails";
                pst = con.prepareStatement(sql);
                rs = pst.executeQuery();
                
                while(rs.next()){
                    String Mid;
                    Mid=rs.getString("MID");
                    
                    if(mid.equals(Mid)){
                        a=1;
                    }
                }
            } catch (Exception e) {
                showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            }
    return a;
    }
 }
