package abstractfactory;

public class CyberLid implements Lid {
    @Override
    public void seal() {
        System.out.println("Sealing with a smart locking tech-lid.");
    }
}