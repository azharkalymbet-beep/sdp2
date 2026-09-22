package factorymethod;

public abstract class CoffeeShop {
    // Фабричный метод, который должны переопределить подклассы
    public abstract Drink createDrink();

    // Бизнес-логика, использующая интерфейс продукта
    public void orderCoffee() {
        Drink drink = createDrink();
        System.out.println("--- Processing Coffee Order ---");
        drink.prepare();
        System.out.println("Price: $" + drink.getCost());
        System.out.println("Order completed successfully!\n");
    }
}