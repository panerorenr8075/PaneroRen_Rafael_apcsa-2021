package project7;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFive
{
 private char letter;
 private int amount;

	public TriangleFive()
	{
		setLetter(letter);
		setAmount(amount);
	}

	public TriangleFive(char c, int amt)
	{
		setLetter(letter);
		setAmount(amount);
	}

	public void setLetter(char c)
	{
		letter = c;
	}

	public void setAmount(int amt)
	{
		amount = amt;
	}

	public String toString()
	{
		String test ="";
		char c = letter;
		int amt = amount;
		for(int loop = 0; loop < amount; loop = loop + 1)
		{
			for(int cos = 0; cos < amount; cos = cos + 1) {
				for(int x = amt; x > cos; x=x-1);{
					test += (char) (letter + cos);
				}
				test += "";
			}
			amount = amount - 1;
			test += "/n";
		}
		
		return test;
	}
}
