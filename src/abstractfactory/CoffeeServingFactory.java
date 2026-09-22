package abstractfactory;

public interface CoffeeServingFactory {
    Cup createCup();
    Lid createLid();
    Receipt createReceipt();
}