public class MaxSubarraySum03 {

    /*
     * Kadane's Algorithm
     *
     * Used to find the maximum sum among all subarrays.
     *
     * currentSum -> stores the sum of the current subarray
     * maxSum     -> stores the maximum sum found so far
     *
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public static int kadanes(int arr[]) {

        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;


        /*
         * Traverse through the array.
         */
        for (int i = 0; i < arr.length; i++) {

            /*
             * Add the current element to currentSum.
             */
            currentSum += arr[i];


            /*
             * If currentSum becomes negative,
             * it is better to start a new subarray
             * from the next element.
             */
            if (currentSum < 0) {

                currentSum = 0;
            }


            /*
             * Update maxSum if currentSum is greater.
             */
            maxSum = Math.max(currentSum, maxSum);
        }


        /*
         * Return the maximum subarray sum.
         */
        return maxSum;
    }


    public static void main(String[] args) {

        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};


        /*
         * Call Kadane's Algorithm.
         */
        System.out.println(
            "Maximum sum is: " + kadanes(arr)
        );
    }
}