package examples.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamsExample {

    public static void main(String[] args) {
        findEvenNumbers();
        System.out.println("--------------------------------------------------");
        findWordsWithVowelAndSort();
    }

    static void findWordsWithVowelAndSort() {
        ArrayList<String> listOfWords = new ArrayList<>();
        listOfWords.add("Ram");
        listOfWords.add("Tom");
        listOfWords.add("Elf");
        listOfWords.add("Cat");

        System.out.println("BEFORE : " + listOfWords);

        List resultList = listOfWords.stream()
                .filter(element -> element.contains("a"))
                .limit(5)
                .sorted()
                .collect(Collectors.toList());

        System.out.println("AFTER : " + resultList);

    }

    static void findEvenNumbers() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++)
            arrayList.add(new Random().nextInt(100));

        System.out.println("BEFORE : " + arrayList);

        List resultList = arrayList.stream()
                .filter(element -> element % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("AFTER : " + resultList);
    }
}
