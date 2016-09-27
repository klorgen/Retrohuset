/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Retrohuset;

import static databaseopg.SpesifikKundeOrdre.kNr;
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
public class NyOrdre {
    static String fornavn = "Erik";
    static String etternavn = "Haram"; 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String connectionUrl = "jdbc:sqlserver://kristrog-sql.uials.no;databaseName=HobbyhusetEXMPL; user=kristofferNB; password=LUL";
        
        try (
                Connection c = DriverManager.getConnection(connectionUrl);
                Statement stm = c.createStatement()) {
            String sql = "INSERT INTO Ordre (KNr, OrdreNr, OrdreDato, SendtDato, BetaltDato)" +
                    "VALUES ((SELECT KNr FROM Kunde WHERE Fornavn='" + fornavn + "' AND Etternavn='" + etternavn + "'), (SELECT MAX(OrdreNr) + 1 FROM Ordre), GETDATE(), GETDATE(), DATEADD(day,2,GETDATE()))";
            int rowCount = stm.executeUpdate(sql);
            System.out.printf("Inserted %d records\n",rowCount);
        } catch (SQLException ex) {
            Logger.getLogger(KundeList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}