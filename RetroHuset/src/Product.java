/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anders
 */
public class Product {
    
    private String productName;
    private int storageCount;
    private float price;
    
    /**
     * Constructor for class Product.
     * @param productName 
     * @param storageCount
     * @param price 
     */
    public Product (String productName, int storageCount, float price) {
        this.productName = productName;
        this.storageCount = storageCount;
        this.price = price;
    }
}
