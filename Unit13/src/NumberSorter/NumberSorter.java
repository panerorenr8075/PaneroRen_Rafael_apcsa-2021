package NumberSorter;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays; 
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSorter
{
	//instance variables and other methods not shown

	private static int getNumDigits(int number)
	{
		int count = 0;
		while (number > 0) {
			++count;
			number = number / 10;
		}
		return count;
	}

	public static int[] getSortedDigitArray(int number)
	{
		int digs = getNumDigits(number);
		int[] sorted = new int[digs];
		
		for (int i = 0; i < digs; ++i) {
			int nextDig = number % 10;
			sorted[i] = nextDig;
			number = number / 10;
		}
		
		int changed = 1;
		while (changed == 1) {
			changed = 0;
			for (int i = 0; i < digs-1; ++i) {
				if (sorted[i] > sorted[i+1]) {
					changed = 1;
					int swap = sorted[i];
					sorted[i] = sorted[i+1];
					sorted[i+1] = swap;
				}
			}
		}
		
		return sorted;
	}
}