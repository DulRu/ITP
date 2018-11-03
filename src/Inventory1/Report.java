/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Inventory1;

import com.mysql.jdbc.Connection;
import java.awt.Container;
import java.util.HashMap;
import javax.swing.*;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.swing.JRViewer;
//import db_connect.dbconnect;
import  db_connect.*;


/**
 *
 * @author Hasindu
 */
public class Report extends JFrame
{
    public Report(String fileName)
    {
        this(fileName, null);
    }
    public Report(String fileName, HashMap para)
    {
        super("MAS Active Garment Management system)");

        dbconnect dba = new dbconnect();
        Connection con =(Connection) db_connect.dbconnect.connect();

        try
        {
            JasperPrint print = JasperFillManager.fillReport(fileName, para, con);
            JRViewer viewer = new JRViewer(print);
            Container c = getContentPane();
            c.add(viewer);            
        } 
        catch (JRException jRException)
        {
            
        }
        setBounds(10, 10, 900, 700);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    
}
