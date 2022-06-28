public class Sample {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(5 * i);

        }

        int a =19; int b = 15;
        int c = 10; int d = 12;

        if(a+b > c+d){
            System.out.println("AB is greater");
        }else {
            System.out.println("CD is greater");
        }

        int angles1 = 80;  int angles2 = 70;
        int angles3 = 30;

        if(angles1 + angles2 + angles3 == 180){
            System.out.println("This is a Triangle");
        }else {
            System.out.println("This isn't a Triangle");
        }

        int number = 9;
        if(number % 2 == 0){
            System.out.println("This is a Prime Number");
        }else{
            System.out.println("This is not a prime Number");
        }

        int i = 1;
        int j = 2;
        for(i = 1, j =2; i <= 10; i++, j--){
            System.out.println(j);
        }
        for(i = 1; i <= 10; i++){
            System.out.println("no 1");
            System.out.println("no 1");
        }

    }
}