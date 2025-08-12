package Lambda_Expressions;
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
    
}
