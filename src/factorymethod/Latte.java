package factorymethod;

public class Latte implements Drink {
    @Override
    public void prepare() {
        System.out.println("Mixing espresso with lots of steamed milk and adding delicate foam.");
    }

    @Override
    public double getCost() {
        return 4.00;
    }
}