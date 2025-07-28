package JAVA_TECH.DesignPatterns.StructuralPattern.DecoratorPattern;

public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    public int cost() {
        return super.cost() + 20;
    }

    public String getDescription() {
        return super.getDescription() + ", Milk";
    }
}
