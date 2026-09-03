public class MaxSubarraySum02 {

    /*
     * Find the maximum sum among all subarrays.
     *
     * This approach uses a Prefix Sum Array.
     *
     * Prefix Sum:
     * prefixArray[i] stores the sum of all elements
     * from index 0 to i.
     *
     * Example:
     *
     * arr = {1, -2, 6, -1, 3}
     *
     * prefixArray = {1, -1, 5, 4, 7}
     *
     * Time Complexity: O(n^2)
     * Space Complexity: O(n)
     */
    public static void maxSubarraySum(int arr[]) {

        /*
         * Start with the smallest possible integer value.
         *
         * This also works if all elements are negative.
         */
        int maxSum = Integer.MIN_VALUE;


        /*
         * Create the Prefix Sum Array.
         */
        int prefixArray[] = new int[arr.length];

        prefixArray[0] = arr[0];


        /*
         * Calculate prefix sums.
         *
         * Each element stores the sum from index 0
         * up to the current index.
         */
        for (int i = 1; i < arr.length; i++) {

            prefixArray[i] = prefixArray[i - 1] + arr[i];
        }


        /*
         * Find the sum of every possible subarray.
         *
         * i -> starting index
         * j -> ending index
         */
        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {

                int sum;

                /*
                 * If the subarray starts from index 0,
                 * its sum is simply prefixArray[j].
                 */
                if (i == 0) {

                    sum = prefixArray[j];

                } else {

                    /*
                     * Otherwise:
                     *
                     * sum = prefixArray[j] - prefixArray[i - 1]
                     *
                     * This gives the sum from index i to j.
                     */
                    sum = prefixArray[j] - prefixArray[i - 1];
                }


                /*
                 * Update maxSum if the current subarray
                 * has a greater sum.
                 */
                if (sum > maxSum) {

                    maxSum = sum;
                }
            }
        }


        /*
         * Print the maximum subarray sum.
         */
        System.out.println("Maximum sum is: " + maxSum);
    }


    public static void main(String args[]) {

        int arr[] = {1, -2, 6, -1, 3};

        /*
         * Call the maxSubarraySum() method.
         */
        maxSubarraySum(arr);
    }
}