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
public class Order {

    private int id;
    private Date date;
    private float price;
    private float total;
    private int cusid;
    private int staffid;

    public Order() {
    }

    public Order(Date date, float price, float total, int cusid, int staffid) {
        this.date = date;
        this.price = price;
        this.total = total;
        this.cusid = cusid;
        this.staffid = staffid;
    }

    public Order(int id, Date date, float price, float total, int cusid, int staffid) {
        this.id = id;
        this.date = date;
        this.price = price;
        this.total = total;
        this.cusid = cusid;
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

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public int getCusid() {
        return cusid;
    }

    public void setCusid(int cusid) {
        this.cusid = cusid;
    }

    public int getStaffid() {
        return staffid;
    }

    public void setStaffid(int staffid) {
        this.staffid = staffid;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Order{" + "id=" + id + ", date=" + date + ", price=" + price + ", total=" + total + ", cusid=" + cusid + ", staffid=" + staffid + '}';
    }
    
}
