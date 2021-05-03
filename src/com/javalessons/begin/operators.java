package com.javalessons.begin;

public class operators {

    public static void main(String[] args) {
//      + - / * %
        int a = 10;
        int b = 3;

        int c = a + b;
        int d = a - b;

        int e = a * b;
        int f = a / b;
        int g = a % b;
        float f1 = 10, f2 = 3;
        float ff = f1 / f2;

        System.out.println("ff = " + ff);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        System.out.println("g = " + g);

//      a = a + 5;
        a += 5;
        System.out.println("a = " + a);
        a++;
        System.out.println("a++ = " + a);

        int n = 7, m = 7;
        int resl1 = 2 * n++;
        int resl2 = 2 * ++m;
        System.out.println("resl1= " + resl1);
        System.out.println("n= " + n);
        System.out.println("resl2= " + resl2);

//      == != < > <= >= && || ?:
        int x = 3;
        int y = 5;
        int z = 8;
        boolean boolVal = x == y;
        boolean boolVal1 = z >= x;
        boolean boolVal2 = boolVal || boolVal1;
        boolean boolVal3 = boolVal && boolVal1;
        System.out.println("BoolVal = "+boolVal);
        System.out.println("BoolVal2 = "+boolVal2);
        System.out.println("BoolVal3 = "+boolVal3);

        int res = x < y ? x : y;
        System.out.println("Ternary res = "+res);
    }
}
