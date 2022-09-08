
import java.math.BigDecimal;
import java.util.*;
import java.text.*;
import java.util.Currency;
import java.util.Set;
public class CurrencyPayment  extends  converterRunner{
    public static void main(String[] args) {
         Set<Currency> currencySet = Currency.getAvailableCurrencies();
converterRunner r= new converterRunner();
        Enumeration e = Collections.enumeration(currencySet);
        System.out.println("Available currencies are: " + currencySet.size());
        String code = " ";
        for (Currency c : currencySet) {

            code = c.getCurrencyCode();
            System.out.println(code + ", Name : " + c.getDisplayName() + " Symbol : " + c.getSymbol());
            r.converter();


        }

        }

}