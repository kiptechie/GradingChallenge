package com.kiptechie.gradingchallenge;

import java.util.ArrayList;
import java.util.List;

/**
 * Utility class
 * Contains some helper functions
 */
public class Helpers {

    /**
     * Calculate the final grade after following Professor Sam's rules
     *
     * @param grade Integer value of the grade
     * @return Integer representing the computed result
     */
    public static int applyRule(int grade) {
        if (grade < 38) {
            return grade;
        }
        int nextMultipleOf5 = (grade + 4) / 5 * 5;
        int currentGrade = grade;
        if ((nextMultipleOf5 - currentGrade) < 3) {
            currentGrade = nextMultipleOf5;
        }
        return currentGrade;
    }

    /**
     * This function converts a String to Integer list
     *
     * @param str String with comma as separators
     * @return int[]
     */
    public static List<Integer> toIntegerList(String str) {
        String[] strings = Helpers.toStringArray(str);
        List<Integer> integerList = new ArrayList<>();
        for (String string : strings) {
            integerList.add(Integer.parseInt(string));
        }
        return integerList;
    }

    private static final String delimiter = "[,]";

    /**
     * This function converts a String to a String Array
     *
     * @param str String with comma as separators
     * @return String[]
     */
    public static String[] toStringArray(String str) {
        return str.replaceAll("\\s", "").split(delimiter);
    }

}
