
import java.util.Scanner;

public class JavaPractice1 {
  public static void main (String args[]) {
    Scanner sc = new Scanner(System.in);

    // how many times hello gets printed

    for(int i = 0; i < 5; i++) {
      System.out.println("Hello");
      i+=2;
    } // 2


    // Write a program that reads a set of integers, and then prints the 
    // sum of the even and odd integers.

    // int evenSum = 0; 
    // int oddsum = 0; 

    // System.out.print("Enter 10 numbers - even and odd numbers");
    // for(int i = 1; i<=10; i++) {
    //   int num = sc.nextInt();
    //     if(num % 2 == 0) {
    //       evenSum+=i;
    //     } else {
    //       oddsum+=i;
    //     }
    // }
    // System.out.println("Even numbers sum is: "+ evenSum);
    // System.out.println("Odd numbers sum is: "+ oddsum);


    // Write a program to find the factorial of any number entered by the user.

    System.out.print("Enter the positive number for finding the factorial: ");
    int num = sc.nextInt();
    
    int factorial = 1;
    for(int i = 1; i<=num; i++) {
      factorial *= i;
    }
    System.out.println("Factorial of " + num + " is " + factorial);


    // Write a program to print the multiplication table of a number N, entered by the user.
    System.out.print("Enter the number to prints its table: ");
    int N = sc.nextInt();
    for(int i = 1; i<= 10; i++) {
      System.out.println(N + " x " + i + " = " + N*i);
    }


    // What is wrong in the following program?
    // for(int i=0;i<=5;i++ ) {
    //   System.out.println("i = "+i);
    // }
    //   System.out.println("i after the loop = "+ i ); // cant access i 
  }
}