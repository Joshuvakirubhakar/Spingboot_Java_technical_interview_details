package JAVA_TECH.DesignPatterns.TECH.Java.Features.Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MethodReferenceDemo {
    public static void main(String args[]){
        List<String> names = Arrays.asList("bob", "alan", "Java");
        Set<String> filteredname = names.stream().map(String::toUpperCase).collect(Collectors.toSet());
        filteredname.forEach(System.out::println);
    }
}
