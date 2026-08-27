import java.util.Scanner;

public class FunctionBasics01 {

    /*
     * Method with no parameters and no return value.
     *
     * void means this method does not return any value.
     */
    public static void printHelloWorld() {

        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
    }


    /*
     * Method with parameters and a return value.
     *
     * int means this method will return an integer value.
     *
     * a and b are parameters of the method.
     */
    public static int calculateSum(int a, int b) {

        int sum = a + b;

        return sum;
    }


    public static void main(String[] args) {

        /*
         * Calling the printHelloWorld() method.
         */
        printHelloWorld();


        /*
         * Taking two numbers from the user
         * and calculating their sum.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers for sum");

        System.out.print("Enter number 1: ");
        int a = sc.nextInt();

        System.out.print("Enter number 2: ");
        int b = sc.nextInt();


        /*
         * Calling calculateSum() and passing a and b
         * as arguments.
         *
         * The returned value is stored in sum.
         */
        int sum = calculateSum(a, b);

        System.out.print(
            "Sum of " + a + " and " + b + " is " + sum
        );


        sc.close();
    }
}