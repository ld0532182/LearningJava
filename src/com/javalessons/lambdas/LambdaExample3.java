package com.javalessons.lambdas;

public class LambdaExample3 {
    public static void main(String[] args) {

        Operation oper = action(1);

        System.out.println(oper.execute(2,3));

        System.out.println(action(3).execute(5,3));
    }

    private static Operation action(int number) {
        switch (number) {
            case 1:
                return (x, y) -> x + y;
            case 2:
                return (x, y) -> x - y;
            case 3:
                return (x, y) -> x * y;
            default:
                return (x, y) -> 0;
        }

    }
}

@FunctionalInterface
interface Operation {
    int execute(int x, int y);
}
