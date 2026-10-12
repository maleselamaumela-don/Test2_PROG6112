//Subclass:
package com.mycompany.st10515042_prog6112_test2;

public class BeverageSales extends Beverages{//start of class

    //Constructor:
    public BeverageSales(String Beveragetype, String City, int TotalSales) {
        super(Beveragetype, City, TotalSales);
    }

    //Method that will print out the required variables:
    public void printReport(){//start of method
        System.out.println("NUMBER 1 COFFEE HUT REPORT");
        System.out.println("**************************************");
        System.out.println("BEVERAGE TYPE: " + getBeverageType());
        System.out.println("CITY: " + getCity());
        System.out.println("TOTAL SALES: " + getTotalSales());
    }//end of method
    
}//end of class
