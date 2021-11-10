package java_examples.interview_recipes;

import java.util.HashSet;

public class SockMerchant1 {

    static int sockMerchant(int n, int[] ar) {
        HashSet<Integer> set = new HashSet<Integer>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int element = ar[i];
            if (set.contains(element)) {
                set.remove(element);
                count++;
            } else {
                set.add(element);
            }

        }
        return count;
    }
}
