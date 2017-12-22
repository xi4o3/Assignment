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
public class Food implements Comparable<Food>{
    private String foodID;
    private String foodName;
    private double Price;
    private String Category;
    private String foodAVA;
    private Affiliate restaurant;
    private String promotion;


    public Food(String foodID, String foodName, double Price, String Category, String foodAVA, Affiliate restaurant, String promotion) {
        this.foodID = foodID;
        this.foodName = foodName;
        this.Price = Price;
        this.Category = Category;
        this.foodAVA = foodAVA;
        this.restaurant = restaurant;
        this.promotion = promotion;
    }

    public String getPromotion() {
        return promotion;
    }

    public void setPromotion(String promotion) {
        this.promotion = promotion;
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
        //return "\t" + foodID + "\t" + foodName + "\t\t" + Price + "\t" + Category + "\t" + foodAVA + "\t\t" + promotion;
        //return String.format("%s\t%s\t%d\t%s\t%s\t%s", foodID, foodName, Price, Category, foodAVA, promotion);
        String formatPrice = String.format("RM %5.2f", Price);
        return String.format(" %10s %20s %13s %15s %10s %10s\n", foodID, foodName, formatPrice, Category, foodAVA, promotion);
    }
    
    public int compareTo(Food food) {
        if(Category.compareTo(food.getCategory()) < 0){
            return 1;
        }
        else if(Category.compareTo(food.getCategory()) == 0){
            if(Price > food.getPrice()){
                return -1;
            }
            else if(Price == food.getPrice()){
                 return 1;  
            }   
            else
                return 1;
        }
        else
            return -1;

    }
   
}
