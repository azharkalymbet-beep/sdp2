package abstractfactory;

public class EcoCup implements Cup {
    @Override
    public void hold() {
        System.out.println("Holding biodegradable paper cup.");
    }
}