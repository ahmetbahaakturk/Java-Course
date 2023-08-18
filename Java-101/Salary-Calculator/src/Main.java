import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        double grossSalary;
        int workHours;
        int hireYear;

        System.out.print("Employee Name: ");
        name = scanner.nextLine();
        System.out.print("Gross Salary: ");
        grossSalary = scanner.nextDouble();
        System.out.print("Work Hour Per Week: ");
        workHours = scanner.nextInt();
        System.out.print("Hire Year: ");
        hireYear = scanner.nextInt();

        Employee employee = new Employee(name, grossSalary, workHours, hireYear);
        System.out.print(employee);
    }
}