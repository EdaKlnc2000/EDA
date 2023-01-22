
class Employee {
    private String name;
    private double salary;
    private int workHours;
    private int startYear;

    public Employee(String name, double salary, int workHours, int startYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.startYear = startYear;
    }

    public double tax() {
        if (salary < 1000) {
            return 0;
        } else {
            return salary * 0.03;
        }
    }

    public double bonus() {
        if (workHours > 40) {
            return (workHours - 40) * 30;
        } else {
            return 0;
        }
    }

    public void riseSalary() {
        int currentYear = 2021;
        int yearsWorked = currentYear - startYear;

        if (yearsWorked < 10) {
            salary += salary * 0.05;
        } else if (yearsWorked >= 10 && yearsWorked < 20) {
            salary += salary * 0.1;
        } else {
            salary += salary * 0.15;
        }
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Salary: " + salary + ", Work Hours: " + workHours + ", Start Year: " + startYear;
    }
}
