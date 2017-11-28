/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuleA;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import domain.*;

/**
 *
 * @author Wingent
 */
public class ModuleAFunction 
{
    Scanner scanner = new Scanner(System.in);
    private List<Affiliate> affiliate = new ArrayList<>();
    private List<Food> food = new ArrayList<>();
    
    public ModuleAFunction() 
    {
    }
         
    public boolean Login(List<Affiliate> affiliate) 
    {
        int idcount = 0;
        boolean password = false;
        while (idcount == 0) {
            System.out.println("===============");
            System.out.println("Affiliate Login");
            System.out.println("===============");
            System.out.print("Restaurant ID: ");
            String id = scanner.nextLine().toUpperCase();
            for (int i=0 ; i<affiliate.size() ; i++) 
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
                            Menu(affiliate.get(i));
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

    public void Menu(Affiliate A) {
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
                addFood(A);
                break;
            }
            case 2: 
            {
                updateFood(A);
                scanner.nextLine();
                break;
            }
            case 3: 
            {
                deleteFood(A);
                break;
            }
            case 0: 
            {
                System.out.println("Successfully Logout");
                
                boolean login;
                do{
                login = Login(affiliate);
                }while(login == false);
            }
            default: 
            {
                System.out.println("Please select again...");
                Menu(A);
                break;
            }
        }
    }

    public void addFood(Affiliate A){
        System.out.println("========");
        System.out.println("New Food");
        System.out.println("========");
        
        int totalFood = food.size();
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
        
        Food f = new Food(foodID, foodName, Price, Category, foodAVA, A);
        food.add(f);
        
        System.out.println("New Food Added !");
        System.out.println("FoodID: " + foodID);
        System.out.println("Food Name: " + foodName);
        System.out.println("Price: RM" + Price);
        System.out.println("Category: " + Category);
        System.out.println("Availability: YES");
        
        Menu(A);
    }

    public void FoodList(Affiliate A)
    {
        for(int i=0 ; i<food.size() ; i++)
        {
            if(A.equals(food.get(i).getRestaurant())&&food.get(i).getFoodAVA()=="YES"||food.get(i).getFoodAVA()=="NO")
            {
                System.out.println("FoodID: "+food.get(i).getFoodID()+" Food Name: "+food.get(i).getFoodName()+" Food Price: RM" +food.get(i).getPrice()+" Food Availability: "+food.get(i).getFoodAVA());   
            }
        }
    }
    
    public void updateFood(Affiliate A)
    {
        int id = 99;
        System.out.println("==================");
        System.out.println("Update Item Detail");
        System.out.println("==================");
        System.out.println("Welcome ! " + A.getRes_name());
        FoodList(A);
        System.out.print("Enter FoodID: ");
        String FoodID = scanner.nextLine().toUpperCase();
        
        int i=0; 
        while(i < food.size())
        {
            if(FoodID.equals(food.get(i).getFoodID())&& A.equals(food.get(i).getRestaurant()))
            {        
                System.out.println("FoodID: " + food.get(i).getFoodID());
                System.out.println("Food Name: " + food.get(i).getFoodName());
                System.out.println("Price: RM" + food.get(i).getPrice());
                System.out.println("Food Type: " + food.get(i).getCategory());
                System.out.println("Food Availability: " + food.get(i).getFoodAVA());
                
                Food F = food.get(i);
                
                id = 0; 
                updateFoodDetail(A,F);
                
                   
            }
            i++;
        }
            if(id == 99)
            {
                System.out.println("FoodID not found...");
                System.out.println("Please enter again !");
                updateFood(A);
            }      
    }
    
    public void updateFoodDetail(Affiliate A, Food F)
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
                Menu(A);
                break;
            }
            case 2:
            {
                System.out.println("Food Price: RM" + F.getPrice());
                System.out.print("New Food Price: RM");
                double NewPrice = scanner.nextDouble();
                F.setPrice(NewPrice);
                System.out.println("Update successfully!");
                Menu(A);
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
                Menu(A);
                break;
            }
            case 4:
            {
                Menu(A);
                break;
            }
            default:
            {
                System.out.println("Please select again...");
            }
        }
    }
    
    public void deleteFood(Affiliate A){
        int d=0;
        System.out.println("================");
        System.out.println("Delete Food Menu");
        System.out.println("================");
        FoodList(A);
        System.out.print("Enter FoodID to delete: ");
        String foodID = scanner.nextLine().toUpperCase();
        
        for(int i =0 ; i<food.size() ; i++)
        {
                if(foodID.equals(food.get(i).getFoodID())&& A.equals(food.get(i).getRestaurant()))
                {
                    System.out.println("Confirm to delete?");
                    System.out.print("Enter your selection (y/n):");
                    char selection = Character.toUpperCase(scanner.nextLine().charAt(0));
                    switch(selection)
                    {
                        case 'Y':
                        {
                            System.out.println("Delete successfully!");
                            food.get(i).setFoodAVA("Deleted");
                            d=1;
                            Menu(A);
                            break;
                        }
                        case 'N':
                        {
                            d=1;
                            Menu(A);
                            break;
                        }
                        default:
                        {
                            d=0;
                            System.out.println("Please enter again...");
                            Menu(A);
                            break;
                        }
                    }
                }
            }
            if(d==0)
            {
                System.out.println("Please enter again...");
                deleteFood(A);
            }
    }
    public void setAffiliate(List<Affiliate> affiliate) {
        this.affiliate = affiliate;
    }
    
    public void setFood(List<Food> food){
        this.food = food;
    }
}


