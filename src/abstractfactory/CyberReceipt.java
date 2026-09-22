package abstractfactory;

public class CyberReceipt implements Receipt {
    @Override
    public void print() {
        System.out.println("Sending encrypted digital receipt to your neural-link/phone.");
    }
}