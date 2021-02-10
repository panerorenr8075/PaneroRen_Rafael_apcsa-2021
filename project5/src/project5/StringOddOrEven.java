package project5;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Rafael Panero Ren
//Date - February 9, 2021
//Class - AP Computer Science A, Period 3
//Lab  - Odd or Even Strings

import static java.lang.System.*;
import java.util.Scanner;

public class StringOddOrEven
{
	public static String getWord(String word)
	{
		if (word.length()%2 == 1) {
			return "has an odd number of letters!";
		}
		return "has an even number of letters!";
	}
}
