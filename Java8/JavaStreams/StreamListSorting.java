package JavaStreams;

//Program to sort list of strings in ascending and descending order using stream api

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamListSorting{

    public static void main(String[] args) {

        List<String> fruits =  new ArrayList<String>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");

//        Ascending order - sorted method with parameter
        List<String> sortedFruits = fruits.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        sortedFruits.forEach(System.out::println);
        System.out.println("_______________________________________");

//        lambda function instead of comparator
        List<String> sortedFruits2 = fruits.stream().sorted((o1,o2)->o1.compareTo(o2)).collect(Collectors.toList());
        sortedFruits2.forEach(System.out::println);

//        Ascending order - sorted method without parameter - default ascending order
        List<String> sortedFruits3 = fruits.stream().sorted().collect(Collectors.toList());
        sortedFruits3.forEach(System.out::println);
        System.out.println("_______________________________________");

//        Descending order
        List<String> sortedFruitsDesc = fruits.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        sortedFruitsDesc.forEach(System.out::println);
        System.out.println("_______________________________________");

//        lambda function instead of comparator
        List<String> sortedFruitsDesc1 = fruits.stream().sorted((o1,o2)->o2.compareTo(o1)).collect(Collectors.toList());
        sortedFruitsDesc1.forEach(System.out::println);
        System.out.println("_______________________________________");

    }
}
