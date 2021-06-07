package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number to read out: ");
        int number = scanner.nextInt();
        int hundreds = number / 100;
        String hundred = "";
        switch (hundreds) {
            case 1 -> hundred = "one hundred";
            case 2 -> hundred = "two hundred";
            case 3 -> hundred = "three hundred";
            case 4 -> hundred = "four hundred";
            case 5 -> hundred = "five hundred";
            case 6 -> hundred = "six hundred";
            case 7 -> hundred = "seven hundred";
            case 8 -> hundred = "eight hundred";
            case 9 -> hundred = "nine hundred";
        }
        int tens = (number - (hundreds * 100)) / 10;
        String ten = "";
        switch (tens) {
            case 1 -> ten = "ten";
            case 2 -> ten = "twenty";
            case 3 -> ten = "thirty";
            case 4 -> ten = "forty";
            case 5 -> ten = "fifty";
            case 6 -> ten = "sixty";
            case 7 -> ten = "seventy";
            case 8 -> ten = "eighty";
            case 9 -> ten = "ninety";
        }
        int ones = number - (hundreds * 100) - (tens * 10);
        String one = "";
        switch (ones) {
            case 1 -> one = "one";
            case 2 -> one = "two";
            case 3 -> one = "three";
            case 4 -> one = "four";
            case 5 -> one = "five";
            case 6 -> one = "six";
            case 7 -> one = "seven";
            case 8 -> one = "eight";
            case 9 -> one = "nine";
        }
        if (number >= 100) {
            if (number >= 1000) {
                System.out.println("out of ability");
            } else if (number % 100 == 0) {
                System.out.println(hundred);

            } else if (tens == 1) {
                if (ones == 0) {
                    one = "ten";
                    System.out.println(hundred + " and " + one);
                } else {
                    switch (ones) {
                        case 1 -> one = "eleventh";
                        case 2 -> one = "twelve";
                        case 3 -> one = "thirteen";
                        case 4 -> one = "fourteen";
                        case 5 -> one = "fifteen";
                        case 6 -> one = "sixteen";
                        case 7 -> one = "seventeen";
                        case 8 -> one = "eighteen";
                        case 9 -> one = "nineteen";
                    }
                    System.out.println(hundred + " " + one);
                }

            } else {
                System.out.println(hundred + " and " + ten + " " + one);
            }
        } else if (number >= 20) {
            System.out.println(ten + " " + one);
        } else {
            if (number < 10 && number >= 0) {
                if (ones == 0) {
                    one = "zero";
                }
                System.out.println(one);
            } else if (number > 10) {
                switch (ones) {
                    case 1 -> one = "Eleventh";
                    case 2 -> one = "twelve";
                    case 3 -> one = "thirteen";
                    case 4 -> one = "fourteen";
                    case 5 -> one = "fifteen";
                    case 6 -> one = "sixteen";
                    case 7 -> one = "seventeen";
                    case 8 -> one = "eighteen";
                    case 9 -> one = "nineteen";
                }
                System.out.println(one);
            } else {
                System.out.println(ten);
            }
        }
    }
}
