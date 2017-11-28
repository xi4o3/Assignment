/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Wingent
 */
public class Food {
    private String foodID;
    private String foodName;
    private double Price;
    private String Category;
    private String foodAVA;
    private Affiliate restaurant;


    public Food(String foodID, String foodName, double Price, String Category, String foodAVA, Affiliate restaurant) {
        this.foodID = foodID;
        this.foodName = foodName;
        this.Price = Price;
        this.Category = Category;
        this.foodAVA = foodAVA;
        this.restaurant = restaurant;
    }

    public String getFoodID() {
        return foodID;
    }

    public void setFoodID(String foodID) {
        this.foodID = foodID;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public String getFoodAVA() {
        return foodAVA;
    }

    public void setFoodAVA(String foodAVA) {
        this.foodAVA = foodAVA;
    }

    public Affiliate getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Affiliate restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public String toString() {
        return "Food{" + "foodID=" + foodID + ", foodName=" + foodName + ", Price=" + Price + ", Category=" + Category + ", foodAVA=" + foodAVA + ", restaurant=" + restaurant + '}';
    }
 
}
