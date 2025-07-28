package JAVA_TECH.DesignPatterns.TECH.Java.Features.Java8;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class StreamAdvancedExample {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alice", 23, "Female"),
                new Person("Bob", 31, "Male"),
                new Person("Carol", 28, "Female"),
                new Person("David", 31, "Male"),
                new Person("Eve", 23, "Female")
        );

        // Group people by age
        Map<Integer, List<Person>> groupByAge = people.stream()
                .collect(Collectors.groupingBy(Person::getAge));
        System.out.println("Grouped by Age: " + groupByAge);

        // Partition people by gender (Male or not)
        Map<Boolean, List<Person>> partitionByGender = people.stream()
                .collect(Collectors.partitioningBy(p -> p.getGender().equals("Male")));
        System.out.println("Partitioned by Male Gender: " + partitionByGender);

        // Summarize ages
        IntSummaryStatistics ageStats = people.stream()
                .collect(Collectors.summarizingInt(Person::getAge));
        System.out.println("Age Summary: " + ageStats);
    }
}

class Person {
    private String name;
    private int age;
    private String gender;

    public Person(String name, int age, String gender) {
        this.name = name; this.age = age; this.gender = gender;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public String getGender() { return gender; }

    @Override
    public String toString() {
        return name + "(" + age + ", " + gender + ")";
    }
}
