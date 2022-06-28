package PrimitiveDataTypes;

import java.math.BigDecimal;
public class SimpleInterestCalculator {
    BigDecimal principle;
    BigDecimal Interest;
    public SimpleInterestCalculator(String principle ,String Interest){
        this.principle = new BigDecimal(principle);
        this.Interest = new BigDecimal(Interest).divide(new BigDecimal(100));
    }

    public BigDecimal calculateTotalValue(int noOfYears) {
       return principle.add(principle.multiply(Interest).multiply(new BigDecimal(noOfYears)));

    }


//    int TotalAmount (){
//        return principle.add(principle).multiply(Interest)
//    }

//    BigDecimal totalValue (){
//        return
//    }
}
