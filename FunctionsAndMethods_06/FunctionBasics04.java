public class FunctionBasics04 {

    /*
     * Check whether a number is prime or not.
     *
     * A prime number is a number greater than 1
     * that has only two factors: 1 and itself.
     *
     * We check divisibility up to sqrt(a).
     */
    public static boolean checkPrime(int a) {

        if (a <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(a); i++) {

            if (a % i == 0) {
                return false;
            }
        }

        /*
         * Another simple approach:
         *
         * for (int i = 2; i < a; i++) {
         *     if (a % i == 0) {
         *         return false;
         *     }
         * }
         */

        return true;
    }


    /*
     * Print all prime numbers in a range.
     *
     * This method checks every number from 2
     * up to n and prints the prime numbers.
     */
    public static void primeRange(int n) {

        for (int i = 2; i < n; i++) {

            if (checkPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }


    /*
     * Binary to Decimal
     *
     * Converts a binary number into its decimal equivalent.
     *
     * Example:
     * Binary 111 = Decimal 7
     *
     * Each binary digit is multiplied by a power of 2.
     */
    public static void binaryToDecimal(int n) {

        int copyBin = n;
        int decimal = 0;
        int pow = 0;

        while (n > 0) {

            int digit = n % 10;

            decimal = decimal
                    + (digit * (int) Math.pow(2, pow));

            n /= 10;
            pow++;
        }

        System.out.println(
            "Decimal of " + copyBin + " is " + decimal
        );
    }


    /*
     * Decimal to Binary
     *
     * Converts a decimal number into its binary equivalent.
     *
     * The remainder after dividing by 2 gives
     * each binary digit.
     */
    public static void decimalToBinary(int n) {

        int numCopy = n;
        int pow = 0;
        int binary = 0;

        while (n > 0) {

            int rem = n % 2;

            binary = binary
                    + (rem * (int) Math.pow(10, pow));

            pow++;
            n /= 2;
        }

        System.out.println(
            "Binary of " + numCopy + " is " + binary
        );
    }


    public static void main(String args[]) {
        int a = 18;

        System.out.println(
            a + " is "
            + (checkPrime(a) ? "prime" : "not prime")
        );


        primeRange(a);

        System.out.println();

        binaryToDecimal(111);

        decimalToBinary(12);
    }
}