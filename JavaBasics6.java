public class JavaBasics6 {

    public static void main(String args[]) {

        /*
         * Type Promotion in Expressions
         *
         * Java automatically promotes byte, short, and char
         * operands to int when evaluating an expression.
         */


        /*
         * char + char
         *
         * Both char values are promoted to int during addition.
         * Therefore, a + b gives the numeric result.
         *
         * But when a and b are used with a String,
         * they are treated as characters and concatenated.
         */

        char a = 'a';
        char b = 'b';

        System.out.println(a + b + " is result of " + a + b);

        // String concatenation gives "ab"
        System.out.println("sum of " + a + " and " + b + " is " + a + b);


        /*
         * char values are promoted to int during arithmetic.
         *
         * Therefore, the result of c - d is an int,
         * and it cannot be directly stored in a char variable.
         */

        char c = 'c';
        char d = 'd';

        // char e = c - d;   // Error: result is int


        /*
         * byte, short and char are promoted to int
         * when used in an arithmetic expression.
         *
         * v1 + b1 + c1 produces an int result.
         *
         * Therefore, it cannot be directly stored in a byte.
         * Explicit type casting is required.
         */

        short v1 = 100;
        byte b1 = 10;
        char c1 = 'a';

        // byte sum = v1 + b1 + c1;   // Error: result is int

        byte sum = (byte) (v1 + b1 + c1);

        System.out.println(sum);


        /*
         * If an expression contains long, float, or double,
         * the other values are promoted to that type.
         *
         * Here, double is present, so the entire expression
         * is evaluated as double.
         */

        int a1 = 20;
        float a2 = 34.50f;
        long a3 = 255;
        double a4 = 123.55;

        double sum2 = a1 + a2 + a3 + a4;

        // int sum3 = a1 + a2 + a3 + a4;   // Error: result is double

        System.out.println(sum2);


        /*
         * byte arithmetic
         *
         * b2 is a byte, but during multiplication it is
         * promoted to int.
         *
         * Therefore, the result cannot be directly assigned
         * to a byte without type casting.
         */

        byte b2 = 5;

        // b2 = b2 * 2;   // Error: result is int

        byte b3 = (byte) (b2 * 2);

        System.out.println(b3);
    }
}