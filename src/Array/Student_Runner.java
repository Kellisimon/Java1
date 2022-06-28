package Array;

import java.math.BigDecimal;

public class Student_Runner {
    public static void main(String[] args) {
        int [] marks = {50,48,35};
        Student student = new Student("Kelli", marks);

        int number = Student.getNumberOfMarks();
        System.out.println(number);

        int sum = Student.getTotalSumOfMarks();
        System.out.println(sum);

        int maximumMark = Student.getMaximumMark();
        System.out.println(maximumMark);

        int minimumMark = Student.getMinimumMark();
        System.out.println(minimumMark);

        BigDecimal average = Student.getAverageMarks();
        System.out.println(average);

    }
}
