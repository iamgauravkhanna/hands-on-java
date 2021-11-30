package java_examples.interview_recipes;

// Program to find duplicate elements in an array and print them

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DuplicateElementsInArray2 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();

		// Form a list of numbers
		for (int i = 0; i < 19; i++) {
			list.add(String.valueOf(i));
		}

		// Insert a new set of numbers
		for (int i = 0; i < 19; i += 2) {
			list.add(String.valueOf(i));
		}

		System.out.println("Input list : " + list);

        // Time Complexity = O(n)
		findDuplicate(list);
	}

    private static void findDuplicate(ArrayList<String> list) {

	    Set<String> set = new HashSet<String>();
	    Set<String> duplicate = new HashSet<String>();

	    for(String string : list){
	        if(set.add(string)==false){
                duplicate.add(string);
            }
        }
        System.out.println("Duplicate Values list : " + duplicate);
    }
}