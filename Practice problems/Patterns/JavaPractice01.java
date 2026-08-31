
public class JavaPractice01 {

    public static void main(String[] args) {
      // 1
      // 121
      // 12321
      // 1234321
      // 123454321
      for(int i = 1; i <= 5; i++) {
        for(int j = 1; j<=i; j++) {
          System.out.print(j);
        }
        for( int k = i-1; k>=1; k--){
          System.out.print(k);
        }
        System.out.println();
      }

        // 1
        // 212
        // 32123
        // 4321234
        // 543212345
        for(int i = 1; i <= 5; i++) {
        for(int j = i; j>=1; j--) {
          System.out.print(j);
        }
        for( int k = 2; k<=i; k++){
          System.out.print(k);
        }
        System.out.println();
      }
    }
}