public class ReverseArray04 {

    /*
     * Reverse an Array
     *
     * We use two variables:
     *
     * start -> points to the first element
     * end   -> points to the last element
     *
     * We swap these elements and then move:
     *
     * start -> forward
     * end   -> backward
     *
     * We continue until start and end meet.
     */
    public static int[] reverseArray(int arr[]) {

        int start = 0;
        int end = arr.length - 1;


        /*
         * Continue swapping while start is
         * smaller than end.
         */
        while (start < end) {

            /*
             * Store the value at start temporarily.
             */
            int temp = arr[start];

            /*
             * Put the value from end at start.
             */
            arr[start] = arr[end];

            /*
             * Put the original start value at end.
             */
            arr[end] = temp;


            /*
             * Move towards the middle.
             */
            start++;
            end--;
        }


        /*
         * Return the reversed array.
         */
        return arr;
    }


    public static void main(String args[]) {

        int arr[] = {0, 1, 2, 3, 4, 5};


        /*
         * Call reverseArray() and store
         * the returned array.
         */
        int result[] = reverseArray(arr);


        /*
         * Print the reversed array.
         */
        System.out.println("Reversed array:");

        for (int i = 0; i < result.length; i++) {

            System.out.print(result[i]+" ");
        }
    }
}