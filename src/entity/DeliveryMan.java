/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import adt.DMSortedListInterface;
import java.util.Date;

/**
 *
 * @author MSI-
 */
public class DeliveryMan implements Comparable<DeliveryMan> {
    private int manID;
    private String pw;
    private static int nextManID = 0001;
    private String name;
    private String contactNum;
    private String adds;
    private String status;
    private Date DateTime;
    private String workingStatus;
    private String orderCharge;
    private int maxDelivery;
    private int deliveryAssigned;
    private double rating;
    
    

    public String getOrderCharge() {
        return orderCharge;
    }

    public void setOrderCharge(String orderCharge) {
        this.orderCharge = orderCharge;
    }

    public int getMaxDelivery() {
        return maxDelivery;
    }

    public void setMaxDelivery(int maxDelivery) {
        this.maxDelivery = maxDelivery;
    }

    public DeliveryMan() {
    }

    public String getWorkingStatus() {
        return workingStatus;
    }

    public void setWorkingStatus(String workingStatus) {
        this.workingStatus = workingStatus;
    }

    public Date getDateTime() {
        return DateTime;
    }

    public void setDateTime(Date DateTime) {
        this.DateTime = DateTime;
    }

    public DeliveryMan(int manID, String name) {
        this.manID =  nextManID++;
        this.name = name;
    }

    public DeliveryMan(String name) {
        this.manID = nextManID++;
        this.name = name;
    }


    public DeliveryMan(int manID, String name, String pw,String contactNum, String adds, String status, Date DateTime, String workingStatus, String orderCharge, int maxDelivery, int deliveryAssigned) {

        this.manID = nextManID++;
        this.pw = pw;
        this.name = name;
        this.contactNum = contactNum;
        this.adds = adds;
        this.status = status;
        this.DateTime = DateTime;
        this.workingStatus = workingStatus;
        this.orderCharge = orderCharge;
        this.maxDelivery = maxDelivery;
        this.deliveryAssigned = deliveryAssigned;
    }
    
      public DeliveryMan(int manID, String name, String pw,String contactNum, String adds, String status, Date DateTime, String workingStatus, String orderCharge, int maxDelivery, int deliveryAssigned, double rating) {

        this.manID = nextManID++;
        this.pw = pw;
        this.name = name;
        this.contactNum = contactNum;
        this.adds = adds;
        this.status = status;
        this.DateTime = DateTime;
        this.workingStatus = workingStatus;
        this.orderCharge = orderCharge;
        this.maxDelivery = maxDelivery;
        this.deliveryAssigned = deliveryAssigned;
        this.rating = rating;
    }
      
      
    
    public int getManID() {
        return manID;
    }

    public void setManID(int manID) {
        this.manID = nextManID++;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public static int getNextManID() {
        return nextManID;
    }

    public static void setNextManID(int nextManID) {
        DeliveryMan.nextManID = nextManID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

     public double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }
    
    
    public String getContactNum() {
        return contactNum;
    }

    public void setContactNum(String contactNum) {
        this.contactNum = contactNum;
    }

    public String getAdds() {
        return adds;
    }

    public void setAdds(String adds) {
        this.adds = adds;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getDeliveryAssigned() {
        return deliveryAssigned;
    }

    public void setDeliveryAssigned(int deliveryAssigned) {
        this.deliveryAssigned = deliveryAssigned;
    }
    
    public String toString(){
        return String.format("No. %-10d %-20s %-20s %-20s  %-20s %-10d %.1f", manID, name,contactNum,adds,status,deliveryAssigned,rating);
    }
    
    @Override
    public int compareTo(DeliveryMan T){
        int nextrow = 1;
        String strI = Integer.toString(this.getManID());
      //compare rating
        if(this.rating >= T.getRating())
        {
            //same rating
            if(this.rating == T.getRating())
            {
                // if ManID < then next ManID means the ManID happens first
                // compare the ManID
                if(Integer.toString(this.getManID()).compareTo(Integer.toString((T.getManID())))>0)
                {
                    nextrow = 1; //if next new man is lower rating
                }
                else{
                    nextrow = 0;
                }
            }
            else{
                nextrow = 1;
            }
        }
        else{
            nextrow = 0;
        }
        return nextrow;
    }
    
DMSortedListInterface<DeliveryMan> manList;
    public int compare(){
        int position = 1;
        DeliveryMan currentMan;
        DeliveryMan previousMan;
       for (int i =1; i < manList.getLength(); i++){
           //getNumberOfEntries()
           currentMan = manList.getEntry(i);
           previousMan = manList.getEntry(i-1);
           if(this.rating>=currentMan.getRating()){
               if(currentMan == null || previousMan.getRating()<=this.rating)
               {
                   position++;
               }
           
           }
       }
       return position;
    }

    
}
