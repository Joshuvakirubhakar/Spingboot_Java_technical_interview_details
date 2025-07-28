package JAVA_TECH.DesignPatterns.TECH.Java.Features.Java8;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

// Custom Functional Interface
@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);

    // Default method allowed
    default void description() {
        System.out.println("Performs a calculation on two integers.");
    }

    // Static method allowed
    static void info() {
        System.out.println("Calculator Interface");
    }
}

public class FunctionalInterfaceCompleteDemo {

    public static void main(String[] args) {

        // 1. Using Custom Functional Interface with Lambda
        Calculator add = (a, b) -> a + b;
        Calculator multiply = (a, b) -> a * b;

        System.out.println("Addition: " + add.calculate(5, 3));       // 8
        System.out.println("Multiplication: " + multiply.calculate(5, 3)); // 15
        add.description();
        Calculator.info();

        System.out.println("\n--- Built-in Functional Interfaces ---");

        // 2. Predicate<T>: test a condition returning boolean
        Predicate<String> startsWithA = s -> s.startsWith("A");
        System.out.println("Does 'Apple' start with A? " + startsWithA.test("Apple")); // true
        System.out.println("Does 'Banana' start with A? " + startsWithA.test("Banana")); // false

        // Filtering list with Predicate
        List<String> names = Arrays.asList("Alice", "Bob", "Anna", "Mike");
        List<String> filteredNames = names.stream()
                .filter(startsWithA)
                .collect(Collectors.toList());
        System.out.println("Filtered names starting with A: " + filteredNames);

        // 3. Function<T,R>: transform T to R
        Function<String, Integer> stringLength = String::length;
        int length = stringLength.apply("Functional Interface");
        System.out.println("Length of string: " + length);

        // Using Function in stream map()
        List<Integer> nameLengths = names.stream()
                .map(stringLength)
                .collect(Collectors.toList());
        System.out.println("Name lengths: " + nameLengths);

        // 4. Consumer<T>: performs an action on T, returns void
        Consumer<String> printUpperCase = s -> System.out.println(s.toUpperCase());
        System.out.print("Names in uppercase: ");
        names.forEach(printUpperCase);

        // 5. Supplier<T>: supplies a value, no input
        Supplier<Double> randomSupplier = () -> Math.random();
        System.out.println("\nRandom number supplied: " + randomSupplier.get());

        // 6. Real-world callback example using Runnable (another functional interface)
        Runnable task = () -> System.out.println("Task executed in a separate thread.");
        new Thread(task).start();

        // 7. Deferred execution example using Supplier
        Supplier<String> deferredValue = () -> "Lazy evaluation at " + System.currentTimeMillis();
        System.out.println("Deferred value (not called yet)");
        System.out.println("Calling deferredValue.get(): " + deferredValue.get());
    }
}

