import java.util.Scanner;

class StudentNameComparison {
    String name1, name2;

    StudentNameComparison(String name1, String name2) {
        this.name1 = name1;
        this.name2 = name2;
    }

    void compareNames() {
        if (name1.equals(name2)) {
            System.out.println("Names are equal (case-sensitive)");
        } else {
            System.out.println("Names are not equal (case-sensitive)");
        }

        if (name1.equalsIgnoreCase(name2)) {
            System.out.println("Names are equal (case-insensitive)");
        } else {
            System.out.println("Names are not equal (case-insensitive)");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first student name: ");
        String n1 = sc.nextLine();
        System.out.print("Enter second student name: ");
        String n2 = sc.nextLine();

        StudentNameComparison obj = new StudentNameComparison(n1, n2);
        obj.compareNames();
    }
}
