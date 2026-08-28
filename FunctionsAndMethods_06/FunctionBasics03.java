public class FunctionBasics03 {

    /*
     * Function / Method Overloading
     *
     * Method overloading means having multiple methods
     * with the same name but different parameters.
     *
     * The parameters can differ in:
     * - Number of parameters
     * - Data type of parameters
     *
     * The return type alone cannot be used for overloading.
     */


    /*
     * add() with two int parameters
     */
    public static int add(int a, int b) {

        return a + b;
    }


    /*
     * add() with three int parameters
     */
    public static int add(int a, int b, int c) {

        return a + b + c;
    }


    /*
     * add() with two float parameters
     */
    public static float add(float a, float b) {

        return a + b;
    }


    public static void main(String args[]) {

        /*
         * User-defined methods
         *
         * These are methods created by the programmer.
         *
         * Examples from this class:
         * add(int, int)
         * add(int, int, int)
         * add(float, float)
         */

        System.out.println(add(10, 20));

        System.out.println(add(10, 20, 30));

        System.out.println(add(10.5f, 20.5f));


        /*
         * Built-in methods
         *
         * These are methods already provided by Java.
         *
         * Example:
         * Math.max() returns the larger of two numbers.
         */

        System.out.println(Math.max(10, 20));

        /*
         * Math.min() returns the smaller of two numbers.
         */
        System.out.println(Math.min(10, 20));
    }
}