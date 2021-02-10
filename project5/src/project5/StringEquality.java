package project5;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StringEquality
{
	private String wordOne, wordTwo;

	public StringEquality(String one, String two)
	{
		setWords(one,two);
	}

	public void setWords(String one, String two)
	{
		wordOne = one;
		wordTwo = two;
	}

	public boolean checkEquality( )
	{
		if (wordOne.compareTo(wordTwo) != 0) {
		return false;}
		else {
			return true;
		}
	}

	public String toString()
	{
		return wordOne + " does not have the same letters as " + wordTwo + "\n";
	}
}
