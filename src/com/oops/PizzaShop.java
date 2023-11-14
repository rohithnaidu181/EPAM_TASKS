package com.oops;

public class PizzaShop {
    public static void main(String[] args) {
        //  Vigneshwaran Ordered pizza with a Soft base and  toppings
        PizzaBasePrice pizza = new PizzaBasePrice("Soft");
        pizza.addTopping("Tomato");
        pizza.addTopping("Mushrooms");

        double cost = pizza.calculateCost();
        System.out.println("Vigneshwaran Ordered Pizaa Cost is: Rs "   + cost);
    }
}