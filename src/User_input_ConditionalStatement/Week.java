package User_input_ConditionalStatement;

public class Week {
    public static void main(String[] args) {
        System.out.println(isWeekDay(0));
    }

    public static boolean isWeekDay(int dayNumber){
        switch (dayNumber){
            case 0 :  return false;
            case 6 :
            case 1 :
            case 2 :
            case 3 :
            case 4 :
            case 5 : return true;
        }
        return false;
    }
}
