package com.javalessons.collections.arrays;

import java.util.Arrays;

public class GradeBook {
    public static void main(String[] args) {

        int[][] gradesArray = {{40, 80, 10, 1},
                {66, 2130, 54},
                {91, 130, 456},
                {3, 54, 10, 4330}};

        System.out.println(calcMin(gradesArray));
        varArgs();
        processArrays();
    }

    private static int calcMin(int[][] grades) {
        int min = grades[0][0];
        for (int i = 0; i < grades.length; i++) {
            for (int j = 0; j < grades[i].length; j++) {
                min = min < grades[i][j] ? min : grades[i][j];
            }
        }
        return min;
    }

    private static void varArgs() {
        double a = 0.56;
        double b = 1.33;
        double c = 4.19;
        double d = 0.11;

        System.out.println("Average of 2 values is " + calcAverage(a, b));
        System.out.println("Average of 3 values is " + calcAverage(a, b, c));
        System.out.println("Average of 4 values is " + calcAverage(a, b, c, d));
    }

    private static double calcAverage(double... args) {
        double sum = 0;
        for (double i : args) {
            sum += i;
        }
        return sum / args.length;
    }

    private static void processArrays(){
        double[] doubleArray = {8.9, 4.65, 8.12, 64.24};
        Arrays.sort(doubleArray);
        System.out.println(Arrays.toString(doubleArray));

        int[] filledArray = new int[7];
        Arrays.fill(filledArray, 7);
        System.out.println(Arrays.toString(filledArray));

        int[] intArray = {1, 2, 3, 4, 5, 6, 7};
        int[] arrayCopy = new int[10];

        System.arraycopy(intArray, 0, arrayCopy, 0, intArray.length);
        System.out.println(Arrays.toString(arrayCopy));

    }

}
