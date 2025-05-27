package program3;

// CircleArea.java
public class CircleArea {
    // Attribute
    double radius;

    // Constructor to initialize radius
    public CircleArea(double r) {
        radius = r;
    }

    // Method to calculate area
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate perimeter (circumference)
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Creating a CircleArea object
        CircleArea circle = new CircleArea(7.0);

        // Calculating and displaying area and perimeter
        double area = circle.calculateArea();
        double perimeter = circle.calculatePerimeter();

        System.out.println("Radius: " + circle.radius);
        System.out.println("Area of Circle: " + area);
        System.out.println("Perimeter (Circumference) of Circle: " + perimeter);
    }
}