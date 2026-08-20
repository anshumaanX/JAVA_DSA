import java.util.*;

public class JavaBasics3 {
  public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
/*  
    // sum of two numbers
    System.out.print("Enter the first number: ");
    int num1 = sc.nextInt();
    
    System.out.print("Enter the second number: ");
    int num2 = sc.nextInt();

    System.out.print("Sum of " + num1 + " and " + num2 + " is " + (num1 + num2));

*/

    // area of circle = pi * r * r
    System.out.print("Enter the radius of circle: ");
    float radius = sc.nextFloat();

    float area = 3.14f * radius * radius;
    System.out.print("Area of circle is: " + area);
    sc.close();
  }
}