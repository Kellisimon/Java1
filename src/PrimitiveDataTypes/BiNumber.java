package PrimitiveDataTypes;

public class BiNumber {
    private int numbers;
    private int numb;

 public BiNumber(int i , int i1){
     this.numbers = i;
     this.numb = i1;
   }

    int add (){
       return numbers + numb;
  }

    int multiply (){
        return numbers * numb;
    }

    void doub (){
     this.numbers = numbers*2;
     this.numb = numb*2;
    }

    int getNumber1 (){
     return numbers;
    }

    int getNumber2 (){
        return numb;
    }

}







