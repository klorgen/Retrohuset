
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Represents a single product. Has the ability to add and remove a product
 * @author Anders
 */
public class ProductSQL {

    static String connectionUrl = "jdbc:sqlserver://kaysl-gruppepress.uials.no;databaseName=Retrohuset; user=javaDBAlogin; password=MEMES";
    
    /**
     * Registers and adds a new product to the register. 
     * @param categoryName Name of the category the item belongs to. For example 'Books'
     * @param productName Name or description of the item
     * @param storageCount How many items of this type are in stock
     * @param price Price in NOK for a single item
     * @return Row count
     */
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
    
    /**
     * Remove a product from the product register
     * @param productID The unique product ID of the item you want to remove
     * @return Row count
     */
    public static int remove(int productID) {       
        Integer rowCount = null;
        try (
                Connection c = DriverManager.getConnection(connectionUrl);
                Statement stm = c.createStatement()) {
            rowCount = stm.executeUpdate("DELETE FROM Product WHERE productID = '" + productID + "'");
            new Printer(rowCount);
        } catch(SQLException ex) {
            Logger.getLogger(ProductSQL.class.getName()).log(Level.SEVERE, null, ex);

        }
        return rowCount;
    }
    
}
