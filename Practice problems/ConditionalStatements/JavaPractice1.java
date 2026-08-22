import java.util.*;
public class JavaPractice1 {
  public static void main (String args[]) {
    Scanner sc = new Scanner(System.in);
    // Write a programme To get a number from user
    //  And check whether the number is positive or negative

    // System.out.print("Enter the number for checking +ve or -ve: ");
    // int num = sc.nextInt();
    // if(num < 0){
    //   System.out.println(num + " is negative");
    // } else if(num > 0){
    //   System.out.println(num + " is positive");
    // } else {
    //   System.out.println(num + " is neither positive or negative");
    // }

    // Finish the following code so that it prints You have a fever if your 
    // temperature is above 100 and otherwise prints You don't have a fever.

    double temp = 103.5;
    if(temp > 100){
      System.out.println("You have a fever");
    } else {
      System.out.println("You don't have a fever");
    }

    // Write a Java program to input week number (1-7) and print day of week 
    // name using switch cas
      System.out.print("Enter week number from 1 to 7: ");
      int week = sc.nextInt();
      switch(week){
        case 1 -> System.out.println("Monday");
        case 2 -> System.out.println("Tuesday");
        case 3 -> System.out.println("Wednesday");
        case 4 -> System.out.println("Thursday");
        case 5 -> System.out.println("Friday");
        case 6 -> System.out.println("Saturday");
        case 7 -> System.out.println("Sunday");
        default -> System.out.println("choose from 1 to 7 only!");
      }

      // What will be the value of x & y in the following program:
      int a=63, b=36;
      boolean x = (a < b) ? true : false;
      int y = (a > b) ? a : b;
      System.out.println(x);
      System.out.println(y);

      // Write a Java program that takes a year from the user and print whether
      // that year is a leap year or not.
      System.out.println("Enter the year to check where its Leap year or Not");
      System.out.println("Year");
      int year = sc.nextInt();


      if(year % 400 == 0){
          System.out.println(year +" is Leap Year");
      } else if (year % 100 == 0){
          System.out.println(year +" is not Leap Year");
      } else if (year % 4 == 0){
          System.out.println(year +" is Leap Year");
      } else {
          System.out.println(year +" is not Leap Year");
      }

  }
}