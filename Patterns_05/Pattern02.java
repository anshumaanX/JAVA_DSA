public class Pattern02 {
  public static void main (String args[]) {

    // hollow square
    // * * * *
    // *     *
    // *     *
    // * * * *
    for(int i = 1; i<=4; i++) {
      for(int j = 1; j<=4; j++) {
        if(i == 1 || i == 4 || j == 1 || j==4) {
          System.out.print("* ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }


    // hollow triangle
    // * 
    // * * 
    // *   * 
    // *     * 
    // * * * * *

    for(int i = 1; i<=5; i++) {
      for(int j =1; j<=i; j++) {
        if(j == 1 || j==i || i==5) {
          System.out.print("* ");
        } else {
          System.out.print("  ");
        }
      }
        
      System.out.println();
    }

    // inverted rotated half pyramid
    //       *
    //     * *
    //   * * *
    // * * * *
        System.out.println(" ------------------------------------------------ ");

    for(int i = 1; i<= 4; i++) {
      for(int j = 1; j<=4; j++) {

        if(j<=4-i) {
          System.out.print("  ");
        }else {
          System.out.print("* ");
        }
      }
        System.out.println();
    }
  }
}