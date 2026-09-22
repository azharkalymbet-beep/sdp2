package abstractfactory;

public class MainAbstractFactory {
    public static void main(String[] args) {
        // Выбор семейства происходит в единственном месте программы
        System.out.println("Customer chooses Eco Style:");
        CoffeeServingFactory ecoFactory = new EcoBrandFactory();
        KioskClient ecoClient = new KioskClient(ecoFactory);
        ecoClient.serveOrder();

        System.out.println("Customer chooses Cyberpunk Style:");
        CoffeeServingFactory cyberFactory = new CyberpunkBrandFactory();
        KioskClient cyberClient = new KioskClient(cyberFactory);
        cyberClient.serveOrder();
    }
}