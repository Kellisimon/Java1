package intro2OOP;

public class Books {
   private int noOfCopies;

    public Books(int noOfCopies){
        if(noOfCopies > 0)
            this.noOfCopies = noOfCopies;
    }

    void increaseNoOfCopies(int amount){

        this.noOfCopies = this.noOfCopies + amount;
    }

    int getNoOfCopies(){
        return noOfCopies;
    }

    void decreseNoOfCopies(int amount){
        this.noOfCopies = this.noOfCopies - amount;
    }
}
