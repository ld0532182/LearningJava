package com.javalessons.controlstatement;

public class WhileDo {
    public static void main(String[] args) {
        int finalBalance = 100_000;
        double currentBalance = 0;
        int payment = 1000;
        int years = 0;
        double interestRate = 0.1;

//      while (finalBalance > currentBalance) {
        do {
            currentBalance += payment;
            currentBalance += currentBalance * interestRate;
            years++;
            System.out.println("Year " + years + " - " + currentBalance);
        } while ((finalBalance > currentBalance) && (years < 15));

    }
}
