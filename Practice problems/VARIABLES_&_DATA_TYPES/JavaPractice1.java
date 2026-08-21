import java.util.*;

public class JavaPractice1 {
  public static void main (String args[]) {
    /*
      In a program,input 3 numbers: A, B and C.
      You have to output the average of these 3 numbers.
    */

   Scanner sc = new Scanner(System.in);

  //  System.out.println("****Enter the three numbers for getting average*****");
  //  System.out.print("Enter the first number: ");
  //  float num1 = sc.nextInt();

  //  System.out.print("Enter the second number: ");
  //  float num2 = sc.nextInt();
   
  //  System.out.print("Enter the third number: ");
  //  float num3 = sc.nextInt();

  // float average = (num1 + num2 + num3)/3;
  // System.out.println("Average of " + (int)num1 + " " + (int)num2 + " " +(int)num3 + " is: " + average);



  /*
    Enter cost of 3 items from the user (using float data type) - a pencil, a pen and an eraser. 
    You have to output the total cost of the items back to the user as their bill.
    (Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)
  */

  System.out.println("Enter the cost of following stationary items: ");

  System.out.print("Eraser: ");
  float eraser = sc.nextFloat();

  System.out.print("Pen: ");
  float pen = sc.nextFloat();

  System.out.print("Pencil: ");
  float pencil = sc.nextFloat();

  float total = eraser + pen + pencil;

  System.out.println("cost of Eraser $"+eraser);
  System.out.println("cost of Pen $"+pen);
  System.out.println("cost of Pencil $"+pencil);
  System.out.println("Total cost before GST: $"+total);
  System.out.println("GST 18%: $"+(total*0.18));
  System.out.println("Total cost after GST: $"+((total)+(total*0.18)));
   sc.close();
  }
}