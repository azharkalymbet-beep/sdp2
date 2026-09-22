package factorymethod;

public class MainFactoryMethod {
    public static void main(String[] args) {
        // Клиентский код никогда не вызывает напрямую "new Espresso()"
        CoffeeShop shop1 = new EspressoShop();
        shop1.orderCoffee();

        CoffeeShop shop2 = new LatteShop();
        shop2.orderCoffee();

        CoffeeShop shop3 = new CappuccinoShop();
        shop3.orderCoffee();
    }
}