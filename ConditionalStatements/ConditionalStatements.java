import java.util.Scanner;

public class ConditionalStatements {

    public static void main(String args[]) {

        /*
         * Conditional Statements
         *
         * Conditional statements are used to make decisions
         * in a program based on a condition.
         *
         * Main types:
         * 1. if
         * 2. if-else
         * 3. if-else-if
         */


        /*
         * ---------------------------------------------
         * Basic if-else Example
         * ---------------------------------------------
         *
         * Checking whether a person is eligible to vote.
         */

        int age = 20;

        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }


        /*
         * ---------------------------------------------
         * Maximum of Two Numbers
         * ---------------------------------------------
         *
         * Comparing two numbers and finding
         * which one is greater.
         */

        int num1 = 25;
        int num2 = 15;

        if (num1 > num2) {
            System.out.println(num1 + " is greater.");
        } else {
            System.out.println(num2 + " is greater.");
        }


        /*
         * ---------------------------------------------
         * Odd or Even
         * ---------------------------------------------
         *
         * Taking a number from the user and checking
         * whether it is odd or even.
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }


        /*
         * ---------------------------------------------
         * if-else-if Statement
         * ---------------------------------------------
         *
         * Used when there are multiple conditions
         * that need to be checked.
         */

        int marks = 75;

        if (marks >= 90) {
            System.out.println("Grade A+");
        } else if (marks >= 80) {
            System.out.println("Grade A");
        } else if (marks >= 70) {
            System.out.println("Grade B");
        } else if (marks >= 60) {
            System.out.println("Grade C");
        } else {
            System.out.println("Grade D");
        }


        /*
         * ---------------------------------------------
         * Basic Income Tax Calculator
         * ---------------------------------------------
         *
         * New Tax Regime - AY 2026-27
         *
         * Up to ₹4,00,000       -> 0%
         * ₹4,00,001-₹8,00,000   -> 5%
         * ₹8,00,001-₹12,00,000  -> 10%
         * ₹12,00,001-₹16,00,000 -> 15%
         * ₹16,00,001-₹20,00,000 -> 20%
         * ₹20,00,001-₹24,00,000 -> 25%
         * Above ₹24,00,000     -> 30%
         *
         * This is a basic slab demonstration for learning
         * if-else-if statements.
         */

        System.out.print("Enter your annual income: ");
        double income = sc.nextDouble();

        double tax;

        if (income <= 400000) {

            tax = 0;

        } else if (income <= 800000) {

            tax = (income - 400000) * 0.05;

        } else if (income <= 1200000) {

            tax = 20000 + (income - 800000) * 0.10;

        } else if (income <= 1600000) {

            tax = 60000 + (income - 1200000) * 0.15;

        } else if (income <= 2000000) {

            tax = 120000 + (income - 1600000) * 0.20;

        } else if (income <= 2400000) {

            tax = 200000 + (income - 2000000) * 0.25;

        } else {

            tax = 300000 + (income - 2400000) * 0.30;
        }

        System.out.println("Basic calculated tax: ₹" + tax);

        sc.close();
    }
}