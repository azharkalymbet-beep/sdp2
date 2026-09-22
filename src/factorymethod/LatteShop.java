package factorymethod;

public class LatteShop extends CoffeeShop {
    @Override
    public Drink createDrink() {
        return new Latte();
    }
}