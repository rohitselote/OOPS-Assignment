class Employee {
    String name;
    int id;

    static int employeeCount = 0;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
        employeeCount++;
    }

    static void displayEmployeeCount() {
        System.out.println("Total Employees: " + employeeCount);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Alice", 101);
        Employee e2 = new Employee("Bob", 102);
        Employee e3 = new Employee("Charlie", 103);

        Employee.displayEmployeeCount();
    }
}
