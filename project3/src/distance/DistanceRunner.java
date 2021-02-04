package distance;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;

import project3.MilesPerHour;

import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunner
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(in);

		out.print("Enter the x1 Coordinate :: ");
		int xOne = keyboard.nextInt();

		out.print("Enter the y1 Coordinate :: ");
		int yOne = keyboard.nextInt();

		out.print("Enter the x2 Coordinate :: ");
		int xTwo = keyboard.nextInt();
		
		out.print("Enter the y2 Coordinate :: ");
		int yTwo = keyboard.nextInt();

		Distance test = new Distance(xOne, yOne, xTwo, yTwo);
		test.calcDistance();
		System.out.println(test.toString());
		//add test cases	
			
	}
}
