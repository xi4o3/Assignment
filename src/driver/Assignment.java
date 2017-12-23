/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driver;

import entity.DeliveryMan;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import driver.staffView;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import driver.UserStory1;
import static driver.UserStory1.orderList;
import adt.DMSortedLinkedList;
import adt.DMSortedListInterface;
import adt.SortedDoublyLinkedList;
import entity.Affiliate;
import entity.Food;
import java.util.ArrayList;
import entity.order;
import entity.HR;
import entity.customer;
import java.text.DateFormat;
import entity.SummaryReport;

/**
 *
 * @author User
 */
public class Assignment {

    public static DMSortedListInterface<DeliveryMan> manList = new DMSortedLinkedList<>();
//    public static ListInterface<DeliveryMan> manList = new List<>();
    public static ListInterface<HR> HRList = new List<>();
    public static ListInterface<order> orderL = new List<>();
    public static ListInterface<customer> customer = new List<>();
    private UserStory1 a = new UserStory1(affiliate, food, customer);
    //***************************module A***********************************
  ModuleA
    private static SortedDoublyLinkedList<Affiliate> affiliate = new SortedDoublyLinkedList<>();
    public static SortedDoublyLinkedList<Food> food = new SortedDoublyLinkedList<>();
    public static SortedDoublyLinkedList<SummaryReport> SR; 
    
    private Affiliate curAffiliate;
    //**********************************************************************
    static staffView staffview = new staffView();
=======
    public static ListInterface<Affiliate> affiliate = new List<>();
    public static ListInterface<Food> food = new List<>();
    private ModuleAFunction A = new ModuleAFunction();
    //**************************************************************
    static staffView staffview = new staffView();  
  master
    private static Scanner sc = new Scanner(System.in);
    public static int b;
    public static String menu;
    public static String main;
    public static String cusMenu;
    static String other;

    public Assignment() {
        //initialize deliveryman
        HR hr = new HR("HR0001","1234"); 
        HR hr1 = new HR("HR0002","5678"); 
        HRList.add(hr);
        HRList.add(hr1);
        
        DeliveryMan deliMan = new DeliveryMan(10, "Miw", "Miw12345", "012-3456789", "Jalan Miw", "Employed", null, "Unavailable", "None", 0, 1, 2.0,50,2);
        DeliveryMan deliMan1 = new DeliveryMan(20, "Albert", "1234", "012-8723124", "Jalan Pisang", "Employed", null, "Unavailable", "None", 0, 0, 3.0,50,1);
        DeliveryMan deliMan2 = new DeliveryMan(30, "Thomas", "1234", "012-8132234", "Jalan Rambutan", "Employed", null, "Unavailable", "None", 0, 3, 3.0,50,2);
        DeliveryMan deliMan3 = new DeliveryMan(40, "Jack", "1234", "012-8132234", "Jalan Rambutan", "Employed", null, "Unavailable", "None", 0, 3, 2.0,50,3);
        
        manList.add(deliMan);
        manList.add(deliMan1);
        manList.add(deliMan2);
        manList.add(deliMan3);

 ModuleA
        Affiliate aff1 = new Affiliate("R0000","1234","Crab and Lobster", "Tan ah meng", "2,Jalan Besar", "011-20993388");
        Affiliate aff2 = new Affiliate("R0001","1234","Arabica Estate", "Johnson tan", "3,Jalan Kecil", "012-99384756");
        Affiliate aff3 = new Affiliate("R0002","1234","Sushi King", "Desmond Lee", "5,Lorong Residensi 2", "019-27374656");
        Affiliate aff4 = new Affiliate("R0003","1234","McDonald", "Joshua Tan", "7,Persiaran SS15", "011-29384765");
        affiliate.insert(aff3);
        affiliate.insert(aff4);
        affiliate.insert(aff1);
        affiliate.insert(aff2);

        food.insert(new Food("F0001", "Chicken Chop", 100.00, "Food", "YES", affiliate.getAtPosition(3), "YES"));
        food.insert(new Food("F0002", "Steak", 50.00, "Food", "YES", affiliate.getAtPosition(3), "YES"));
        food.insert(new Food("F0003", "Fish & Chip", 20.00, "Snack", "YES", affiliate.getAtPosition(3), "NO"));
        food.insert(new Food("F0004", "Lamb Chop", 30.00, "Food", "YES", affiliate.getAtPosition(3), "YES"));
        food.insert(new Food("F0005", "Ice cream", 5.00, "Beverage", "YES", affiliate.getAtPosition(3), "YES"));
        food.insert(new Food("F0006", "Mushroom Soup", 25.00, "Snack", "YES", affiliate.getAtPosition(3), "YES"));
        food.insert(new Food("F0010", "Steak", 20.00, "Desert", "YES", affiliate.getAtPosition(3), "YES"));
        food.insert(new Food("F0011", "Pumpkin soup", 30.00, "Desert", "YES", affiliate.getAtPosition(3), "NO"));
        food.insert(new Food("F0012", "beef soup", 100.00, "Desert", "YES", affiliate.getAtPosition(3), "NO"));
        
        food.insert(new Food("F0001", "Fish & Chip", 20.00, "Food", "YES", affiliate.getAtPosition(2), "NO"));
        food.insert(new Food("F0002", "Lamb Chop", 30.00, "Food", "YES", affiliate.getAtPosition(2), "YES"));
        food.insert(new Food("F0003", "Ice cream", 5.00, "Beverage", "YES", affiliate.getAtPosition(2), "YES"));
        food.insert(new Food("F0004", "Mushroom Soup", 25.00, "Beverage", "YES", affiliate.getAtPosition(2), "YES"));
        food.insert(new Food("F0005", "Steak", 20.00, "Desert", "YES", affiliate.getAtPosition(2), "YES"));
        food.insert(new Food("F0006", "Pumpkin soup", 30.00, "Snack", "YES", affiliate.getAtPosition(2), "NO"));
        food.insert(new Food("F0007", "beef soup", 100.00, "Desert", "YES", affiliate.getAtPosition(2), "NO"));
        
        food.insert(new Food("F0003", "Ice cream", 5.00, "Beverage", "YES", affiliate.getAtPosition(1), "YES"));
        food.insert(new Food("F0004", "Mushroom Soup", 25.00, "Snack", "YES", affiliate.getAtPosition(1), "YES"));
        food.insert(new Food("F0005", "Steak", 20.00, "Desert", "YES", affiliate.getAtPosition(1), "YES"));
        food.insert(new Food("F0006", "Pumpkin soup", 30.00, "Desert", "YES", affiliate.getAtPosition(1), "NO"));
        food.insert(new Food("F0007", "beef soup", 100.00, "Desert", "YES", affiliate.getAtPosition(1), "NO"));
        
        food.insert(new Food("F0001", "Steak", 20.00, "Snack", "YES", affiliate.getAtPosition(4), "YES"));
        food.insert(new Food("F0002", "Pumpkin soup", 30.00, "Desert", "YES", affiliate.getAtPosition(4), "NO"));
        food.insert(new Food("F0003", "beef soup", 100.00, "Desert", "YES", affiliate.getAtPosition(3), "NO"));
             
        order order = new order("P0001", "Abu", 01234567, "Jalan Abu", 14000, "Hamplang Chop", 20, "2017/12/20 12:08:43", "Pending", deliMan1);
        order order1 = new order("P0002", "Ata", 01234567, "Jalan Duck", 23000, "Banana Chop", 20, "2017/12/20 12:08:43", "Completed", deliMan);
        order order2 = new order("P0003", "Ali", 01234567, "Jalan Diao", 33000, "Banana Chop", 20, "2017/12/20 12:08:43", "Pending", deliMan1);
        order order3 = new order("P0004", "Agi", 01234567, "Jalan Halo", 44000, "Banana Chop", 20, "2017/12/20 12:08:43", "Pending", deliMan);
        order order4 = new order("P0005", "Ahi", 01234567, "Jalan Hiao", 50300, "Banana Chop", 20, "2017/12/20 12:08:43", "Pending", deliMan2);
=======
        Affiliate aff = new Affiliate("R0000", "Tan", "tan", "123", "123", "aaa");
        affiliate.add(aff);

        customer cust1= new customer("C0000","123","Tan",0123,"Jalan raya",12345);
        customer.add(cust1);
        
        food.add(new Food("F0001", "Wingent Meal", 100, "Food", "A", affiliate.getEntry(1)));
        food.add(new Food("F0002", "Happy Meal", 89, "Food", "Deleted", affiliate.getEntry(1)));
        food.add(new Food("F0003", "Pork Chop", 100, "Food", "A", affiliate.getEntry(1)));
        food.add(new Food("F0004", "Fries Rice", 89, "Food", "A", affiliate.getEntry(1)));
        food.add(new Food("F0005", "Chicken Chop", 9.40, "Food", "A", affiliate.getEntry(1)));
        food.add(new Food("F0006", "Fish&Chip", 9.40, "Food", "A", affiliate.getEntry(1)));

      
        
        order order = new order("P0001", "Abu", 01234567, "Jalan Abu", 14000, "Hamplang Chop", 20,20, "2017/12/17 12:08:43", "Pending", deliMan,customer.getEntry(1));
        order order1 = new order("P0002", "Ata", 01234567, "Jalan Duck", 23000, "Banana Chop", 20,20, "2017/12/17 12:08:43", "Completed", deliMan3,customer.getEntry(1));
        order order2 = new order("P0003", "Ali", 01234567, "Jalan Diao", 33000, "Banana Chop", 20,20, "2017/12/17 12:08:43", "Pending", deliMan,customer.getEntry(1));
        order order3 = new order("P0004", "Agi", 01234567, "Jalan Halo", 44000, "Banana Chop", 20,20, "2017/12/17 12:08:43", "Pending", deliMan1,customer.getEntry(1));
        order order4 = new order("P0005", "Ahi", 01234567, "Jalan Hiao", 50300, "Banana Chop", 20,20, "2017/12/17 12:08:43", "Pending", deliMan2,customer.getEntry(1));
         order order5 = new order("P0003", "Ali", 01234567, "Jalan Diao", 33000, "Banana Chop", 20,20, "2017/12/17 12:08:43", "Pending", deliMan2,customer.getEntry(1));
        order order6 = new order("P0004", "Agi", 01234567, "Jalan Halo", 44000, "Banana Chop", 20,20, "2017/12/17 12:08:43", "Pending", deliMan3,customer.getEntry(1));
        order order7 = new order("P0005", "Ahi", 01234567, "Jalan Hiao", 50300, "Banana Chop", 20,20, "2017/12/17 12:08:43", "Pending", deliMan3,customer.getEntry(1));
        
 master
        orderL.add(order);
        orderL.add(order1);
        orderL.add(order2);
        orderL.add(order3);
        orderL.add(order4);
      ModuleA
=======
        orderL.add(order5);
        orderL.add(order6);
        orderL.add(order7);
        

 master
    }

    public void mainMenu() {
        boolean flag = true;
        while (flag) {
            System.out.println("=======================");
            System.out.println("1. Delivery man Log In");
            System.out.println("2. Affiliate Log In");
            System.out.println("3. HR Log In");
            System.out.println("4. Customer Log In");
            System.out.println("5. Affiliate Registration");
            System.out.println("6. View Affiliates");
            System.out.println("7. Customer Registration");
            System.out.println("8. Report");
            System.out.println("0. Exit Program");
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
                    boolean login;
                    do {
                        login = Login();
                    } while (login == false);
                    break;
                }
                case "3": {
//                    verifyHRLogin();
                    displayMenu();
                    break;
                }
                case "4": {
                    boolean custLog;
                    do{
                        custLog = a.custLogin();
                    }while(custLog==false);
                    customerMenu();
                    break;
                }
                case "5": {
                    Register();
                    mainMenu();
                    break;
                }
                case "6": {
                    ViewAffiliate();
                    mainMenu();
                    break;
                }
                case "7": {
                    
                    cusRegister();
                    break;
                }
                case "8": {
                    GenerateMenuSummRpt();
                    break;
                }
                case "0": {
                    flag = false;
                    break;
                }
                default: {
                    System.out.println("Please enter again !");
                    mainMenu();
                }
            }//end switch
        }//end while
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

        for (i = 1; i <= manList.getLength(); i++) {
            if (username.equals(manList.getEntry(i).getName()) && password.equals(manList.getEntry(i).getPw())) {
                a = true;
                b = i;
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
    
    public void verifyHRLogin(){
        boolean pass = false;
        System.out.print("HR ID: ");
        String id = sc.nextLine();
        System.out.print("HR Password: ");
        String pw = sc.nextLine();
            for (int i = 1; i <= HRList.getNumberOfEntries(); i++) {
                HR hr = HRList.getEntry(i);
                if(id.equals(hr.getStaffID()) && pw.equals(hr.getPassword())){
                    displayMenu();
                    pass = true;
                }
            }
            if(pass == false){
                System.out.println("Invalid id or password!");
                System.out.println("Please try again!!");
            }
                
    }

    public void deliverymanMenu() {

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
                if (manList.getEntry(b).getWorkingStatus() == "Unavailable") {
                    manList.getEntry(b).setWorkingStatus("Available");
                    System.out.println("** Status is now AVAILABLE !! ** ");
                    testDate();
                    deliverymanMenu();
                    break;
                } else {
                    System.out.println("You need to clock out to clock in ! ");
                    deliverymanMenu();
                    break;
                }
            }
            case "2": {
                if (manList.getEntry(b).getWorkingStatus() == "Available") {
                    manList.getEntry(b).setWorkingStatus("Unavailable");
                    System.out.println("** Status is now UNAVAILABLE !! **");
                    testDate();
                    deliverymanMenu();
                    break;
                } else {
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

    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("\t\tHR Menu");
        System.out.println("=====================================");
        System.out.println("1. Add new delivery man");
        System.out.println("2. View delivery man details");
        System.out.println("3. View delivery man working status");
        System.out.println("4. Update delivery man status");
        System.out.println("5. Update delivery man details");
        System.out.println("6. Assign job for delivery man");
        System.out.println("7. View pending deliveries");
        System.out.println("8. View daily report");
        System.out.println("9. -- Log out --");
        System.out.println("====================================\n");
        System.out.print("\nPlease select your choice: ");
        choice = scanner.nextInt();
        while (choice < 0 || choice > 9) {
            System.out.print("Please enter number 1-9: ");
            choice = scanner.nextInt();
        }

        switch (choice) {
            case 1:

                addDeliveryMan();
                displayMenu();

                break;
            case 2:
                String ratingStar = "";
                System.out.printf("%3s %5s      %-20s %-15s %-20s %-19s %-10s %-10s\n","No","ID","Name","Contact No.","Address","Status","Rating","Total Deliveries");
                System.out.printf("%3s %5s      %-20s %-15s %-20s %-19s %-10s %-10s\n","--","--","----","-----------","-------","------","------","----------------");
                 for (int i = 1; i <= manList.getLength(); ++i) {
                     DeliveryMan dm = manList.getEntry(i);
                     if(dm.getRating() >=1 && dm.getRating() <2 )
                         ratingStar = "*";
                     else if(dm.getRating() >=2  && dm.getRating() <3)
                         ratingStar = "* *";
                     else if(dm.getRating() >=3  && dm.getRating() <4)
                         ratingStar = "* * *";
                     else if(dm.getRating() >=4  && dm.getRating() <5)
                         ratingStar = "* * * *";
                     else if(dm.getRating() >=5)
                         ratingStar = "* * * * *";
                     else if(dm.getRating() >0 && dm.getRating() <1)
                          ratingStar = "POOR";
                     else if(dm.getRating() == 0)
                          ratingStar = "TBD";
                     else
                         ratingStar = "unknown";
                     
                     System.out.printf("%3d %5d      %-20s %-15s %-20s %-15s %10s %20d\n",i,dm.getManID(),dm.getName(),dm.getContactNum(),dm.getAdds(),dm.getStatus(),ratingStar,dm.getTotalDeliveries());
                
                 }
                
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
                System.out.print("Please enter the delivery man ID: ");
                int updateId = sc.nextInt();
                updateDeliManDetails(updateId);
                break; 
            case 6:
                viewDelivery();
                assignDeliver();
                break;
            case 7:
                viewPendingDeliveries();
                break;
            case 8:
                viewDailyReport();
                break;
            case 9:
                mainMenu();
                break;
            default:
                System.out.println("Please enter again !");
                displayMenu();

        }

    }

    public static void customerMenu() {
        System.out.println("=======================");
        System.out.println("1. View Order Mmenu");
        System.out.println("2. Place Order");
        System.out.println("3. Show Order");
        System.out.println("4. Check delivery order reamaining time");
        System.out.println("5. -- Log out --");
        System.out.println("=======================");
        System.out.print("Enter your selection: ");
        cusMenu = sc.nextLine();
        UserStory1 us1 = new UserStory1(affiliate, food, customer);
        switch (cusMenu) {
            case "1": {
                //us1.orderMenu();
                break;
            }
            case "2": {
                us1.order1();
                break;
            }
            case "3": {
                us1.show();
                break;
            }
            case "4": {
                checkTime();
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
            System.out.print("Set Login Password: ");
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

    public void updateDeliManStatus(int id) {
        int choice = 0, i;

//        while(j <= manList.getNumberOfEntries()){
//            j++;
//        }
        for (i = 1; i <= manList.getLength(); i++) {
            if (id == manList.getEntry(i).getManID()) {
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
                switch (choice) {
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
    
    public void updateDeliManDetails(int updateId) {
        int choice = 0, i;
        Scanner scanner = new Scanner(System.in);
//        while(j <= manList.getNumberOfEntries()){
//            j++;
//        }
        for (i = 1; i <= manList.getLength(); i++) {
            if (updateId == manList.getEntry(i).getManID()) {
                System.out.println(manList.getEntry(i).getManID());

                System.out.println("Update the delivery man details: ");
                System.out.println("1. Contact Number");
                System.out.println("2. Address");
                System.out.println("3. Back to HR main page");
                System.out.print("\nYour choice: ");
                choice = sc.nextInt();
                while (choice < 0 || choice > 3) {
                    System.out.print("Please enter number 1-3: ");
                    choice = sc.nextInt();
                }
                switch (choice) {
                    case 1:
                        System.out.println(manList.getEntry(i).getContactNum());
                        System.out.print("Enter new contact number: ");
                        String contactNo = scanner.nextLine();
                        manList.getEntry(i).setContactNum(contactNo);
                        break;
                    case 2:
                        System.out.println(manList.getEntry(i).getAdds());
                        System.out.print("Enter new address: ");
                        String adds = scanner.nextLine();
                        manList.getEntry(i).setAdds(adds);
                        break;
                    case 3:
                        displayMenu();
                    default:
                        System.out.print("Please select your choice (1-3) !");

                }

            }

        }

        System.out.println(manList);
        displayMenu();

    }

    public void viewPendingDeliveries() {
        Scanner scanner = new Scanner(System.in);
        int num = 1;
        String option = "";
        boolean data = false;
         for (int i = 1; i <= manList.getLength(); i++) {
                 DeliveryMan dm = manList.getEntry(i);
                 if(dm.getDeliveryAssigned()>=1)
                    data = true;
                 else
                    data = false;
         }
         if(data == false){
             System.out.println("All delivery man has completed the deliveries.");
             System.out.println("No pending deliveries available");
         }
         else{
            do {
                num = 1;
                System.out.printf("%3s %5s      %-20s %-15s %-30s\n","No","ID","Name","Contact No.","Total Pending Deliveries");
                System.out.printf("%3s %5s      %-20s %-15s %-30s\n","--","--","----","-----------","------------------------");
                for (int i = 1; i <= manList.getLength(); i++) {
                    DeliveryMan dm = manList.getEntry(i);
                    int onHold = manList.getEntry(i).getDeliveryAssigned();
                    if (onHold > 0) {
    //                    System.out.println(num + ". ( ID: " + manList.getEntry(i).getManID() + " ) " + name + "  [Total Pending Deliveries: " + manList.getEntry(i).getDeliveryAssigned() + " ]");
                         System.out.printf("%3d %5d      %-20s %-15s %24d\n",num,dm.getManID(),dm.getName(),dm.getContactNum(),dm.getDeliveryAssigned());
                        num++;
                    }
                }
                System.out.print("Enter the delivery man ID to view more details: ");

                int selection = scanner.nextInt();
                String name = "";
                boolean gtPendingOrder = false;
                for (int i = 1; i <= manList.getLength(); i++) {
                    if (selection == (manList.getEntry(i).getManID())) {
                        name = manList.getEntry(i).getName();
                        if(manList.getEntry(i).getDeliveryAssigned()>=1){
                            gtPendingOrder = true;
                        }
                        else
                            gtPendingOrder = false;
                    }
                }
                
                if(gtPendingOrder = true){
                 System.out.printf("%10s \t%-15s %-25s %-15s %-15s %-10s\n","OrderID", "Name", "Address", "Postcode", "OrderTime", "OrderStatus");
                 System.out.printf("%10s \t%-15s %-25s %-15s %-15s %-10s\n","-------", "----", "-------", "--------", "---------", "-----------");
                for (int i = 1; i <= orderL.getNumberOfEntries(); i++) {
                    order order = orderL.getEntry(i);
                    if (name.equals(orderL.getEntry(i).getDeliveryMan().getName())) {
                       
                        String st = String.format("%10s \t%-15s %-25s %-15s %-15s %-10s", order.getOrderId(), order.getName(), order.getAddress(), order.getPostCode(), order.getOrderTime(), order.getOrderTime());
                        System.out.println(st);

                    }

                }
                System.out.print("Do you wish to continue?(y/n): ");
                Scanner scanner1 = new Scanner(System.in);
                option = scanner1.nextLine();

                }else
                System.out.println("No pending deliveries.");

            } while (option.equals("y"));
                     
        }
    }
    
    public void viewDailyReport(){

       int count =0;
       int num = 1;
       int distance = 0;
       int totalDistance = 0;
       int grandDistance = 0;
       int grandDeliveries = 0;
       String reportDate = "";
       String orderTime = "";
       int dmID = 0;
       int deli = 0;
     
       int reportData = 0;
       String orderDMHPNo = "";
       String orderDM = "";
       DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
       Date date = new Date();
       System.out.print("Enter the day of the report(yyyy/mm/dd)： ");
       reportDate = sc.nextLine();
        System.out.println("\n\t\t\t\tDAILY DELIVERY MAN REPORT");
        System.out.println("\t\t\t\t       of "+ reportDate);
        
//        System.out.printf("%3s %5s      %-20s %-15s %-23s %-20s\n","--","--","----","-----------","----------------","--------------");
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.printf("%3s %5s      %-20s %-15s %-23s %-20s\n","No","ID","Name","Contact No.","Total Deliveries","Total Distance");
        System.out.println("------------------------------------------------------------------------------------------");
//        System.out.printf("%3s %5s      %-20s %-15s %-23s %-20s\n","--","--","----","-----------","----------------","--------------");
      
         for (int i = 1 ; i <= manList.getLength(); i++) {
                   count = 0;
                   totalDistance = 0;
                   
                   DeliveryMan dm = manList.getEntry(i);
                   String name = dm.getName();

            for(int j =1 ; j <= orderL.getNumberOfEntries() ; j++){
                
                order ord = orderL.getEntry(j);   
                orderTime = ord.getOrderTime().substring(0,10);
                if(orderTime.equals(reportDate) && ord.getDeliveryMan().getName().equals(name)){
                    dmID = ord.getDeliveryMan().getManID();
                    orderDM = ord.getDeliveryMan().getName();
                    orderDMHPNo = ord.getDeliveryMan().getContactNum();
                    count++;
                    if(ord.getPostCode()>=10000 && ord.getPostCode()<20000)
                        distance = 1;
                    else if(ord.getPostCode()>=20000 && ord.getPostCode()<30000)
                        distance = 2;
                    else if(ord.getPostCode()>=30000 && ord.getPostCode()<40000)
                        distance = 3;
                    else if(ord.getPostCode()>=40000 && ord.getPostCode()<50000)
                        distance = 4;
                    else if(ord.getPostCode()>=50000 && ord.getPostCode()<60000)
                        distance = 5;
                    else if(ord.getPostCode()>=60000 && ord.getPostCode()<70000)
                        distance = 6;
                    else 
                        distance = 100;
                    
                }
                
                totalDistance +=  distance;
                distance = 0;
        }
            
                if(totalDistance == 0){
                      dm.setDayTotalDeliveries(0);
                      manList.remove(i);
                      manList.add(dm);
                    
                }else{
                    dm.setDayTotalDeliveries(count);
                    manList.remove(i);
                    manList.add(dm);
                    System.out.printf("%3s %5s      %-20s %-15s %16s %18d km\n",num ,dmID,orderDM,orderDMHPNo,dm.getDayTotalDeliveries(), totalDistance);
                    reportData++;
                    
                    grandDeliveries += count;
                    grandDistance += totalDistance; 
                    num++;
                   
                }
                    
                
                  
            
       }
     
         if(reportData == 0){
             System.out.println("No record available!");
         }
//         System.out.println("==========================================================================================");
         System.out.println("\n------------------------------------------------------------------------------------------");
         if(grandDeliveries == 0){
           System.out.printf("%48s %27s %6s\n","","Grand Total Deliveries Completed :","-");
             System.out.printf("%48s %27s %3s km \n","","Grand Total Distances Travelled  :","-");
         }else{
         System.out.printf("%48s %27s %6d\n","","Grand Total Deliveries Completed :",grandDeliveries);
         System.out.printf("%48s %27s %3d km \n","","Grand Total Distances Travelled  :",grandDistance);
         }
//         System.out.println("       \t\t\t\t\t\t\t\tGrand Total Deliveries:"+grandDeliveries);
        System.out.println("------------------------------------------------------------------------------------------\n");
        System.out.println("\t\t\t\t     END OF REPORT");
        System.out.println("\t\t\t    Generated at: "+dateFormat.format(date)+"\n\n\n");
//        System.out.println("==========================================================================================");
         
//            
        }
    
    public void addUser() {
        staffview.setUserList(manList); 
        Date date = new Date();
        SimpleDateFormat dateFormatter = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
        try {
            date = dateFormatter.parse("2017-05-12 11:12:26");//just for hardcode
        } catch (Exception ex) {
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
//        Date date=new Date();
//        SimpleDateFormat sdf=new SimpleDateFormat("HH:mm");
//        Calendar cal= Calendar.getInstance();
//        cal.add(Calendar.MINUTE, 10);
//        System.out.println(sdf.format(cal));

        Assignment assign = new Assignment();
        assign.addUser();
        assign.mainMenu();
        assign.assignDeliver();

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
    public void cusRegister(){
     customer custemp = null;
     Scanner cus = new Scanner(System.in);
     String password = null;
     String cus_name = null;
     String address = null;
     int contact_no = 0;
     int posCod = 0;
     System.out.println("==========Fastest Delivery System==========");
     int totalAff = customer.getNumberOfEntries();
        
     String cus_id = String.format("C%04d", totalAff + 1);
     System.out.println("Customer ID: " + cus_id);
     System.out.print("Enter Password for login purpose: ");
     password  = cus.nextLine();
        
     System.out.print("Enter name: ");
     cus_name  = cus.nextLine();
        
     System.out.print("Enter Contact No: ");
     contact_no  = Integer.parseInt(cus.nextLine());
        
     System.out.print("Enter Address: ");
     address  = cus.nextLine();
        
     System.out.println("Enter PostCode:");
     posCod = Integer.parseInt(cus.nextLine());
        
     custemp = new customer(cus_id,password,cus_name,contact_no,address,posCod);
     customer.add(custemp);
     System.out.println("Register Successful!!");
     }

//******************************************************************************************************************************    
//ModuleA
    public void Register() {
        System.out.println("======================");
        System.out.println("Affiliate Registration");
        System.out.println("======================");

        int totalAff = affiliate.getSize();

        String Res_id = String.format("R%04d", totalAff + 1);
        System.out.println("Affiliate ID: " + Res_id);
        System.out.println("**REMEMBER FOR FUTURE LOGIN PURPOSE**");
        sc.nextLine();
        System.out.print("Enter Password for login purpose: ");
        String password = sc.nextLine();

        System.out.print("Enter Restaurant name: ");
        String Res_name = sc.nextLine();

        System.out.print("Enter Owner name: ");
        String Owner_name = sc.nextLine();

        System.out.print("Enter Contact No: ");
        String contact_no = sc.nextLine();

        System.out.print("Enter Restaurant Address: ");
        String address = sc.nextLine();

        System.out.print("\n");

        Affiliate newAff = new Affiliate(Res_id, password, Res_name, Owner_name, contact_no, address);
        affiliate.insert(newAff);
        System.out.println("Successfully Registered.");
        System.out.print("\n");

    }
    
    public boolean Login() 
    {
        
        int idcount = 0;
        boolean password = false;
        while (idcount == 0) {
            System.out.println("===============");
            System.out.println("Affiliate Login");
            System.out.println("===============");
            System.out.print("Restaurant ID: ");
            String id = sc.nextLine();
            for (int i= 1; i<=affiliate.getSize(); i++) 
            {
                if (id.equals(affiliate.getAtPosition(i).getRes_id())) 
                {
                    while (!password) 
                    {
                        System.out.print("Password: ");
                        String pass = sc.nextLine();
                        idcount = 1;
                        if (pass.equals(affiliate.getAtPosition(i).getPassword())) 
                        {
                            password = true;
                            System.out.println("Successfully Login");
                            curAffiliate=affiliate.getAtPosition(i);
                            Menu();
                        } else 
                        {
                            System.out.println("Invalid password");
                        }
                    }
                }
            }
            if (idcount == 0) 
            {
                System.out.println("No ID found");
            }
        }
        return password;
    }

    public void Menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Add New Menu");
        System.out.println("2. Update Item Details");
        System.out.println("3. Remove Items");
        System.out.println("4. View Items");
        System.out.println("0. Log Out");
        
        System.out.print("Enter your selection: ");
        
        int selection = scanner.nextInt();
        scanner.nextLine();
        switch (selection) 
        {
            case 1: 
            {
                addFood();
                break;
            }
            case 2: 
            {
                updateFood();
                scanner.nextLine();
                break;
            }
            case 3: 
            {
                deleteFood();
                break;
            }
            case 4: 
            {
                FoodList();
                Menu();
                
                break;
            }
            case 0: 
            {
                System.out.println("Successfully Logout");
                break;
            }
            default: 
            {
                System.out.println("Please select again...");
                Menu();
                break;
            }
        }
    }

    public void addFood(){
        System.out.println("========");
        System.out.println("New Food");
        System.out.println("========");
        
        int totalFood = food.getSize();
        String foodID = String.format("F%04d", totalFood + 1);
        System.out.println("FoodID: " + foodID);
        System.out.print("Food Name: ");
        String foodName = sc.nextLine();
        System.out.print("Price: ");
        Double Price = sc.nextDouble();
        sc.nextLine();
        System.out.print("Category: ");
        String Category = sc.nextLine();
        String foodAVA = "YES";
        System.out.print("Promotion Item (Yes/No): ");
        String promotion = sc.nextLine();
        
        
        Food f = new Food(foodID, foodName, Price, Category, foodAVA, curAffiliate, promotion);
        food.insert(f);

        System.out.println("New Food Added !");
        System.out.println("FoodID: " + foodID);
        System.out.println("Food Name: " + foodName);
        System.out.println("Price: RM" + Price);
        System.out.println("Category: " + Category);
        System.out.println("Availability: YES");
        System.out.println("Promotion Status: " + promotion);

        Menu();
    }
    
     public void deleteFood(){
        int d=0;
        System.out.println("================");
        System.out.println("Delete Food Menu");
        System.out.println("================");
        FoodList();
        System.out.print("Enter FoodID to delete: ");
        String foodID = sc.nextLine().toUpperCase();
        
        for(int i =1 ; i<=food.getSize(); i++)
        {
                if(foodID.equals(food.getAtPosition(i).getFoodID())&& curAffiliate.getRes_id().equals(food.getAtPosition(i).getRestaurant().getRes_id())/**&& affiliate.getEntry(idIndex).equals(food.getEntry(i).getRestaurant())**/)
                {
                    System.out.println("Confirm to delete?");
                    System.out.print("Enter your selection (y/n):");
                    char selection = Character.toUpperCase(sc.nextLine().charAt(0));
                    switch(selection)
                    {
                        case 'Y':
                        {
                            System.out.println("Delete successfully!");
                            food.getAtPosition(i).setFoodAVA("Deleted");
                            food.deleteAtPos(i);
                            d=1;
                            Menu();
                            break;
                        }
                        case 'N':
                        {
                            d=1;
                            Menu();
                            break;
                        }
                        default:
                        {
                            d=0;
                            System.out.println("Please enter again...");
                            Menu();
                            break;
                        }
                    }
                }
            }
            if(d==0)
            {
                System.out.println("Please enter again...");
                deleteFood();
            }
            
            
    }
     
    public void updateFood(){
        int id = 99;
        System.out.println("==================");
        System.out.println("Update Item Detail");
        System.out.println("==================");
        System.out.println("Welcome ! " + curAffiliate.getRes_name());
        FoodList();
        System.out.print("Enter FoodID: ");
        String FoodID = sc.nextLine().toUpperCase();
        
        int i=1; 
        while(i <= food.getSize())
        {
            if(FoodID.equals(food.getAtPosition(i).getFoodID())&& curAffiliate.getRes_id().equals(food.getAtPosition(i).getRestaurant().getRes_id())/*&& curAffiliate.equals(food.getAtPosition(i).getRestaurant())*/)
            {        
                System.out.println("FoodID: " + food.getAtPosition(i).getFoodID());
                System.out.println("Food Name: " + food.getAtPosition(i).getFoodName());
                System.out.println("Price: RM" + food.getAtPosition(i).getPrice());
                System.out.println("Food Type: " + food.getAtPosition(i).getCategory());
                System.out.println("Food Availability: " + food.getAtPosition(i).getFoodAVA());
                System.out.println("Promotion: " + food.getAtPosition(i).getPromotion());
                
                Food F = food.getAtPosition(i);
                
                id = 0; 
                updateFoodDetail(curAffiliate,F);
                
                   
            }
            i++;
        }
            if(id == 99)
            {
                System.out.println("FoodID not found...");
                System.out.println("Please enter again !");
                updateFood();
            }      
    }
    
    public void FoodList(){
        int no=1;
        System.out.println("-----------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%3s %10s %20s %20s %20s %20s %20s\n", "No", "Food ID", "Food Name", "Food Price", "Caterory", "Availability", "Promotion");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------");   
        for(int i=1; i<=food.getSize(); i++)
        {
            if(food.getAtPosition(i).getFoodAVA().equals("YES") && curAffiliate.getRes_id().equals(food.getAtPosition(i).getRestaurant().getRes_id()))
            {
                String formatPrice = String.format("RM %5.2f", food.getAtPosition(i).getPrice());
                System.out.printf("%3d %10s %20s %20s %20s %20s %20s\n", no, food.getAtPosition(i).getFoodID(), food.getAtPosition(i).getFoodName(), formatPrice, food.getAtPosition(i).getCategory(), food.getAtPosition(i).getFoodAVA(), food.getAtPosition(i).getPromotion());
                no++;
            }
        }
        System.out.println("-----------------------------------------------------------------------------------------------------------------------");
    }
       
    public void updateFoodDetail(Affiliate A,Food F){
        System.out.println("Select any detail to update...");
        System.out.println("1.Food Name");
        System.out.println("2.Food Price");
        System.out.println("3.Food Availability");
        System.out.println("4.Promotion status");
        System.out.println("5.Back");
        System.out.print("Enter your selection: ");
        int choices =sc.nextInt();
        
        switch(choices)
        {
            case 1:
            {
                System.out.println("Food Name: " + F.getFoodName());
                System.out.print("New Food Name: ");
                sc.nextLine();
                String NewName = sc.nextLine();
                F.setFoodName(NewName);
                for(int i = 1 ; i < food.getSize() ; i++){
                    if(food.getAtPosition(i).getFoodID().equals(F.getFoodID())){
                        food.update(i, F);
                    }
                }
                System.out.println("Update successfully!");
                Menu();
                break;
            }
            case 2:
            {
                System.out.println("Food Price: RM" + F.getPrice());
                System.out.print("New Food Price: RM");
                double NewPrice = sc.nextDouble();
                F.setPrice(NewPrice);
                for(int i = 1 ; i < food.getSize() ; i++){
                    if(food.getAtPosition(i).getFoodID().equals(F.getFoodID())){
                        food.update(i, F);
                    }
                }
                System.out.println("Update successfully!");
                Menu();
                break;
            }
            case 3:
            {
                System.out.println("Food Availability: "+ F.getFoodAVA()); 
                System.out.print("Latest Availability: ");
                sc.nextLine();
                String status = sc.nextLine();
                status = status.toUpperCase();
                F.setFoodAVA(status);
                for(int i = 1 ; i < food.getSize() ; i++){
                    if(food.getAtPosition(i).getFoodID().equals(F.getFoodID())){
                        food.update(i, F);
                    }
                }
                System.out.println("Update successfully!");
                Menu();
                break;
            }
            case 4:
            {
                System.out.println("Promotion Ststus: "+ F.getPromotion()); 
                System.out.print("New Promotion Status: ");
                sc.nextLine();
                String promotion = sc.nextLine();
                promotion = promotion.toUpperCase();
                F.setPromotion(promotion);
                for(int i = 1 ; i < food.getSize() ; i++){
                    if(food.getAtPosition(i).getFoodID().equals(F.getFoodID())){
                        food.update(i, F);
                    }
                }
                System.out.println("Update successfully!");
                Menu();
                break;
            }
            case 5:
            {
                Menu();
                break;
            }
            default:
            {
                System.out.println("Please select again...");
            }
        }
    }
      
    public void ViewAffiliate() {
        System.out.println("-------------------------------------------------------------------------------------------------------------");
        System.out.printf("%3s %15s %15s %20s %20s %20s\n","No", "Restaurant ID", "OwnerName","Restaurant Name", "Contact.No", "Address");
        System.out.println("-------------------------------------------------------------------------------------------------------------");
        affiliate.display();
        System.out.println("-------------------------------------------------------------------------------------------------------------");
    }
    
    public void GenerateSummaryReport()
    {
        int foodqty;
        int bevqty;
        int snackqty;
        int desertqty;
        
        SummaryReport ASR; 
        SR = new SortedDoublyLinkedList<>();
        for(int i =1;i<=affiliate.getSize();i++)
        {
            foodqty=0;
            bevqty=0;
            snackqty=0;
            desertqty=0;
            Affiliate Restaurant=affiliate.getAtPosition(i);
            for(int j=1;j<=food.getSize();j++)
            {
                
                if(Restaurant.getRes_name().equals(food.getAtPosition(j).getRestaurant().getRes_name()) && food.getAtPosition(j).getCategory().equals("Food"))
                {
                    foodqty ++;
                }
                else if(Restaurant.getRes_name().equals(food.getAtPosition(j).getRestaurant().getRes_name()) && food.getAtPosition(j).getCategory().equals("Beverage"))
                {
                    bevqty ++;
                }
                else if(Restaurant.getRes_name().equals(food.getAtPosition(j).getRestaurant().getRes_name()) && food.getAtPosition(j).getCategory().equals("Snack"))
                {
                    snackqty ++;
                }
                else if(Restaurant.getRes_name().equals(food.getAtPosition(j).getRestaurant().getRes_name()) && food.getAtPosition(j).getCategory().equals("Desert"))
                {
                    desertqty ++;
                }
            }
            ASR=new SummaryReport(foodqty, bevqty, snackqty, desertqty, Restaurant);
            SR.insert(ASR);
        }
    }
    
    public void GenerateMenuSummRpt(){
        GenerateSummaryReport();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        Calendar c = Calendar.getInstance();
        
        System.out.printf("\n%20sTotal Menu Item For Each Restaurant Report\n\n"," ");
        System.out.printf("Date: %s\t\t\t\t\t\t\tTime: %s\n\n",dateFormat.format(c.getTime()),timeFormat.format(c.getTime()));
        System.out.println("****************************************************************************************");
        System.out.printf("%3s %20s %12s %12s %12s %11s %12s","No","Restaurant Name","Food","Beverage","Snack","Desert","Total\n");
        System.out.printf("----------------------------------------------------------------------------------------\n");
        SR.display();
        System.out.printf("----------------------------------------------------------------------------------------\n");
    }
    
    //**************************************************************************************************************************
    public void viewDelivery() {

        System.out.println("deliveryManID\t\t\tName\t\t\tWorkingStatus\t\t\torderInCharge");
        System.out.println("====================================================================================================");
        for (int i = 1; i <= manList.getLength(); i++) {
            //  System.out.println("deliveryManID\t\t\tName\t\t\tWorkingStatus\t\t\torderInCharge");
            //  System.out.println("====================================================================================================");
            System.out.println(manList.getEntry(i).getManID() + "\t\t\t\t" + manList.getEntry(i).getName() + "\t\t\t" + manList.getEntry(i).getWorkingStatus() + "\t\t\t" + manList.getEntry(i).getOrderCharge());
        }
        System.out.println("");
        System.out.println("OrderID\t\t\tPhoneNum\t\tDeliveryAddress");
        System.out.println("====================================================================================================");
        for (int a = 1; a <= orderList.getNumberOfEntries(); a++) {
            //   System.out.println("");
            //  System.out.println("OrderID\t\t\tPhoneNum\t\t\t\t\tDeliveryAddress");
            //  System.out.println("====================================================================================================");
            System.out.println(orderList.getEntry(a).getOrderId() + "\t\t\t" + orderList.getEntry(a).getPhone() + "\t\t\t" + orderList.getEntry(a).getAddress());
        }
    }

    public void assignDeliver() {

        boolean countinue = true;

        while (countinue) {
            System.out.println("Enter orderID");
            String deliverOrder = sc.nextLine();
            System.out.println("Enter DelirymanID");
            int deliverDeliveryMan = sc.nextInt();
            sc.nextLine();
            //      if(manList.getEntry(i).getWorkingStatus().equals())
            boolean find = false;
            for (int a = 1; a <= orderList.getNumberOfEntries(); a++) {
                if (deliverOrder.equals(orderList.getEntry(a).getOrderId())) {
                    //   System.out.println("123");
                    for (int i = 1; i <= manList.getLength(); i++) {
                        if (deliverDeliveryMan == manList.getEntry(i).getManID()) {
                            //   System.out.println("456");
                            if (manList.getEntry(i).getMaxDelivery() == 3 ||manList.getEntry(i).getOrderCharge().contains(deliverOrder) || manList.getEntry(i).getOrderCharge().equals(deliverOrder)) {
                                if (manList.getEntry(i).getMaxDelivery() == 3) {
                                    System.out.println("Deliveryman can only accept maximum 3 deliverys !");
                                    find = true;
                                } else if (manList.getEntry(i).getWorkingStatus().equalsIgnoreCase("Unavailable")) {
                                    System.out.println("The delivery man working status is currently UNAVAILABLE !");
                                    find = true;
                                } else if (manList.getEntry(i).getOrderCharge().contains(deliverOrder)) {
                                    System.out.println("Current order has been assigned !");
                                } else {
                                    System.out.println("System error.");
                                }
                            } else {
                                manList.getEntry(i).setWorkingStatus("OnDelivery");
                                manList.getEntry(i).setOrderCharge(manList.getEntry(i).getOrderCharge() + "," + deliverOrder);
                                manList.getEntry(i).setMaxDelivery(manList.getEntry(i).getMaxDelivery() + 1);
                                System.out.println("Sccussfully assigned !");
                                find = true;
                            }
                        }
                    }
                }
            }
            if (!find) {
                System.out.println("Please key in the correct OrderID and delvieryManID !");
            }
            System.out.print("Do you want to continue?(Y/N):");
            String scan = sc.nextLine();
            if (Character.toUpperCase(scan.charAt(0)) == 'Y') {
                countinue = true;
            } else {
                countinue = false;
            }
        }

        /*public void initializeList() 
         {
         food.add(new Food("FM0004", "Chicken Chop", 9.40, "Food", "A", affiliate.getEntry(1)));
         food.add(new Food("FM0005", "Orange Juice", 10.50, "Beverage", "A", affiliate.getEntry(1)));
         food.add(new Food("FM0006", "Aglio Olio", 29.90, "Food", "A", affiliate.getEntry(2)));
         food.add(new Food("FM0007", "Steak", 9.40, "Set", "Food", affiliate.getEntry(2)));
         food.add(new Food("FM0008", "Mushroom soup", 10.50, "Soup", "A", affiliate.getEntry(2)));
         food.add(new Food("FM0009", "Fried rice", 29.90, "Food", "A", affiliate.getEntry(2)));
         }*/
    }

    public static void checkTime() {

        System.out.println("Enter your OrderID: ");
        boolean found = false;
        String orderID = sc.nextLine();
        for (int a = 1; a <= orderList.getNumberOfEntries() && !found; a++) {
            if (orderID.equals(orderList.getEntry(a).getOrderId())) {
                found = true;
                System.out.println("Your order time: " + orderList.getEntry(a).getOrderTime());

                switch (orderList.getEntry(a).getPostCode()) {

                    case 5400: {
                        System.out.println("Your delivery will be recieved in 15 mins !");
                        break;
                    }
                    case 5300: {
                        System.out.println("Your delivery will be recieved in 30 mins !");
                        break;
                    }
                    default: {
                        System.out.println("Your postcode is out of range or wrong postcode was given !");
                        break;
                    }

                }
            }
        }
        if (!found) {
            System.out.println("Please enter the correct OrderID !");
        }
    }
          
}
