public class TrappingRainWater04 {

    /*
     * Trapping Rain Water
     *
     * For every position, the amount of water trapped is:
     *
     * Water = min(leftMaxBoundary, rightMaxBoundary) - height
     *
     * We create two arrays:
     *
     * leftMaxBoundary  -> stores the maximum height
     *                     from the left side.
     *
     * rightMaxBoundary -> stores the maximum height
     *                     from the right side.
     *
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     */
    public static void rainWaterTrapping(int arr[]) {

        int leftMaxBoundary[] = new int[arr.length];
        int rightMaxBoundary[] = new int[arr.length];

        int totalTrappedWater = 0;


        /*
         * ------------------------------------------------
         * Create Left Maximum Boundary Array
         * ------------------------------------------------
         *
         * leftMaxBoundary[i] stores the maximum height
         * from index 0 to i.
         */

        leftMaxBoundary[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {

            leftMaxBoundary[i] =
                    Math.max(arr[i], leftMaxBoundary[i - 1]);
        }


        /*
         * ------------------------------------------------
         * Create Right Maximum Boundary Array
         * ------------------------------------------------
         *
         * rightMaxBoundary[i] stores the maximum height
         * from index i to the last index.
         */

        rightMaxBoundary[arr.length - 1] =
                arr[arr.length - 1];

        for (int i = arr.length - 2; i >= 0; i--) {

            rightMaxBoundary[i] =
                    Math.max(rightMaxBoundary[i + 1], arr[i]);
        }


        /*
         * ------------------------------------------------
         * Calculate Trapped Water
         * ------------------------------------------------
         *
         * Water at each index:
         *
         * min(left boundary, right boundary) - height
         */

        for (int i = 0; i < arr.length; i++) {

            int waterLevel =
                    Math.min(leftMaxBoundary[i], rightMaxBoundary[i]);

            int trappedWater = waterLevel - arr[i];

            totalTrappedWater += trappedWater;
        }


        /*
         * Print the total amount of trapped water.
         */
        System.out.println(
            "Total trapped water: " + totalTrappedWater
        );
    }


    public static void main(String[] args) {

        int arr[] = {4, 2, 0, 6, 3, 2, 5};

        /*
         * Call the rainWaterTrapping() method.
         */
        rainWaterTrapping(arr);
    }
}