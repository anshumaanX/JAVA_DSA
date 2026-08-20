import java.util.Scanner;

public class JavaBasics2 {

    public static void main(String args[]) {

        // Scanner is used to take input from the user.
        Scanner sc = new Scanner(System.in);


        /*
         * Taking String input
         *
         * next() reads a single word.
         * It does not read spaces.
         */
        String word = sc.next();
        System.out.println(word);


        /*
         * nextLine() reads a complete line.
         * It can store a String containing spaces.
         */
        String name = sc.nextLine();
        System.out.println(name);


        /*
         * Taking integer input
         */
        int number = sc.nextInt();
        System.out.println(number);


        /*
         * Taking float input
         */
        float price = sc.nextFloat();
        System.out.println(price);


        /*
         * Other data types can also be taken as input
         * using their respective Scanner methods.
         */

        double area = sc.nextDouble();
        System.out.println(area);

        boolean is_boy = sc.nextBoolean();
        System.out.println(is_boy);


        sc.close();
    }
}