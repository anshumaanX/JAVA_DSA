public class BubbleSort {

    /*
     * Bubble Sort
     *
     * Bubble Sort repeatedly compares adjacent elements.
     *
     * If the left element is greater than the right element,
     * we swap them.
     *
     * After every pass, the largest unsorted element
     * moves to its correct position at the end.
     */
    public static void bubbleSorting(int arr[]) {

        /*
         * Number of passes.
         *
         * We need at most arr.length - 1 passes.
         */
        for (int i = 0; i < arr.length - 1; i++) {

            /*
             * Counts how many swaps happened
             * in the current pass.
             */
            int swap = 0;


            /*
             * Compare adjacent elements.
             *
             * arr.length - 1 - i
             *
             * We subtract i because after every pass,
             * one largest element is already placed
             * at the end.
             */
            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {

                    /*
                     * Swap the two elements.
                     */
                    int temp = arr[j];

                    arr[j] = arr[j + 1];

                    arr[j + 1] = temp;

                    swap++;
                }
            }


            /*
             * If no swap happened during a complete pass,
             * the array is already sorted.
             *
             * So there is no need to continue.
             */
            if (swap == 0) {

                break;
            }
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

        int arr[] = {1, 2, 3, 4, 5};

        /*
         * Sort the array.
         */
        bubbleSorting(arr);


        /*
         * Print the sorted array.
         */
        printArray(arr);
    }
}