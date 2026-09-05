public class SelectionSort {

    /*
     * Selection Sort
     *
     * In Selection Sort, we divide the array into:
     *
     * 1. Sorted part
     * 2. Unsorted part
     *
     * In every pass, we find the smallest element
     * from the unsorted part and place it at the
     * beginning of that part.
     */
    public static void selectionSorting(int arr[]) {

        /*
         * i represents the position where the
         * next smallest element should be placed.
         *
         * We need at most arr.length - 1 passes.
         */
        for (int i = 0; i < arr.length - 1; i++) {

            /*
             * Initially assume that the element at i
             * is the smallest element.
             */
            int smallestIndex = i;


            /*
             * Search for a smaller element in the
             * remaining unsorted part of the array.
             */
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] < arr[smallestIndex]) {

                    smallestIndex = j;
                }
            }


            /*
             * Swap the smallest element with
             * the element at index i.
             */
            int temp = arr[smallestIndex];

            arr[smallestIndex] = arr[i];

            arr[i] = temp;
        }
    }


    /*
     * Print all elements of the array.
     */
    public static void printArray(int arr[]) {

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }
    }


    public static void main(String args[]) {

        int arr[] = {5, 4, 1, 3, 2};


        /*
         * Sort the array using Selection Sort.
         */
        selectionSorting(arr);


        /*
         * Print the sorted array.
         */
        printArray(arr);
    }
}