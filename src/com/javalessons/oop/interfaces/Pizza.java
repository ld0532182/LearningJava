package com.javalessons.oop.interfaces;

public class Pizza implements Priceable {

    private PizzaType pizzaType;
    private int quantity;
    private int price;

    public Pizza(PizzaType pizzaType, int quantity, int price) {
        this.pizzaType = pizzaType;
        this.quantity = quantity;
        this.price = price;
    }

    public PizzaType getPizzaType() {
        return pizzaType;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return price;
    }


    @Override
    public int calcDeliveryPrice() {
        if (pizzaType == PizzaType.PEPERONI || quantity > 1) {
            return 0;
        } else {
            return 300;
        }
    }

    @Override
    public int calcOrderPrice() {
        return this.quantity * this.price;
    }

}
