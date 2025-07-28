package JAVA_TECH.DesignPatterns.TECH.Java.Features.Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorAPIDemo {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");

        Map<String, Long> fruits_count = fruits.stream().collect(Collectors.groupingBy(fruit -> fruit, Collectors.counting()));

        System.out.println(fruits_count);
    }
}
