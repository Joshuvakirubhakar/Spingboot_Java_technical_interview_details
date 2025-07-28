package JAVA_TECH.DesignPatterns.StructuralPattern.DecoratorPattern;

public abstract class CoffeeDecorator implements Coffee {
    protected Coffee decoratedCoffee;

    public CoffeeDecorator(Coffee coffee) {
        this.decoratedCoffee = coffee;
    }

    public int cost() {
        return decoratedCoffee.cost();
    }

    public String getDescription() {
        return decoratedCoffee.getDescription();
    }
}
