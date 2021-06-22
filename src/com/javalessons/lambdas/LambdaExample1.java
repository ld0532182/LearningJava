package com.javalessons.lambdas;

import java.util.Arrays;

public class LambdaExample1 {

    public static void main(String[] args) {


        String[] colours = {"green", "brown", "black", "blue", "pink", "grey"};

        Player player1 = new Player("Alex", 100);
        Player player2 = new Player("Igor", 80);
        Player player3 = new Player("Viktor", 80);
        Player player4 = new Player("John", 91);

        Player[] players = {player1, player2, player3, player4};

// sort with comparator
        Arrays.sort(colours, (String s1, String s2) ->
                s1.charAt(s1.length() - 1) - s2.charAt(s2.length() - 1)
        );

        Arrays.sort(players, (p1, p2) -> {
                    if ((p2.getScore() - p1.getScore()) != 0) {
                        return p2.getScore() - p1.getScore();
                    } else {
                        return p1.getName().compareTo(p2.getName());
                    }
                }
        );
        System.out.println(Arrays.toString(colours));

        System.out.println(Arrays.toString(players));
// creating interfaces for lambda
        LambdaInterface iInterface1 = (x, y) -> {
            int i = x * y;
            return i + x;
        };
        LambdaInterface iInterface2 = (x, y) -> x - y;

        System.out.println(iInterface1.action(5, 2));
        System.out.println(iInterface2.action(10, 8));

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println(sum(numbers, x-> x%2==0));


    }

    private static int sum(int[] numbers, isBoolean checker) {
        int res = 0;
        for (int i : numbers) {
            if (checker.check(i)) {
                res += i;
            }
        }
        return res;
    }

}


@FunctionalInterface
interface LambdaInterface {
    int action(int x, int y);
}

@FunctionalInterface
interface isBoolean {
    boolean check(int b);
}
