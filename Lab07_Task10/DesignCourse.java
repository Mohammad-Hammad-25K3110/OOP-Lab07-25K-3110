package Lab07_Tasks.Lab07_Task10;

public class DesignCourse extends Course{
    @Override
    public double calculateGrade(int assignments, int exams) {
        return assignments * 0.5 + exams * 0.5;
    }
}
