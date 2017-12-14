package assignment;

import domain.Affiliate;
import domain.Food;
import assignment.order;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author DANSO
 */
public class UserStory1 {
  
    public static ListInterface<order> orderList = new List<>();
    public static ListInterface<Affiliate> affiliate = new List<>();
    public static ListInterface<Food> food = new List<>();
    
    
    //private static String[] resaArray = {"A1. Chicken Chop-RM10.90", "A2. Fish & Chip-RM10.90", "A3. Lamb Chop-RM18.90", "A4. Steak-RM18.90"};
    //private static String[] resbArray = {"B1. 1/4 Chicken-RM17.90", "B2. 1/2 Chicken-RM27.90", "B3. Whole Chicken-RM43.90", "B4. 5 Chicken Wings-RM26.90"};
    //private static String[] rescArray = {"C1. 2pc Combo-RM11.90", "C2. 3pc Combo-RM14.90", "C3. Zinger set-RM13.90", "C4. 9pc Family Combo-Rm49.90"};
    //private static String[] resdArray = {"D1. Mc Chicken set-RM8.90", "D2. Double Cheeseburger set-RM10.90", "D3. 2pc Ayam Goreng set-RM12.90", "D4. Fish burger set-Rm14.90"};

    public UserStory1(ListInterface<Affiliate> getaffiliate,ListInterface<Food> getfood) {
        this.affiliate = getaffiliate;
        this.food = getfood;
    }
    
    public void orderMenu() {
        Scanner user = new Scanner(System.in);
        String mn;
        mainRestaurant();   
        System.out.println("Enter your option>");
        mn = user.nextLine();
        for(int i = 1;i<=food.getNumberOfEntries();i++){
            if(mn.equals(food.getEntry(i).getRestaurant().getRes_name())){
                mainBlue();
                for(int a=1;a<=food.getNumberOfEntries();a++ ){
                    System.out.println(food.getEntry(a).toString());
                }
                System.out.println("Back");
                System.out.println("Enter your option>");
                mn = user.nextLine();
                if(mn.equals("Back")){
                    mainRestaurant();
                }else{
                    mainRestaurant();
                }
            }else{
                
                
            }
        } 
    }
    
    public void order1(){
        orderF();
        
    }
    
    public void show(){
        //order.toString();
        for(int i = 1;i <= orderList.getNumberOfEntries();i++){
                System.out.printf(orderList.getEntry(i).toString());
            }
        }

    public static void mainRestaurant() {
        System.out.println("==========Fastest Delivery System==========");
        for(int i=1;i<=affiliate.getNumberOfEntries();i++){
           System.out.println(affiliate.getEntry(i).getRes_name());
        }
        System.out.println("Back");
    }

    public static void mainBlue() {
        System.out.println("==========Fastest Delivery System==========");

    }
    
        public static void orderF(){
        order temp = null;
        Scanner order1 = new Scanner(System.in);
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        Date today=new Date();
        String todaydate = df.format(today);
        String resName = null;
        String name = null;
        int phone = 0;
        String address = null;
        int post = 0;
        String food1 = null;
        int i = 0;
        String statusD = "NotDelivered";
        String statusD1 = "OrderCancel";
        int foodAmt = 0;
        int orId = orderList.getNumberOfEntries();
        String option = null;
        String option2 = null;
        System.out.println("Restaurant Name: ");
        resName = order1.nextLine();
        order1.nextLine();
        for(int a =1;a<=food.getNumberOfEntries();a++){
            if(resName.equals(food.getEntry(a).getRestaurant().getRes_name())){
                System.out.println(food.getEntry(a).toString());
            }else{
                System.out.println("No such Restaurant!!");
                //customerMenu();
            }
        }
        String order_id = String.format("P%04d", orId + 1);
        System.out.println("Order ID: " + order_id);
        System.out.println("Name: ");
        name =order1.nextLine();
        System.out.println("Phone Number: ");
        phone=Integer.parseInt(order1.nextLine());
        System.out.println("Address: ");
        address = order1.nextLine();
        System.out.println("Postcode: ");
        post=Integer.parseInt(order1.nextLine());
        System.out.println("Food: ");
        food1 = order1.nextLine();
        System.out.println("Food Amount: ");
        foodAmt=Integer.parseInt(order1.nextLine());
        temp = new order(order_id,name,phone,address,post,food1,foodAmt,todaydate,statusD,null);
        orderList.add(temp);
        System.out.println("Do you want to order other food?[y/n]");
        option = order1.nextLine();
        if(option.equals("y")){
            System.out.println("Food: ");
            food1 = order1.nextLine();
            System.out.println("Food Amount: ");
            foodAmt=Integer.parseInt(order1.nextLine());
            temp = new order(order_id,name,phone,address,post,food1,foodAmt,todaydate,statusD,null);
            orderList.add(temp);
            System.out.println("Do you want to order other food?[y/n]");
            option = order1.nextLine();
        }else if(option.equals("n")){
            System.out.println("Do you comfirm the order?[y/n]");
            option2 = order1.nextLine();
            if(option2.equals("y")){
                System.out.println("Order Sucessfully added!");
            }else if(option2.equals("n")){
                for(int b = 1;b<=orderList.getNumberOfEntries();b++){
                    if(order_id.equals(orderList.getEntry(b).getOrderId())){
                        temp = new order(order_id,name,phone,address,post,food1,foodAmt,todaydate,statusD1,null);
                        orderList.replace(b, temp); 
                    }
                }
                System.out.println("Order has been cancel!");
            }
        }
        }
}
    

    

