package NumberShifter;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;

import NumberSorter.NumberSorter;

import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifterRunner
{
	public static void main( String args[] ) throws IOException
	{
		//add test cases
		for (int i = 0; i < 10; ++i) {
			int[] one = NumberShifter.makeLucky7Array(10);
			for(int item : one)
			{
				System.out.print(item + " ");
			}
			System.out.println();
		}
	}
}



