public class JavaBasics5 {

    public static void main(String args[]) {

        /*
         * Type Casting / Explicit Conversion / Narrowing
         *
         * Type casting means manually converting a value
         * from one data type to another.
         *
         * Type Conversion:
         * - Happens automatically.
         * - Usually converts a smaller compatible data type
         *   into a larger data type.
         *
         * Type Casting:
         * - Done manually by the programmer.
         * - Usually converts a larger data type into a smaller
         *   data type.
         */


        /*
         * Float to int
         *
         * float has a larger range/size than int in this context,
         * so explicit type casting is required.
         *
         * The decimal part is removed.
         */

        float a = 25.62f;

        int b = (int) a;

        System.out.println(b);


        /*
         * Character can also be converted into a number.
         *
         * Characters have corresponding numeric values
         * based on their Unicode values.
         */

        char ch = 'a';
        char ch2 = 'A';

        int number = ch;
        int number2 = ch2;

        System.out.println(number);
        System.out.println(number2);
    }
}