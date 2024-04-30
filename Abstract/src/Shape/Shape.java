package Shape;

import java.util.Scanner;

abstract class ShapeBase{
    public abstract void area();
    public abstract void perimeter();
}

class Rectangle extends ShapeBase{
    private final float width, height;

    public Rectangle() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Rectangle Width: ");
        this.width = input.nextFloat();
        System.out.println("Enter Rectangle height: ");
        this.height = input.nextFloat();
    }

    @Override
    public void area() {
        System.out.println("Rectangle Area Is: " + this.width * this.height);
    }

    @Override
    public void perimeter() {
        System.out.println("Rectangle Perimeter Is: " + 2 * (this.width + this.height));
    }
}

class Square extends ShapeBase{
    private final float side;

    public Square() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Square Side: ");
        this.side = input.nextFloat();
    }

    @Override
    public void area() {
        System.out.println("Square Area Is: " + this.side * this.side);
    }

    @Override
    public void perimeter() {
        System.out.println("Square Perimeter Is: " + 4 * this.side);
    }
}

class Circle extends ShapeBase{
    private final float radius;

    public Circle() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Circle Radius: ");
        this.radius = input.nextFloat();
    }
    @Override
    public void area() {
        System.out.println("Circle Area Is: " + Math.PI * Math.pow(this.radius, 2));
    }

    @Override
    public void perimeter() {
        System.out.println("Circle Perimeter Is: " + 2 * Math.PI * this.radius);
    }
}

public class Shape {
    static void shape_type(String shape_type) {
        switch (shape_type) {
            case "rectangle" -> {
                Rectangle rectangle = new Rectangle();
                rectangle.area();
                rectangle.perimeter();
            }
            case "square" -> {
                Square square = new Square();
                square.area();
                square.perimeter();
            }
            case "circle" -> {
                Circle circle = new Circle();
                circle.area();
                circle.perimeter();
            }
            case null, default -> System.out.println("Unknown Shape Type");
        }
    }
}
