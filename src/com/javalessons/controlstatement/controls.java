package com.javalessons.controlstatement;

public class controls {

    public static void main(String[] args) {

        int i = 10;
        {
            int k = 15;
            System.out.println("I = " + i);
            System.out.println("K = " + k);
        }
        int testScore = 74;
        System.out.print("You've got ");
        if (testScore >= 90) {
            System.out.println("an excellent score");
        } else if (testScore >= 75) {
            System.out.println("a good score");
        } else if (testScore < 75) {
            System.out.println("a bad score");
        }

    }

}
