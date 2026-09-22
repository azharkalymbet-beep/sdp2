package factorymethod;

public class CappuccinoShop extends CoffeeShop {
    @Override
    public Drink createDrink() {
        return new Cappuccino();
    }
}