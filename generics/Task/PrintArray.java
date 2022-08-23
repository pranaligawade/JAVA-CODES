package Task;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintArray{
     static  void  printArrayOfType(List<? > l){
         System.out.println(l);
     }

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
        System.out.println("Integer Array :");
        printArrayOfType(list);

        List<Double> d= new ArrayList<>(Arrays.asList(1.2,1.3,4.5,3.4,5.6));
        System.out.println("Double array :");
        printArrayOfType(d);
        
        List  list2 = new ArrayList<>(Arrays.asList(-129,-233,1,12,-139));
        printArrayOfType(list2);

     }
}
