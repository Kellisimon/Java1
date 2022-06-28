package intro2OOP;

public class MotorBikeRunner {
    public static void main(String[] args) {
        MotorBike ducati = new MotorBike();
        MotorBike honda = new MotorBike();

        ducati.start();
        honda.start();

        ducati.setSpeed (100);
        System.out.println(ducati.getSpeed());

        honda.setSpeed(50);
        System.out.println(honda.getSpeed());

//        // increasing speed by 100 long method
//        int ducatiSpeed = ducati.getSpeed(); // get current speed
//        ducatiSpeed += 100;  // do the addition
//        ducati.setSpeed(ducatiSpeed);  // set speed
//
//        System.out.println(ducati.getSpeed());
//
//        int hondaSpeed = honda.getSpeed(); // get current speed
//        hondaSpeed += 100;  // do the addition
//        honda.setSpeed(hondaSpeed);  // set speed
//
//        System.out.println(honda.getSpeed());

          // increasing speed by 100 short method
        //i first created a method in the motorbike class chk for code

        ducati.increaseSpeed(100);
        honda.increaseSpeed(100);
        System.out.println(ducati.getSpeed());
        System.out.println(honda.getSpeed());


    }
}
