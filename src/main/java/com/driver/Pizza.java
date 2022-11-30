package com.driver;

public class Pizza {

    private int price;
    private boolean isVeg;
//    private int bill;
    private Boolean isCheeseAdded;
    private boolean isToppingsAdded;
    private boolean isTakeaway;

    public Pizza(Boolean isVeg){
        this.isCheeseAdded = false;
        this.isToppingsAdded = false;
        this.isTakeaway = false;
        this.isVeg = isVeg;

        // your code goes here
        if(isVeg)
            this.price= 300;
        else
            this.price = 400;
    }

    public int getPrice(){
//        if(isCheeseAdded) return bill+ price;
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isCheeseAdded){
            price += 80;
            isCheeseAdded = true;
        }
    }
    public void addExtraToppings(){
        // your code goes here
        if(!isToppingsAdded){
            if(isVeg) price += 70;
            else price += 120;
            isToppingsAdded = true;
        }
    }
    public void addTakeaway(){
        // your code goes here
        if(!isTakeaway) {
            price += 20;
            isTakeaway = true;
        }
    }

    public String getBill(){
        // your code goes here
        System.out.println("Base Price Of The Pizza: "+ (isVeg? 300:400));

        if(isCheeseAdded) System.out.println("Extra Cheese Added: 80");

        if(isToppingsAdded) System.out.println("Extra Toppings Added: "+ (isVeg? 70:120));

        if(isTakeaway) System.out.println("Paperbag Added: 20");

        return "Total Price: " + getPrice();
    }
}
