abstract class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract double calculateBonus();
}

class Manager extends Employee {
    double salary;

    Manager(String name, int id, double salary) {
        super(name, id);
        this.salary = salary;
    }

    double calculateBonus() {
        return 0.20 * salary;
    }
}

class Developer extends Employee {
    double salary;
    double projectIncentive;

    Developer(String name, int id, double salary, double projectIncentive) {
        super(name, id);
        this.salary = salary;
        this.projectIncentive = projectIncentive;
    }

    double calculateBonus() {
        return (0.10 * salary) + projectIncentive;
    }
}

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Manager("Alice", 101, 50000);
        Employee e2 = new Developer("Bob", 102, 40000, 5000);

        System.out.println("Manager Bonus: " + e1.calculateBonus());
        System.out.println("Developer Bonus: " + e2.calculateBonus());
    }
}
