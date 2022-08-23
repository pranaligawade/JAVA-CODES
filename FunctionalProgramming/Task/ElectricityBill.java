package Task;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        long unit;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter units:" );
     unit= sc.nextLong();
     BillCalculate bill=  new BillCalculate(unit);
        System.out.println("bill to pay is : "+bill.totalbill);
    }
}
 class  BillCalculate{
     double totalbill=0;
    BillCalculate( long unit){
        if(unit<100){
            totalbill=unit*1.20;
        } else if (unit<300) {
            totalbill= unit*1.20+(unit-100)*2;
        }else {
            totalbill=100*1.20+200*2+(unit-300)*3;
        }
    }
 }
