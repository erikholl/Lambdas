package be.intecbrussel;

import java.util.ArrayList;
import java.util.List;

public class LambdaDemo {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Hello ");
        list.add("darkness ");
        list.add("my ");
        list.add("old ");
        list.add("friend ");
        list.add("there ");

        // traditional way:
        for(String word : list) {
            System.out.println(word);
        }

        // lambda way: (parameter) -> do something with parameter
        list.forEach(word -> System.out.println(word));

        // even shorter
        list.forEach(System.out::println);

    }

}
