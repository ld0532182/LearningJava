package com.javalessons.collections.arrays;

import java.security.SecureRandom;
import java.util.Arrays;

public class ArrayLauncher {
    public static void main(String[] args) {

        SecureRandom random = new SecureRandom();
        int[] frequency = new int[7];
        for (int i = 0; i < 1000; i++) {
            ++frequency[1 + random.nextInt(6)];
        }
        System.out.println(Arrays.toString(frequency));
        multArrLaunch();
    }

    private static void multArrLaunch() {

        int[][] a = {{1, 599},
                {456, 9454, 0},
                {400, 0, 234, 434, 1, 545}};

        int[][] b = new int[3][3];

        int[][] c = new int[2][];
        c[0] = new int[]{1, 2};
        c[1] = new int[4];

        for (int[] i : a) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

}
