package examples.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExample3 {

    public static void main(String[] args) {

        String[] words = {"apple", "banana", "orange", "grape"};

        List<Integer> wordLengths = Arrays.stream(words)
                .map(String::length)
                .collect(Collectors.toList());

        System.out.println(wordLengths);
    }
}
