package com.javalessons.oop.interfaces;

public class InterfacesMain {
    public static void main(String[] args) {

        Priceable pizza = new Pizza(PizzaType.CHEESE, 1, 100);
        System.out.println("Sum of your order is " + pizza.calcFinalPrice() + "$.");

        Priceable phone = new CellPhone("nokia", "3310", 2, 300);
        System.out.println("Order price is " + phone.calcOrderPrice());

        Priceable fridge = new Fridge("LG", "T-2000", 1, 140, 30);

        Priceable[] priceables = {pizza, phone, fridge};
        for (Priceable p : priceables) {
            printDeliveryPrice(p);
        }

        Priceable.testMeth();

    }


    private static void printDeliveryPrice(Priceable pri) {
        System.out.println("Final price is " + pri.calcFinalPrice());
    }
}
