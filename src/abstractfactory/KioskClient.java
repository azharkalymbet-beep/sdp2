package abstractfactory;

public class KioskClient {
    private final Cup cup;
    private final Lid lid;
    private final Receipt receipt;

    // Фабрика передается через композицию (конструктор)
    public KioskClient(CoffeeServingFactory factory) {
        this.cup = factory.createCup();
        this.lid = factory.createLid();
        this.receipt = factory.createReceipt();
    }

    public void serveOrder() {
        System.out.println("--- Serving Coffee Package ---");
        cup.hold();
        lid.seal();
        receipt.print();
        System.out.println("Package served consistently!\n");
    }
}