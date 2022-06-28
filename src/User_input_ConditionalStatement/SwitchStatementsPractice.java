package User_input_ConditionalStatement;

public class SwitchStatementsPractice {


    public static void main(String[] args) {
        System.out.println(determineNameOfDay(1));

    }

    public static String determineNameOfDay(int dayNumber) {
        String result = " " ;
        switch (dayNumber) {
            case 0 : result = "sunday"; break;
            case 1 : result = "monday"; break;
            case 2 : result = "tuesday"; break;
            case 3 : result = "wednesday"; break;
            case 4 : result = "thursday"; break;
            case 5 : result = "friday"; break;
            case 6 : result = "saturday"; break;
        }
        return result;
    }

}