package Task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Summation {

     static  void sumOfNo(List<? >d) {
//         double sum=0.0;
//         for (Number n:d){
//            sum+=n.doubleValue();
         System.out.println(d);
         }
        // return  sum;

   //  }
    public static void main(String[] args) {
     //   System.out.println(sumOfNo(List.of(1.2, 2.3,2.4,4.6,3.6)));
      //  System.out.println(sumOfNo(List.of(1,2,3,4,5,6,7)));
         List<Integer> i= new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
            sumOfNo(i);
        List<Double> D= new ArrayList<>(Arrays.asList(1.1,2.2,3.3,4.3,5.3,6.3));
        sumOfNo(D);
    }
}
