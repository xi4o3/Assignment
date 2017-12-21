package driver;

import entity.Affiliate;
import entity.Food;
import entity.customer;
import entity.order;
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
    public static ListInterface<customer> customer = new List<>();

    private static customer curCustomer;

    //private static String[] resaArray = {"A1. Chicken Chop-RM10.90", "A2. Fish & Chip-RM10.90", "A3. Lamb Chop-RM18.90", "A4. Steak-RM18.90"};
    //private static String[] resbArray = {"B1. 1/4 Chicken-RM17.90", "B2. 1/2 Chicken-RM27.90", "B3. Whole Chicken-RM43.90", "B4. 5 Chicken Wings-RM26.90"};
    //private static String[] rescArray = {"C1. 2pc Combo-RM11.90", "C2. 3pc Combo-RM14.90", "C3. Zinger set-RM13.90", "C4. 9pc Family Combo-Rm49.90"};
    //private static String[] resdArray = {"D1. Mc Chicken set-RM8.90", "D2. Double Cheeseburger set-RM10.90", "D3. 2pc Ayam Goreng set-RM12.90", "D4. Fish burger set-Rm14.90"};
    public UserStory1(ListInterface<Affiliate> getaffiliate, ListInterface<Food> getfood, ListInterface<customer> getCust) {
        this.affiliate = getaffiliate;
        this.food = getfood;
        this.customer = getCust;
    }

    /*public void orderMenu() {
        Scanner user = new Scanner(System.in);
        String mn;
        mainRestaurant();
        System.out.println("Enter your option>");
        mn = user.nextLine();
        for (int i = 1; i <= food.getNumberOfEntries(); i++) {
            if (mn.equals(food.getEntry(i).getRestaurant().getRes_name())) {
                mainBlue();
                for (int a = 1; a <= food.getNumberOfEntries(); a++) {
                    System.out.println(food.getEntry(a).toString());
                }
                System.out.println("Back");
                System.out.println("Enter your option>");
                mn = user.nextLine();
                if (mn.equals("Back")) {
                    mainRestaurant();
                } else {
                    mainRestaurant();
                }
            } else {

            }
        }
    }*/
    public boolean custLogin() {
        Scanner login = new Scanner(System.in);
        int idcount = 0;
        boolean password = false;
        while (idcount == 0) {
            System.out.println("===============");
            System.out.println("Customer Login");
            System.out.println("===============");
            System.out.print("Customer ID: ");
            String id = login.nextLine();
            for (int i = 1; i <= customer.getNumberOfEntries(); i++) {
                if (id.equals(customer.getEntry(i).getCusId())) {
                    while (!password) {
                        System.out.print("Password: ");
                        String pass = login.nextLine();
                        idcount = 1;
                        if (pass.equals(customer.getEntry(i).getCusPass())) {
                            password = true;
                            System.out.println("Successfully Login");
                            curCustomer = customer.getEntry(i);
                        } else {
                            System.out.println("Invalid password");
                        }
                    }
                }
            }
            if (idcount == 0) {
                System.out.println("No ID found");
            }
        }
        return password;
    }

    public void order1() {
        orderF();

    }

    public void show() {
        //order.toString();
        for (int i = 1; i <= orderList.getNumberOfEntries(); i++) {
            System.out.printf(orderList.getEntry(i).toString());
        }
    }

    public static void mainRestaurant() {
        System.out.println("==========Fastest Delivery System==========");
        for (int i = 1; i <= affiliate.getNumberOfEntries(); i++) {
            System.out.println(affiliate.getEntry(i).getRes_name());
        }
        System.out.println("Back");
    }

    public static void mainBlue() {
        System.out.println("==========Fastest Delivery System==========");

    }

    public void orderF() {
        order temp = null;
        Scanner order1 = new Scanner(System.in);
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        Date today = new Date();
        String todaydate = df.format(today);
        String resName = null;
        String name = null;
        int phone = 0;
        String address = null;
        int post = 0;
        String food1 = null;
        int i = 0;
        String statusD = "Pending";
        //String statusD1 = "OrderCancel";
        int foodAmt = 0;
        int orId = orderList.getNumberOfEntries();
        char option;
        String option2 = null;
        double totalP = 0;
        double subTotal = 0;
        for (int c = 1; c <= affiliate.getNumberOfEntries(); c++) {
            System.out.println(affiliate.getEntry(c).getRes_name());
        }
        System.out.print("Restaurant Name: ");
        resName = order1.nextLine();
        int r;
        do {
            r = -1;
            for (int a = 1; a <= food.getNumberOfEntries() && r == -1; a++) {
                if (resName.equals(food.getEntry(a).getRestaurant().getRes_name())) {
                    r = a;
                    for (int e = 1; e <= food.getNumberOfEntries(); e++) {
                        System.out.println(food.getEntry(e).toString());
                    }
                }
            }
            if (r == -1) {
                System.out.println("No such Restaurant!!");
                System.out.print("Restaurant Name: ");
                resName = order1.nextLine();
            }
        } while (r == -1);
        String order_id = String.format("P%04d", orId + 1);
        System.out.println("Order ID: " + order_id);
        System.out.print("Name: ");
        name = order1.nextLine();
        System.out.print("Phone Number: ");
        phone = Integer.parseInt(order1.nextLine());
        System.out.println("Address: ");
        address = order1.nextLine();
        System.out.print("Postcode: ");
        post = Integer.parseInt(order1.nextLine());
        System.out.print("Food ID: ");
        food1 = order1.nextLine();

        int f;
        do {
            f = -1;
            for (int b = 1; b <= food.getNumberOfEntries() && f == -1; b++) {
                if (food1.equals(food.getEntry(b).getFoodID())) {
                    f = b;
                }
            }
            if (f == -1) {
                System.out.println("Wrong Food ID");
                System.out.print("Food ID: ");
                food1 = order1.nextLine();
            }
        } while (f == -1);

        System.out.print("Food Amount: ");
        foodAmt = Integer.parseInt(order1.nextLine());
        for (int d = 1; d <= food.getNumberOfEntries(); d++) {
            if (food1.equals(food.getEntry(d).getFoodID())) {
                totalP = food.getEntry(d).getPrice() * foodAmt;
            }
        }
        temp = new order(order_id, name, phone, address, post, food1, foodAmt, totalP, todaydate, statusD, null, curCustomer);
        orderList.add(temp);
        System.out.print("Do you want to order other food?[y/n]");
        option = order1.nextLine().charAt(0);
        do {
            if (option == 'y') {
                System.out.print("Food: ");
                food1 = order1.nextLine();
                System.out.print("Food Amount: ");
                foodAmt = Integer.parseInt(order1.nextLine());
                for (int d = 1; d <= food.getNumberOfEntries(); d++) {
                    if (food1.equals(food.getEntry(d).getFoodID())) {
                        totalP = food.getEntry(d).getPrice() * foodAmt;
                    }
                }
                temp = new order(order_id, name, phone, address, post, food1, foodAmt, totalP, todaydate, statusD, null, curCustomer);
                orderList.add(temp);
                System.out.print("Do you want to order other food?[y/n]");
                option = order1.nextLine().charAt(0);
            }

            if (option == 'n') {
                System.out.println("Please comfirm order!");
            }
        } while (option == 'y' || option == 'Y');

        System.out.printf("%-20s %-15s\n", "Food ID", "Quantity");
        System.out.println("------------------------------");
        for (int g = 1; g <= orderList.getNumberOfEntries(); g++) {
            if (curCustomer.getCusId().equalsIgnoreCase(orderList.getEntry(g).getCustInfo().getCusId())) {
                System.out.printf("%-20s %-8d\n", orderList.getEntry(g).getFood(),orderList.getEntry(g).getFoodAmt());
                subTotal += orderList.getEntry(g).getToPrice();
            }
        }
        System.out.printf("Total price : RM %.2f",subTotal);
        System.out.println("Do you comfirm the order?[y/n]");
        option2 = order1.nextLine();
        if (option2.equals("y")) {
            System.out.println("Order Sucessfully added!");
        } else if (option2.equals("n")) {
            //do{
            for (int b = 1; b <= orderList.getNumberOfEntries(); b++) {
                if (order_id.equals(orderList.getEntry(b).getOrderId())) {
                    orderList.remove(b);
                    b--;
                }
            }
            System.out.println("Order has been cancel!");
        }
        
    }

    
}

//    for(int b = 1;b<=orderList.getNumberOfEntries();b++){
//                    if(order_id.equals(orderList.getEntry(b).getOrderId())){
//                        //temp = new order(order_id,name,phone,address,post,food1,foodAmt,totalP,todaydate,statusD,null,curCustomer);
//                        orderList.remove(b); 
//                        }
//                    }
//int totalOrder=0;
//                do{
//                    System.out.println(orderList.getEntry(totalOrder).getOrderId());
//                    orderList.remove(totalOrder); 
//                    totalOrder++;
//                }while(totalOrder<=orderList.getNumberOfEntries());

