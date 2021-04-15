package Word;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File; 
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class WordRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("words.dat"));

		int size = file.nextInt();
		file.nextLine();
		
		Word[] wrds = new Word[size];
		for (int i = 0; i<size; ++i) {
			String w = file.nextLine();
			Word newWord = new Word(w);
			wrds[i] = newWord;
		}
		Arrays.sort(wrds);
		
		for (int i = 0; i<size; ++i) {
			System.out.println(wrds[i]);
		}











	}
}