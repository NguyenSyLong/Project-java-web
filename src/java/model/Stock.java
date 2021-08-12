/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Lehait
 */
public class Stock {
    private int id;
    private int productID;
    private int amount;

    public Stock() {
    }

    public Stock(int id, int productID, int amount) {
        this.id = id;
        this.productID = productID;
        this.amount = amount;
    }

    public Stock(int productID, int amount) {
        this.productID = productID;
        this.amount = amount;
    }

    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    
}
