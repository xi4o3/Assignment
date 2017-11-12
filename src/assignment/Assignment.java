/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import assignment.User;
import assignment.staffView;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author User
 */
public class Assignment {

    public List<User> userList = new ArrayList<>();
    staffView staffview = new staffView();
    private Scanner sc = new Scanner(System.in);
    public static int b;
    
    public void mainMenu(){
        String main;
        System.out.println("=======================");
        System.out.println("1. Delivery man Log In");
  //      System.out.println("2. test check");
        System.out.println("=======================");
        System.out.print("Enter your selection: ");
        main = sc.nextLine();
        //sc.nextLine();//fflush(stdin);
        switch(main){
            case "1":{
                User();
                mainMenu();
                break;
            }
   /*         case "2":{
                staffview.viewInfo();
                mainMenu();
                break;
            } */
            default :{
                System.out.println("Please enter again !");
                mainMenu();
            }
        }
    }
    
    public void deliverymanMenu(){
        String menu;;
        System.out.println("=================================");
        System.out.println("1. Clock in");
        System.out.println("2. Clock out");
        System.out.println("3. View order details");
        System.out.println("4. View order delivery location");
        System.out.println("5. -- Log out -- ");
        System.out.println("=================================");
        System.out.print("Enter your selection: ");
        menu = sc.nextLine();
        
        switch(menu){
            case "1":{
                userList.get(b).setStatus("Available");
                System.out.println("** Status is now AVAILABLE !! ** ");
                testDate();
   //             staffview.viewInfo();
                deliverymanMenu2();
                break;
            }
            case "2":{
                userList.get(b).setStatus("Unavailable");
                System.out.println("** Status is now UNAVAILABLE !! **");
                testDate();
   //             staffview.viewInfo();
                deliverymanMenu2();
                break;
            }
            case "3":{
                
            }
            case "4":{
                
            }
            case "5":{
                mainMenu();
                break;
            }
        }
    }
    
    public void deliverymanMenu2(){
        String menu2;
        System.out.println("=================================");
        System.out.println("1. Back to delivery man Menu ");
        System.out.println("2. Back to Main Menu");
        System.out.println("=================================");
        System.out.print("Enter your selection: ");
        menu2 = sc.nextLine();
        
        switch(menu2){
            case "1":{
                deliverymanMenu();
            }
            case "2":{
                mainMenu();
            }
        }
        
    }
    
    public void User() {
        String username;
        String password;
        boolean a = false;
        int i;

        System.out.print("Enter your username:");
        username = sc.nextLine();
        System.out.print("Enter your password:");
        password = sc.nextLine();

        for (i = 0; i < userList.size(); i++) {
            if (username.equals(userList.get(i).getUser()) && password.equals(userList.get(i).getPass())) {
                a = true;
                i=b;
                System.out.println("Log in successful !");
 //               testDate();
 //               userList.get(i).setStatus("Available");
 //               staffview.viewInfo();
                deliverymanMenu();
            }
        }
        if(a == false){
            System.out.println("Log in Again!");
            User();
        }
    }
   
    public void addUser() {
        Date date1 = new Date();
        /*SimpleDateFormat dateFormatter = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
        try{
            date1 = dateFormatter.parse("2017-05-12 11:12:26");//just for hardcode
        }catch(Exception ex){
            System.out.print("asd");
        }*/
        userList.add(new User("Miw", "Miw12345", null, "Unavailable"));
        userList.add(new User("Tneh", "Tneh12345", null, "Unavailable"));
        userList.add(new User("OngYJ", "OngYJ12345", null, "Unavailable"));
        staffview.setUserList(userList);
    }
  //  Sun 2017.35.12 at 11:35:14 AM 
    public void testDate(){
        Date now = new Date();
      //  SimpleDateFormat dateFormatter = new SimpleDateFormat("E yyyy.mm.dd 'at' hh:mm:ss a");
        userList.get(b).setDateTime(now);
      // System.out.println(userList.get(b).getDateTime());
      //  userList.get(b).setDateTime(now);
    }

    public static void main(String[] args) {
        Assignment assign = new Assignment();
        assign.addUser();
        assign.mainMenu();
        //assign.deliverymanMenu();
        //boolean a = assign.User();

        /*if (a) {
            System.out.print("Log in successful !");
            assign.userList.get(b).setStatus("Available");
        } else {
            System.out.print("Log in Again!");
        }*/
    }

}
