package com.javalessons.tests;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
/** Требуется найти в бинарном векторе самую длинную последовательность единиц и вывести её длину.*/
public class YaTask2 {
    public static void main(String[] args) throws InterruptedException, IOException {
        LinkedList<String> listStr = new LinkedList<>();
        FileWriter writer = new FileWriter("output.txt");
        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        String c;
        while ((c = reader.readLine()) != null) {
            listStr.add(c);
        }

        int[] array = new int[listStr.size()];
        String[] strArr = new String[listStr.size()];
        listStr.toArray(strArr);

        for (int i = 0; i < array.length; i++) {
            try {
                array[i] = Integer.parseInt(strArr[i]);
            } catch (NumberFormatException ignored){
            }
        }


        int[] arrCheck = new int[array.length];

        for (int i = 1, j = 0; i < array.length; i++) {
            if (array[i] == 1) {
                j = i;
                while ((j < array.length) && (array[j] == 1)) {
                    ++arrCheck[i];
                    j = j + 1;
                }
            }
        }
        int maxValue = 0;
        for (int j : arrCheck) {
            maxValue = Math.max(maxValue, j);
        }
        writer.write(Integer.toString(maxValue));
        writer.close();
    }
}
