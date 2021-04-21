package WordSearch;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
import java.io.*; 

public class WordSearch
{
    private String[][] m;

    public WordSearch( int size, String str )
    {
    	m = new String[size][size];
    	for (int i = 0; i < str.length(); ++i) {
    		int r = i/size;
    		int c = i/size;
    		c = c*size;
    		c = i-c;
    		if (r < size && c < size) {
    			m[r][c] = str.substring(i, i+1);
    		}
    	}
    }

    public boolean isFound( String word )
    {
    	for (int i = 0; i < m.length; ++i) {
    		for (int j = 0; j < m[i].length; ++j) {
    			if (checkRight(word, i, j) || checkLeft(word, i, j) || checkUp(word, i, j) || checkDown(word, i, j) ||
    					checkDiagUpRight(word, i, j) || checkDiagUpLeft(word, i, j) ||
    						checkDiagDownRight(word, i, j) || checkDiagDownLeft(word, i, j)) {
    				return true;
    			}
    		}
    	}
    	return false;
    }

	public boolean checkRight(String w, int r, int c)
   {
		if (w.length() > m[r].length - c) {
			return false;
		}
		for (int i = 0; i < w.length(); ++i) {
			if (!w.substring(i, i+1).equals(m[r][c+i])) {
				return false;
			}
		}
		return true;
	}

	public boolean checkLeft(String w, int r, int c)
	{
		if (w.length() > c+1) {
			return false;
		}
		for (int i = 0; i < w.length(); ++i) {
			if (!w.substring(i, i+1).equals(m[r][c-i])) {
				return false;
			}
		}
		return true;
	}

	public boolean checkUp(String w, int r, int c)
	{
		if (w.length() > r+1) {
			return false;
		}
		for (int i = 0; i < w.length(); ++i) {
			if (!w.substring(i, i+1).equals(m[r-i][c])) {
				return false;
			}
		}
		return true;
	}

	public boolean checkDown(String w, int r, int c)
   {
		if (w.length() > m.length - r) {
			return false;
		}
		for (int i = 0; i < w.length(); ++i) {
			if (!w.substring(i, i+1).equals(m[r+i][c])) {
				return false;
			}
		}
		return true;
	}

	public boolean checkDiagUpRight(String w, int r, int c)
	{
		if (w.length() > r+1) {
			return false;
		}
		if (w.length() > m[r].length - c) {
			return false;
		}
		for (int i = 0; i < w.length(); ++i) {
			if (!w.substring(i, i+1).equals(m[r-i][c+i])) {
				return false;
			}
		}
		return true;
	}

	public boolean checkDiagUpLeft(String w, int r, int c)
	{
		if (w.length() > r+1) {
			return false;
		}
		if (w.length() > c+1) {
			return false;
		}
		for (int i = 0; i < w.length(); ++i) {
			if (!w.substring(i, i+1).equals(m[r-i][c-i])) {
				return false;
			}
		}
		return true;
	}

	public boolean checkDiagDownLeft(String w, int r, int c)
   {
		if (w.length() > m.length - r) {
			return false;
		}
		if (w.length() > c+1) {
			return false;
		}
		for (int i = 0; i < w.length(); ++i) {
			if (!w.substring(i, i+1).equals(m[r+i][c-i])) {
				return false;
			}
		}
		return true;
	}

	public boolean checkDiagDownRight(String w, int r, int c)
	{
		if (w.length() > m.length - r) {
			return false;
		}
		if (w.length() > m[r].length - c) {
			return false;
		}
		for (int i = 0; i < w.length(); ++i) {
			if (!w.substring(i, i+1).equals(m[r+i][c+i])) {
				return false;
			}
		}
		return true;
	}

    public String toString()
    {
    	String output="";
		for(int rows = 0; rows < m.length; rows++) {
			for(int cols = 0; cols < m[rows].length; cols++) {
				output += (m[rows][cols] + "  " );
			}
			output += "\n";
		}
		return output;
    }
}
