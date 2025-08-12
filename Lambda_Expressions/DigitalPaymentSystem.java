package Lambda_Expressions;
import java.util.*;
interface Payment {
    void pay(double amount);
}

// UPI payment
class UpiPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " via UPI.");
    }
}
// Wallet payment
class WalletPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " via Wallet.");
    }
}


public class DigitalPaymentSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Digital Payment System ===");
        System.out.print("Enter amount to pay: ₹");
        double amount = sc.nextDouble();

        System.out.println("\nSelect Payment Method:");
        System.out.println("1. UPI");
        System.out.println("2. Credit Card");
        System.out.println("3. Wallet");
        System.out.print("Choice: ");
        int choice = sc.nextInt();
    }
}
