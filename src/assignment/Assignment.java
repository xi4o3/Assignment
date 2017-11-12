/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;


import java.util.Scanner;

/**
 *
 * @author MSI-
 */
public class Assignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       displayMenu();
            
    }
    
    public static void addDeliveryMan(){
        ListInterface<DeliveryMan> manList = new List<>();
        DeliveryMan deliMan = new DeliveryMan(23,"Ali","012-3456789","Jalan Pisang","Employed");
        manList.add(deliMan);
      
        String ans="";
        do{
            Scanner scanner = new Scanner(System.in);
            DeliveryMan deliMan1 = new DeliveryMan();
            deliMan1.setManID(DeliveryMan.getNextManID());
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            deliMan1.setName(name);
            System.out.print("Enter contact number: ");
            String hpNum = scanner.nextLine();
            deliMan1.setContactNum(hpNum);
            System.out.print("Enter address: ");
            String adds = scanner.nextLine();
            deliMan1.setAdds(adds);
            deliMan1.setStatus("Employed");
            
            manList.add(deliMan1);
           System.out.print("Do you want to continue(Y/N)?: ");
            ans=scanner.next();
        }while(ans.equals("y"));
        
        System.out.println("Delivery Man List");
        System.out.println("\t       Name\t\t  Contact Number\t     Address\t\tStatus");

//        System.out.println(String.format(" %-20s %-20n %-20s %-20n\n","Name", "Contact Number","Address","Status"));
      
        System.out.println(manList);
    }
    
    public static void displayMenu() {
    Scanner scanner = new Scanner(System.in);
    int choice;
   
    System.out.println("Main Menu");
        System.out.println("-------------------------\n");
        System.out.println("1 - Add new delivery man");
        System.out.println("2 - View delivery man");
//        System.out.println("3 - Decrypt a number");
        System.out.println("4 - Quit");
        System.out.print("\nPlease select your choice: ");
        choice = scanner.nextInt();
        while(choice < 0 || choice > 4){
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
            System.exit(0);
            break;
        default:
            
    }

 
 }
    
//    public static void clearScreen() {  
//    System.out.print("\033[H\033[2J");  
//    System.out.flush();  
//   }
//  

}
   

 

    

