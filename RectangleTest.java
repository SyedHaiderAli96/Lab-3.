import java.util.Scanner;
class Rectangle {
    private double length;
    private double width;

    // Default constructor
    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }

    // Parameterized constructor
    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    // Getter for length
    public double getLength() {
        return length;
    }

    // Setter for length with validation
    public void setLength(double length) {
        if (length > 0.0 && length < 20.0) {
            this.length = length;
        } else {
            throw new IllegalArgumentException("Length must be > 0.0 and < 20.0");
        }
    }

    // Getter for width
    public double getWidth() {
        return width;
    }

    // Setter for width with validation
    public void setWidth(double width) {
        if (width > 0.0 && width < 20.0) {
            this.width = width;
        } else {
            throw new IllegalArgumentException("Width must be > 0.0 and < 20.0");
        }
    }

    // Method to calculate the perimeter
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    // Method to calculate the area
    public double calculateArea() {
        return length * width;
    }
}
public class RectangleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a rectangle object using the default constructor
        Rectangle rectangle = new Rectangle();

        // Get length from user
        System.out.print("Enter length (between 0.0 and 20.0): ");
        double length = scanner.nextDouble();
        rectangle.setLength(length);

        // Get width from user
        System.out.print("Enter width (between 0.0 and 20.0): ");
        double width = scanner.nextDouble();
        rectangle.setWidth(width);

        // Display the results
        System.out.printf("Length: %.2f\n", rectangle.getLength());
        System.out.printf("Width: %.2f\n", rectangle.getWidth());
        System.out.printf("Perimeter: %.2f\n", rectangle.calculatePerimeter());
        System.out.printf("Area: %.2f\n", rectangle.calculateArea());

        scanner.close();
    }
}
}
