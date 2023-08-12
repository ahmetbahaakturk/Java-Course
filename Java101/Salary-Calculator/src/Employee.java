public class Employee {
    String name;
    double grossSalary;
    double netSalary;
    int workHours;
    int hireYear;
    int bonus;
    double tax;
    double raiseSalary;


    Employee(String name, double grossSalary, int workHours, int hireYear) {
        this.name = name;
        this.grossSalary = grossSalary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        this.bonus = 0;
        this.tax = 0.0;
        this.raiseSalary = 0.0;
        this.netSalary = this.grossSalary;

        raiseSalary();
        bonus();
        tax();
    }

    void tax() {
        if (this.grossSalary >= 1000) {
            this.tax = this.netSalary * 0.03;
        }
        this.netSalary -= this.tax;
    }

    void bonus() {
        if (this.workHours > 40) {
            this.bonus += (workHours - 40) * 30;
        }
        this.netSalary += this.bonus;
    }

    void raiseSalary() {
        int workYear = 2021 - hireYear;

        if (workYear > 19) {
            this.raiseSalary = this.netSalary * 0.15;
        } else if (workYear > 9) {
            this.raiseSalary = this.netSalary * 0.10;
        } else {
            this.raiseSalary = this.netSalary * 0.05;
        }
        this.netSalary += raiseSalary;
    }

    public String toString() {
        return "=====Employee Information=====\n" + "Name: " + this.name + "\nGross Salary: " + this.grossSalary + "\nWork Hour Per Week: " + this.workHours + "\nHire Year: " + this.hireYear + "\nRaise grossSalary: " + this.raiseSalary + "\nBonus: " + this.bonus + "\nTax: " + this.tax + "\nNet Salary: " + this.netSalary + "\n==============================";
    }
}