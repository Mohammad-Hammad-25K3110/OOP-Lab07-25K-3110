package Lab07_Tasks.Lab07_Task10;

public class MathematicsCourse extends Course{
    @Override
    public double calculateGrade(int assignments, int exams) {
        return assignments * 0.3 + exams * 0.7;
    }
}
