package SRP.Bad;

public class Employee {
    private String name;
    private double hourlyRate;
    private int hoursWorked;

    public Employee(String name, double hourlyRate, int hoursWorked) {
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    public void generateReport() {
        double salary = calculateSalary();
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: $" + salary);
    }

    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", 20.0, 40);
        employee.generateReport();
    }
}
