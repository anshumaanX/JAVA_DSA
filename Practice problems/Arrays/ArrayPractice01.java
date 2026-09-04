public class ArrayPractice01 {

    /*
     * Check if an array contains duplicate elements.
     *
     * Return true:
     * If any value appears at least twice.
     *
     * Return false:
     * If every element is distinct.
     *
     * Example:
     * {1, 2, 3, 2} -> true
     * {1, 2, 3, 4} -> false
     *
     * This approach compares every element with
     * the elements that come after it.
     *
     * Time Complexity: O(n^2)
     * Space Complexity: O(1)
     */
    public static boolean duplicate(int arr[]) {

        for (int i = 0; i < arr.length-1; i++) {

            /*
             * Start j from i + 1 so that we don't
             * compare an element with itself or
             * check the same pair again.
             */
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {

                    return true;
                }
            }
        }

        /*
         * No duplicate was found.
         */
        return false;
    }


    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,10};


        /*
         * Check whether the array contains
         * any duplicate value.
         */
        System.out.println(
            "Contains duplicate: " + duplicate(arr)
        );
    }
}