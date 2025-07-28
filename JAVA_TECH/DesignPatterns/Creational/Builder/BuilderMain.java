package JAVA_TECH.DesignPatterns.Creational.Builder;

public class BuilderMain {
    public static void main(String[] args) {
        Person person = new Person.Builder("Alice")
                .age(28)
                .city("Bangalore")
                .build();

        System.out.println(person);
    }
}
