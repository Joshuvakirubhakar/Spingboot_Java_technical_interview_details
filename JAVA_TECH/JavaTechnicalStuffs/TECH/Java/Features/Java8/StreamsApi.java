package JAVA_TECH.DesignPatterns.TECH.Java.Features.Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamsApi {

    static void printStreams(List<Integer> numbers) {
        List<Integer> filtered_List = numbers.stream().filter(num -> num % 2 == 0)
                .sorted()
               .collect(Collectors.toList());
        filtered_List.forEach(System.out::println);

    }

    public static void main(String[] args) {
        // Example of using Streams API to filter and print even numbers from a list
        List<Integer> numbers = Arrays.asList(1, 22, 224, 4, 5, 6, 7, 8, 9, 10);
        printStreams(numbers);
    }
}
