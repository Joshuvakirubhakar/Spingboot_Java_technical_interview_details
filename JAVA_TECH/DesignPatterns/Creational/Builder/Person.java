package JAVA_TECH.DesignPatterns.Creational.Builder;

public class Person {
    private final String name;
    private final int age;
    private final String city;

    private Person(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.city = builder.city;
    }

    public static class Builder {
        private final String name; // required
        private int age = 0;       // optional default
        private String city = "";  // optional default

        public Builder(String name) {
            this.name = name;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder city(String city) {
            this.city = city;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }

    @Override
    public String toString() {
        return "Person{name='" + name + '\'' + ", age=" + age + ", city='" + city + '\'' + '}';
    }
}

