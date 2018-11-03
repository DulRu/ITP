/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package security_managment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.*;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Tharindu sachintha
 */
public class Vehicle_d {
    
    Connection con=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    
    public Vehicle_d()
    {
       con=db_connect.dbconnect.connect();
    }
    
    void setTable(JTable table)
    {
            String sql="select pid,did,date,model,vno,parkp,parkno,Leve from vehicle";
            
            try{
                pst=con.prepareStatement(sql);
                rs=pst.executeQuery();
                
                table.setModel(DbUtils.resultSetToTableModel(rs));
                
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,e);
            }
    }
    
    void Insert(String vehino,String driverid,String drname,String modell,String pkno,String pkp,String datee,JComboBox mcombo,JTextField place)
    {
         try{
            String sql="INSERT INTO vehicle(vno,did,dname,model,parkno,parkp,date)"
                    +"VALUES('"+vehino+"','"+driverid+"','"+drname+"','"+modell+"','"+pkno+"','"+pkp+"','"+datee+"')";
            
            String sq="INSERT INTO leavevehicle(model) VALUES('"+modell+"')";
        
            String model=(String)mcombo.getSelectedItem();
            
            pst=con.prepareStatement(sql);
            pst=con.prepareStatement(sq);
          
            if(model.equals("Car and Van"))
            {
                place.setText("A Park");
            }
            else if(model.equals("Lorry"))
            {
                place.setText("B Park");
            }
            else if(model.equals("Bike"))
            {
                place.setText("Park C");
            }
            
            pst.execute(sql);
            pst.execute(sq);
            JOptionPane.showMessageDialog(null,"success");

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }

    public void Update(String driverid,String drname,String modell,String vehino,String pkp,String pkno,String id)
    {
         int x=JOptionPane.showConfirmDialog(null,"Do you really want to update");
        if (x==0);
            String sql="update vehicle set  did=?,dname=?,model=?,vno=?,parkp=?,parkno=? where pid=?";
        
        try{
            pst=con.prepareStatement(sql);
            
           pst.setString(1,driverid);
           pst.setString(2,drname);
           pst.setString(3,modell);
           pst.setString(4,vehino);
           pst.setString(5,pkp);
           pst.setString(6,pkno);
           pst.setString(7,id);       
            
            pst.executeUpdate();
            
            
            JOptionPane.showMessageDialog(null,"Success");
           
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
    public void Delete(String pid,String search)
    {
        String sql="delete from vehicle where pid=? ";
             
              String sq="delete from leavevehicle where pid=?";            
           
        try{
            pst=con.prepareStatement(sql);
            pst.setString(1,pid);
            
            int msg=JOptionPane.showConfirmDialog(null,"Do you need to delete vehicle details :"+pid, "close",JOptionPane.YES_OPTION,JOptionPane.NO_OPTION);
            
            if(msg==JOptionPane.YES_OPTION)
            {
                pst.executeUpdate();
                
                pst=con.prepareStatement(sq);
                pst.setString(1,search);
                pst.executeUpdate();
            }
            
            
        }
        catch(Exception e)
        {
        
        }
    }
    
    public void Leave(String search)
    {
         String sql="delete from leavevehicle where pid=?";
        String s="update vehicle set  Leve='leave' where pid=?";
       
        
        try{
            pst=con.prepareStatement(sql);
            pst.setString(1,search);
            
            int msg=JOptionPane.showConfirmDialog(null,"is it leave :"+search, "close",JOptionPane.YES_OPTION,JOptionPane.NO_OPTION);
            
            if(msg==JOptionPane.YES_OPTION)
            {
                pst.executeUpdate();
                pst=con.prepareStatement(s);
                pst.setString(1,search);
                pst.executeUpdate();
            }
           
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
    public void setUsingComboBox(String modl,JTextField place,JTextField no,JLabel lable)
    {
        String sql="select count(model) from leavevehicle where model=?";
            
        try{
            pst=con.prepareStatement(sql);
            
            pst.setString(1,modl);
            rs=pst.executeQuery();
          
            int count = -1;

            while(rs.next())
            {
                count = rs.getInt(1);
                
            }
                
                if(modl.equals("Car and Van") && count<=5 )
                {
                    place.setText("A Park");
                    no.setText(String.valueOf(++count));
                    lable.setText(null);
            
                 }
                else if(modl.equals("Lorry") && count<=10)
                {
                    place.setText("B Park");
                    no.setText(String.valueOf(++count));
                    lable.setText(null);
                }
                else if(modl.equals("Bike") && count<=10)
                {
                    place.setText("Park C");
                    no.setText(String.valueOf(++count));
                    lable.setText(null);
                }
                else if(modl.equals("Select model"))
                {
                    place.setText(null);
                    no.setText(null);
                    lable.setText(null);
                }
                else
                {
                    place.setText(null);
                    no.setText(null);
                    lable.setText("full");
                }
            
        }    
        catch(Exception e)
        {
        
        }
    }
    public void Search(String se,JTextField vno,JTextField did,JTextField dn,JLabel pid,JTextField place,JComboBox mcombo,JTextField sea)
    {
         String sql="select * from vehicle where pid=?";
        
        try{
            
            pst=con.prepareStatement(sql);
            pst.setString(1,se);
            rs=pst.executeQuery();
            
            if(rs.next())
            {
                vno.setText(rs.getString("vno"));
                did.setText(rs.getString("did"));
                dn.setText(rs.getString("dname"));
                pid.setText(rs.getString("pid"));
                place.setText(rs.getString("parkp"));
                mcombo.setSelectedItem(rs.getString("model"));
               // dte.set
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Invalid Park Id");
                sea.setText(null);
            }
        }
        catch(Exception e)
        {
        
        }
    }
    
}
