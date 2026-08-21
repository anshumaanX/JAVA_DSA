public class Operators {

    public static void main(String args[]) {

        /*
         * Types of Operators in Java:
         *
         * 1. Arithmetic Operators
         * 2. Relational Operators
         * 3. Logical Operators
         * 4. Bitwise Operators
         * 5. Assignment Operators
         */


        /*
         * ------------------------------------------------
         * Arithmetic Operators
         * ------------------------------------------------
         *
         * Binary: +, -, *, /, %
         * Unary: ++, --
         */


        // Binary Arithmetic Operators

        int A = 10;
        int B = 5;

        System.out.println(A + " + " + B + " = " + (A + B));
        System.out.println(A + " - " + B + " = " + (A - B));
        System.out.println(A + " * " + B + " = " + (A * B));
        System.out.println(A + " / " + B + " = " + (A / B));
        System.out.println(A + " % " + B + " = " + (A % B));


        /*
         * Unary Operators
         *
         * Pre-increment:
         * First increases the value, then uses it.
         */

        System.out.println("---------- Unary Operators ----------");

        int a1 = 10;
        int b1 = ++a1;

        System.out.println(a1);
        System.out.println(b1);

        System.out.println("------------");


        /*
         * Post-increment:
         * First uses the current value, then increases it.
         */

        int c1 = 10;
        int d1 = c1++;

        System.out.println(c1);
        System.out.println(d1);


        /*
         * ------------------------------------------------
         * Relational Operators
         * ------------------------------------------------
         *
         * Used to compare two values.
         *
         * ==  Equal to
         * !=  Not equal to
         * <   Less than
         * >   Greater than
         * <=  Less than or equal to
         * >=  Greater than or equal to
         */

        System.out.println("---------- Relational Operators ----------");

        int A2 = 10;
        int B2 = 5;

        System.out.println(A2 + " == " + B2 + " = " + (A2 == B2));
        System.out.println(A2 + " != " + B2 + " = " + (A2 != B2));
        System.out.println(A2 + " < " + B2 + " = " + (A2 < B2));
        System.out.println(A2 + " > " + B2 + " = " + (A2 > B2));
        System.out.println(A2 + " >= " + B2 + " = " + (A2 >= B2));
        System.out.println(A2 + " <= " + B2 + " = " + (A2 <= B2));


        /*
         * ------------------------------------------------
         * Logical Operators
         * ------------------------------------------------
         *
         * &&  Logical AND
         * ||  Logical OR
         * !   Logical NOT
         *
         * Logical operators work with boolean expressions.
         */

        System.out.println("---------- Logical Operators ----------");

        System.out.println("(10 > 5) && (20 > 10) = " + ((10 > 5) && (20 > 10)));

        System.out.println("(10 > 5) && (20 < 10) = " + ((10 > 5) && (20 < 10)));

        System.out.println("(10 > 5) || (20 < 10) = " + ((10 > 5) || (20 < 10)));

        System.out.println("(10 < 5) || (20 < 10) = " + ((10 < 5) || (20 < 10)));

        System.out.println("!(10 > 5) = " + !(10 > 5));


        /*
         * ------------------------------------------------
         * Assignment Operators
         * ------------------------------------------------
         *
         * =   Assign
         * +=  Add and assign
         * -=  Subtract and assign
         * *=  Multiply and assign
         * /=  Divide and assign
         * %=  Modulus and assign
         */

        System.out.println("---------- Assignment Operators ----------");

        int x = 10;

        System.out.println("x = " + x);

        x += 5;
        System.out.println("x += 5 -> " + x);

        x -= 3;
        System.out.println("x -= 3 -> " + x);

        x *= 2;
        System.out.println("x *= 2 -> " + x);

        x /= 4;
        System.out.println("x /= 4 -> " + x);

        x %= 3;
        System.out.println("x %= 3 -> " + x);


        /*
         * ------------------------------------------------
         * Bitwise Operators
         * ------------------------------------------------
         *
         * Bitwise operators work on the individual bits
         * of integer values.
         *
         * &, |, ^, ~, <<, >>
         *
         * Detailed examples will be covered separately.
         */
    }
}