
// RectanglePerimeter.java
public class RectanglePerimeter {
    // Attributes
    double length;
    double breadth;

    // Constructor to initialize values
    public RectanglePerimeter(double len, double brd) {
        length = len;
        breadth = brd;
    }

    // Method to calculate area
    public double calculateArea() {
        return length * breadth;
    }

    // Method to calculate perimeter
    public double calculatePerimeter() {
        return 2 * (length + breadth);
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Creating an object
        RectanglePerimeter rect = new RectanglePerimeter(8.0, 4.0);

        // Calculating and displaying area and perimeter
        System.out.println("Length: " + rect.length);
        System.out.println("Breadth: " + rect.breadth);
        System.out.println("Area of Rectangle: " + rect.calculateArea());
        System.out.println("Perimeter of Rectangle: " + rect.calculatePerimeter());
    }
}
