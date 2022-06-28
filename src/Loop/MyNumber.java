package Loop;

public class MyNumber {
    int i ;

    public MyNumber(int i) {
        this.i = i;
    }

    public boolean IsPrime() {
        if (i % 2 == 0){
            return false;
        }return true;
    }
}
