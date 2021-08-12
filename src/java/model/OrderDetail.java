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
public class OrderDetail {

    private int id;
    private int pro_id;
    private int order_id;
    private int amount;

    public OrderDetail() {
    }

    public OrderDetail(int id, int pro_id, int order_id, int amount) {
        this.id = id;
        this.pro_id = pro_id;
        this.order_id = order_id;
        this.amount = amount;
    }

    public OrderDetail(int pro_id, int order_id, int amount) {
        this.pro_id = pro_id;
        this.order_id = order_id;
        this.amount = amount;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPro_id() {
        return pro_id;
    }

    public void setPro_id(int pro_id) {
        this.pro_id = pro_id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }
    
}
