class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        int result1 = calc.add(10, 20);
        System.out.println("Sum of two integers: " + result1);

        int result2 = calc.add(10, 20, 30);
        System.out.println("Sum of three integers: " + result2);

        double result3 = calc.add(5.5, 2.3);
        System.out.println("Sum of two doubles: " + result3);
    }
}
