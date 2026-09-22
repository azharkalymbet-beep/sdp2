package factorymethod;

public class Espresso implements Drink {
    @Override
    public void prepare() {
        System.out.println("Brewing a strong and bold Espresso under high pressure.");
    }

    @Override
    public double getCost() {
        return 2.50;
    }
}