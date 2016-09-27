/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Retrohuset;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Face
 */
public class DatabaseOpg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String connectionUrl = "jdbc:sqlserver://kristrog-sql.uials.no;databaseName=HobbyhusetEXMPL; user=kristofferNB; password=LUL";
        
        try (
                Connection c = DriverManager.getConnection(connectionUrl);
                Statement stm = c.createStatement()) {
            ResultSet rs = stm.executeQuery("SELECT * FROM Kunde");
            while (rs.next()) {
                    System.out.println(rs.getString(4) + " " + rs.getString(5));
                }
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseOpg.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
