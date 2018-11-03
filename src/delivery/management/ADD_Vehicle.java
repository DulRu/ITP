/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delivery.management;
import db_connect.dbconnect;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JComboBox;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;
import javax.swing.*;
/**
/**
 *
 * @author asd
 */
public class ADD_Vehicle {
    Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs=null;
        
        public ADD_Vehicle()
        {
            con= dbconnect.connect();
        }
        
        
        
        public void tableload(JTable jtable)
    {
       try
       {
 
            String sql ="SELECT VehicleID as VehicleID,Manufacturer as Manufacturer,RegNo as RegNo,Transmission as Transmission,ManuYear as ManuYear,PurchaseDate as PurchaseDate,FuelType as FuelType FROM vehicleinventory "; 
            pst = con.prepareStatement(sql);
          
            rs =pst.executeQuery();
            
            jtable.setModel(DbUtils.resultSetToTableModel(rs));      
       }
       catch(Exception e)
       {
           showMessageDialog(null,e);
       }
    }
    
      
        public void Insert(String VehicleID, String Manufacturer,String RegNo,String Transmission,String ManuYear,String PurchaseDate,String FuelType) 
    {
        
        String sql="INSERT INTO vehicleinventory(VehicleID,Manufacturer,RegNo,Transmission,ManuYear,PurchaseDate,FuelType) values ('"+VehicleID+"','"+Manufacturer+"','"+RegNo+"','"+Transmission+"','"+ManuYear+"','"+PurchaseDate+"','"+FuelType+"')";
        
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
         
         
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    
    }
    

   
    
        
        
        
        
     
        
   
