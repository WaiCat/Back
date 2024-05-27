package example;

import java.util.List;

public class GradeCalculator {
    private  final  Courses courses;

    public GradeCalculator(List<Courses> courses){
        this.courses = new Courses(courses);
    }

    public GradeCalculator(Courses courses){
        this.courses = courses;
    }

    public double calculateGrade() {
        double totalmultipliedCreditAndCourseGrade = courses.multiplyCreditAndCourseGrade();

        int totalCompletedCredit = courses.calculateTotalCompletedCredit();

        return  totalmultipliedCreditAndCourseGrade / totalCompletedCredit;
    }
}
