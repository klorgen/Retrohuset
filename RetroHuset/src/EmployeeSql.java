
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kay Sindre Lorgen
 */
public class EmployeeSQL {

    String connectionUrl = "jdbc:sqlserver://kaysl-gruppepress.uials.no;databaseName=Retrohuset; user=javaDBAlogin; password=MEMES";

    public EmployeeSQL() {
    }

    /**
     * Adds new EmployeeSQL to the EmployeeSQL table
     *
     * @param firstName Firstname to add
     * @param surName Surname to add
     * @param isAdmin is employee admin
     * @param streetName Streetname of the employee
     * @param zipNumber Zipnumber of the employee
     * @param faxNumber Faxnumber of the employee
     * @param salary Salary of the employee
     */
    public int addEmployee(String firstName, String surName, Boolean isAdmin, String streetName, String zipNumber, String faxNumber, int salary) {
        Integer rowCount = null;
        try (
                Connection c = DriverManager.getConnection(connectionUrl);
                Statement stm = c.createStatement()) {
            String sql = "INSERT INTO Employee(EmployeeID, FirstName, SurName, isAdmin, StreetName, ZipNumber, FaxNumber, Salary)"
                    + "VALUES((SELECT MAX(EmployeeID) + 1 FROM Employee), '" + firstName + "', '" + surName + "', '" + isAdmin + "', '" + streetName + "', '" + zipNumber + "', '" + faxNumber + "', '" + salary + "')";
            rowCount = stm.executeUpdate(sql);
            new Printer(rowCount);
        } catch (SQLException ex) {
            new Printer("Toooo baaaaad!!!");
        }
        return rowCount;
    }
public int removeEmployee()
{
    Integer rowCount = null;
    
    return rowCount;
}
}
