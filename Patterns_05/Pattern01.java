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
  }
}