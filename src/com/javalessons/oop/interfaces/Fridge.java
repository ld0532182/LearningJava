package com.javalessons.oop.interfaces;

public class Fridge extends Electronics implements Priceable {

    private int weight;

    public Fridge(String make, String model, int quantity, int price, int weight) {
        super(make, model, quantity, price);
        this.weight = weight;
    }

    @Override
    public int calcDeliveryPrice() {
        if (weight < 20) {
            return 0;
        } else {
            return weight * 5;
        }
    }
}
