package com.mycompany.st10515042_prog6112_test1;

import java.util.Scanner;

public class St10515042_PROG6112_Test1 {//start of class

    public static void main(String[] args) {//start of main method
        
        //populating the arrays:
        String Cities[]={"CAPE TOWN","PORT ELIZABETH","PRETORIA"};//single arrays
        String Beverages[]={"COFFEE","TEA","BOBA TEA"};//single arrays
        int MonthlySales[][]=new int [3][3];//2D-arrays
        
        //Scanner: that will allow users to enter data
        Scanner input = new Scanner(System.in);
        
        //HEADER:
        System.out.println("NUMBER 1 COFFEE HUT APPLICATION");
        System.out.println("--------------------------------------------------------------------------");
        
        //NESTED LOOP: instructing the user to enter data
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter the number of " + Beverages[j]  + " sales for " + Cities[i] + ": " );
                MonthlySales[i][j]=input.nextInt();
                System.out.println("");
            }
        }
        
        //HEADER:
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("NUMBER 1 COFFEE HUT REPORT");
        System.out.println("--------------------------------------------------------------------------");
        
        //Loop that will display the Beverages[]
        for (int i = 0; i < Beverages.length; i++) {
            System.out.print(" " + " \t " + Beverages[i]);
        }
        System.out.println("");
        
        //NESTED LOOP: that will displauy the Cities[] AND MonthlySales[][]
        for (int i = 0; i < 3; i++) {
            System.out.print("" + Cities[i] + "\t");
            
            for (int j = 0; j < 3; j++) { 
                int total = 0;
                System.out.print(" " + "\t" + MonthlySales[i][j] + ".00");
            }
            System.out.println("");
        }
        System.out.println("");
        
        //HEADER:
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("PRODUCT SALES TOTALS FOR EACH CITY");
        System.out.println("--------------------------------------------------------------------------");
        
        //NESTED LOOP: that will display the totals for all the Cities[]
        for (int i = 0; i < 3; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += MonthlySales[i][j];
                int current = MonthlySales[i][j];
            }
            System.out.println(Cities[i] + " \t" + "R" + total +  ".00");
        }
        System.out.println("");
        
        //NESTED LOOP: that will display the total sales for the Cities[]
        int total = 0;
        for (int i = 0; i < 3; i++) {
        
            for (int j = 0; j < 3; j++) {  
                total += MonthlySales[i][j];
                int current = MonthlySales[i][j];
                
                //selection statement:
                if(total>current){
                    current=total;
                }
            } 
        }
        System.out.print("TOTAL SALES FOR CITIES: " + " R"+ total + ".00");
    }//end of main method
}//end of class
