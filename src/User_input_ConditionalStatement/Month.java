package User_input_ConditionalStatement;

public class Month {
    public static void main(String[] args) {
        System.out.println(determineNameOfMonth(7));
    }

    public static String determineNameOfMonth(int monthNumber){
        String result = " ";
        switch (monthNumber){
            case 1 : result = "January"; break;
            case 2 : result = "Febuary"; break;
            case 3 : result = "March"; break;
            case 4 : result = "April"; break;
            case 5 : result = "May"; break;
            case 6 : result = "June"; break;
            case 7 : result = "July"; break;
            case 8 : result = "August"; break;
            case 9 : result = "September"; break;
            case 10 : result = "October"; break;
            case 11 : result = "November"; break;
            case 12 : result = "December"; break;
        }
        return result ;
    }
}
