public class subArray06 {

    /*
     * Print all subarrays of an array.
     *
     * A subarray is a continuous part of an array.
     *
     * Example:
     * For {1, 2, 3}
     *
     * Subarrays are:
     * {1}
     * {1, 2}
     * {1, 2, 3}
     * {2}
     * {2, 3}
     * {3}
     */


    /*
     * i -> starting index of the subarray
     * j -> ending index of the subarray
     * k -> used to print all elements from i to j
     */
    public static void subArray(int arr[]) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {

                for (int k = i; k <= j; k++) {

                    System.out.print(arr[k] + " ");
                }

                System.out.println();
            }

            /*
             * Empty line after all subarrays
             * starting from the current index.
             */
            System.out.println();
        }
    }


    public static void main(String args[]) {

        int arr[] = {1, 2, 3, 4};

        /*
         * Call the subArray() method.
         */
        subArray(arr);
    }
}