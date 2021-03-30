package Rational;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
	//add two instance variables
	private int numerator;
	private int denominator;

	//write two constructors
	public Rational() {
		setNumerator(1);
		setDenominator(1);
	}
	
	public Rational(int num, int den) {
		setRational(num, den);
	}


	//write a setRational method
	public void setRational(int nu, int de) {
		setNumerator(nu);
		setDenominator(de);
	}

	//write  a set method for numerator and denominator
	public void setNumerator(int n) {
		numerator = n;
	}
	
	public void setDenominator(int d) {
		denominator = d;
	}

	
	public void add(Rational  other)
	{
		//num1/den1 + num2/den2 
		//new numerator = (num1 * den2 + num2 * den1)
		//new denominator = (den1 * den2)
		int numer = (getNumerator() * other.getDenominator()) + (other.getNumerator() * getDenominator());
		int denom = (getDenominator() * other.getDenominator());
		
		setNumerator(numer);
		setDenominator(denom);

		reduce();
	}

	private void reduce()
	{
		int numera = getNumerator()/gcd(numerator, denominator);
		int denomi = getDenominator()/gcd(numerator, denominator);
		setNumerator(numera);
		setDenominator(denomi);



	}

	private int gcd(int numOne, int numTwo)
	{
		int gcd = 1;
		for(int i = 1; i <= numOne && i <= numTwo; ++i) {
			if(numOne % i == 0 && numTwo % i == 0) {
				gcd = i;
			}
		}

		return gcd;
	}

	public Object clone ()
	{
		Rational cln = new Rational();
		cln.setNumerator(numerator);
		cln.setDenominator(denominator);
		return cln;
	}


	//ACCESSORS

	//write get methods for numerator and denominator
	public int getNumerator() {
		return numerator;
	}
	
	public int getDenominator() {
		return denominator;
	}
	
	
	public boolean equals( Object obj)
	{
		Rational other = (Rational)obj;
		other.reduce();
		this.reduce();
		if (numerator == other.getNumerator() && denominator == other.getDenominator()) {
			return true;
		}
		return false;
	}

	public int compareTo(Rational other)
	{
		double thisOne = (double)numerator / denominator;
		double otherOne = (double)other.getNumerator() / other.getDenominator();
		
		if(thisOne == otherOne) {
			return 0;
		}
		else if (thisOne > otherOne) {
			return 1;
		}
		else {
			return -1;
		}
	}



	
	//write  toString() method
	public String toString() {
		return numerator + "/" + denominator;
	}
	
	
}