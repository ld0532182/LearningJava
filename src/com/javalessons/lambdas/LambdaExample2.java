package com.javalessons.lambdas;

interface Expression {
    boolean isEqual(int n);
}

class ExpressionHelper {

    static boolean isEven(int n) {

        return n % 2 == 0;
    }

    static boolean isPositive(int n) {

        return n > 0;
    }
}

public class LambdaExample2 {

    public static void main(String[] args) {

        int[] numbers = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};
        System.out.println(sum(numbers, ExpressionHelper::isEven));

        Expression expr = ExpressionHelper::isPositive;
        System.out.println(sum(numbers, expr));
    }

    private static int sum(int[] numbers, Expression func) {
        int result = 0;
        for (int i : numbers) {
            if (func.isEqual(i))
                result += i;
        }
        return result;
    }
}

