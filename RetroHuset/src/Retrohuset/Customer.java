/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Face
 */
public class Customer {
    private int customerID = 0;
    private String firstName ="";
    private String surName = "";
    private String zipNumber = "";
    private String streetName = "";
    private String faxNumber = "";
    public Customer(int customerID, String firstName, String surName,
            String zipNumber, String streetName, String faxNumber){
        this.customerID = customerID;
        this.firstName = firstName;
        this.surName = surName;
        this.zipNumber = zipNumber;
        this.streetName = streetName;
        this.faxNumber = faxNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getFaxNumber() {
        return faxNumber;
    }

    public String getSurName() {
        return surName;
    }


    public String getZipNumber() {
        return zipNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public int getCustomerID() {
        return customerID;
    }
    public String printAll(){
        return customerID + firstName + surName + zipNumber + streetName + faxNumber;
    }
    
}
