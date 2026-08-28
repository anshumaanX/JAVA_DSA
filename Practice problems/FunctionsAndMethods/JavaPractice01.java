import java.util.Scanner;

public class JavaPractice01 {

    /*
     * Calculate the average of three numbers.
     *
     * The method accepts three double values
     * and returns their average.
     */
    public static double average(double a, double b, double c) {

        double avg = (a + b + c) / 3;

        return avg;
    }


    /*
     * Check whether a number is even or odd.
     *
     * If the remainder after dividing by 2 is 0,
     * the number is even.
     */
    public static boolean isEven(int n) {

        return n % 2 == 0;
    }


    /*
     * Check whether a number is a palindrome.
     *
     * A palindrome number remains the same
     * when its digits are reversed.
     *
     * Example:
     * 121 -> 121
     * Therefore, 121 is a palindrome.
     */
    public static void isPalindrome(int num) {

        int numCopy = num;
        int rev = 0;

        while (num > 0) {

            int digit = num % 10;

            rev = rev * 10 + digit;

            num /= 10;
        }

        if (rev == numCopy) {

            System.out.println(numCopy + " is palindrome");

        } else {

            System.out.println(numCopy + " is not palindrome");
        }
    }


    /*
     * Calculate the sum of the digits of an integer.
     *
     * Example:
     * 123 -> 1 + 2 + 3 = 6
     */
    public static int sumOfDigits(int n) {

        int sum = 0;

        while (n > 0) {

            int digit = n % 10;

            sum += digit;

            n /= 10;
        }

        return sum;
    }


    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);


        /*
         * Average of three numbers
         */

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.print("Enter third number: ");
        double c = sc.nextDouble();

        System.out.println(
            "Average = " + average(a, b, c)
        );


        /*
         * Check whether a number is even or odd
         */

        int num = 11;

        System.out.println(
            isEven(num)
                ? num + " is Even"
                : num + " is Odd"
        );


        /*
         * Check whether a number is palindrome
         */

        isPalindrome(121);


        /*
         * Sum of digits
         */

        int sumDigit = 123;

        System.out.println(
            "Sum of digits of " + sumDigit
            + " is " + sumOfDigits(sumDigit)
        );


        sc.close();
    }
}