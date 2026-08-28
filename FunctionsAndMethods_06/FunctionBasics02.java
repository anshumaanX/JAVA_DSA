public class FunctionBasics02 {

  // pass by reference vs pass by value ( what we use in java )
  public static void swapTwoNumbers (int a, int b) {
    int temp = a;
    a = b; 
    b = temp;
  }

  // poduct of two numbers
  public static int productOfTwoNumbers(int a, int b) {
    int product = a * b;
    return product;
  }

  // factorial of a number
  public static int factorial (int n) {
    int fact = 1;
    for(int i = n; i>=1; i--) {
      fact *=i;
    }
    return fact;
  }

  // Binomial cofficient
  public static int binomialCofficient (int n, int r) {
    // nCr = n! / (r! * (n - r)!)
    int nFact = factorial(n);
    int rFact = factorial(r);
    int nmr = factorial(n-r);

    int ncr = nFact/(rFact * nmr);

    return ncr;
  }
  public static void main (String args[]) {
    int a = 5;
    int b = 10;
    swapTwoNumbers(a, b); // pass by value ( created the copy )
    System.out.println("a = " +a);
    System.out.println("b = " +b);

    int multiply = productOfTwoNumbers(a, b);
    System.out.println("product of "+ a + " X "+ b + " is " + multiply);

    int fact = factorial(a);
    System.out.println("Fcatorial of "+ a + " is " + fact);

    System.out.println(binomialCofficient(5, 2));
  }
}