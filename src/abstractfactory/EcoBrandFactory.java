package abstractfactory;

public class EcoBrandFactory implements CoffeeServingFactory {
    @Override
    public Cup createCup() {
        return new EcoCup();
    }

    @Override
    public Lid createLid() {
        return new EcoLid();
    }

    @Override
    public Receipt createReceipt() {
        return new EcoReceipt();
    }
}