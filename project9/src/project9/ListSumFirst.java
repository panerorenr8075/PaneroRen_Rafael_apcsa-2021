package project9;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListSumFirst
{
	public static int go(List<Integer> ray)
	{
		if (ray.size() == 0) {
			return -1;
		}
		
		int first = ray.get(0);
		int fin = 0;
		int greater = 0;
		
		for(int i = 0; i < ray.size(); ++i) {
			if (ray.get(i) > first) {
				fin += ray.get(i);
				greater = 1;
			}
		}
		
		if (greater == 0) {
			return -1;
		}
		return fin;
 	}
}
