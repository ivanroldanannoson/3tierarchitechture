/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ivanroldan
 */
public class Order {
    int id;

    int vendorId;
    String orderDate; 
    List<Item> orderItem;

    public Order() {
    }

    public Order(int id,int vendorId, String orderDate, List<Item> orderItem) {
        this.id= id;
        this.vendorId = vendorId;
        this.orderDate = orderDate;
        this.orderItem = orderItem;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getVendorId() {
        return vendorId;
    }

    public void setVendorId(int vendorId) {
        this.vendorId = vendorId;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }
    
    
    public List<Item> getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(List<Item> orderItem) {
        this.orderItem = orderItem;
    }

}
