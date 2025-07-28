package JAVA_TECH.DesignPatterns.TECH.Java.Features.Java11;

import java.util.Optional;

public class OptionalEnhanced {
    public static void main(String[] args) {
//        Optional<String> emptyOpt = "Optional.empty();".describeConstable();
        Optional<String> opt = Optional.of("Hello, Java 11!");
        System.out.println("Is empty: " + opt.isEmpty());
        System.out.println("Is present: " + opt.isPresent());
        System.out.println("Value: " + opt.get());
        Optional<String> emptyOpt = Optional.ofNullable(null);
        System.out.println("Is empty: " + emptyOpt.isEmpty());
        System.out.println("OrElse: " + emptyOpt.orElse("Default Value"));
        System.out.println("OrElseGet: " + emptyOpt.orElseGet(() -> "Generated Value"));
//        System.out.println("OrElseThrow: " + emptyOpt.orElseThrow(() -> new IllegalArgumentException("Value is absent")));
        emptyOpt.ifPresent(value -> System.out.println("Value is present: " + value));

    }

}
