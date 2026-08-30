
public class Pattern04 {

  public static void solid_rhombus(int n) {
      // solid rhombus pattern
      //         * * * * *
      //       * * * * *
      //     * * * * *
      //   * * * * *
      // * * * * *

      for (int i = 1; i <= n; i++) {
          for (int j = 1; j <= n - i; j++) {
              System.out.print("  ");
          }
          for (int j = 1; j <= n; j++) {
              System.out.print("* ");
          }
          System.out.println();
      }
  }

  public static void hollow_rhombus(int n) {
      // hollow rhombus pattern
      //         * * * * *
      //       *       *
      //     *       *
      //   *       *
      // * * * * *

      for (int i = 1; i <= n; i++) {
          for (int j = 1; j <= n - i; j++) {
              System.out.print(" ");
          }
          for (int j = 1; j <= n; j++) {
              if (j == 1 || j == n || i == 1 || i == n) {
                  System.out.print("* ");
              } else {
                  System.out.print("  ");
              }
          }
          System.out.println();
      }
  }

  public static void dimond(int row) {
      // dimond pattern
      //           *
      //        *  *  * 
      //      *  *  *  * 
      //   *  *  *  *  *  * 
      //   *  *  *  *  *  *
      //      *  *  *  *
      //         *  *
      //          *

      for (int i = 1; i <= row; i++) {
          for (int j = 1; j <= row-i; j++) {
            System.out.print(" ");
          }
          for(int j = 1; j<=(i*2)-1; j++) {
            System.out.print("*");
          }
            System.out.println();
      }
      for (int i = row; i >= 1; i--) {
          for (int j = 1; j <= row-i; j++) {
            System.out.print(" ");
          }
          for(int j = 1; j<=(i*2)-1; j++) {
            System.out.print("*");
          }
            System.out.println();
      }
  }

    public static void main(String args[]) {
        solid_rhombus(5);
        hollow_rhombus(5);
        dimond(5);
    }
}
