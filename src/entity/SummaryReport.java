/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Wingent
 */
public class SummaryReport implements Comparable<SummaryReport>{
    private int foodqty, bevqty, snackqty, desertqt;
    Affiliate Restaurant;
    int total;

    public SummaryReport(int foodqty, int bevqty, int snackqty, int desertqt, Affiliate Restaurant) {
        this.total = bevqty + desertqt + foodqty + snackqty;
        this.foodqty = foodqty;
        this.bevqty = bevqty;
        this.snackqty = snackqty;
        this.desertqt = desertqt;
        this.Restaurant = Restaurant;
    }

    public int getFoodqty() {
        return foodqty;
    }

    public void setFoodqty(int foodqty) {
        this.foodqty = foodqty;
    }

    public int getBevqty() {
        return bevqty;
    }

    public void setBevqty(int bevqty) {
        this.bevqty = bevqty;
    }

    public int getSnackqty() {
        return snackqty;
    }

    public void setSnackqty(int snackqty) {
        this.snackqty = snackqty;
    }

    public int getDesertqt() {
        return desertqt;
    }

    public void setDesertqt(int desertqt) {
        this.desertqt = desertqt;
    }

    public Affiliate getRestaurant() {
        return Restaurant;
    }

    public void setRestaurant(Affiliate Restaurant) {
        this.Restaurant = Restaurant;
    }

    @Override
    public int compareTo(SummaryReport t) {
        
        if(total > t.total){
            return 1;
        }
        else if(total == t.total){
            return 0;
        }
        else
            return -1;
        
    }

    @Override
    public String toString() {
        return String.format(" %20s %10d %10d %12d %12d %12d\n", Restaurant.getRes_name(), foodqty,  bevqty ,  snackqty, desertqt , total);
    }
    
    
    
    
}
