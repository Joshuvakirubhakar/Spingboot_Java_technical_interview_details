package JAVA_TECH.DesignPatterns.StructuralPattern.Adapter;

public class AdapterPatternExample {
    public static void main(String[] args) {
        Voltage220V oldCharger = new Voltage220V();
        Voltage5V charger = new VoltageAdapter(oldCharger);

        int output = charger.output5V();
        System.out.println("Output voltage: " + output + "V");
    }
}
