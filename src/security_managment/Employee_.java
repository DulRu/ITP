/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package security_managment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Tharindu sachintha
 */
public class Employee_ {
    
    
    Connection con=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    
    public Employee_()
    {
        con=db_connect.dbconnect.connect();
    }
    
    public void Attendence(int Eid,String Sdate,String Edate)
    {
        String sql="insert into attendence(eid,sdate,edate) values('"+Eid+"','"+Sdate+"','"+Edate+"')";
        
        try{
            pst=con.prepareStatement(sql);
            pst.execute();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    
}
