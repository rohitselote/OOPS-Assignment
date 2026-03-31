class BankingSystem {
    private int balance = 1000;

    public void withdraw(String user, int amount) {
        synchronized (this) {
            if (balance >= amount) {
                System.out.println(user + " is withdrawing " + amount);
                balance -= amount;
                System.out.println("Remaining balance: " + balance);
            } else {
                System.out.println(user + " tried to withdraw " + amount + " but insufficient balance");
            }
        }
    }
}

class User extends Thread {
    BankingSystem bank;
    String name;
    int amount;

    User(BankingSystem bank, String name, int amount) {
        this.bank = bank;
        this.name = name;
        this.amount = amount;
    }

    public void run() {
        bank.withdraw(name, amount);
    }
}

public class Main {
    public static void main(String[] args) {
        BankingSystem bank = new BankingSystem();

        User u1 = new User(bank, "User1", 700);
        User u2 = new User(bank, "User2", 500);

        u1.start();
        u2.start();
    }
}
