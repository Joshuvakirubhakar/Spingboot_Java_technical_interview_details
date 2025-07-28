package JAVA_TECH.DesignPatterns.StructuralPattern.DecoratorPattern;

public class DecoratorPatternMainClass {
    public static void main(String[] args) {
        Coffee coffee = new MilkDecorator(new SugarDecorator(new BasicCoffee()));

        System.out.println(coffee.getDescription() + " costs ₹" + coffee.cost());
    }
}
