package JAVA_TECH.DesignPatterns.TECH.Java.Features.Java11;

public class StringMethodsJava11 {

    public static void main(String[] args) {
        String str = "  Hello Java 11  ";

        System.out.println("isBlank: " + str.isBlank());
        System.out.println("strip: '" + str.strip() + "'");
        System.out.println("stripLeading: '" + str.stripLeading() + "'");
        System.out.println("stripTrailing: '" + str.stripTrailing() + "'");
        System.out.println("repeat: " + "Hi! ".repeat(3));

        String multiline = "Line1\nLine2\nLine3";
        System.out.println("lines():");
        multiline.lines().forEach(System.out::println);

    }
}
