abstract class Shape {
    int x, y;

    // Abstract method to be implemented by subclasses
    abstract void printArea();
}

class Rectangle extends Shape {
    @Override
    void printArea() {
        System.out.println("Area of Rectangle is " + (x * y));
    }
}

class Triangle extends Shape {
    @Override
    void printArea() {
        System.out.println("Area of Triangle is " + (x * y) / 2);
    }
}

class Circle extends Shape {
    @Override
    void printArea() {
        System.out.println("Area of Circle is " + (22 * x * x) / 7);
    }
}

public class Abs {
    public static void main(String[] args) {
        // Rectangle instance
        Rectangle r = new Rectangle();
        r.x = 10; // Length
        r.y = 20; // Breadth
        r.printArea();
        System.out.println("--------------------------------------------------");

        // Triangle instance
        Triangle t = new Triangle();
        t.x = 30; // Base
        t.y = 35; // Height
        t.printArea();
        System.out.println("--------------------------------------------------");

        // Circle instance
        Circle c = new Circle();
        c.x = 2; // Radius
        c.printArea();
        System.out.println("--------------------------------------------------");
    }
}
