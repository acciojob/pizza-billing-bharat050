package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
//    private String bill;
    private int billInt=0;

    public void setBillInt(int billInt) {
        this.billInt = billInt;
    }

    public int getBillInt() {
        return billInt;
    }

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;

        // your code goes here
        if(isVeg)
            this.price= 300;
        else
            this.price = 400;
        billInt += price;
    }

    public int getPrice(){
        return this.price;
    }
    private int flagC = 0;
    public void addExtraCheese(){
        // your code goes here
        if(flagC==0){
            billInt += 80;
            flagC = 1;
        }
    }

    private int flagT = 0;
    public void addExtraToppings(){
        // your code goes here
        if(flagT==0){
            if(isVeg) billInt += 70;
            else billInt += 120;
            flagT=1;
        }
    }
    private int flagA = 0;
    public void addTakeaway(){
        // your code goes here
        if(flagA ==0) {
            billInt += 20;
            flagA =1;
        }
    }

    public String getBill(){
        // your code goes here
        return Integer.toString(billInt);
    }
}
