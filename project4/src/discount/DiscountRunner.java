package discount;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name - 
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class DiscountRunner
{
	public static void main( String args[] )
	{
		Discount discount = new Discount();
		Scanner keyboard = new Scanner(System.in);
		
		out.print("Enter the original bill amount :: ");
		double bill = keyboard.nextDouble();
		
		
		out.println("The bill after the discount is " + (discount.getDiscountedBill(bill)));
		

	}
}