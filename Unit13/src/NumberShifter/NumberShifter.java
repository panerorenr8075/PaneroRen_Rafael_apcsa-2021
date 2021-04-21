package NumberShifter;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifter
{
	public static int[] makeLucky7Array( int size)
	{
		int [] rand = new int [size];
		for (int i = 0; i < size; ++i) {
			rand[i] = (int) (Math.random()*10) + 1;
		}
		
		shiftEm(rand);
		return rand;
	}
	public static void shiftEm(int[] array)
	{
		int nextAvailable = 0;
		for (int i = 0; i < array.length; ++i) {
			if (array[i] == 7) {
				array[i] = array[nextAvailable];
				array[nextAvailable] = 7;
				++nextAvailable;
			}
		}
	}
}