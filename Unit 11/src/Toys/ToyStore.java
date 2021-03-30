package Toys;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> toyList;

	public ToyStore()
	{
		toyList = new ArrayList<Toy>();
	}

	public void loadToys( String toys )
	{
		String[] splt = toys.split(" ");
		for (int i = 0; i < splt.length; ++i) {
			int found_flag = 0;
			for (int j = 0 ; j<toyList.size(); ++j) {
				if (splt[i].equals(toyList.get(j).getName())) {
					toyList.get(j).setCount(toyList.get(j).getCount()+1);
					found_flag = 1;
					break;
				}
			}
			if (found_flag == 0) {
				Toy newToy = new Toy(splt[i]);
				toyList.add(newToy);
			}
		}
	}
  
  	public Toy getThatToy( String nm )
  	{
  		for (int i = 0; i<toyList.size(); ++i) {
  			if (toyList.get(i).getName().equals(nm)) {
  				return toyList.get(i);
  			}
  		}
  		Toy noToy = new Toy("NONE FOUND");
  		return noToy;
  	}
  
  	public String getMostFrequentToy()
  	{
  		int most = 0;
  		String mostName = "";
  		for (int i = 0; i<toyList.size(); ++i) {
  			if(toyList.get(i).getCount() > most) {
  				most = toyList.get(i).getCount();
  				mostName = toyList.get(i).getName();
  			}
  		}
  		return mostName;
  	}  
  
  	public void sortToysByCount()
  	{
  		int changes = 1;
  		while (changes != 0) {
  			changes = 0;
  			for (int i = 0; i < toyList.size()-1; ++i) {
  				if(toyList.get(i).getCount() < toyList.get(i+1).getCount()) {
  					changes = 1;
  					Toy temp = toyList.get(i);
  					toyList.set(i, toyList.get(i+1));
  					toyList.set(i+1, temp);
  				}
  			}
  		}
  	}  
  	  
	public String toString()
	{
	   String fin = "[";
	   for(int i = 0; i < toyList.size()-1; ++i) {
		   fin += toyList.get(i).getName();
		   fin += " ";
		   fin += toyList.get(i).getCount();
		   fin += ", ";
	   }
	   if (toyList.size() != 0) {
		   fin += toyList.get(toyList.size()-1).getName();
		   fin += " ";
		   fin += toyList.get(toyList.size()-1).getCount();
	   }
	   fin += "]";
	   return fin;
	}
}