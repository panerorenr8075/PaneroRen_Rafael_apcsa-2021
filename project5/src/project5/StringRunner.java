package project5;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Rafael Panero Ren
//Date - February 9, 2021
//Class - AP Computer Science A, Period 3
//Lab  - Odd or Even String Runner

import static java.lang.System.*;
import java.util.Scanner;





public class StringRunner
{
	public static void main ( String[] args )
	{
		StringOddOrEven stringoddoreven = new StringOddOrEven();
		Scanner keyboard = new Scanner(System.in);
		
		out.print("Enter a word :: ");
		String word = keyboard.toString();
		
		
		
		out.println("This " + (stringoddoreven.getWord(word)));
	}
}
