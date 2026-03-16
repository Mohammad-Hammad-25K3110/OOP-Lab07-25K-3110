package Lab07_Tasks.Lab07_Task10;

public class Main {
    public static void main(String[] args) {
        Course c1 = new ProgrammingCourse();
        Course c2 = new MathematicsCourse();
        Course c3 = new DesignCourse();
        int assignments = 80;
        int exams = 90;
        System.out.println("Programming Course Grade: " + c1.calculateGrade(assignments, exams));
        System.out.println("Mathematics Course Grade: " + c2.calculateGrade(assignments, exams));
        System.out.println("Design Course Grade: " + c3.calculateGrade(assignments, exams));
    }
}
