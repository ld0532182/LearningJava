package com.javalessons.tests;

import java.util.*;

public class Rand1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = "0";
        Random random = new Random();
        while (!(n.equals("n"))) {
            System.out.print(random.nextBoolean()+ " ");
            n = scanner.nextLine();
        }
        int i = 1, x = 10;
        i = i > x ? i : x;
        System.out.println(i);
    }
}
