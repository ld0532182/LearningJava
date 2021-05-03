package com.javalessons.oop.innerclasses;

public class InnerClassesMain {
    public static void main(String[] args) {

        CellPhone phone = new CellPhone("Nokia", "3310");
        phone.turnOn();
        Display display = phone.getDisplay();
//For inner  Display.Pixel pixel = display.new Pixel(10000, 9, Display.Color.BLACK);
//For nested Display.Pixel pixel = new Display.Pixel(100, 200, Display.Color.GREEN);
        phone.call("1234567890");
    }
}
