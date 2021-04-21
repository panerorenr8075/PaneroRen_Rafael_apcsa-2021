package WordSorter;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class WordSortTwo
{
	private String[] wordRay;

	public WordSortTwo(String sentence)
	{
		wordRay = sentence.split(" ");
	}

	public void sort()
	{
		int changed = 1;
		while (changed == 1) {
			changed = 0;
			for (int i = 0; i < wordRay.length-1; ++i) {
				if (wordRay[i].compareTo(wordRay[i+1]) > 0) {
					changed = 1;
					String swap = wordRay[i];
					wordRay[i] = wordRay[i+1];
					wordRay[i+1] = swap;
				}
			}
		}
	}

	public String toString()
	{
		String output="";
		for (int i = 0; i < wordRay.length; ++i) {
			output += wordRay[i] + "\n";
		}
		return output+"\n\n";
	}
}