//Abstract class:
package com.mycompany.st10515042_prog6112_test2;

public abstract class Beverages implements IBeverage{//start of class
    
    //Variables required:
    String BeverageType;
    String City;
    int TotalSales;
    
    //constructor:
    public Beverages(String Beveragetype, String City, int TotalSales) {
        this.BeverageType = Beveragetype;
        this.City = City;
        this.TotalSales = TotalSales;
    }
    
    //Get method to get the required variables:
    @Override
    public String getBeverageType() {
        return BeverageType;
    }

    @Override
    public String getCity() {
        return City;
    }

    @Override
    public int getTotalSales() {
        return TotalSales;
    }
    
}//end of class
