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

/**
 *
 * @author User
 */
public class Assignment {

    public static ListInterface<DeliveryMan> manList = new List<>();
    staffView staffview = new staffView();
    private Scanner sc = new Scanner(System.in);
    public static int b;
    
        public void mainMenu() {
        String main;
        System.out.println("=======================");
        System.out.println("1. Delivery man Log In");
        System.out.println("2. Staff Log in");
        System.out.println("3. View Order Menu");
   //     System.out.println("3. test check");
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
                displayMenu();
                break;
             }
            case "3": {
                UserStory1 us1 = new UserStory1();
               us1.orderMenu();
                break;
             }
        /*             case "3":{
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
        
 public void User() {
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
 
     public void deliverymanMenu() {
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

        switch (menu) {
            case "1": {
                manList.getEntry(b).setWorkingStatus("Available");
                System.out.println("** Status is now AVAILABLE !! ** ");
                testDate();
             //   staffview.viewInfo();
                deliverymanMenu2();
                break;
            }
            case "2": {
                manList.getEntry(b).setWorkingStatus("Unavailable");
                System.out.println("** Status is now UNAVAILABLE !! **");
                testDate();
            //    staffview.viewInfo();
                deliverymanMenu2();
                break;
            }
            case "3": {

            }
            case "4": {

            }
            case "5": {
                mainMenu();
                break;
            }
        }
    }
 
     public static void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("Staff Menu");
        System.out.println("-------------------------\n");
        System.out.println("1 - Add new delivery man");
        System.out.println("2 - View delivery man");
//        System.out.println("3 - Decrypt a number");
        System.out.println("4 - Quit");
        System.out.println("-------------------------\n");
        System.out.print("\nPlease select your choice: ");
        choice = scanner.nextInt();
        while (choice < 0 || choice > 4) {
            System.out.print("Please enter number 1-4: ");
            choice = scanner.nextInt();

        }

        switch (choice) {
            case 1:

                addDeliveryMan();

                break;
            case 2:
                // Perform "encrypt number" case.
                break;
            case 3:
                // Perform "decrypt number" case.
                break;
            case 4:
                Assignment assign = new Assignment();
                assign.mainMenu();
         //      System.exit(0);
                break;
            default:

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

    public void deliverymanMenu2() {
        String menu2;
        System.out.println("=================================");
        System.out.println("1. Back to delivery man Menu ");
        System.out.println("2. Back to Main Menu");
        System.out.println("=================================");
        System.out.print("Enter your selection: ");
        menu2 = sc.nextLine();

        switch (menu2) {
            case "1": {
                deliverymanMenu();
            }
            case "2": {
                mainMenu();
            }
        }

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

    public void testDate() {
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
        displayMenu();
        assign.testDate();
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
