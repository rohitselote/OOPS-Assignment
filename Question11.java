class Shape {
    void display() {
        System.out.println("This is a shape.");
    }
}


class Circle extends Shape {
    double radius;

    void getData(double r) {
        radius = r;
    }

    void area() {
        System.out.println("Area of Circle = " + (3.14 * radius * radius));
    }
}


class Rectangle extends Shape {
    double length, width;

    void getData(double l, double w) {
        length = l;
        width = w;
    }

    void area() {
        System.out.println("Area of Rectangle = " + (length * width));
    }
}


public class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();

        c.display();
        c.getData(5);
        c.area();

        r.display();
        r.getData(4, 6);
        r.area();
    }
}
