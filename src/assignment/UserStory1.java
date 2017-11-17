package assignment;


import java.util.*;
import java.util.List;
import java.util.ArrayList;

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
    public void orderMenu(){
       String[] resaArray={"1. Chicken Chop-RM10.90","2. Fish & Chip-RM10.90","3. Lamb Chop-RM18.90","4. Steak-RM18.90"};
       String[] resbArray={"1. 1/4 Chicken-RM17.90","2. 1/2 Chicken-RM27.90","3. Whole Chicken-RM43.90","4. 5 Chicken Wings-RM26.90"};
       String[] rescArray={"1. 2pc Combo-RM11.90","2. 3pc Combo-RM14.90","3. Zinger set-RM13.90","4. 9pc Family Combo-Rm49.90"};
       String[] resdArray={"1. Mc Chicken set-RM8.90","2. Double Cheeseburger set-RM10.90","3. 2pc Ayam Goreng set-RM12.90","4. Fish burger set-Rm14.90"};
       
       Scanner user = new Scanner(System.in);
       int mn;
       
       do{
		mainRestaurant();

		System.out.println("Enter your option.(1/2/3/4/5)>");
              mn = user.nextInt();
              if(mn==1){
			int ah;
			mainBlue();
                     List<String> strList = Arrays.asList(resaArray);    
                     for (String a : strList) 
                    { 
                        System.out.println(a); 
                    } 
                     System.out.println("5. Back");
			System.out.println("Enter your option.(1/2/3/4/5)>");
				ah = user.nextInt();
                     if(ah==5){
                         mainRestaurant();
                     }
              }else if(mn==2){
                  int ah;
			mainBlue();
                     List<String> strList = Arrays.asList(resbArray);    
                     for (String a : strList) 
                    { 
                        System.out.println(a); 
                    } 
                     System.out.println("5. Back");
			System.out.println("Enter your option.(1/2/3/4/5)>");
				ah = user.nextInt();
                     if(ah==5){
                         mainRestaurant();
                     }
              }else if(mn==3){
                  int ah;
			mainBlue();
                     List<String> strList = Arrays.asList(rescArray);    
                     for (String a : strList) 
                    { 
                        System.out.println(a); 
                    } 
                     System.out.println("5. Back");
			System.out.println("Enter your option.(1/2/3/4/5)>");
				ah = user.nextInt();
                     if(ah==5){
                         mainRestaurant();
                     }
              }else if(mn==4){
                    int ah;
			mainBlue();
                     List<String> strList = Arrays.asList(resdArray);    
                     for (String a : strList) 
                    { 
                        System.out.println(a); 
                    } 
                     System.out.println("5. Back");
			System.out.println("Enter your option.(1/2/3/4/5)>");
				ah = user.nextInt();
                     if(ah==5){
                         mainRestaurant();
                     }
              }else if(mn==5){
                  
              }else if(mn!=1||mn!=2||mn!=3||mn!=4||mn!=5){
                  System.out.println("Please key in 1, 2, 3, 4 or 5!!");
                  mainRestaurant();
                  System.out.println("Enter your option.(1/2/3/4/5)>");
                  mn = user.nextInt();
              }
       }while(mn==1||mn==2||mn==3||mn==4);
       
    }
    public static void mainRestaurant(){
        System.out.println("====================");
        System.out.println("1. Blue Ribbon Restaurant");
        System.out.println("2. Nando's");
	 System.out.println("3. KFC");
	 System.out.println("4. Mc Donald");
	 System.out.println("5. Back");
    }
    
    public static void mainBlue(){
        System.out.println("====================");
    }
    
   
}
