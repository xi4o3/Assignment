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
import ModuleA.ModuleAFunction;
import adt.DMSortedLinkedList;
import adt.DMSortedListInterface;
import entity.Affiliate;
import entity.Food;
import java.util.ArrayList;
import entity.order;
import entity.HR;

/**
 *
 * @author User
 */
public class Assignment {

    public static DMSortedListInterface<DeliveryMan> manList = new DMSortedLinkedList<>();
//    public static ListInterface<DeliveryMan> manList = new List<>();
    public static ListInterface<HR> HRList = new List<>();
    public static ListInterface<order> orderL = new List<>();
    
    //***************************module A***********************************
    public static ListInterface<Affiliate> affiliate = new List<>();
    public static ListInterface<Food> food = new List<>();
    private ModuleAFunction A = new ModuleAFunction();
    //**************************************************************
    static staffView staffview = new staffView();
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
        
        DeliveryMan deliMan = new DeliveryMan(10, "Miw", "Miw12345", "012-3456789", "Jalan Miw", "Employed", null, "Unavailable", "None", 0, 1, 4.5);
        DeliveryMan deliMan1 = new DeliveryMan(20, "Albert", "1234", "012-8723124", "Jalan Pisang", "Employed", null, "Unavailable", "None", 0, 0, 4.0);
        DeliveryMan deliMan2 = new DeliveryMan(30, "Thomas", "1234", "012-8132234", "Jalan Rambutan", "Employed", null, "Unavailable", "None", 0, 3, 5.0);
        manList.add(deliMan);
        manList.add(deliMan1);
        manList.add(deliMan2);

        Affiliate aff = new Affiliate("R0000", "Tan", "tan", "123", "123", "aaa");
        affiliate.add(aff);

        food.add(new Food("F0001", "Wingent Meal", 100, "Food", "A", affiliate.getEntry(1)));
        food.add(new Food("F0002", "Happy Meal", 89, "Food", "Deleted", affiliate.getEntry(1)));
        food.add(new Food("F0003", "Pork Chop", 100, "Food", "A", affiliate.getEntry(1)));
        food.add(new Food("F0004", "Fries Rice", 89, "Food", "A", affiliate.getEntry(1)));
        food.add(new Food("F0005", "Chicken Chop", 9.40, "Food", "A", affiliate.getEntry(1)));
        food.add(new Food("F0006", "Fish&Chip", 9.40, "Food", "A", affiliate.getEntry(1)));

        order order = new order("P0001", "Abu", 01234567, "Jalan Abu", 5400, "Hamplang Chop", 20, null, "Pending", deliMan);
        order order1 = new order("P0002", "Ata", 01234567, "Jalan Duck", 5300, "Banana Chop", 20, null, "Completed", deliMan1);
        order order2 = new order("P0003", "Ali", 01234567, "Jalan Diao", 5300, "Banana Chop", 20, null, "Pending", deliMan2);
        order order3 = new order("P0004", "Agi", 01234567, "Jalan Halo", 5400, "Banana Chop", 20, null, "Pending", deliMan2);
        order order4 = new order("P0005", "Ahi", 01234567, "Jalan Hiao", 5300, "Banana Chop", 20, null, "Pending", deliMan2);
        orderL.add(order);
        orderL.add(order1);
        orderL.add(order2);
        orderL.add(order3);
        orderL.add(order4);

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
                        login = A.Login(affiliate, food);
                    } while (login == false);
                    food = A.getFood();
                    break;
                }
                case "3": {
//                    verifyHRLogin();
                    displayMenu();
                    break;
                }
                case "4": {
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
                    //cusRegister();
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
        System.out.println("5. Assign job for delivery man");
        System.out.println("6. View pending deliveries");
        System.out.println("7. -- Log out --");
        System.out.println("====================================\n");
        System.out.print("\nPlease select your choice: ");
        choice = scanner.nextInt();
        while (choice < 0 || choice > 7) {
            System.out.print("Please enter number 1-7: ");
            choice = scanner.nextInt();
        }

        switch (choice) {
            case 1:

                addDeliveryMan();
                displayMenu();

                break;
            case 2:
                System.out.println("\t       Name\t\tContact No.\tAddress\tStatus\t Total Pending Deliveries");
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
                viewDelivery();
                assignDeliver();
                break;
            case 6:
                viewPendingDeliveries();
                break;
            case 7:
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
        UserStory1 us1 = new UserStory1(affiliate, food);
        switch (cusMenu) {
            case "1": {
                us1.orderMenu();
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

    public void viewPendingDeliveries() {
        Scanner scanner = new Scanner(System.in);
        int num = 1;
        String option = "";
        do {
            num = 1;
            for (int i = 1; i <= manList.getLength(); i++) {
                int onHold = manList.getEntry(i).getDeliveryAssigned();
                String name = manList.getEntry(i).getName();
                if (onHold > 0) {
                    System.out.println(num + ". ( ID: " + manList.getEntry(i).getManID() + " ) " + name + "  [Total Pending Deliveries: " + manList.getEntry(i).getDeliveryAssigned() + " ]");
                    num++;
                }
            }
            System.out.print("Enter the delivery man ID to view more details: ");

            int selection = scanner.nextInt();
            String name = "";
            for (int i = 1; i <= manList.getLength(); i++) {
                if (selection == (manList.getEntry(i).getManID())) {
                    name = manList.getEntry(i).getName();
                }
            }

            for (int i = 1; i <= orderL.getNumberOfEntries(); i++) {
                order order = orderL.getEntry(i);
                if (name.equals(orderL.getEntry(i).getDeliveryMan().getName())) {
                    String st = String.format("%10s\t%-10s\t%-10s\t%-10s\t%-10s\t%-10s\t", order.getOrderId(), order.getName(), order.getAddress(), order.getPostCode(), order.getOrderTime(), order.getStatus());
                    System.out.println(st);

                }

            }
            System.out.print("Do you wish to continue?(y/n): ");
            Scanner scanner1 = new Scanner(System.in);
            option = scanner1.nextLine();

        } while (option.equals("y"));
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
    /*public void cusRegister(){
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
        
     System.out.print("Enter Restaurant Address: ");
     address  = cus.nextLine();
        
     System.out.println("Enter PostCode:");
     posCod = Integer.parseInt(cus.nextLine());
        
     custemp = new customer(cus_id,password,cus_name,contact_no,address,posCod);
     customer.add(custemp);
     System.out.println("Register Successful!!");
     }*/

//******************************************************************************************************************************    
//ModuleA
    public void Register() {
        System.out.println("======================");
        System.out.println("Affiliate Registration");
        System.out.println("======================");

        int totalAff = affiliate.getNumberOfEntries();

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
        affiliate.add(newAff);
        System.out.println("Successfully Registered.");
        System.out.print("\n");

    }

    public void ViewAffiliate() {
        for (int i = 1; i <= affiliate.getNumberOfEntries(); i++) {
            System.out.print("Affiliates ");
            System.out.println(i + 1);
            System.out.println("===========");
            System.out.println("Restaurant ID :" + affiliate.getEntry(i).getRes_id());
            System.out.println("Restaurant Name :" + affiliate.getEntry(i).getRes_name());
            System.out.println("Owner Name :" + affiliate.getEntry(i).getOwner_name());
            System.out.println("Contact No :" + affiliate.getEntry(i).getContact_no());
            System.out.println("Address :" + affiliate.getEntry(i).getAddress());

        }

    }

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
