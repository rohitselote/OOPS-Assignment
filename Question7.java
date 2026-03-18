abstract class Shape {

    abstract double calculateArea();


    void displayInfo() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double calculateArea() {
        return length * width;
    }
}

public class Main {
    public static void main(String[] args) {

 
        Shape c = new Circle(5);
        Shape r = new Rectangle(4, 6);

        c.displayInfo();
        System.out.println("Circle Area: " + c.calculateArea());

        r.displayInfo();
        System.out.println("Rectangle Area: " + r.calculateArea());
    }
}
