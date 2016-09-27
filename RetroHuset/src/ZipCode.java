

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kristoffer Rogne
 */
public class ZipCode {
    String connectionUrl = 
            "jdbc:sqlserver://kaysl-gruppepress.uials.no;databaseName=Retrohuset; user=javaDBAlogin; password=MEMES";
    
/**
 * Adds a zip code to the ZipCode table
 * @param zipNumber The Zip number to add
 * @param zipName The Zip Name to add
 */    
    public void add(String zipNumber, String zipName) {
        try (
                Connection c = DriverManager.getConnection(connectionUrl);
                Statement stm = c.createStatement()) {
            String sql = "INSERT INTO ZipCode (ZipNumber, ZipName)"
                    + "VALUES ('" + zipNumber + "','" + zipName + "')";
            int rowCount = stm.executeUpdate(sql);
            Printer print = new Printer(rowCount);
        } catch (SQLException ex) {
            Logger.getLogger(ZipCode.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
/**
 * Removes from the ZipCode table with the given parameters
 * @param zipNumber The Zip number to remove (can be an empty string)
 * @param zipName The Zip Name to remove (can be an empty string)
 */    
    public void remove(String zipNumber, String zipName) {
        try (
                Connection c = DriverManager.getConnection(connectionUrl);
                Statement stm = c.createStatement()) {
            String sql = "REMOVE FROM ZipCode WHERE zipNumber=" + zipNumber + " AND zipName=" + zipName;
            int rowCount = stm.executeUpdate(sql);
            Printer print = new Printer(rowCount);
        } catch (SQLException ex) {
            Logger.getLogger(ZipCode.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
/**
 * Selects from the ZipCode table with the given parameters
 * @param zipNumber The Zip number to select from (can be an empty string)
 * @param zipName The Zip Name to select from (can be an empty string)
 */    
    public void select(String zipNumber, String zipName) {
        try (
                Connection c = DriverManager.getConnection(connectionUrl);
                Statement stm = c.createStatement()) {
            String sql = "SELECT FROM ZipCode WHERE ZipNumber=" + zipNumber + " AND ZipName=" + zipName;
            ResultSet rs = stm.executeQuery(sql);
            while(rs.next())
            {
                new Printer("%4d ",rs.getInt("ZipNumber"));
                new Printer("%-10.20s ",rs.getString("ZipName"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ZipCode.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
}
