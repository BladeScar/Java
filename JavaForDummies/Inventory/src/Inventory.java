import java.text.NumberFormat;
import java.util.Scanner;
import static java.lang.System.out;

public class Inventory {

	public static void main(String[] args) {
		final double boxPrice = 3.25;
		Scanner keyboard = new Scanner(System.in);
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		out.print("How many boxes do we have? ");
		String numBoxesIn = keyboard.next();
		try {
			int numBoxes = Integer.parseInt(numBoxesIn);
			out.println("The value is ");
			out.println(currency.format(numBoxes * boxPrice));
		} catch(NumberFormatException e){
			out.println("That's not a number!");
		};
		
	}

}
