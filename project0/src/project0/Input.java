package project0;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Rafael Panero Ren
//Date - January 31, 2021
//Class - AP Computer Science A
//Lab  - Input

import static java.lang.System.*;
import java.util.Scanner;

public class Input
{
  public static void main (String[] args) 
  {
	  Scanner keyboard = new Scanner(System.in);

	  // two integers
	  int intOne, intTwo;
	  // two double variables
	  double doubleOne, doubleTwo;
	  // two float variables
	  float floatOne, floatTwo;
	  // two short variables
	  short shortOne, shortTwo;

	  // ask for first integer
	  System.out.print("Enter an integer :: ");
	  intOne = keyboard.nextInt();
    	
	  // ask for second integer
	  System.out.print("Enter an integer :: ");
	  intTwo = keyboard.nextInt();

	  // ask for double variable
	  System.out.print("Enter a double :: ");
	  doubleOne = keyboard.nextDouble();
    	
	  // ask for second double variable
	  System.out.print("Enter a double :: ");
	  doubleTwo = keyboard.nextDouble();

	  // ask for a float variable
	  System.out.print("Enter a float :: ");
	  floatOne = keyboard.nextFloat();
    	
	  // ask for second float variable
	  System.out.print("Enter a float :: ");
	  floatTwo = keyboard.nextFloat();

	  // ask for short variable
	  System.out.print("Enter a short :: ");
	  shortOne = keyboard.nextShort();
    	
	  // ask for second short variable
	  System.out.print("Enter a short :: ");
	  shortTwo = keyboard.nextShort();

	  // output the two integers
	  System.out.println("integer one = " + intOne);
	  System.out.println("integer two = " + intTwo);

	  // output the two double variables
	  System.out.println("double one = " + doubleOne);
	  System.out.println("double two = " + doubleTwo);

	  // output the two float variables
	  System.out.println("float one = " + floatOne);
	  System.out.println("float two = " + floatTwo);

	  // output the two short variables
	  System.out.println("short one = " + shortOne);
	  System.out.println("short two = " + shortTwo);


   }
}
