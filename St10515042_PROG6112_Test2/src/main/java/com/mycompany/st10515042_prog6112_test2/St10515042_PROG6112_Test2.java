package com.mycompany.st10515042_prog6112_test2;

import java.util.Scanner;

public class St10515042_PROG6112_Test2 {//start of class

    public static void main(String[] args) {//start of main method
        
        //Scanner: so that the user can be able to enter data
        Scanner input = new Scanner(System.in);
        
        System.out.println("Select the beverage type " + "\n"
                + "1) COFFEE" + "\n"
                + "2) TEA" + "\n"
                + "3) BOBA");
                String BeverageType = input.nextLine();
                
                System.out.println(BeverageType);
                
        System.out.println("Enter the city: ");
        input.nextLine();
        String City= input.nextLine();
        
        System.out.println("Enter the total sales of " + BeverageType + " beverages in " + City + ":");
        int TotalSales=input.nextInt();
        
        //Instantiating the BeverageSales class.
        BeverageSales sales = new BeverageSales(BeverageType, City, TotalSales);
        sales.printReport();
        
    
//        int choice = 3;
//        switch(choice){
//            case 1:
//                System.out.println("Select the beverage type "
//                + "1) COFFEE"
//                + "2) TEA"
//                + "3) BOBA");
//                int BeverageType = input.nextInt();
//        break;
//        
//            case 2:
//                System.out.println("Enter the city: ");
//                String City = input.nextLine();
//                
//                System.out.println("Enter the total sales of " + ""+ " beverages in " + ""+ ":");
//                int TotalSales=input.nextInt();
//                
//                break;
//                
//            case 3:
////                BeverageSales sales = new BeverageSales(BeverageType, City, TotalSales);
////                sales.printReport();
//        }
 
    }//end of main method
}//end of class
