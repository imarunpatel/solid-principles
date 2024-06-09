package ISP.Bad;

import javax.swing.*;
//In this example, we have a Worker interface that includes methods for both work and eat. This forces classes that implement this interface to provide implementations for methods they may not need.
public class Employee implements Worker{
    @Override
    public void work() {
        System.out.println("Employee is working");
    }

    @Override
    public void eat() {
        System.out.println("Employee is eating");
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.work();
        employee.eat();

        Robot robot = new Robot();
        robot.work();
        robot.eat();
    }
}
