package Method;

class methodSample {

    static void sayHello(int times) {
        System.out.println(" i am me");
        System.out.println("you are u");
    }



    static void sumOfTwo(int som, int sum) {
        int sumy = som + sum;
        System.out.println(sumy);
    }


    int sumOfThree(int som, int sum, int son) {
        int summ = som + sum + son;
        return summ;

    }



    int Calc(int ang1, int ang2) {
        int ang3 = 180 - (ang1 + ang2);                               
        return ang3;

    }
    int sum = sumOfThree(8, 45, 78);

     int ang3 = Calc(90, 20);

    public static void main(String[] args) {
        sayHello(3);

        sumOfTwo(4, 9);



    }

}
