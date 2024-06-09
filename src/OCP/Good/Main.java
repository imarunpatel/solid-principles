package OCP.Good;

//In this example, the AreaCalculator class is closed for modification but open for extension.
// We achieve this by using an abstract Shape class and extending it for specific shapes.

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 10);
        Shape circle = new Circle(7);

        // Create an instance of AreaCalculator
        AreaCalculator calculator = new AreaCalculator();

        System.out.println("Area of the rectangle: " + calculator.calculateArea(rectangle));
        System.out.println("Area of the circle: " + calculator.calculateArea(circle));
    }
}
