package com.javalessons.oop.interfaces;

public interface Priceable extends Deliverable, Orderable {

    default int calcFinalPrice() {
        return calcOrderPrice() + calcDeliveryPrice();
    }

    static void testMeth(){
        System.out.println("Boop");
    }

}
