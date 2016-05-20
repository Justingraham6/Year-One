import java.text.DecimalFormat;
import java.util.*;

/**
 * CelsiusToFahrenheit will convert a Celsius temperature to an
 * equivalent Fahrenheit temperature.
 *
 * @author Justin Graham and Sean Raasio
 * @version 18 Sep 2014
 */
public class CelsiusToFahrenheit
{

    /**
     * Input the temperature in celsius and output the equivalent Fahrenheit 
     * temperature. Format the results with 1 decimal place.
     *
     * EXAMPLES - Provide 3 examples for testing
     *      Celcius    Fahrenheit
     * 1.      0           32
     * 2.      25          77
     * 3.      100         212
     *
     * @param args command line arguments unused
     */
    public static void main (String[] args)
    {
        // declarations of constants followed by declarations of variables
         Scanner keyboard;
         double cel;
         double fah;
         
     
        // perform initialization and get the required input
         keyboard = new Scanner(System.in);
         cel = keyboard.nextInt();
         
         
        // perform the conversion calculations
         fah = cel * 9 / 5 + 32 ;
         

        // output the results
         System.out.print(cel + "° Celsius");
         System.out.printf(" is %.1f", fah);
         System.out.println("° Fahrenheit");
         
         //formatting stuff
         double amount;
         DecimalFormat formatter = new DecimalFormat("0.0");
         amount = 103.159456;
         
         System.out.println("The amount is: " + formatter.format(amount));
          
         System.out.printf("$%.2f", amount);
         
         
    }
}
