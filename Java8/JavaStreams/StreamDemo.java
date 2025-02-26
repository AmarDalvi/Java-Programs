package JavaStreams;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;



public class StreamDemo {
    public static void main(String[] args) {

        // create a stream
        Stream<String> stream = Stream.of("a","b","c");
        stream.forEach(System.out::println);

        //create stream from sources
        Collection<String> collection = Arrays.asList("Java","J2EE","Spring","hibernate");
        Stream <String> stream2 = collection.stream();
        stream2.forEach(System.out::println);

        List<String> list = Arrays.asList("Java","J2EE","Spring","hibernate");
        Stream <String> stream3 = list.stream();
        stream3.forEach(System.out::println);

        // stream from set
        Set <String> set = new HashSet<>(list);
        Stream <String> stream4 = set.stream();
        stream4.forEach(System.out::println);

        // create stream from arrays
        String[] strArray =  {"a","m","r"};
        Stream<String> stream5 = Arrays.stream(strArray);
        stream5.forEach(System.out::println);

        

    }


    public static class StreamFilter {
    }
}
