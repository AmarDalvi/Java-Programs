package JavaStreams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class FindMethods {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);

//        findFirst() and findAny()

        Optional<Integer> element = list.stream().findFirst();
        if(element.isPresent()){
            System.out.println(element.get());
        }else {
            System.out.println("stream is empty");
        }

//        findAny()
        Optional<Integer> element1 = list.stream().findAny();
        if(element.isPresent()){
            System.out.println(element.get());
        }else {
            System.out.println("stream is empty");
        }
    }

//    count, min, max methods
//    Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
//    System.out.println(stream.count());
    /*





     */
//    Integer integer = stream.min(Comparator.comparing(Integer::valueOf)).get()
 

}
