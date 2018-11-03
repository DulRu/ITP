
package MTfunction;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Dulangi Rathnayaka
 */
public class mtfunction {
     static double total;
     public static String getNextID(String col, String table, String prefix, Connection con)
    {
        int id = 0;
        int length = prefix.length() + 1;
        String query = "select max(substring( " + col + ","+length +",length(" + col + "))) as nextid from " + table;
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		try
        	{
            		pst = con.prepareStatement(query);
            		rs = pst.executeQuery(query);
            		while (rs.next())
            		{

                		if (rs.getString("nextid") == null)
                                    id = 1001;
                		else
                    			id = Integer.parseInt(rs.getString("nextid")) + 1;
            		}
        	}
        	catch (Exception ex)
        	{
           		 System.out.println(ex);
        	}
        return prefix + id;
    }

   
}
    

