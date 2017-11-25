/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.util.Date;
/**
 *
 * @author DANSO
 */
public class order {
    private String name;
    private int phone;
    private String address;
    private String food;
    private String orderTime;
    private String status;
    
    public order(String name,int phone,String address,String food,String orderTime,String status){
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.food = food;
        this.orderTime = orderTime;
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public String getName() {
        return name;
    }

    public int getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getFood() {
        return food;
    }

    public String getOrderTime() {
        return orderTime;
    }
    
    public String toString(){
        return String.format("Customer Name: %s\n Customer Phone: %d\n Customer Address: %s\n Ordered Food: %s\n Ordered Time: %s\n Status: %s\n",name,phone,address,food,orderTime,status);
    }
}
