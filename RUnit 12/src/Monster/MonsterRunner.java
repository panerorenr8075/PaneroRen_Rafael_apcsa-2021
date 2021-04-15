package Monster;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		for (int i = 0; i < 3; ++i) {
			//ask for name and size
			System.out.print("Enter 1st monster's name : ");
			String MOneName = keyboard.next();
			System.out.print("Enter 1st monster's size : ");
			int MOneSize = keyboard.nextInt();
			
			//instantiate monster one
			Skeleton MOne = new Skeleton(MOneName, MOneSize);
			
			//ask for name and size
			System.out.print("Enter 2nd monster's name : ");
			String MTwoName = keyboard.next();
			System.out.print("Enter 2nd monster's size : ");
			int MTwoSize = keyboard.nextInt();
			
			//instantiate monster two
			Skeleton MTwo = new Skeleton(MTwoName, MTwoSize);
			
			System.out.println("");
			String first = "Monster 1 - ";
			first += MOne.toString();
			System.out.println(first);
			
			String second = "Monster 2 - ";
			second += MTwo.toString();
			System.out.println(second);
			
			System.out.println("");
			if (MOne.isBigger(MTwo)) {
				System.out.println("Monster one is bigger than Monster two.");
			}
			else if (MOne.isSmaller(MTwo)) {
				System.out.println("Monster one is smaller than Monster two.");
			}
			else {
				System.out.println("Monster one is the same size as Monster two.");
			}
			
			if (MOne.namesTheSame(MTwo)) {
				System.out.println("Monster one has the same name as Monster two.");
			}
			else {
				System.out.println("Monster one does not have the same name as Monster two.");
			}
			System.out.println("");
			System.out.println("");
			System.out.println("");
		}
		
		System.out.print("Enter 1st monster's name : ");
		String MOneName = keyboard.next();
		System.out.print("Enter 1st monster's size : ");
		int MOneSize = keyboard.nextInt();
		
		//instantiate monster one
		Skeleton MOne = new Skeleton(MOneName, MOneSize);
		
		//ask for name and size
		System.out.print("Enter 2nd monster's name : ");
		String MTwoName = keyboard.next();
		System.out.print("Enter 2nd monster's size : ");
		int MTwoSize = keyboard.nextInt();
		
		//instantiate monster two
		Zombie MTwo = new Zombie(MTwoName, MTwoSize);
		
		System.out.println("");
		String first = "Monster 1 - ";
		first += MOne.toString();
		System.out.println(first);
		
		String second = "Monster 2 - ";
		second += MTwo.toString();
		System.out.println(second);
		
		System.out.println("");
		if (MOne.isBigger(MTwo)) {
			System.out.println("Monster one is bigger than Monster two.");
		}
		else if (MOne.isSmaller(MTwo)) {
			System.out.println("Monster one is smaller than Monster two.");
		}
		else {
			System.out.println("Monster one is the same size as Monster two.");
		}
		
		if (MOne.namesTheSame(MTwo)) {
			System.out.println("Monster one has the same name as Monster two.");
		}
		else {
			System.out.println("Monster one does not have the same name as Monster two.");
		}
	}
}