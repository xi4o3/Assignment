/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuleA;

import java.util.Scanner;
import java.util.List;
import domain.Affiliate;
import java.util.ArrayList;
/**
 *
 * @author Wingent
 */
public class Register {
    Scanner scanner = new Scanner(System.in);
    private List<Affiliate> affiliate = new ArrayList<>();
    
    public static void main (String args[])
    {
        Register register = new Register();
        register.Menu(); 
    }
    
    public void Menu()
    {
        int selection;
        
        System.out.println("====");
        System.out.println("Menu");
        System.out.println("====");
        System.out.println("1.Register as Affiliate");
        System.out.println("2.View");
        System.out.println("3.Login");
        System.out.print("Please choose : ");
        selection = scanner.nextInt();
        System.out.print("\n\n");
        
        switch(selection)
        {
            case 1:
            {
                Register();
                Menu();
                break;
            }
            case 2:
            {
                ViewAffiliate();
                Menu();
                break;
            }
            case 3:
            {
                boolean login = Login(affiliate);
                break;
            }
            default:
            {
                
                Menu();
            }
        }
    }
    
    public void Register()
    {   
        System.out.println("======================");
        System.out.println("Affiliate Registration");
        System.out.println("======================");
        
        int totalAff = affiliate.size();
        
        String Res_id = String.format("R%04d", totalAff + 1);
        System.out.println("Affiliate ID: " + Res_id);
        System.out.println("**REMEMBER FOR FUTURE LOGIN PURPOSE**");
        scanner.nextLine();
        System.out.print("Enter Password for login purpose: ");
        String password  = scanner.nextLine();
        
        System.out.print("Enter Restaurant name: ");
        String Res_name  = scanner.nextLine();
        
        System.out.print("Enter Owner name: ");
        String Owner_name  = scanner.nextLine();
        
        System.out.print("Enter Contact No: ");
        String contact_no  = scanner.nextLine();
        
        System.out.print("Enter Restaurant Address: ");
        String address  = scanner.nextLine();
        
        System.out.print("\n");
        
        Affiliate newAff = new Affiliate(Res_id, password, Res_name, Owner_name, contact_no, address);
        affiliate.add(newAff);
        System.out.println("Successfully Registered.");
        System.out.print("\n");
    }
    
    public void ViewAffiliate()
    {
        for(int i = 0 ; i < affiliate.size() ; i++)
        {           
            System.out.print("Affiliates ");
            System.out.println(i+1);
            System.out.println("===========");
            System.out.println("Restaurant ID :" + affiliate.get(i).getRes_id());
            System.out.println("Restaurant Name :" + affiliate.get(i).getRes_name());
            System.out.println("Owner Name :" + affiliate.get(i).getOwner_name());
            System.out.println("Contact No :" + affiliate.get(i).getContact_no());
            System.out.println("Address :" + affiliate.get(i).getAddress());
            
        }
        
    }
    
    public boolean Login(List<Affiliate> affiliate) {
    int idcount = 0;
    boolean password = false;
    while (idcount == 0) {
            System.out.println("===============");
            System.out.println("Affiliate Login");
            System.out.println("===============");
            System.out.print("Restaurant ID: ");
            scanner.nextLine();
            String id = scanner.nextLine().toUpperCase();
            for (int i = 0; i < affiliate.size(); i++) 
            {
                if (id.equals(affiliate.get(i).getRes_id())) 
                {
                    while (!password) 
                    {
                        System.out.print("Password: ");
                        String pass = scanner.nextLine();
                        idcount = 1;
                        if (pass.equals(affiliate.get(i).getPassword())) 
                        {
                            password = true;
                            System.out.println("Successfully Login");
                            //RestaurantMenu(restaurant);
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
}


