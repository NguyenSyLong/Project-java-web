/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;

/**
 *
 * @author Lehait
 */
public class Import {
    private int id;
    private Date date;
    private float iprice;
    private int productid;
    private int staffid;

    public Import() {
    }

    public Import(int id, Date date, float iprice, int productid, int staffid) {
        this.id = id;
        this.date = date;
        this.iprice = iprice;
        this.productid = productid;
        this.staffid = staffid;
    }

    public Import(Date date, float iprice, int productid, int staffid) {
        this.date = date;
        this.iprice = iprice;
        this.productid = productid;
        this.staffid = staffid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public float getIprice() {
        return iprice;
    }

    public void setIprice(float iprice) {
        this.iprice = iprice;
    }

    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public int getStaffid() {
        return staffid;
    }

    public void setStaffid(int staffid) {
        this.staffid = staffid;
    }
    
}
