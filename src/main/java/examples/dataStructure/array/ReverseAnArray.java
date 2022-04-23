package java.examples.dataStructure.array;

import java.util.Arrays;

// Program to Reverse an array

public class ReverseAnArray {

    public static void main(String args[]) {
        usingIterativeWay(new int[]{1, 2, 3, 4, 5, 6, 7, 8}); // even elements
        usingIterativeWay(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}); // odd elements
        usingIterativeWay(new int[]{3, 2}); // two elements
        usingIterativeWay(new int[]{3}); // single element
    }

    // Iterative way
    // Time Complexity : O(n)
    static void usingIterativeWay(int[] integerArr) {
        int temp, start, end;
        start = 0;
        end = integerArr.length - 1;
        while (start < end) {
            temp = integerArr[start];
            integerArr[start] = integerArr[end];
            integerArr[end] = temp;
            start += 1;
            end -= 1;
        }
        System.out.println(Arrays.toString(integerArr));
    }

    // Recursive way
    // Time Complexity : O(n)
}
