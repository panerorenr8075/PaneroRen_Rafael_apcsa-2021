package Toys;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStoreRunner
{
	public static void main( String args[] )
	{
		ToyStore store = new ToyStore();
		System.out.println(store);
		store.loadToys("sorry bat sorry sorry sorry train train teddy teddy ball ball");
		System.out.println(store);
		System.out.println("max == " + store.getMostFrequentToy());
	}
}