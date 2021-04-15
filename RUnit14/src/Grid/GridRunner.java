package Grid;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class GridRunner
{
	public static void main( String args[] ) throws IOException
	{
		String [] vals = {"a","7","x","c","b","2","9"};
		Grid grd = new Grid(20,20,vals);
		System.out.println(grd);
		
		String prt = grd.findMax(vals);
		prt += " occurs the most.";
		System.out.println(prt);
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		Grid grd2 = new Grid(10,10,vals);
		System.out.println(grd2);
		
		String prt2 = grd2.findMax(vals);
		prt2 += " occurs the most.";
		System.out.println(prt2);
	}
}