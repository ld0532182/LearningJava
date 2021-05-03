package com.javalessons.begin;

public class Methods {
    public static void main(String[] args) {
        printMethod("Li");
        printMethod("La");
        printMethod("Lo");
        System.out.println("Rectangle = " + (rectangleSquare(3, 4) + rectangleSquare(2, 5)));
        String init = "Jdk toP";
        System.out.println(init.toUpperCase());
        System.out.println(init.toLowerCase());
 //       
        String str2 = "I like black coffee!";
        String str1 = "I like black coffee";
        comparingStrings(str1, str2);

    }
    static void printMethod(String name) {
        System.out.println("Hello " + name + "!!");
    }
    public static int rectangleSquare(int length, int height) {
        return length * height;
    }

    public static void comparingStrings(String str1, String str2) {
        System.out.println(str1.toLowerCase());
        System.out.println(str1.toUpperCase());

        String str3 = new String("I like black coffee");
        System.out.println("Comparing with new String "+(str1 == str3));
 //     equals is boolean type / substring cuts the string
        System.out.println("Substring = "+str1.equals(str2.substring(0, 19)));
//      comparing start and end of string
        System.out.println("EndsWith = "+str2.endsWith("ee!"));
        System.out.println("StartsWith = "+str2.startsWith("I "));
//      replacing and finding the first symbol of the string
        System.out.println(str2.replace("!", "?"));
        System.out.println(str1.indexOf("back"));
    }
}


