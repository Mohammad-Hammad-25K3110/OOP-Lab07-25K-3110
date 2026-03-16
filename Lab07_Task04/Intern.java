package Lab07_Tasks.Lab07_Task04;

public class Intern extends Employee{
    private double baseSalary;
    public Intern(String name, double baseSalary) {
        super(name);
        this.baseSalary = baseSalary;
    }

    @Override
    public double calculateSalary() {
        return baseSalary;
    }
}
