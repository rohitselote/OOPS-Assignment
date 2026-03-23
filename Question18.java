class Bank {
    final double interestRate = 5.0;

    double calculateInterest(double amount) {
        return (amount * interestRate) / 100;
    }
}

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        double customer1 = bank.calculateInterest(10000);
        double customer2 = bank.calculateInterest(20000);
        double customer3 = bank.calculateInterest(50000);

        System.out.println("Customer 1 Interest: " + customer1);
        System.out.println("Customer 2 Interest: " + customer2);
        System.out.println("Customer 3 Interest: " + customer3);
    }
}
