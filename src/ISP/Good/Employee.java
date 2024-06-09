package ISP.Good;

import ISP.Bad.Worker;
//In this example, we split the Worker interface into two more specific interfaces: Workable and Eatable. This way, classes implement only the interfaces relevant to them.

public class Employee implements Worker, Eatable {
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
        // robot.eat(); // Not applicable and not forced to implement
    }
}
