package Lab07_Tasks.Lab07_Task10;

public class ProgrammingCourse extends Course{
    @Override
    public double calculateGrade(int assignments, int exams) {
        return assignments * 0.4 + exams * 0.6;
    }
}
