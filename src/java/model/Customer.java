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
public class Customer {
    private int id;
    private String name;
    private Date dob;
    private boolean Gender;
    private String phone;
    private String address;

    public Customer() {
    }

    public Customer(int id, String name, Date dob, boolean Gender, String phone, String address) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.Gender = Gender;
        this.phone = phone;
        this.address = address;
    }

    public Customer(String name, Date dob, boolean Gender, String phone, String address) {
        this.name = name;
        this.dob = dob;
        this.Gender = Gender;
        this.phone = phone;
        this.address = address;
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

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public boolean isGender() {
        return Gender;
    }

    public void setGender(boolean Gender) {
        this.Gender = Gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", name=" + name + ", dob=" + dob + ", Gender=" + Gender + ", phone=" + phone + ", address=" + address + '}';
    }
    
}
