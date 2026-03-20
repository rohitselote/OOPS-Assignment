
abstract class Payment {
    abstract void pay(double amount);
}


class CreditCardPayment extends Payment {
    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card.");
    }
}


class UPIPayment extends Payment {
    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI.");
    }
}


class NetBankingPayment extends Payment {
    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Net Banking.");
    }
}


public class Main {
    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment();
        Payment p2 = new UPIPayment();
        Payment p3 = new NetBankingPayment();

        p1.pay(1500);
        p2.pay(750);
        p3.pay(2000);
    }
}
