/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.text.SimpleDateFormat;
import java.util.Scanner;
import assignment.staffView;
import java.text.SimpleDateFormat;
import java.util.Date;
import assignment.UserStory1;
import static assignment.UserStory1.order;

/**
 *
 * @author User
 */
public class Assignment {
    
    public static ListInterface<DeliveryMan> manList = new List<>();
    static staffView staffview = new staffView();
    private static Scanner sc = new Scanner(System.in);
    public static int b;
    public static String menu;
    public static String main;
    public static String cusMenu;
     static String other;
    
    
        public static void mainMenu() {
        System.out.println("=======================");
        System.out.println("1. Delivery man Log In");
        System.out.println("2. Affiliate Log In");
        System.out.println("3. HR Log In");
        System.out.println("4. Customer Log In");
    //    System.out.println("4. test check");
        System.out.println("=======================");
        System.out.print("Enter your selection: ");
        main = sc.nextLine();
        //sc.nextLine();//fflush(stdin);
        switch (main) {
            case "1": {
                User();
                mainMenu();
                break;
            }
            case "2": {
                
                break;
             }
              case "3": {
                displayMenu();
                break;
             }
            case "4": {
                customerMenu();
                break;
             }
        /*     case "4":{
                staffview.viewInfo();
                mainMenu();
                break; 
             } */
            default: {
                System.out.println("Please enter again !");
                mainMenu();
            }
        }
    }
        
 public static void User() {
        String username;
        String password;
        boolean a = false;
        int i;
        System.out.print("Enter your username:");
        username = sc.nextLine();
        System.out.print("Enter your password:");
        password = sc.nextLine();

        for (i = 1; i <= manList.getNumberOfEntries(); i++) {
            if (username.equals(manList.getEntry(i).getName()) && password.equals(manList.getEntry(i).getPw())) {
                a = true;
                b=i;
                System.out.println("Log in successful !");
                //testDate();
                //manList.get(i).setStatus("Available");
                //staffview.viewInfo();
                deliverymanMenu();
            }
        }
        if (a == false) {
            System.out.println("Log in Again!");
            User();
        }
    }
 
     public static void deliverymanMenu() {
 
        System.out.println("=================================");
        System.out.println("1. Clock in");
        System.out.println("2. Clock out");
        System.out.println("3. View order details");
        System.out.println("4. View order delivery location");
        System.out.println("5. -- Log out -- ");
        System.out.println("=================================");
        System.out.print("Enter your selection: ");
        menu = sc.nextLine();

        switch (menu) {
            case "1": {
                if(manList.getEntry(b).getWorkingStatus() == "Unavailable"){
                    manList.getEntry(b).setWorkingStatus("Available");
                    System.out.println("** Status is now AVAILABLE !! ** ");
                    testDate();
                    deliverymanMenu();
                    break;
                }else{
                     System.out.println("You need to clock out to clock in ! ");
                     deliverymanMenu();
                     break;
            }
            }
            case "2": {
                if(manList.getEntry(b).getWorkingStatus() == "Available"){
                    manList.getEntry(b).setWorkingStatus("Unavailable");
                    System.out.println("** Status is now UNAVAILABLE !! **");
                    testDate();
                    deliverymanMenu();
                    break;
                }else{
                    System.out.println("You need to clock in to clock out ! ");
                    deliverymanMenu();
                    break;
                }
            }
            case "3": {

            }
            case "4": {

            }
            case "5": {
                mainMenu();
                break;
            }
             default: {
                System.out.println("Please enter again !");
                deliverymanMenu();
            }
        }
    }
 
     public static void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("Staff Menu");
        System.out.println("=========================\n");
        System.out.println("1. Add new delivery man");
        System.out.println("2. View delivery man details");
        System.out.println("3. View delivery man working status");
        System.out.println("4. Update delivery man status");
        System.out.println("5. -- Log out --");
        System.out.println("=========================\n");
        System.out.print("\nPlease select your choice: ");
        choice = scanner.nextInt();
        while (choice < 0 || choice > 5) {
            System.out.print("Please enter number 1-5: ");
            choice = scanner.nextInt();
        }

        switch (choice) {
            case 1:

                addDeliveryMan();
                displayMenu();

                break;
            case 2:
                System.out.println(manList);
                displayMenu();
                break;
            case 3:
                staffview.viewInfo();
                displayMenu();
                break;
            case 4:
                System.out.print("Please enter the delivery man ID: ");
                int id = sc.nextInt();
                updateDeliManStatus(id);
                break;
            case 5:
                mainMenu();
             //      System.exit(0);
                break;
            default: 
                System.out.println("Please enter again !");
                displayMenu();

        }
     
    
    }
     
     public static void customerMenu(){
        System.out.println("=======================");
        System.out.println("1. View Order Mmenu");
        System.out.println("1. -- Log out --");
        System.out.println("=======================");
        System.out.print("Enter your selection: ");
        cusMenu = sc.nextLine();
        
        switch (cusMenu) {
            case "1": {
                UserStory1 us1 = new UserStory1();
                us1.orderMenu();
                break;

            }
            case "2": {

                break;
             }
            case "3": {
                
                break;
             }
            default: {
                System.out.println("Please enter again !");
                customerMenu();
            }
        }
     }

    public static void addDeliveryMan() {

        String ans = "";
        do {
            Scanner scanner = new Scanner(System.in);
            DeliveryMan deliMan1 = new DeliveryMan();
            deliMan1.setManID(DeliveryMan.getNextManID());
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            deliMan1.setName(name);
            System.out.print("Enter Password: ");
            String pw = scanner.nextLine();
            deliMan1.setPw(pw);
            System.out.print("Enter contact number: ");
            String hpNum = scanner.nextLine();
            deliMan1.setContactNum(hpNum);
            System.out.print("Enter address: ");
            String adds = scanner.nextLine();
            deliMan1.setAdds(adds);
            deliMan1.setStatus("Employed");

            manList.add(deliMan1);
            System.out.print("Do you want to continue(Y/N)?: ");
            ans = scanner.next();
        } while (ans.equals("y"));

        System.out.println("Delivery Man List");
        System.out.println("\t       Name\t\t  Contact Number\t     Address\t\tStatus");

//        System.out.println(String.format(" %-20s %-20n %-20s %-20n\n","Name", "Contact Number","Address","Status"));
        System.out.println(manList);
    }
    
    public static void updateDeliManStatus(int id){
        int choice = 0, i;
 
//        while(j <= manList.getNumberOfEntries()){
//            j++;
//        }
        
           for(i = 1 ; i <= manList.getNumberOfEntries(); i++){
            if(id == manList.getEntry(i).getManID()){
                System.out.println(manList.getEntry(i).getManID());
                
                System.out.println("Set the delivery man status to: ");
                System.out.println("1. Retired");
                System.out.println("2. Resigned");
                System.out.println("3. Other");
                System.out.println("4. Back to HR main page");
                System.out.print("\nYour choice: ");    
                 choice = sc.nextInt();
                while (choice < 0 || choice > 4) {
                    System.out.print("Please enter number 1-4: ");
                    choice = sc.nextInt();
                }
                switch(choice){
                    case 1:
                        manList.getEntry(i).setStatus("Retired");
                        break;
                    case 2:
                        manList.getEntry(i).setStatus("Resigned");
                        break;
                    case 3:
                        Scanner scanner = new Scanner(System.in); 
                        System.out.print("Please specify: ");
                        other = scanner.nextLine();
                        manList.getEntry(i).setStatus(other);
                        break;
                    case 4:
                        displayMenu();
                    default:
                        System.out.print("Please select your choice (1-4) !");
                        
                }
         
           }
            
          
           }
           

                System.out.println(manList);
                displayMenu();

                }
    

    

    
    
        
    

    public void addUser() {
        DeliveryMan deliMan = new DeliveryMan(10, "Miw","Miw12345" ,"012-3456789", "Jalan Miw", "Employed", null,"Unavailable");
        manList.add(deliMan);
        staffview.setUserList(manList);
        Date date = new Date();
        SimpleDateFormat dateFormatter = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
        try{
                date = dateFormatter.parse("2017-05-12 11:12:26");//just for hardcode
         }catch(Exception ex){
                System.out.print("qwer");
         }
        
        
      /*  manList.add(new User("Miw", "Miw12345", null, "Unavailable"));
        manList.add(new User("Tneh", "Tneh12345", null, "Unavailable"));
        manList.add(new User("OngYJ", "OngYJ12345", null, "Unavailable"));
        staffview.setUserList(manList); */
    }

    public static void testDate() {
        Date now = new Date();
        //  SimpleDateFormat dateFormatter = new SimpleDateFormat("E yyyy.mm.dd 'at' hh:mm:ss a");
        manList.getEntry(b).setDateTime(now);
        // System.out.println(userList.get(b).getDateTime());
        // manList.get(b).setDateTime(now);
    }

    public static void main(String[] args) {
        Assignment assign = new Assignment();
        assign.addUser();
        assign.mainMenu();
        
//        assign.testDate();
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
