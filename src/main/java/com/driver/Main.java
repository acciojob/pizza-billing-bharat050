package com.driver;

public class Main {
  public static void main(String[] args) {

    Pizza p = new Pizza(false);
    p.addExtraCheese();
    System.out.println(p.getPrice());
    p.addExtraToppings();
    System.out.println(p.getPrice());
    p.addTakeaway();
    System.out.println(p.getBill());

    DeluxePizza dp = new DeluxePizza(false);
    System.out.println(dp.getPrice());
    dp.addTakeaway();
    dp.addExtraCheese();
    dp.addTakeaway();
    System.out.println(dp.getBill());
  }
}