import java.util.Scanner;

public class loop {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);


        /*
         * ------------------------------------------------
         * Print Numbers from 1 to n
         * ------------------------------------------------
         *
         * while loop repeats the code as long as
         * the given condition is true.
         */

        System.out.println("Till where to print the numbers?");
        System.out.print("Enter the number: ");

        int n = sc.nextInt();
        int counter = 1;

        while (counter <= n) {

            System.out.print(counter + " ");
            counter++;
        }

        System.out.println();


        /*
         * ------------------------------------------------
         * Sum of Natural Numbers from 1 to n
         * ------------------------------------------------
         */

        System.out.println("----------------------");

        System.out.print("Enter the number to calculate the sum: ");

        n = sc.nextInt();

        counter = 1;
        int sum = 0;

        while (counter <= n) {

            sum += counter;
            counter++;
        }

        System.out.println("Sum from 1 to " + n + " is " + sum);


        /*
         * ------------------------------------------------
         * Print Square Pattern
         * ------------------------------------------------
         *
         * Using a for loop to print 4 rows.
         */

        System.out.println("----------------------");

        for (int i = 1; i <= 4; i++) {

            System.out.println("*  *  *  *");
        }


        /*
         * ------------------------------------------------
         * Reverse of a Number
         * ------------------------------------------------
         *
         * % 10 gives the last digit.
         *
         * / 10 removes the last digit.
         */

        System.out.println("----------------------");

        System.out.print("Enter the number to get its reverse: ");

        int num = sc.nextInt();
        int reverse = 0;

        while (num != 0) {

            int digit = num % 10;

            reverse = reverse * 10 + digit;

            num /= 10;
        }

        System.out.println("Reverse = " + reverse);


        /*
         * ------------------------------------------------
         * do-while Loop
         * ------------------------------------------------
         *
         * A do-while loop executes the code at least once
         * before checking the condition.
         */

        System.out.println("----------------------");

        int count = 0;

        do {

            System.out.println("hii");
            count++;

        } while (count < 5);


        /*
         * ------------------------------------------------
         * break Statement
         * ------------------------------------------------
         *
         * break immediately stops the loop.
         *
         * The loop will stop when the user enters
         * a multiple of 10.
         */

        System.out.println("----------------------");

        do {

            System.out.print("Enter the number: ");

            num = sc.nextInt();

            if (num % 10 == 0) {
                break;
            }

        } while (true);


        /*
         * ------------------------------------------------
         * continue Statement
         * ------------------------------------------------
         *
         * continue skips the remaining code of the
         * current iteration and moves to the next iteration.
         *
         * If the user enters a multiple of 10,
         * that number will not be printed.
         */

        System.out.println("----------------------");

        do {

            System.out.print("Enter the number: ");

            num = sc.nextInt();

            if (num % 10 == 0) {
                continue;
            }

            System.out.println(num);

        } while (true);


    }
}