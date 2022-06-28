package Array;

import java.math.BigDecimal;
import java.util.Arrays;

public class Student {
    private String name;
    private static int[]marks;

    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }


    public static int getNumberOfMarks() {

        return marks.length;
    }

    static int sum = 0;
    public static int getTotalSumOfMarks() {
        for(int mark :marks){
            sum = sum + mark;
        }
        return sum;
    }

    static int maximumMark = Integer.MIN_VALUE ;
    public static int getMaximumMark() {
        for(int mark:marks){
            if(mark>maximumMark){
                maximumMark = mark;
            }
        }
        return maximumMark;
    }

    static  int minimumMark = Integer.MAX_VALUE;
    public static int getMinimumMark() {
        for(int mark:marks){
            if(mark<minimumMark){
                minimumMark = mark;
            }
        }
        return minimumMark ;
    }

    static BigDecimal Avg;
    public static BigDecimal getAverageMarks() {
        return new BigDecimal(sum).divide(new BigDecimal(marks.length));
    }
}
