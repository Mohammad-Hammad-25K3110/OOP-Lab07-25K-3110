package Lab07_Tasks.Lab07_Task04;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Manager("Alice", 50000);
        Employee e2 = new Developer("Bob", 40000);
        Employee e3 = new Intern("Charlie", 10000);
        System.out.println(e1.name + " Salary: " + e1.calculateSalary());
        System.out.println(e2.name + " Salary: " + e2.calculateSalary());
        System.out.println(e3.name + " Salary: " + e3.calculateSalary());
    }
}
