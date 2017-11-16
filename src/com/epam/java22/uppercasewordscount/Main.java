package com.epam.java22.uppercasewordscount;

public class Main {
    private static String patternUpperCaseWords = "[A-Z]";
    public static String poemOfKipling = "If you can talk with crowds and keep your virtue,\n" +
            "Or walk with Kings-nor lose the common touch,\n" +
            "If neither foes nor loving friends can hurt you,\n" +
            "If all men count with you, but none too much;\n" +
            "If you can fill the unforgiving minute\n" +
            "With sixty seconds' worth of distance run,\n" +
            "Yours is the Earth and everything that's in it,\n" +
            "And-which is more-you'll be a Man, my son!";

    public static void main(String[] args) {
        int countUpperCases = 0;
        String[] letters = poemOfKipling.split("");
        for (int i = 0; i < letters.length; i++) {
            if (letters[i].matches(patternUpperCaseWords)) {
                countUpperCases++;
            }
        }
        System.out.println("Number of words with first uppercase letter = " + countUpperCases);
    }
}

