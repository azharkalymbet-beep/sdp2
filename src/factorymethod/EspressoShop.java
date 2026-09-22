package factorymethod;

public class EspressoShop extends CoffeeShop {
    @Override
    public Drink createDrink() {
        return new Espresso();
    }
}