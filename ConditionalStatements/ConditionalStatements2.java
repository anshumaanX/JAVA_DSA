import java.util.*;
public class ConditionalStatements2 {

    public static void main(String args[]) {
      // largest of two numbers
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter 3 numbers to find maximun:");
      System.out.print("Enter a: ");
      int a = sc.nextInt();
      System.out.print("Enter b: ");
      int b = sc.nextInt();
      System.out.print("Enter c: ");
      int c = sc.nextInt();
      if (a >= b && a >= c) {
          System.out.println(a + " is maximum");
      } else if (b >= a && b >= c) {
          System.out.println(b + " is maximum");
      } else {
          System.out.println(c + " is maximum");
      }

      // ternary Operator
      // prime or not prime
      System.out.println("Enter the number for checking: prime or not");
      int number = sc.nextInt();
      boolean isPrime = true;
      if(number <= 1) {
        isPrime = false;
      }
      for(int i = 2; i < number; i++){
        if(number % i == 0) {
          isPrime = false;
          break;
        }
      }
      System.out.println(isPrime ? number +" is prime" :  number +" is not prime");

      // student is pass or fail ( minimum 33 marks for passing)
      int marks = 33;
      String result = marks >= 33 ? "pass" : "fail";
      System.out.println(result);

      // Switch case
      int output = 5;
      switch(output) {
        case 1 -> System.out.println("Case 1");
        case 2 -> System.out.println("Case 2");
        case 3 -> System.out.println("Case 3");
        case 4 -> System.out.println("Case 4");
        case 5 -> System.out.println("Case 5");
        case 6 -> System.out.println("Case 6");
        default -> System.out.println("Case default");
      }

      // calculator using switch statement
      System.out.println("-----Calculator------");
      System.out.print("Enter first number: ");
      int a1 = sc.nextInt();
      System.out.print("Enter second number: ");
      int a2 = sc.nextInt();
      System.out.print("Choose operation: +, -, *, /, %");
      char operator = sc.next().charAt(0);

      switch(operator){
        case '+' -> System.out.println(a1 + " " + operator + " " + a2 + " = " + (a1 + a2));
        case '-' -> System.out.println(a1 + " " + operator + " " + a2 + " = " + (a1 - a2));
        case '*' -> System.out.println(a1 + " " + operator + " " + a2 + " = " + (a1 * a2));
        case '/' -> System.out.println(a1 + " " + operator + " " + a2 + " = " + (a1 / a2));
        case '%' -> System.out.println(a1 + " " + operator + " " + a2 + " = " + (a1 % a2));
        default -> System.out.println("Please choose the operator from the list only!");
      }
    }
}