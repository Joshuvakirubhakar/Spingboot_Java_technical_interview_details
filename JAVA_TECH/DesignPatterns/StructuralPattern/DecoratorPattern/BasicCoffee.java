package JAVA_TECH.DesignPatterns.StructuralPattern.DecoratorPattern;

public class BasicCoffee implements Coffee {
    public int cost() {
        return 50;
    }

    public String getDescription() {
        return "Basic Coffee";
    }
}
