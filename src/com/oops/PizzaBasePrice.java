package com.oops;
import java.util.ArrayList;
import java.util.List;

class PizzaBasePrice {
    private String base;
    private List<String> toppings;

    public PizzaBasePrice(String base) {
        this.base = base;
        this.toppings = new ArrayList<>();
    }

    public void addTopping(String topping) {
        toppings.add(topping);
    }

    public double calculateCost() {
        double baseCost = 0.0;
        double toppingCost = 0.0;

        if (base.equalsIgnoreCase("Standard")) {
            baseCost = 50; 
        } else if (base.equalsIgnoreCase("Soft")) {
            baseCost = 60; 
        }

        for (String topping : toppings) {
            switch (topping.toLowerCase()) {
                case "tomato":
                    toppingCost += 150; 
                    break;
                case "corn":
                    toppingCost += 150; 
                    break;
                case "mushrooms":
                    toppingCost += 200;
                    break;
                default:
                    System.out.println("Unknown topping: " + topping);
            }
        }

        double totalCost = baseCost + toppingCost;
        return totalCost;
    }
}

