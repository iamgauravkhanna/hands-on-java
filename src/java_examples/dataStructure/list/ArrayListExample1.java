package java_examples.dataStructure.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample1 {

    public static void main(String arg[]){

        List<String> list = new ArrayList<>();

        list.add("Berlin") ;

        list.add("Tokyo") ;

        list.add("Helsinki") ;

        for(String city : list){

            System.out.println(city);

        }
    }
}
