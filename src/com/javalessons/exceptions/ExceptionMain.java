package com.javalessons.exceptions;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionMain {

    public static void main(String[] args) {
        boolean continueLoop = true;
        PrintWriter writer = null;
        Scanner scanner = new Scanner(System.in);
        do {
            try {
                System.out.println("Enter values ");
                int numerator = scanner.nextInt();
                int denominator = scanner.nextInt();
                writer = new PrintWriter(new FileWriter("out.txt"));
                writer.println("Result is " + divide(numerator, denominator));
 /*            for "finally" test
               if(continueLoop)  {
                throw new RuntimeException("Runtime exception");
                    }*/
                continueLoop = false;
            } catch (InputMismatchException | ArithmeticException e) {
                scanner.nextLine();
                System.out.println("Exception: " + e);
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                System.out.println("Finally block called");
                if (writer != null) {
                    writer.close();
                }
            }
        } while (continueLoop);
    }

    private static int divide(int numerator, int denominator) throws ArithmeticException {
        return numerator / denominator;
    }
}
