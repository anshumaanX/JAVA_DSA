import java.util.*;
public class primeNumber {
  public static void main (String args[]) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the number to check its prime or not: ");
    int num = sc.nextInt();

    boolean isPrime = true;

    if(num <= 1) {
      isPrime = false;
    }
    for(int i = 2; i < num; i++) {
      if(num % i == 0) {
        isPrime = false;
        break;
      }
    };
    System.out.println(num + " is " + (isPrime  ? "prime" : "not prime"));
  }
}