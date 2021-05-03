package com.javalessons.controlstatement;

public class ForLoop {
    public static void main(String[] args) {
        int limit = 10;
        int factorial = 1;
        for (int i = 1; i <= limit; i++) {
            factorial *= i;
            System.out.print(factorial + " ");
        }
        System.out.println('\n');
        int i = 10;
        while (i>=1) {
            System.out.print(i+" ");
            i--;
        }
    }
}
