
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
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
public class Product {
    public static void main(String[] args) {
        addProduct("books", "pølsevev", 3, 40f);
    }
    static String connectionUrl = "jdbc:sqlserver://kaysl-gruppepress.uials.no;databaseName=Retrohuset; user=javaDBAlogin; password=MEMES";

    public static void addProduct(String categoryName, String productName, int storageCount, float price) {
        try (
                Connection c = DriverManager.getConnection(connectionUrl);
                Statement stm = c.createStatement()) {
                String categoryID = "SELECT CategoryID FROM Category WHERE CategoryName = '" + categoryName + "'";
            int rowCount = stm.executeUpdate("INSERT INTO Product (CategoryID, ProductName, StorageCount, Price) "
                                            + "VALUES ((" + categoryID + "), '" + productName + "', " 
                                            + storageCount + ", " + price +")");
            new Printer(rowCount);
        } catch (SQLException ex) {
            Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
