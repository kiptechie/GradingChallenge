package com.kiptechie.gradingchallenge;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
         * Grade range 0-100
         * any grade less than 40 is a failing grade
         * Rules:
            -If the difference between the grade and the next multiple of 5 is less than 3, round grade up to the next multiple of 5.
            -If the value of a grade is less than 38 no rounding occurs as the result is still a fail
         */

        System.out.println("Please input grades separated with a comma e.g (73,67,38,33):");

        Scanner scanner = new Scanner(System.in);

        String numberString = scanner.next();

        scanner.close();

        List<Integer> grades = Helpers.toIntegerList(numberString);

        // validate grade range
        boolean inputHasNumberOutOfRange = false;
        for (Integer grade : grades) {
            boolean isWithinRange = grade >= 0 && grade <= 100;
            if (!isWithinRange) {
                inputHasNumberOutOfRange = true;
                break;
            }
        }

        if (inputHasNumberOutOfRange) {
            System.out.println("One of the grade inputs is out of range.");
        } else {
            showResults(grades);
        }

    }

    private static void showResults(List<Integer> grades) {
        System.out.println("Results:");
        for (Integer grade : grades) {
            System.out.println(Helpers.applyRule(grade));
        }
    }
}
