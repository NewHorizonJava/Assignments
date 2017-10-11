package com.company;

public class Main {

    public static void main(String[] args) {
	// declare variables
        double firstQuestion;
        double X, Y;
        double secondQuestion1, finalSecondQuestion1, secondQuestion2, finalSecondQuestion2;
        double b, A, C;
        double thirdQuestion;
        double P, R, T;
        double fourthQuestion, finalFourthQuestion;

    // initialise variables;
        X = Math.pow(5, 0.5);
        Y = Math.pow(3, 2);
        b = Math.pow(2, 2);
        A = Math.pow(1, 2);
        C = 5;
        P = 1000000;
        R = 0.1;
        T = 5;

    // perform calculations
        //first question
        firstQuestion = X + Y - Math.sqrt(5-1)/200;

        // second question
        secondQuestion1 = Math.pow(b, 2) + (Math.sqrt(Math.pow(b, 2) - 4 * A * C) / 2 * A);
        finalSecondQuestion1 = (long)secondQuestion1;
        secondQuestion2 = Math.pow(b, 2) - (Math.sqrt(Math.pow(b, 2) - 4 * A * C) / 2 * A);
        finalSecondQuestion2 = (long)secondQuestion2;

        // third question
        thirdQuestion = (P * R * T)/100;

        // fourth question
        fourthQuestion = Math.pow(X, 2) + Math.pow(Y, 2) + Math.sqrt(X - Y)/Math.sqrt(X + Y) / 100;
        finalFourthQuestion = (long)fourthQuestion;

    // print statement
        System.out.print("The Answer to the first question is " + firstQuestion + "\n");
        System.out.print("\nThe Answer to the second question is " + finalSecondQuestion1 + " and " + finalSecondQuestion2 + "\n");
        System.out.print("\nThe Answer to the third question is " + thirdQuestion + "\n");
        System.out.print("\nThe Answer to the fourth question is " + finalFourthQuestion + "\n");
    }
}
