package JAVA_TECH.DesignPatterns.TECH.Java.Features.Java8;

import java.util.function.Function;

public class SimpleFunctionalInterface {

    public static void main(String[] args) {
        Function<Integer, String> intToString = (Integer i) -> "Number: " + i;
        String result = intToString.apply(5);
        System.out.println(result+" -is converted from Number to string using functional interface"); // Output: Number: 5
    }
}
