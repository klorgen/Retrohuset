

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
    String zipNumber;
    String zipName;
    public ZipCode(String zipNumber, String zipName) {
        this.zipNumber = zipNumber;
        this.zipName = zipName;
    }
    
    public void add() {
        String connectionUrl = "jdbc:sqlserver://kaysl-gruppepress.uials.no;databaseName=Retrohuset; user=javaDBAlogin; password=MEMES";
        
        try (
                Connection c = DriverManager.getConnection(connectionUrl);
                Statement stm = c.createStatement()) {
            String sql = "INSERT INTO ZipCode (ZipNumber, ZipName)"
                    + "VALUES ('" + zipNumber + "','" + zipName + "')";
        } catch (SQLException ex) {
            Logger.getLogger(ZipCode.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
