package Toys;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class ToyRunner
{
	public static void main(String[] args)
	{
		Toy srry = new Toy("sorry");
		Toy gi = new Toy("gi joe");
		gi.setCount(5);
		
		System.out.println(srry);
		System.out.println(gi);
	}
}