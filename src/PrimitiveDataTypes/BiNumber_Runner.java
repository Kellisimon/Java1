package PrimitiveDataTypes;

public class BiNumber_Runner {
    public static void main(String[] args) {

        BiNumber numbers = new BiNumber(2,3);

        System.out.println(numbers.add());
        System.out.println(numbers.multiply());
         numbers.doub();
        System.out.println(numbers.getNumber1());
        System.out.println(numbers.getNumber2());

    }
}
