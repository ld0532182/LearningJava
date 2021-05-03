package com.javalessons.oop.interfaces;

public class CellPhone extends Electronics implements Priceable {

    public CellPhone(String make, String model, int quantity, int price) {
        super(make, model, quantity, price);
    }


    @Override
    public int calcDeliveryPrice() {
        if (getPrice() >= 300) {
            return 0;
        } else {
            return 20;
        }
    }
}