package User_input_ConditionalStatement;

import java.util.Scanner;

public class Ex1Runner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number1: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter Number2: ");
        int number2 = scanner.nextInt();

        System.out.println("Choices available are ");
        System.out.println("1-Add");
        System.out.println("2-Subtract");
        System.out.println("3-Divide");
        System.out.println("4-Multiply");

        System.out.println("Enter Choice: ");
        int Choice = scanner.nextInt();

        System.out.println("Your Choices are: ");
        System.out.println("Number1 " + number1);
        System.out.println("Number2 " + number2);
        System.out.println("Choice " + Choice);


//                 USING IF/ELSE STATEMENT
//        if(Choice == 1){
//            System.out.println(number1 + number2);
//        }else if (Choice == 2 ){
//            System.out.println(number1 - number2);
//        }else if (Choice == 3) {
//            System.out.println(number1 / number2);
//        }else if (Choice == 4){
//            System.out.println(number1 * number2);
//        }else{
//            System.out.println("Invalid Input");
//        }

        //      USING SWITCH STATEMENT

        switch (Choice) {
            case 1 :
                System.out.println(number1 + number2);
                break;
            case 2 :
                System.out.println(number1 - number2);
                break;
            case 3 :
                System.out.println(number1 / number2);
                break;
            case 4 :
                System.out.println(number1 * number2);
                break;
            default:
                System.out.println("invalid");
                break;
        }

    }
}




