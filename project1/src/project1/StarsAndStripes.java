package project1;

//© A+ Computer Science
//www.apluscompsci.com

//Name - Rafael Panero Ren
//Date - January 31, 2021
//Class - AP Computer Science A, Period 3
//Lab  - Stars and Stripes

import static java.lang.System.*;

public class StarsAndStripes
{
 public StarsAndStripes()
 {
    out.println("StarsAndStripes");
    printTwoBlankLines();
 }

 public void printTwentyStars()
 {
	 out.println("********************");
 }

 public void printTwentyDashes()
 {
	 out.println("--------------------");
 }

 public void printTwoBlankLines()
 {
	 out.println();
	 out.println();
 }
 
 public void printASmallBox()
 {	
	 out.println("-----");
	 out.println("|    |");
	 out.println("|    |");
	 out.println("-----");
	 
 }
 
 public void printABigBox()
 { 	
	 out.println("------------------");
	 out.println("|                |");
	 out.println("|                |");
	 out.println("|                |");
	 out.println("|                |");
	 out.println("|                |");
	 out.println("|                |");
	 out.println("------------------");
		
 }   


public static void main ( String[] args )
{
	System.out.println("Rafael Panero Ren \t  January 31, 2021 \n\n" );
	
	// Create an instance of stars and stripes
	StarsAndStripes starsAndStripes = new StarsAndStripes();
	
	// Draw freestyle
	starsAndStripes.printTwoBlankLines();
	starsAndStripes.printTwentyStars();
	starsAndStripes.printTwentyDashes();
	starsAndStripes.printASmallBox();
	starsAndStripes.printABigBox();
	starsAndStripes.printTwoBlankLines();
	starsAndStripes.printTwentyDashes();
	starsAndStripes.printTwentyStars();
	
			
}

}