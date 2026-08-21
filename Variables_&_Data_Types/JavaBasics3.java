import java.util.Scanner;

public class JavaBasics3 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);


        /*
         * Sum of two numbers
         *
         * Taking two numbers from the user
         * and calculating their sum.
         */

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        System.out.println(
            "Sum of " + num1 + " and " + num2 + " is " + (num1 + num2)
        );


        /*
         * Area of a circle
         *
         * Formula:
         * Area = π × r × r
         */

        System.out.print("Enter the radius of circle: ");

        float radius = sc.nextFloat();

        float area = 3.14f * radius * radius;

        System.out.print("Area of circle is: " + area);


        sc.close();
    }
}