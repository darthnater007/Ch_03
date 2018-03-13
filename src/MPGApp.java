import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;
//import java.text.NumberFormat;

public class MPGApp {

    public static void main(String[] args) {
        System.out.println("Welcome to the Miles Per Gallon calculator");
        System.out.println();  // print a blank line
        
        
		Scanner sc = new Scanner(System.in);
        
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) 
        {
            System.out.print("Enter miles driven: ");
            BigDecimal Miles = new BigDecimal(sc.next());
            
            System.out.print("Enter gallons of gas used: ");
            BigDecimal Gallons = new BigDecimal(sc.next());
            BigDecimal Mpg = Miles.divide(Gallons,2,RoundingMode.HALF_UP);
            System.out.println("Miles per gallon is " + Mpg.toString() + ".");
            System.out.println(); 
            while (!choice.equalsIgnoreCase("N"))
            {
	            System.out.print("Calculate another MPG? (y/n): ");
	            choice = sc.next();
	            if (choice.equalsIgnoreCase("Y"))
	            {
	            	break;
	            }
	            System.out.println();
            }
        }
        sc.close();
    }
    
}
