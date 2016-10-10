
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Face
 */
public class CustomerSQL {
    String connectionUrl = 
            "jdbc:sqlserver://kaysl-gruppepress.uials.no;databaseName=Retrohuset; user=javaDBAlogin; password=MEMES";
    
    
    public int add(String firstName, String surName, String streetName, String zipNumber, String faxNumber) {
        if(streetName.equals("")) {
            streetName = null;
        } else if (zipNumber.equals("")){
            zipNumber = null;
        } else if (faxNumber.equals("")){
            faxNumber = null;
        }
        Integer rowCount = null;
        try (
                Connection c = DriverManager.getConnection(connectionUrl);
                Statement stm = c.createStatement()) {
            String sql = "INSERT INTO Customer (FirstName, SurName, StreetName, ZipNumber, FaxNumber)"
                    + "VALUES ('" + firstName + "','" + surName + "','" + streetName + "','" + zipNumber + "','" + faxNumber + "')";
            rowCount = stm.executeUpdate(sql);
            new Printer(rowCount);
        } catch (SQLException ex) {
            Logger.getLogger(ZipCodeSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rowCount;
    }
    public int remove(int customerID) {
        Integer rowCount = null;
        try (
                Connection c = DriverManager.getConnection(connectionUrl);
                Statement stm = c.createStatement()) {
            String sql = "DELETE FROM Customer WHERE CustomerID='" + customerID + "'";
            rowCount = stm.executeUpdate(sql);
            new Printer(rowCount);
        } catch (SQLException ex) {
            Logger.getLogger(ZipCodeSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rowCount;
    }
    public ArrayList<Customer> selectALL() {
        ArrayList<Customer> customers = new ArrayList<>();
        try (
                Connection c = DriverManager.getConnection(connectionUrl);
                Statement stm = c.createStatement()) {
            String sql = "SELECT * FROM Customer";
            ResultSet rs = stm.executeQuery(sql);
            while(rs.next()){
                customers.add(new Customer(rs.getInt("CustomerID"), 
                        rs.getString("FirstName"), 
                        rs.getString("SurName"),
                        rs.getString("ZipNumber"),
                        rs.getString("StreetName"),
                        rs.getString("FaxNumber")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ZipCodeSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return customers;
    }
    
}
