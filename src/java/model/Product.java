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
public class Product {
    private int id;
    private String name;
    private String descript;
    private String origin;
    private String image;
    private float price; 
    private int cateid;
    private int amount;
    public Product() {
    }

    public Product(int id, String name, String descript, String origin, String image, float price) {
        this.id = id;
        this.name = name;
        this.descript = descript;
        this.origin = origin;
        this.image = image;
        this.price = price;
    }

    public Product(int id, String name, String descript, String origin, String image, float price, int amount) {
        this.id = id;
        this.name = name;
        this.descript = descript;
        this.origin = origin;
        this.image = image;
        this.price = price;
        this.amount = amount;
    }

    public Product(String name, String descript, String origin, String image, float price, int cateid) {
        this.name = name;
        this.descript = descript;
        this.origin = origin;
        this.image = image;
        this.price = price;
        this.cateid = cateid;
    }
    

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getCateid() {
        return cateid;
    }

    public void setCateid(int cateid) {
        this.cateid = cateid;
    }
    
    
   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

  
    
}
