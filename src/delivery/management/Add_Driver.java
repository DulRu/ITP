/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delivery.management;

import db_connect.dbconnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JComboBox;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;
import javax.swing.*;
/**
 *
 * @author asd
 */
public class Add_Driver {

        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs=null;
        
        public Add_Driver()
        {
            con= dbconnect.connect();
        }
    
    
        
        public void Tableload(JTable jtable)
    {
       try {
 
            String sql ="SELECT DriverId as DriverId,DriverName as Name,AssignedVehicle as VehicelType,Age as Age,Address as Address,Email as Email,TelephoneNumber as Telephone FROM adddriver "; 
            pst = con.prepareStatement(sql);
           
            rs =pst.executeQuery();
            
              jtable.setModel(DbUtils.resultSetToTableModel(rs));      
       }
       catch(Exception e)
       {
           showMessageDialog(null,e);
       }
    }
     
     
        
        
        public void SetComboBox(JComboBox jcombo)
    {
        String sql="select DISTINCT FuelType from vehicleinventory";
        
            try {
                pst=con.prepareStatement(sql);
                rs=pst.executeQuery();
                
                while(rs.next())
                {
                    jcombo.addItem(rs.getString(1));
                }
            } catch (Exception e) {
                System.out.println(e);
            }
    }
     
   
        
        public int Checkemail(String Emaill){
          int x=1;
            
               String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
               if((!Emaill.matches(ePattern))&&(!Emaill.isEmpty())){
                   x=0;
               }
               return x;
    }
    
  
        
        
        public void Insert(String DriverId,String DriverName,String AssignedVehicle,int Age,String Address,String Email,int TelephoneNumber)
    {
        String sql="INSERT INTO adddriver(DriverID,driverName,AssignedVehicle,Age,Address,Email,TelephoneNumber) values ('"+DriverId+"','"+DriverName+"','"+AssignedVehicle+"','"+Age+"','"+Address+"','"+Email+"','"+TelephoneNumber+"')";
        
        try{
        
        pst = con.prepareStatement(sql);
        pst.execute();
        JOptionPane.showMessageDialog(null,"Successfuly Added");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
         }
    }
    
    
        
        public void Update(String UDriverId,String UDriverName,String UAssignedVehicle,int UAge,String UAddress,String UEmail,int UTelephoneNumber)
    {
    
        try{
            
            String sql="update adddriver set DriverName=?,AssignedVehicle=?,Age=?,Address=?,Email=?,TelephoneNumber=? where DriverId=?";
            pst=con.prepareStatement(sql);
   
            pst.setString(1,UDriverName);
            pst.setString(2,UAssignedVehicle);
            pst.setString(3,Integer.toString(UAge));
            pst.setString(4,UAddress);
            pst.setString(5,UEmail);
            pst.setString(6,Integer.toString(UTelephoneNumber));
            
            pst.setString(7,UDriverId);
            
            
            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "Successsfuly Updated");
        }
        
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Not Updated Successfuly"+e);
        }
    }
}
