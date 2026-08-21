public class JavaBasics {

    public static void main(String args[]) {

        /*
         * Printing output in Java
         */
        System.out.println("Hello Everyone!");
        System.out.println("Hello Everyone!");
        System.out.print("Hello Everyone!\n");


        /*
         * Variables in Java
         *
         * A variable is used to store a value.
         */
        int a = 5;
        int b = 10;
        String name = "java";

        System.out.println(a);
        System.out.println(b);
        System.out.println(name);

        // Changing the value of a variable
        a = 15;
        System.out.println(a);

        // Assigning the value of b to a
        a = b;
        System.out.println(a);


        /*
         * Data Types in Java
         *
         * Primitive:
         * byte, short, char, boolean, int, long, float, double
         *
         * Non-primitive:
         * String, Array, Class, Object, Interface
         */

        byte by = 8;
        char ch = 'a';
        boolean bool = true;
        float price = 10.5f;
        int num = 25;
        long num2 = 955653333333364645L;
        double num3 = 256.66;
        short n = 240;


        /*
         * Sum of two numbers
         */
        int num1 = 5;
        int num4 = 15;

        int sum = num1 + num4;

        System.out.println(sum);
    }
}