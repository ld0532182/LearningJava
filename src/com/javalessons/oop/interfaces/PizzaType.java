package com.javalessons.oop.interfaces;

public enum PizzaType {

    PEPERONI("Peperoni"), BANANA("Banana"), CHEESE("Cheese"),
    PINEAPPLE("Pineapple");

    private String strPizzaName;

    PizzaType(String strPizzaName) {
        this.strPizzaName = strPizzaName;
    }

    public String getStrPizzaName() {
        return this.strPizzaName;
    }

}
