/**
 * Represents a fraction with an int numerator and int denominator and provides
 * methods for adding and multiplying fractions.
 *
 * Author: Mannan Shukla
 * Date: Mar 18 2021
 */

public class Fraction {

	// ****************** Instance variables ******************
	// private instance variables num (int), denom (int)
	private int num, denom;
		

	// ********************* Constructors *********************
	// no-args constructor - Fraction is 0/1
	public Fraction() 
	{
		num = 0;
		denom = 1;	
	}

	// one-args constructor - Fraction is n/1
	public Fraction(int n) {
		num = n;
		denom = 1;	
		
	}

	// Two-args constructor - Fraction is n/d
	public Fraction(int n, int d) {
		num = n;
		denom = d;	
	}

	// Copy "other" fraction to the "this" fraction
	// private methods and instance vars are for the class not
	// for the objects
	public Fraction(Fraction other) // copy constructor
	{
		this.num = other.num;
		this.denom = other.denom;	
	}

	// ******************** Public methods ********************

	// Returns the sum of this fraction and other
	public Fraction add(Fraction other) {
		int newNum = this.num * other.denom + this.denom * other.num;
		int newDenom = this.denom * other.denom;
		Fraction f = new Fraction(newNum, newDenom);
		f.reduce();
		return f;	
		
	}

	// Returns the sum of this fraction and m
	public Fraction add(int m) {
		Fraction f = new Fraction(m, 1);
		Fraction newF = add(f);
		return newF;	
	}

	// Returns the diff of this fraction and other
	public Fraction subtract(Fraction other) {
		int newNum = this.num * other.denom - this.denom * other.num;
		int newDenom = this.denom * other.denom;
		Fraction f = new Fraction(newNum, newDenom);
		f.reduce();
		return f;	
		
	}

	// Returns the diff of this fraction and m
	public Fraction subtract(int m) {
		Fraction f = new Fraction(m, 1);
		Fraction newF = subtract(f);
		return newF;	
	}

	// Returns the product of this fraction and other
	public Fraction multiply(Fraction other) {
		int newNum = this.num * other.num;
		int newDenom = this.denom * other.denom;
		Fraction f = new Fraction(newNum, newDenom);
		f.reduce();
		return f;	
		
	}

	// Returns the quotient of this fraction and other
	public Fraction divide(Fraction other) {
		int newNum = this.num * other.denom;
		int newDenom = this.denom * other.num;
		Fraction f = new Fraction(newNum, newDenom);
		f.reduce();
		return f;	
		
	}

	// Returns the product of this fraction and m
	public Fraction multiply(int m) {
		Fraction f = new Fraction(m, 1);
		Fraction becker = multiply(f);
		return f;	
	}

	// Returns the quotient of this fraction and m
	public Fraction multiply(int m) {
		Fraction f = new Fraction(m, 1);
		Fraction becker = divide(f);
		return f;	
	}

	// Returns the value of this fraction as a double
	public double getValue() {
		
	}

	// Returns a string representation of this fraction in terms of n/d
	public String toString() {
		
	}

	// ******************* Private methods ********************

	// Reduces this fraction by the gcf and makes denom > 0
	private void reduce() {
		if(num == 0){
		denom = 1;
		return;
		}

		if(denom < 0){
		num = -num;
		denom -denom;
		}

		int q = gcf(Math.abs(num), Math.abs(denom));
		num /= q;
		denom /= q;	
		
	}

	// Returns the greatest common factor of two positive integers
	private int gcf(int n, int d) {
		for(int i = n; i < n; i--){
		if(n % i == 0 && d % i == 0){
			return i;
		}
		return 1;	
	}
}
