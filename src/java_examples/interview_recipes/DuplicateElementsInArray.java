package java_examples.interview_recipes;

/**
 * Find Duplicate Elements in Array
 *
 * Using Brute Force
 *
 * Time Complexity : O(n*n)
 */
public class DuplicateElementsInArray {

    public static void main(String[] args) {

        //Initialize array
        int[] arr = new int[]{1, 2, 3, 4, 2, 7, 8, 8, 3};

        // this is not a good solution becoz of time complexity O(n*n)

        System.out.println("Duplicate elements in given array: ");
        //Searches for duplicate element
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    System.out.println(arr[j]);
            }
        }
    }
}
