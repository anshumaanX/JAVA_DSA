public class ArrayPairs05 {

    /*
     * Print all pairs of elements in an array.
     *
     * We use two loops:
     *
     * i -> selects the first element
     * j -> selects the second element
     *
     * j starts from i + 1 so that:
     *
     * (1, 2) is printed
     * but (2, 1) is not printed.
     *
     * Also, an element is not paired with itself.
     */
    public static void pairs(int arr[]) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                System.out.print(
                    "(" + arr[i] + ", " + arr[j] + ") "
                );
            }

            System.out.println();
        }
    }


    public static void main(String args[]) {

        int array[] = {1, 2, 3, 4, 5, 6};

        /*
         * Call the pairs() method.
         */
        pairs(array);
    }
}