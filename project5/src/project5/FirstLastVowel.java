package project5;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Rafael Panero Ren
//Date - February 9, 2021


public class FirstLastVowel {
	
	public static String go(String a) {
		if (a.toLowerCase().charAt(0) == 'a') {
			return "yes";
		}
		if (a.toLowerCase().charAt(0) == 'e') {
			return "yes";
		}
		if (a.toLowerCase().charAt(0) == 'i') {
			return "yes";
		}
		if (a.toLowerCase().charAt(0) == 'o') {
			return "yes";
		}
		if (a.toLowerCase().charAt(0) == 'u') {
			return "yes";
		}
		if (a.toLowerCase().charAt(a.length()-1) == 'a') {
			return "yes";
		}
		if (a.toLowerCase().charAt(a.length()-1) == 'e') {
			return "yes";
		}
		if (a.toLowerCase().charAt(a.length()-1) == 'i') {
			return "yes";
		}
		if (a.toLowerCase().charAt(a.length()-1) == 'o') {
			return "yes";
		}
		if (a.toLowerCase().charAt(a.length()-1) == 'u') {
			return "yes";
		}
		return "no";
	}
}
