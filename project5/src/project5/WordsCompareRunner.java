package project5;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;


public class WordsCompareRunner
{
 public static void main( String args[] )
 {
		WordsCompare compare = new WordsCompare();
		
		compare.setWords( "dog", "cats" );

		
		WordsCompare test = new WordsCompare();
		test.compare();
		System.out.println(test.toString());
		//add test cases

	}
}
