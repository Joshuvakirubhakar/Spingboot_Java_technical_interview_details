package JAVA_TECH.DesignPatterns.Singleton;


public class SingletonDemo
{
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println("Are they the same? " + (instance1 == instance2));
    }
}
