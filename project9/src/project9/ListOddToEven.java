package project9;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	public static int go( List<Integer> ray )
	{
		int first = -1;
		for (int i = 0; i<ray.size(); ++i) {
			if (ray.get(i)%2 == 1) {
				first = i;
				break;
			}
		}
		if (first == -1) {
			return -1;
		}
		
		int even = -1;
		for (int j = first + 1; j<ray.size(); ++j) {
			if (ray.get(j)%2 == 0) {
				even = j;
			}
		}
		if(even == -1) {
			return -1;
		}
		
		return even-first;
	}
}
