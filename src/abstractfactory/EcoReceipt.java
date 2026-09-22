package abstractfactory;

public class EcoReceipt implements Receipt {
    @Override
    public void print() {
        System.out.println("Printing receipt on recycled kraft paper.");
    }
}