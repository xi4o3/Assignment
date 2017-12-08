/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuleA;

import assignment.*;
import java.util.Scanner;
//import java.util.List;
//import java.util.ArrayList;
import domain.*;

/**
 *
 * @author Wingent
 */
public class ModuleAFunction 
{
    Scanner scanner = new Scanner(System.in);
    public ListInterface<Affiliate> affiliate = new List<>();
    public static ListInterface<Food> food = new List<>();
    
    private Affiliate curAffiliate;
    private int idIndex;
    public ModuleAFunction() 
    {
    }
         
    public boolean Login(ListInterface<Affiliate> getaffiliate,ListInterface<Food> oldFood) 
    {
        this.affiliate=getaffiliate;
        this.food=oldFood;
        int idcount = 0;
        boolean password = false;
        while (idcount == 0) {
            System.out.println("===============");
            System.out.println("Affiliate Login");
            System.out.println("===============");
            System.out.print("Restaurant ID: ");
            String id = scanner.nextLine();
            for (int i= 1; i<=affiliate.getNumberOfEntries(); i++) 
            {
                if (id.equals(affiliate.getEntry(i).getRes_id())) 
                {
                    while (!password) 
                    {
                        System.out.print("Password: ");
                        String pass = scanner.nextLine();
                        idcount = 1;
                        if (pass.equals(affiliate.getEntry(i).getPassword())) 
                        {
                            password = true;
                            System.out.println("Successfully Login");
                            curAffiliate=affiliate.getEntry(i);
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
        
        int totalFood = food.getNumberOfEntries();
        String foodID = String.format("F%04d", totalFood + 1);
        System.out.println("FoodID: " + foodID);
        System.out.print("Food Name: ");
        String foodName = scanner.nextLine();
        System.out.print("Price: ");
        Double Price = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Category: ");
        String Category = scanner.nextLine();
        String foodAVA = "YES";
        
        Food f = new Food(foodID, foodName, Price, Category, foodAVA, curAffiliate);
        food.add(f);
        
        System.out.println("New Food Added !");
        System.out.println("FoodID: " + foodID);
        System.out.println("Food Name: " + foodName);
        System.out.println("Price: RM" + Price);
        System.out.println("Category: " + Category);
        System.out.println("Availability: YES");
        
        Menu();
    }

    public void FoodList()
    {
        for(int i=1; i<=food.getNumberOfEntries(); i++)
        {
            if(affiliate.equals(food.getEntry(i).getRestaurant())&&food.getEntry(i).getFoodAVA()=="YES"||food.getEntry(i).getFoodAVA()=="NO")
            {
                System.out.println("FoodID: "+food.getEntry(i).getFoodID()+" Food Name: "+food.getEntry(i).getFoodName()+" Food Price: RM" +food.getEntry(i).getPrice()+" Food Availability: "+food.getEntry(i).getFoodAVA());   
            }
        }
    }
    
    public void updateFood()
    {
        int id = 99;
        System.out.println("==================");
        System.out.println("Update Item Detail");
        System.out.println("==================");
        System.out.println("Welcome ! " + curAffiliate.getRes_name());
        FoodList();
        System.out.print("Enter FoodID: ");
        String FoodID = scanner.nextLine().toUpperCase();
        
        int i=1; 
        while(i <= food.getNumberOfEntries())
        {
            if(FoodID.equals(food.getEntry(i).getFoodID())&& curAffiliate.equals(food.getEntry(i).getRestaurant()))
            {        
                System.out.println("FoodID: " + food.getEntry(i).getFoodID());
                System.out.println("Food Name: " + food.getEntry(i).getFoodName());
                System.out.println("Price: RM" + food.getEntry(i).getPrice());
                System.out.println("Food Type: " + food.getEntry(i).getCategory());
                System.out.println("Food Availability: " + food.getEntry(i).getFoodAVA());
                
                Food F = food.getEntry(i);
                
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
    
    public void updateFoodDetail(Affiliate A,Food F)
    {
        System.out.println("Select any detail to update...");
        System.out.println("1.Food Name");
        System.out.println("2.Food Price");
        System.out.println("3.Food Availability");
        System.out.println("4.Back");
        System.out.print("Enter your selection: ");
        int choices =scanner.nextInt();
        
        switch(choices)
        {
            case 1:
            {
                System.out.println("Food Name: " + F.getFoodName());
                System.out.print("New Food Name: ");
                scanner.nextLine();
                String NewName = scanner.nextLine();
                F.setFoodName(NewName);
                System.out.println("Update successfully!");
                Menu();
                break;
            }
            case 2:
            {
                System.out.println("Food Price: RM" + F.getPrice());
                System.out.print("New Food Price: RM");
                double NewPrice = scanner.nextDouble();
                F.setPrice(NewPrice);
                System.out.println("Update successfully!");
                Menu();
                break;
            }
            case 3:
            {
                System.out.println("Food Availability: "+ F.getFoodAVA()); 
                System.out.print("Latest Availability: ");
                scanner.nextLine();
                String status = scanner.nextLine();
                status = status.toUpperCase();
                F.setFoodAVA(status);
                System.out.println("Update successfully!");
                Menu();
                break;
            }
            case 4:
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
    
    public void deleteFood(){
        int d=0;
        System.out.println("================");
        System.out.println("Delete Food Menu");
        System.out.println("================");
        FoodList();
        System.out.print("Enter FoodID to delete: ");
        String foodID = scanner.nextLine().toUpperCase();
        
        for(int i =1 ; i<=food.getNumberOfEntries(); i++)
        {
                if(foodID.equals(food.getEntry(i).getFoodID())&& affiliate.getEntry(idIndex).equals(food.getEntry(i).getRestaurant()))
                {
                    System.out.println("Confirm to delete?");
                    System.out.print("Enter your selection (y/n):");
                    char selection = Character.toUpperCase(scanner.nextLine().charAt(0));
                    switch(selection)
                    {
                        case 'Y':
                        {
                            System.out.println("Delete successfully!");
                            food.getEntry(i).setFoodAVA("Deleted");
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
    public void setAffiliate(ListInterface<Affiliate> affiliate) {
        this.affiliate = affiliate;
    }
    
    public void setFood(ListInterface<Food> food){
        this.food = food;
    }
    
    public ListInterface<Food> getFood(){
        return food;
    }
    
}


