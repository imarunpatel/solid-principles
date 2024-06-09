package SRP.Good;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", 20.4, 40);
        SalaryCalculator salaryCalculator = new SalaryCalculator();
        ReportGenerator reportGenerator = new ReportGenerator();

        // Calculate Report
        double salary = salaryCalculator.calculateSalary(employee.getHourlyRate(), employee.getHoursWorked());

        // Generate Report
        reportGenerator.generateReport(employee.getName(), salary);
    }
}
