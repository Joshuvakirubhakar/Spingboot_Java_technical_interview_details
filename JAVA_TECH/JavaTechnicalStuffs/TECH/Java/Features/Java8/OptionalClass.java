package JAVA_TECH.DesignPatterns.TECH.Java.Features.Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//public class OptionalClass {
////    public static void main(String[] args) {
////        List<String> names = Arrays.asList("Alice","Alan", "Bob", "Charlie", "David", null);
////        names.stream()
////                .filter(name -> Optional.ofNullable(name).map(n -> n.startsWith("A")).orElse(false))
////                .forEach(name -> System.out.println("Found a name starting with A: " + name));
////    }
//
//
//    public static void main(String[] args) {
//        Optional<String> optional = Optional.of("Hello Optional");
//        optional.ifPresent(System.out::println);
//
//        Optional<String> emptyOpt = Optional.empty();
//        System.out.println("Empty optional present? " + emptyOpt.isPresent());
//    }
//
//}




public class OptionalClass {
    public static Optional<String> findUserById(List<String> users, String id) {
        return users.stream()
                .filter(user -> user.equals(id))
                .findFirst();
    }

    public static void main(String[] args) {
        List<String> users = List.of("alice", "bob", "charlie");
        Optional<String> user = findUserById(users, "bob");
        Optional<String> user1 = findUserById(users, "rex");

        user.ifPresentOrElse(
                u -> System.out.println("User found: " + u),
                () -> System.out.println("User not found")
        );
        user1.ifPresentOrElse(
                u -> System.out.println("User found: " + u),
                () -> System.out.println("User not found")
        );
    }
}