public class Pattern03 {

  public static void hollow_rectangle(int row, int col) {
    // print hollow rectangle pattern
    // * * * * * *
    // *         *
    // *         *
    // * * * * * *

    for(int i = 1; i<=row; i++) {
      for(int j = 1; j<=col; j++) {
        if(i == 1 || i == row || j == 1 || j == col) {
          System.out.print("* ");
        } else {
          System.out.print("  ");
        }
      }
        System.out.println();
    }
  }

  public static void inverted_rotated_half_pyramid (int row) {
    // inverted and rotated half pyramid
    //       *
    //     * *
    //   * * *
    // * * * *

    for(int i = 1; i <= row; i++) {
      for(int j = 1; j<=row; j++) {
        if(j<=row-i) {
          System.out.print("  ");
        }else{
          System.out.print("* ");
        }
      }
          System.out.println();
    }

  };

  public static void inverted_half_pyramid_numbers (int row) {
    // Inverted half pyramid with numbers
    // 1 2 3 4 5
    // 1 2 3 4
    // 1 2 3
    // 1 2
    // 1

    for(int i = 1; i <= row; i++) {
      for(int j = 1; j <= row-i+1; j++) {
        System.out.print(j);
      }
        System.out.println();
    }
  };

  public static void floyds_triangle (int row) {
    // FLOYD's Triangle
    // 1
    // 2  3
    // 4  5  6
    // 7  8  9  10
    // 11 12 13 14 15
    int counter = 1;
    for(int i = 1; i <= row; i++) {
      for(int j = 1; j<=i; j++) {
        if(j <= i) {
          System.out.print(counter + " ");
          counter ++;
        }
      }
          System.out.println();
    }
  }

  public static void zero_one_triangle(int n) {
    // 0 - 1  Triangle

    // 1
    // 0 1
    // 1 0 1
    // 0 1 0 1

    for(int i = 1; i <= n; i++) {
      for(int j = 1; j <= i; j++) {
        if( (i + j) % 2 == 0) {
          System.out.print(1);
        }else {
          System.out.print(0);
        }
      }
      System.out.println();
    }
  };

  public static void butterfly (int n) {
    // butterfly pattern
    // *             *
    // * *         * *
    // * * *     * * *
    // * * * * * * * *
    // * * * * * * * *
    // * * *     * * *
    // * *         * *
    // *             *

    for(int i = 1; i <= n; i++) {

      for(int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      for( int j = 1; j<=2*(n-i); j++) {
        System.out.print("  ");
      }
      for(int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
    for(int i = n; i>=1; i--){

      for(int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      for( int j = 1; j<=2*(n-i); j++) {
        System.out.print("  ");
      }
      for(int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();

    }
  }
  public static void main (String args[]) {
    hollow_rectangle(6,12);
    inverted_rotated_half_pyramid(5);
    inverted_half_pyramid_numbers(5);
    floyds_triangle(5);
    zero_one_triangle(5);
    butterfly(4);
  }
}