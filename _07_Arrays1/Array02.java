public class Array02 {

    /*
     * Passing an array as an argument
     *
     * An array can be passed to a method just like
     * other values.
     *
     * The changes made to the array inside the method
     * are reflected in the original array.
     */
    public static void update(int marks[]) {

        for (int i = 0; i < marks.length; i++) {

            marks[i] += 1;
        }
    }


    /*
     * Linear Search
     *
     * Linear search checks each element one by one
     * until the required element is found.
     *
     * Returns:
     * - index of the element if found
     * - -1 if the element is not found
     */
    public static int linearSearch(int numbers[], int key) {

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] == key) {
                return i;
            }
        }

        return -1;
    }


    /*
     * Find the largest and smallest number in an array.
     *
     * The method returns both values in a new array:
     *
     * result[0] -> largest number
     * result[1] -> smallest number
     */
    public static int[] largestAndSmallestNumber(int numbers[]) {

        int largestNumber = numbers[0];
        int smallestNumber = numbers[0];

        for (int i = 1; i < numbers.length; i++) {

            if (largestNumber < numbers[i]) {
                largestNumber = numbers[i];
            }

            if (smallestNumber > numbers[i]) {
                smallestNumber = numbers[i];
            }
        }

        return new int[] {
            largestNumber,
            smallestNumber
        };
    }


    public static void main(String args[]) {

        /*
         * Passing an array as an argument
         */

        int marks[] = {26, 28, 21};

        update(marks);


        /*
         * Printing the updated array.
         */

        System.out.println("Updated marks:");

        for (int i = 0; i < marks.length; i++) {

            System.out.println(marks[i]);
        }


        /*
         * Linear Search
         */

        int numbers[] = {12, 44, 62, 37, 94, 55};

        int index = linearSearch(numbers, 12);

        if (index != -1) {

            System.out.println(
                "Element found at index: " + index
            );

        } else {

            System.out.println("Element not found");
        }


        /*
         * Find largest and smallest number
         */

        int result[] = largestAndSmallestNumber(numbers);

        System.out.println(
            "Largest Number is: " + result[0]
        );

        System.out.println(
            "Smallest Number is: " + result[1]
        );
    }
}