package abstractfactory;

public class EcoLid implements Lid {
    @Override
    public void seal() {
        System.out.println("Sealing with a plant-fiber eco-friendly sip lid.");
    }
}