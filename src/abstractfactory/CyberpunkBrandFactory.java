package abstractfactory;

public class CyberpunkBrandFactory implements CoffeeServingFactory {
    @Override
    public Cup createCup() {
        return new CyberCup();
    }

    @Override
    public Lid createLid() {
        return new CyberLid();
    }

    @Override
    public Receipt createReceipt() {
        return new CyberReceipt();
    }
}