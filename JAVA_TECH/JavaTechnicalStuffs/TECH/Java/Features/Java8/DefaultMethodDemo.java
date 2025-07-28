package JAVA_TECH.DesignPatterns.TECH.Java.Features.Java8;

interface MyInterface {
    void abstractMethod();

    default void defaultMethod() {
        System.out.println("Default method implementation");
    }
}

public class DefaultMethodDemo implements MyInterface {
    public void abstractMethod() {
        System.out.println("Implemented abstract method");
    }

    public static void main(String[] args) {
        DefaultMethodDemo obj = new DefaultMethodDemo();
        obj.abstractMethod();
        obj.defaultMethod();
    }
}
