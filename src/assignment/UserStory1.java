package assignment;

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

    public static ListInterface<order> order = new List<>();
    private static String[] resaArray = {"A1. Chicken Chop-RM10.90", "A2. Fish & Chip-RM10.90", "A3. Lamb Chop-RM18.90", "A4. Steak-RM18.90"};
    private static String[] resbArray = {"B1. 1/4 Chicken-RM17.90", "B2. 1/2 Chicken-RM27.90", "B3. Whole Chicken-RM43.90", "B4. 5 Chicken Wings-RM26.90"};
    private static String[] rescArray = {"C1. 2pc Combo-RM11.90", "C2. 3pc Combo-RM14.90", "C3. Zinger set-RM13.90", "C4. 9pc Family Combo-Rm49.90"};
    private static String[] resdArray = {"D1. Mc Chicken set-RM8.90", "D2. Double Cheeseburger set-RM10.90", "D3. 2pc Ayam Goreng set-RM12.90", "D4. Fish burger set-Rm14.90"};

    public UserStory1() {

    }

    public void orderMenu() {

        Scanner user = new Scanner(System.in);
        int mn;

        do {
            mainRestaurant();

            System.out.println("Enter your option.(1/2/3/4/5)>");
            mn = user.nextInt();
            if (mn == 1) {
                int ah;
                mainBlue();
                for (String a : resaArray) {
                    System.out.println(a);
                }
                System.out.println("5. Back");
                System.out.println("Enter your option.(1/2/3/4/5)>");
                ah = user.nextInt();
                if(ah == 1||ah == 2|| ah==3 || ah==4){
                    order1();
                }
                else if (ah == 5) {
                    mainRestaurant();
                }
            } else if (mn == 2) {
                int ah;
                mainBlue();
                for (String a : resbArray) {
                    System.out.println(a);
                }
                System.out.println("5. Back");
                System.out.println("Enter your option.(1/2/3/4/5)>");
                ah = user.nextInt();
                if(ah == 1||ah == 2|| ah==3 || ah==4){
                    order1();
                }
                else if (ah == 5) {
                    mainRestaurant();
                }
            } else if (mn == 3) {
                int ah;
                mainBlue();
                for (String a : rescArray) {
                    System.out.println(a);
                }
                System.out.println("5. Back");
                System.out.println("Enter your option.(1/2/3/4/5)>");
                ah = user.nextInt();
                if(ah == 1||ah == 2|| ah==3 || ah==4){
                    order1();
                }
                else if (ah == 5) {
                    mainRestaurant();
                }
            } else if (mn == 4) {
                int ah;
                mainBlue();                                                           
                for (String a : resdArray) {
                    System.out.println(a);
                }
                System.out.println("5. Back");
                System.out.println("Enter your option.(1/2/3/4/5)>");
                ah = user.nextInt();
                if(ah == 1||ah == 2|| ah==3 || ah==4){
                    order1();
                }
                else if (ah == 5) {
                    mainRestaurant();
                }
            } else if (mn == 5) {

            } else if (mn != 1 || mn != 2 || mn != 3 || mn != 4 || mn != 5) {
                System.out.println("Please key in 1, 2, 3, 4 or 5!!");
                mainRestaurant();
                System.out.println("Enter your option.(1/2/3/4/5)>");
                mn = user.nextInt();
            }
        } while (mn == 1 || mn == 2 || mn == 3 || mn == 4);

    }
    
    public void order1(){
        orderF();
        
    }
    
    public void show(){
        //order.toString();
        for(int i = 1;i <= order.getNumberOfEntries();i++){
            System.out.printf(order.toString());
        }
    }

    public static void mainRestaurant() {

        System.out.println("==========Fastest Delivery System==========");
        System.out.println("1. Blue Ribbon Restaurant");
        System.out.println("2. Nando's");
        System.out.println("3. KFC");
        System.out.println("4. Mc Donald");
        System.out.println("5. Back");
    }

    public static void mainBlue() {
        System.out.println("==========Fastest Delivery System==========");
    }
    
    public static void orderF(){
        order temp=null;
        Scanner order1 = new Scanner(System.in);
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        Date today=new Date();
        String todaydate = df.format(today);
        String name = null;
        int phone = 0;
        String address = null;
        String food = null;
        int i = 0;
        String statusD = "NotDelivered";
        System.out.println("Name: ");
        name =order1.nextLine();
        order1.nextLine();
        System.out.println("Phone Number: ");
        phone = order1.nextInt();
        order1.nextLine();
        System.out.println("Address: ");
        address = order1.nextLine();
        order1.nextLine();
        for (String a : resaArray) {
                    System.out.println(a);
                }
        for (String b: resbArray) {
                    System.out.println(b);
                }
        for (String c : rescArray) {
                    System.out.println(c);
                }
        for (String d : resdArray) {
                    System.out.println(d);
                }
        System.out.println("Food: ");
        food = order1.nextLine();
        order1.nextLine();
        temp = new order(name,phone,address,food,todaydate,statusD);
        order.add(temp);
    }
    
    

}
