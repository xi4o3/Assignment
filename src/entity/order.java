/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import entity.DeliveryMan;
import java.util.Date;
import java.util.logging.Logger;
/**
 *
 * @author DANSO
 */
public class order {
    private String orderId;
    private String name;
    private int phone;
    private String address;
    private int postCode;
    private String food;
    private int foodAmt;
    private String orderTime;
    private String status;
    private DeliveryMan deliveryMan;
    //private customer custInfo;

    public order(String orderId,String name,int phone,String address,int postCode,String food,int foodAmt,String orderTime,String status, DeliveryMan deliveryMan){
        this.orderId = orderId;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.postCode = postCode;
        this.food = food;
        this.foodAmt = foodAmt;
        this.orderTime = orderTime;
        this.status = status;
        this.deliveryMan = deliveryMan;
        //this.custInfo = custInfo;
    }

    /*public customer getCustInfo() {
        return custInfo;
    }

    public void setCustInfo(customer custInfo) {
        this.custInfo = custInfo;
    }*/

    public int getPostCode() {
        return postCode;
    }

    public void setPostCode(int postCode) {
        this.postCode = postCode;
    }

    public int getFoodAmt() {
        return foodAmt;
    }

    public String getOrderId() {
        return orderId;
    }
    
    public String getStatus() {
        return status;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public void setFoodAmt(int foodAmt) {
        this.foodAmt = foodAmt;
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
    
    public DeliveryMan getDeliveryMan() {
        return deliveryMan;
    }
    
     public void setDeliveryMan(DeliveryMan deliveryMan) {
        this.deliveryMan = deliveryMan;
    }
  
    
    public String toString(){
        return String.format("Order ID: %s\n Customer Name: %s\n Customer Phone: %d\n Customer Address: %s\n Ordered Food: %s\n Ordered Food Amount: %d\n Ordered Time: %s\n Status: %s\n DM: %s\n",orderId,name,phone,address,food,foodAmt,orderTime,status,deliveryMan);
    }
}
