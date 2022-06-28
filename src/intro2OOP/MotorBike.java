package intro2OOP;

public class MotorBike {
    private int speed; // member variable

    void setSpeed(int speed){
        this.speed = speed;
    }                  // local variable

    int getSpeed (){
        return speed;
    }

    void start() {
        System.out.println("Bike Started");
    }

    void increaseSpeed (int howmuch){
        this.speed = this.speed + howmuch;
    }
}
