/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Face
 */
public class ZipCode {
    private String zipNumber = "";
    private String zipName = "";
    public ZipCode(String zipNumber, String zipName){
        this.zipName = zipName;
        this.zipNumber = zipNumber;
    }

    public String getZipNumber() {
        return zipNumber;
    }

    public String getZipName() {
        return zipName;
    }
    
}
