public class Pattern01 {
  public static void main (String args[]) {
    // star pattern
    // right angle star triangle
    //*
    //* *
    //* * *
    //* * * *

    for(int i = 1; i <=4; i++) {
      for(int j = 1; j <= i; j++){
        System.out.print("* ");
      }
      System.out.println("");
    }

    // inverted star pattern
    // * * * *
    // * * *
    // * *
    // *

    System.out.println("---------------------------------");
    for(int i = 1; i <= 4; i++) {
      for(int j = 1; j <= 4-i+1; j++) {
        System.out.print("* ");
      }
        System.out.println("");
    }

    System.out.println("---------------------------------");
    // half pyramid number pattern
    //1
    //1 2
    //1 2 3
    //1 2 3 4

    for(int i = 1; i<= 4; i++) {
      for(int j = 1; j <= i; j++) {
        System.out.print(j);
      }
        System.out.println();
    }

    // character pattern
    // A
    // B C
    // D E F
    // G H I J

    char c = 'A';
    for(int i = 1; i <= 4; i++) {
      for(int j = 1; j<= i; j++) {
        System.out.print(c);
        c++;
      }
        System.out.println();
    }
  }
}