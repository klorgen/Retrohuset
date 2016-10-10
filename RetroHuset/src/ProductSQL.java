
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Represents a single product. 
 * @author Anders
 */
public class ProductSQL {

    static String connectionUrl = "jdbc:sqlserver://kaysl-gruppepress.uials.no;databaseName=Retrohuset; user=javaDBAlogin; password=MEMES";

    public static int add(String categoryName, String productName, int storageCount, float price) {
        Integer rowCount = null;
        try (
                Connection c = DriverManager.getConnection(connectionUrl);
                Statement stm = c.createStatement()) {
                String categoryID = "SELECT CategoryID FROM Category WHERE CategoryName = '" + categoryName + "'";
                rowCount = stm.executeUpdate("INSERT INTO Product (CategoryID, ProductName, StorageCount, Price) "
                                            + "VALUES ((" + categoryID + "), '" + productName + "', " 
                                            + storageCount + ", " + price +")");
            new Printer(rowCount);
        } catch (SQLException ex) {
            Logger.getLogger(ProductSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rowCount;
    }
    
    public static int remove(int productID) {
        
        Integer rowCount = null;
        try (
                Connection c = DriverManager.getConnection(connectionUrl);
                Statement stm = c.createStatement()) {
            rowCount = stm.executeUpdate("DELETE FROM Product WHERE productID = '" + productID + "'");
        } catch(SQLException ex) {
            Logger.getLogger(ZipCode.class.getName()).log(Level.SEVERE, null, ex);

        }
        return rowCount;
    }
    
}
