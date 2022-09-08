import java.text.DecimalFormat;
import java.util.Scanner;

public class converterRunner {
    private  Scanner key = new Scanner(System.in);

    double exchangeRate = 0;
    int conversion;
    double dollar = 0;
    double yuan = 0;
    double INR = 0;
    String Dollar = " ";
    int quarter = 0;

public  void converter(){
    System.out.println("Enter the currency code 1: foriegn to indian  2: indian foreign ");
    conversion = key.nextInt();
    String code = " ";
    if (conversion == 0) {
        System.out.println("foreign currency to indian currency");
        Scanner Sc= new Scanner(System.in);
        System.out.println(" enter the currency code");
        String code1=Sc.nextLine();
       // String code1 = key.nextLine();

        if (code1.equals(code)) {
            System.out.println("enter exchange rate");
            exchangeRate = key.nextDouble();
            System.out.print("Enter the " + code + " " + "amount: ");
            double d = key.nextDouble();
            double y = d * exchangeRate;
            System.out.println(" " + d + " is " + y + " RUPIE.");
            System.out.println();
        }
    } else if (conversion == 1) {
            System.out.println(" ****  indian currency to foreign currency  *****");
            System.out.print("Enter amount in rupees: ");
            DecimalFormat f = new DecimalFormat("##.###");
            INR = key.nextDouble();
            Double FC = INR / exchangeRate;
            System.out.println(" foreign currency  : " + f.format(FC));
            System.out.println();
        } else {
            System.out.println("enter valid input");
        }

    }
}



