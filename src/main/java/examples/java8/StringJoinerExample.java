package examples.java8;

import java.util.StringJoiner;

public class StringJoinerExample {

    public static void main(String[] args) {
        StringJoiner stringJoiner = new StringJoiner(", ");
        stringJoiner.add("Red");
        stringJoiner.add("Blue");
        stringJoiner.add("Green");
        System.out.println(stringJoiner);

        StringJoiner stringJoiner2 = new StringJoiner(", ", "[", "]");
        stringJoiner2.add("Java");
        stringJoiner2.add("Python");
        stringJoiner2.add("JavaScript");
        System.out.println(stringJoiner2);

        stringJoiner.merge(stringJoiner2);
        System.out.println(stringJoiner);
    }
}
