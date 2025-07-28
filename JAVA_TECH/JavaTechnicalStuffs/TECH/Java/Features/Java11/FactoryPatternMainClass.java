package JAVA_TECH.DesignPatterns.TECH.Java.Features.Java11;

public class FactoryPatternMainClass {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        Shape shape1 = factory.getShape("CIRCLE");
        shape1.draw();

        Shape shape2 = factory.getShape("SQUARE");
        shape2.draw();
    }


}
