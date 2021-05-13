package com.javalessons.tests;

import java.util.Scanner;
/** Требуется сложить два числа из стандартного потока ввода*/
public class YaTask3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] values = new int[2];
        for (int i =0; i <2; i++){
            values[i] = scanner.nextInt();
        }
        int res = values[0]+values[1];
        System.out.println(res);
    }
}
