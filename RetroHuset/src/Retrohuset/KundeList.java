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
public class KundeList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String connectionUrl = "jdbc:sqlserver://kristrog-sql.uials.no;databaseName=HobbyhusetEXMPL; user=kristofferNB; password=LUL";
        
        try (
                Connection c = DriverManager.getConnection(connectionUrl);
                Statement stm = c.createStatement()) {
            ResultSet rs = stm.executeQuery("SELECT KNr,Fornavn,Etternavn, Adresse, PostNr FROM Kunde");
            System.out.println("ID   Fornavn    Etternavn");
            while (rs.next()) {
                    System.out.printf("%4d ",rs.getInt("KNr"));
                    System.out.printf("%-10.10s ",rs.getString("Fornavn"));
                    System.out.printf("%-10.10s ",rs.getString("Etternavn"));
                    System.out.printf("%-10.20s ",rs.getString("Adresse"));
                    System.out.printf("%4d\n",rs.getInt("PostNr"));
                }
        } catch (SQLException ex) {
            Logger.getLogger(KundeList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
