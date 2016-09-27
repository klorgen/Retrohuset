/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Retrohuset;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Face
 */
public class NyKunde {
    static String fornavn = "Erik Haram";
    static String etternavn = "Nygård";
    static String adresse = "Homsegata 69";
    static int postNr = 6996;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String connectionUrl = "jdbc:sqlserver://kristrog-sql.uials.no;databaseName=HobbyhusetEXMPL; user=kristofferNB; password=LUL";
        
        try (
                Connection c = DriverManager.getConnection(connectionUrl);
                Statement stm = c.createStatement()) {
            String sql = "INSERT INTO Kunde (KNr, Fornavn, Etternavn, Adresse, PostNr)" +
                    "VALUES ((SELECT MAX(KNr) + 1 FROM Kunde), '" + fornavn + "','" + etternavn + "','" + adresse + "','" + postNr + "')";
            int rowCount = stm.executeUpdate(sql);
            System.out.printf("Inserted %d records\n",rowCount);
        } catch (SQLException ex) {
            Logger.getLogger(KundeList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}