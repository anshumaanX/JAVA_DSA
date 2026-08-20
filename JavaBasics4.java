import java.util.Scanner;

public class JavaBasics4 {

    public static void main(String args[]) {

        /*
         * Type Conversion
         *
         * Type conversion means converting a value
         * from one data type to another.
         */


        /*
         * Implicit Conversion / Widening Conversion
         *
         * Smaller data type can be automatically converted
         * into a larger compatible data type.
         *
         * byte -> short -> int -> long -> float -> double
         */

        int a = 5;

        // int can be automatically converted to long.
        long b = a;

        System.out.println(b);


        /*
         * The reverse conversion is not automatically possible.
         *
         * long -> int
         *
         * because long can store a larger range of values
         * than int.
         */

        long c = 256;

        // int d = c;   // Invalid without explicit conversion.


        /*
         * Type conversion also happens when taking input.
         *
         * nextInt() gives an int value.
         * It can be stored in a float variable because
         * float can store a wider range of values.
         */

        Scanner sc = new Scanner(System.in);

        float number = sc.nextInt();

        System.out.println(number);

        sc.close();
    }
}