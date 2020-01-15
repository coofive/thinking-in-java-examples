package ch12.exceptions.exercise;

/**
 * exceptions/Ex16.java
 * <p>
 * TIJ4 Chapter Exceptions, Exercise 16, page 477
 * <p>
 * ****************** Exercise 16 ******************
 * Modify reusing/CADSystem.java to demonstrate
 * that returning from the middle of a try-finally
 * will still perform proper cleanup.
 * ************************************************
 *
 * @author coofive
 */
public class Ex16 {
    public static void main(String[] args) {
        CadSystem cadSystem = new CadSystem(46);
        try {
            System.out.println("Returning from try block.");
            return;
        } finally {
            cadSystem.dispose();
        }
    }
}

class Shape {
    public Shape(int i) {
        System.out.println("Shape constructor");
    }

    void dispose() {
        System.out.println("Shape dispose");
    }
}

class Circle extends Shape {

    public Circle(int i) {
        super(i);
        System.out.println("Drawing Circle");
    }

    @Override
    void dispose() {
        super.dispose();
        System.out.println("Erasing circle");
    }
}

class Triangle extends Shape {
    public Triangle(int i) {
        super(i);
        System.out.println("Drawing Triangle");
    }

    @Override
    void dispose() {
        super.dispose();
        System.out.println("Erasing Triangle");
    }
}

class Line extends Shape {
    private int start;
    private int end;

    public Line(int start, int end) {
        super(start);
        this.start = start;
        this.end = end;
        System.out.println("Drawing Line: " + start + "," + end);
    }

    @Override
    void dispose() {
        super.dispose();
        System.out.println("Erasing Line: " + start + "," + end);
    }
}

class CadSystem extends Shape {
    private Circle circle;
    private Triangle triangle;
    private Line[] lines = new Line[3];

    public CadSystem(int i) {
        super(i + 1);
        for (int j = 0; j < lines.length; j++) {
            lines[j] = new Line(j, j * j);
        }
        circle = new Circle(i);
        triangle = new Triangle(i);
    }

    @Override
    void dispose() {
        super.dispose();
        System.out.println("CADSystem.dispose()");

        circle.dispose();
        triangle.dispose();

        for (Line line : lines) {
            line.dispose();
        }
    }
}
