
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
        addProduct()
    }
    String connectionUrl = "jdbc:sqlserver://kaysl-gruppepress.uials.no;databaseName=Retrohuset; user=javaDBAlogin; password=MEMES";

    public void addProduct(int categoryName, String productName, int storageCount, float price) {
        try (
                Connection c = DriverManager.getConnection(connectionUrl);
                Statement stm = c.createStatement()) {
                String categoryID = "SELECT CategoryID FROM Category WHERE CategoryName = " + categoryName;
            ResultSet rs = stm.executeQuery("INSERT INTO Product (CategoryID, ProductName, StorageCount, Price) "
                                            + "VALUES ('(" + categoryID + "), '" + productName + "', " 
                                            + storageCount + "', " + price +")");
        } catch (SQLException ex) {
            new Printer("You fucked up");
        }
    }
    
}
