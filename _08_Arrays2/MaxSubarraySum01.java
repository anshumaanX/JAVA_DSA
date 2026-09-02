public class MaxSubarraySum01 {

    /*
     * Find the maximum sum among all subarrays.
     *
     * This method uses three loops:
     *
     * i -> starting index of the subarray
     * j -> ending index of the subarray
     * k -> calculates the sum from i to j
     *
     * This is the brute-force approach.
     */
    public static int maxSubArray(int arr[]) {

        /*
         * Start with the smallest possible integer value.
         *
         * This is important when the array contains
         * negative numbers.
         */
        int maxSum = Integer.MIN_VALUE;


        /*
         * Select the starting index.
         */
        for (int i = 0; i < arr.length; i++) {

            /*
             * Select the ending index.
             */
            for (int j = i; j < arr.length; j++) {

                int currentSum = 0;


                /*
                 * Calculate the sum of the current subarray.
                 */
                for (int k = i; k <= j; k++) {

                    currentSum += arr[k];
                }


                /*
                 * Print the sum of the current subarray.
                 */
                System.out.print(currentSum + " ");


                /*
                 * Update maxSum if the current subarray
                 * has a greater sum.
                 */
                if (currentSum > maxSum) {

                    maxSum = currentSum;
                }
            }
        }

        System.out.println();

        return maxSum;
    }


    public static void main(String args[]) {

        int arr[] = {1, 2, -3, 4, 5, 6};


        /*
         * Find and print the maximum subarray sum.
         */
        System.out.println(
            "Maximum sum is: " + maxSubArray(arr)
        );
    }
}