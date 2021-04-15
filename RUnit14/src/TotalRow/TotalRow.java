package TotalRow;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;

public class TotalRow
{
    public static List<Integer> getRowTotals( int[][] m )
    {
    	//add code here
    	List<Integer> totals = new ArrayList<Integer>();
		for (int i = 0; i < m.length; ++i) {
			int ttl = 0;
			for (int j = 0; j < m[i].length; ++j) {
				ttl += m[i][j];
			}
			totals.add(ttl);
		}
		return totals;
    }
}
