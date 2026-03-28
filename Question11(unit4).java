import java.util.Scanner;

class ATMWithdrawal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter account balance: ");
            double balance = sc.nextDouble();

            System.out.print("Enter withdrawal amount: ");
            double withdraw = sc.nextDouble();

            if (withdraw > balance) {
                throw new Exception("Insufficient Balance");
            } else {
                balance = balance - withdraw;
                System.out.println("Withdrawal successful. Remaining balance: " + balance);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
