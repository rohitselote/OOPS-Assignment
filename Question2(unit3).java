import java.util.Scanner;

class EmailChecker {
    String email;

    EmailChecker(String email) {
        this.email = email;
    }

    void checkEmail() {
        if (email.contains("@gmail.com")) {
            System.out.println("Valid Gmail Address");
        } else {
            System.out.println("Invalid Email");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your email: ");
        String input = sc.nextLine();
        EmailChecker obj = new EmailChecker(input);
        obj.checkEmail();
    }
}
