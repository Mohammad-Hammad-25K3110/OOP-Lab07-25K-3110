package Lab07_Tasks.Lab07_Task04;

public class Developer extends Employee{
    private double baseSalary;
    public Developer(String name, double baseSalary) {
        super(name);
        this.baseSalary = baseSalary;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + 2000;
    }
}
