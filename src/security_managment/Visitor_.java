/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package security_managment;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Tharindu sachintha
 */
public class Visitor_ {
    Connection con=null;
    PreparedStatement pst=null;
    ResultSet rs=null;

    public Visitor_()
    {
        con=db_connect.dbconnect.connect();
    }

    void setTable(JTable table)
    {
    
          String sql="Select idvisitor,name,idno,purpose,status,card,telephoneno,dependent,date from visitor ";
            
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
    public void Search(String se,JTextField Vid,JTextField idno,JTextField name,JTextField address,JTextField telno,JTextField pur,JTextField stat,JTextField crd)
    {
         String sql="select * from visitor where idvisitor=?";
         
        try{
            
            pst=con.prepareStatement(sql);
            pst.setString(1,se);
            rs=pst.executeQuery();
            
            if(rs.next())
            {
                Vid.setText(rs.getString("idvisitor"));
                idno.setText(rs.getString("idno"));
                name.setText(rs.getString("name"));
                address.setText(rs.getString("address"));
                telno.setText(rs.getString("telephoneno"));
                pur.setText(rs.getString("purpose"));
                stat.setText(rs.getString("status"));
                crd.setText(rs.getString("card"));
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Invalid Visitor ID");
            }
        }
        catch(Exception e)
        {
        
        }
    }                      
    
    public void Delete(String Vid){
        
        
        String sql="delete from visitor where idvisitor=? ";
        

        
        try{
            pst=con.prepareStatement(sql);
            pst.setString(1,Vid);
            
            int msg=JOptionPane.showConfirmDialog(null,"Do you need to delete Visitor :"+Vid, "close",JOptionPane.YES_OPTION,JOptionPane.NO_OPTION);
            
            if(msg==JOptionPane.YES_OPTION)
            {
                pst.executeUpdate();
            }
            
        }
        catch(Exception e)
        {
        
        }
        
    }                      
    
      public void Update(String idno,String name,String address,String telno,String pur,String Vid,JTextField tel,JTextField id){
      
            int x=JOptionPane.showConfirmDialog(null,"Do you really want to update");
        if (x==0);
        {  String sql="update visitor set idno=?,name=?,address=?,telephoneno=?,purpose=? where idvisitor=?";
        
        try{
            pst=con.prepareStatement(sql);
            
            pst.setString(1,idno);
            pst.setString(2,name);
            pst.setString(3,address);
            pst.setString(4,telno);
            pst.setString(5,pur);
            pst.setString(6,Vid);
            
            pst.executeUpdate();
            
            
            if(tel.getBackground()==Color.red || tel.getText().length()<10 )
            {
                JOptionPane.showMessageDialog(null,"Wrong Telephone number");
                tel.setText(null);
                
            }
            else if(id.getBackground()==Color.red || id.getText().length()<10 )
            {
                JOptionPane.showMessageDialog(null,"Wrong National Id");
                id.setText(null);
                
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Succeess");
                
            
            }
                
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error");
        }
        
        //SetTable();
        
        
        }
      
      
      
      
      
      
      }
 
 
 
 
 
 
 }    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    













