package JAVA_TECH.DesignPatterns.TECH.Java.Features;

public class StringAllMethodsDemo {

    public static void main(String[] args) {
        String str = "Hello, World!";
        String str2 = "   Java Programming   ";

        // Length
        System.out.println("Length: " + str.length());

        // charAt
        System.out.println("Char at 0: " + str.charAt(0));

        // substring
        System.out.println("Substring (7): " + str.substring(7));
        System.out.println("Substring (0, 5): " + str.substring(0, 5));

        // contains
        System.out.println("Contains 'World': " + str.contains("World"));

        // equals & equalsIgnoreCase
        System.out.println("Equals 'hello': " + str.equals("hello"));
        System.out.println("EqualsIgnoreCase 'hello, world!': " + str.equalsIgnoreCase("hello, world!"));

        // isEmpty & isBlank
        System.out.println("Is Empty: " + "".isEmpty());
        System.out.println("Is Blank: " + "   ".isBlank());

        // trim, strip, stripLeading, stripTrailing
        System.out.println("Trimmed: '" + str2.trim() + "'");
        System.out.println("Strip: '" + str2.strip() + "'");
        System.out.println("Strip Leading: '" + str2.stripLeading() + "'");
        System.out.println("Strip Trailing: '" + str2.stripTrailing() + "'");

        // toLowerCase, toUpperCase
        System.out.println("Lower: " + str.toLowerCase());
        System.out.println("Upper: " + str.toUpperCase());

        // startsWith, endsWith
        System.out.println("Starts with 'Hello': " + str.startsWith("Hello"));
        System.out.println("Ends with '!': " + str.endsWith("!"));

        // indexOf, lastIndexOf
        System.out.println("Index of 'o': " + str.indexOf('o'));
        System.out.println("Last Index of 'o': " + str.lastIndexOf('o'));

        // replace, replaceAll, replaceFirst
        System.out.println("Replace 'l' with 'x': " + str.replace('l', 'x'));
        System.out.println("ReplaceAll 'o.': " + str.replaceAll("o.", "oo"));
        System.out.println("ReplaceFirst 'l': " + str.replaceFirst("l", "L"));

        // split
        String[] parts = str.split(", ");
        System.out.println("Split by ', ':");
        for (String part : parts) {
            System.out.println("- " + part);
        }

        // repeat (Java 11+)
        System.out.println("Repeat 3 times: " + "Hi ".repeat(3));

        // join
        System.out.println("Join: " + String.join(" - ", "Apple", "Banana", "Orange"));

        // matches (regex)
        System.out.println("Matches regex '[A-Za-z ,!]+': " + str.matches("[A-Za-z ,!]+"));

        // format
        String name = "John";
        int age = 25;
        System.out.println(String.format("My name is %s and I am %d years old.", name, age));

        // valueOf
        int number = 123;
        System.out.println("Value of int: " + String.valueOf(number));

        // compareTo, compareToIgnoreCase
        System.out.println("CompareTo 'hello': " + str.compareTo("hello"));
        System.out.println("CompareToIgnoreCase 'hello, world!': " + str.compareToIgnoreCase("hello, world!"));

        // codePointAt, codePointBefore, codePointCount
        System.out.println("CodePointAt(1): " + str.codePointAt(1));
        System.out.println("CodePointBefore(1): " + str.codePointBefore(1));
        System.out.println("CodePointCount(0, 5): " + str.codePointCount(0, 5));

        // toCharArray
        char[] chars = str.toCharArray();
        System.out.print("toCharArray: ");
        for (char c : chars) System.out.print(c + " ");
        System.out.println();

        // intern
        String a = new String("Test");
        String b = "Test";
        System.out.println("a == b: " + (a == b));
        System.out.println("a.intern() == b: " + (a.intern() == b));
    }
}


