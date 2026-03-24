import java.util.Scanner;

class MessageFormatter {
    String firstName, lastName;

    MessageFormatter(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    void displayFullName() {
        String fullName = firstName + " " + lastName;
        System.out.println("Full Name: " + fullName);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first name: ");
        String fName = sc.nextLine();
        System.out.print("Enter last name: ");
        String lName = sc.nextLine();

        MessageFormatter obj = new MessageFormatter(fName, lName);
        obj.displayFullName();
    }
}
