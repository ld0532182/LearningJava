package com.javalessons.begin;

public class myFirstProg {

    public static void main(String[] args) {
        System.out.println("Hello World!!!");
        byte b = 10;
        short s = 100;
        int i = 1000;
        long l = 10000L;
        long sum = b + s + i + l;
        int intSum = (int) sum;
        char c = '\n';
        System.out.print(c);
        System.out.println("Sum = "+sum);
        System.out.println("intSum = "+intSum);
    }
}
