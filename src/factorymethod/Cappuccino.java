package factorymethod;

public class Cappuccino implements Drink {
    @Override
    public void prepare() {
        System.out.println("Preparing a balanced Cappuccino with equal parts espresso, milk, and foam.");
    }

    @Override
    public double getCost() {
        return 3.50;
    }
}