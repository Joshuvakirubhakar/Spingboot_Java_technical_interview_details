package JAVA_TECH.DesignPatterns.StructuralPattern.Adapter;

public class VoltageAdapter implements Voltage5V {
    private Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int volts = voltage220V.output220V();
        System.out.println("Adapter converts " + volts + "V to 5V");
        return 5;
    }
}
