package com.javalessons.controlstatement;

public class SwitchCase {
    public static void main(String[] args) {
        int choice = 1;
        switch (choice) {
            case 1:
                System.out.println("You chose one");
                break;
            case 2:
                System.out.println("You chose two");
                break;
            case 3:
                System.out.println("You chose three");
                break;
            case 4:
                System.out.println("You chose four");
                break;
            default:
                System.out.println("You chose an another case");
        }
        System.out.println("Final string of numbers");
        String dayOfTheWeek = args[0];
        switch (dayOfTheWeek.toLowerCase()) {
            case "monday":
                System.out.println("This is the first day");
                break;
            case "tuesday":
                System.out.println("This is the second day");
                break;
            case "wednesday":
                System.out.println("This is the third day");
                break;
            case "thursday":
                System.out.println("This is the fourth day");
                break;
            case "friday":
                System.out.println("This is the fifth day");
                break;
            case "saturday": case "sunday":
                System.out.println("Weekends");
                break;

        }

    }
}
