public class BinarySearch03 {

    /*
     * Binary Search
     *
     * Binary search is used to find the position of a key
     * in a sorted array.
     *
     * The array must be sorted for binary search to work.
     *
     * Instead of checking every element one by one,
     * we check the middle element and eliminate half
     * of the search area after every comparison.
     */
    public static int binarySearch(int arr[], int key) {

        int start = 0;
        int end = arr.length - 1;

        /*
         * Continue searching while there is still
         * a valid search range.
         */
        while (start <= end) {

            // Find the middle index
            int mid = (start + end) / 2;


            /*
             * If the middle element is equal to the key,
             * return its index.
             */
            if (key == arr[mid]) {

                return mid;
            }


            /*
             * If the key is smaller than the middle element,
             * search in the left half.
             */
            if (key < arr[mid]) {

                end = mid - 1;

            } else {

                /*
                 * If the key is greater than the middle element,
                 * search in the right half.
                 */
                start = mid + 1;
            }
        }


        /*
         * If the loop ends, the key was not found.
         */
        return -1;
    }


    public static void main(String args[]) {

        /*
         * Binary search requires a sorted array.
         */

        int arr[] = {4, 5, 6, 7, 8, 9, 10, 11, 12};

        int key = 13;


        /*
         * Call the binarySearch() method.
         */
        int result = binarySearch(arr, key);


        /*
         * If result is not -1, the element was found.
         *
         * Otherwise, the element was not found.
         */
        if (result != -1) {

            System.out.println(
                "Element found at index: " + result
            );

        } else {

            System.out.println("Element not found!");
        }
    }
}