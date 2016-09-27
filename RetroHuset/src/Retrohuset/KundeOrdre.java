/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Retrohuset;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Face
 */
public class KundeOrdre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String connectionUrl = "jdbc:sqlserver://kristrog-sql.uials.no;databaseName=HobbyhusetEXMPL; user=kristofferNB; password=LUL";
        
        try (
                Connection c = DriverManager.getConnection(connectionUrl);
                Statement stm = c.createStatement()) {
            ResultSet rs = stm.executeQuery("SELECT KNr, OrdreNr, OrdreDato FROM Ordre");
            System.out.println("ID   Ordre Dato");
            while (rs.next()) {
                    System.out.printf("%4d ",rs.getInt("KNr"));
                    System.out.printf("%4d ",rs.getInt("OrdreNr"));
                    System.out.printf("%-10.10s\n",rs.getString("OrdreDato"));
                }
        } catch (SQLException ex) {
            Logger.getLogger(KundeList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
