package OCP.Bad;

//In this example, the AreaCalculator class needs to be modified whenever a new shape is added.
// This violates the OCP because the class is not closed for modification.

public class AreaCalculator {
    public double calculateArea(Object shape) {
        double area = 0;

        if(shape instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) shape;
            area = rectangle.width * rectangle.height;
        } else if(shape instanceof Circle circle) {
            area = Math.PI * circle.radius * circle.radius;
        }
        return area;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        Circle circle = new Circle(7);

        AreaCalculator calculator = new AreaCalculator();
        System.out.println("Area of the rectangle: " + calculator.calculateArea(rectangle));
        System.out.println("Area of the circle: " + calculator.calculateArea(circle));
    }
}
