package FunOne;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class RecursionFunOne
{
	public static int countOddDigits(int num)
	{
		if(num > 0) {
			if ((num%10)%2 == 0) {
				return 1 + countOddDigits((int) num/10);
			}
			return 0 + countOddDigits((int) num/10);
		}
		return 0;
	}
}