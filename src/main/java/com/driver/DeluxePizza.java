package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        if(isVeg)
            super.setBillInt(super.getBillInt()+ 150);
        else
            super.setBillInt(super.getBillInt()+ 200);
        // your code goes here
    }
}
