package com.javalessons.tests;

import java.util.Scanner;

public class YaTask0 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String values = scanner.nextLine();
        String[] formatedValues = values.split(" ");
        int a = Integer.parseInt(formatedValues[0]);
        int b = Integer.parseInt(formatedValues[1]);
        System.out.println(a+b);
    }
}
