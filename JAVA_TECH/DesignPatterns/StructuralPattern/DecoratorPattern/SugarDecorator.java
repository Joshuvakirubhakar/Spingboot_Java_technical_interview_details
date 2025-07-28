package JAVA_TECH.DesignPatterns.StructuralPattern.DecoratorPattern;

public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    public int cost() {
        return super.cost() + 10;
    }

    public String getDescription() {
        return super.getDescription() + ", Sugar";
    }
}
