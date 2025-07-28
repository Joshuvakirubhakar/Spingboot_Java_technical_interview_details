package JAVA_TECH.DesignPatterns.TECH.Java.Features.Java11;

import java.util.List;

public class VarParameterInLambda {
    public static void main(String[] args) {
        List<String> names = List.of("Ram", "Shyam", "Geeta");
        names.forEach((var name) -> System.out.println("Hello " + name));
    }
}
