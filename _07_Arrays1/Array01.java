import java.util.Scanner;

public class Array01 {

    public static void main(String args[]) {

        /*
         * Arrays
         *
         * An array is used to store multiple values
         * of the same data type.
         *
         * Array index starts from 0.
         */


        /*
         * ------------------------------------------------
         * Creating an Array
         * ------------------------------------------------
         *
         * This creates an integer array that can store
         * 50 integer values.
         *
         * All elements initially contain 0.
         */

        int marks[] = new int[50];


        /*
         * Creating and initializing an array
         * at the same time.
         */

        int numbers[] = {1, 2, 3};

        String fruits[] = {"apple", "banana", "orange"};


        /*
         * ------------------------------------------------
         * Taking Input in an Array
         * ------------------------------------------------
         *
         * Creating an array to store marks of subjects.
         */

        int subjectMarks[] = new int[100];

        Scanner sc = new Scanner(System.in);


        /*
         * Taking marks as input.
         *
         * Index 0 -> Physics
         * Index 1 -> Chemistry
         * Index 2 -> Mathematics
         */

        System.out.print("Enter Physics marks: ");
        subjectMarks[0] = sc.nextInt();

        System.out.print("Enter Chemistry marks: ");
        subjectMarks[1] = sc.nextInt();

        System.out.print("Enter Mathematics marks: ");
        subjectMarks[2] = sc.nextInt();


        /*
         * ------------------------------------------------
         * Accessing Array Elements
         * ------------------------------------------------
         *
         * We use the index to access a particular element.
         */

        System.out.println("Physics: " + subjectMarks[0]);
        System.out.println("Chemistry: " + subjectMarks[1]);
        System.out.println("Mathematics: " + subjectMarks[2]);


        /*
         * ------------------------------------------------
         * Updating Array Elements
         * ------------------------------------------------
         *
         * We can change the value stored at an index.
         */

        subjectMarks[2] = 4;

        // Increasing the Chemistry marks by 1
        subjectMarks[1] = subjectMarks[1] + 1;


        /*
         * Calculating the average percentage
         * of the three subjects.
         */

        int percentage =
                (subjectMarks[0]
                + subjectMarks[1]
                + subjectMarks[2]) / 3;


        /*
         * Printing the updated values.
         */

        System.out.println("Mathematics: " + subjectMarks[2]);
        System.out.println("Chemistry: " + subjectMarks[1]);

        System.out.println("Percentage: " + percentage);


        /*
         * ------------------------------------------------
         * Array Length
         * ------------------------------------------------
         *
         * .length gives the total number of elements
         * an array can store.
         */

        System.out.println(
            "Length of array: " + subjectMarks.length
        );


        sc.close();
    }
}