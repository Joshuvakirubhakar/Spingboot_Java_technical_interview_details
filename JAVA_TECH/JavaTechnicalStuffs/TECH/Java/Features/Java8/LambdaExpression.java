package JAVA_TECH.DesignPatterns.TECH.Java.Features.Java8;

import java.util.Arrays;
import java.util.List;

//public class LambdaExpression {
//    // This is a simple example of using a lambda expression in Java 8
//    // to iterate over a list of names and print whether each name starts with 'R'.
//    //syntax: (parameters) -> expression
//
//    public static void main(String[] args) {
//        List<String> names = Arrays.asList("Ram", "Shyam", "Mohan");
//        names.forEach((name) -> {
//            ;
//            if (name.startsWith("R")) {
//                System.out.println(name + " starts with R");
//            } else {
//                System.out.println(name + " does not start with R");
//            }
//        });
//    }
//
//}


public class LambdaExpression {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Banana", "Cherry");

        // Traditional way - anonymous class
        System.out.println("Traditional way:");
        fruits.forEach(new java.util.function.Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        System.out.println("---");
        // Lambda way - concise and readable
        System.out.println("Lambda way:");

        // Lambda way
        fruits.forEach(fruit -> System.out.println(fruit));
    }
}

