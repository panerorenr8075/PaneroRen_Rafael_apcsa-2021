package project7;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class Triples
{
private int number;

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{
		number = num;
	}

	public void setNum(int num)
	{
		number = num;
	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int max = 0;
		if(a > b && a > c)
			max = a;
		if(b > a && b > c)
			max = b;
		if(c > a && c > b)
			max = c;



		return max;
	}

	public String toString()
	{
		String output="";






		return output+"\n";
	}
}
