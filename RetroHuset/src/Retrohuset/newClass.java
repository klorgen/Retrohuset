/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseopg;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Face
 */
public class newClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String connectionUrl = "jdbc:sqlserver://kaysl-gruppepress.uials.no;databaseName=Retrohuset; user=javaDBAlogin; password=MEMES";
        
        try (
                Connection c = DriverManager.getConnection(connectionUrl);
                Statement stm = c.createStatement()) {
            System.out.println("tosk");
        } catch (SQLException ex) {
            Logger.getLogger(newClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
