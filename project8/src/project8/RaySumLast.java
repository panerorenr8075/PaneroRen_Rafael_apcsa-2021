package project8;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RaySumLast
{
	public static int go(int[] ray)
	{
		int index = 0;
		for (int i = 0; i<ray.length; i=i+1) {
			if (ray[i]>ray.length-1) {
				index = index + ray[i];
			}
			else
					index = index + 0;
		}
		if (index <=0)
			index = index - 1;
		return index;
	}
	public char[] go(int i, int j, int k, int l) {
		// TODO Auto-generated method stub
		return null;
}}
