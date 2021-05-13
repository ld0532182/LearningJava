package com.javalessons.tests;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/** Требуется сложить два числа из файла и вывести результат в файл*/
public class YaTask1 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));

        FileWriter writer = new FileWriter("output.txt");

        String inputStr = reader.readLine();

        String[] formStr = inputStr.split(" ");

        int a = Integer.parseInt(formStr[0]);
        int b = Integer.parseInt(formStr[1]);

        Integer res = a+b;
        writer.write(res.toString());
        writer.close();

    }
}
