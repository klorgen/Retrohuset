

import java.sql.Connection;
import java.sql.DriverManager;
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
    String zipNumber;
    String zipName;
    public ZipCode(String zipNumber, String zipName) {
        this.zipNumber = zipNumber;
        this.zipName = zipName;
    }
    
    public void add() {
        
        try (
                Connection c = DriverManager.getConnection(connectionUrl);
                Statement stm = c.createStatement()) {
            String sql = "INSERT INTO ZipCode (ZipNumber, ZipName)"
                    + "VALUES ('" + zipNumber + "','" + zipName + "')";
            int rowCount = stm.executeUpdate(sql);
            Printer print = new Printer("" + rowCount);
        } catch (SQLException ex) {
            Logger.getLogger(ZipCode.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
