import java.util.Scanner;

class UsernameValidator {
    String username;

    UsernameValidator(String username) {
        this.username = username;
    }

    String cleanUsername() {
        String cleaned = username.trim();
        cleaned = cleaned.toLowerCase();
        return cleaned;
    }

    void displayUsername() {
        System.out.println("Cleaned Username: " + cleanUsername());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String input = sc.nextLine();
        UsernameValidator obj = new UsernameValidator(input);
        obj.displayUsername();
    }
}
