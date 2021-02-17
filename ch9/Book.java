//mannan shukla
//feb 16
//book class

public class Book { // class definition
	//private instance variables
	private int book_number;
	private String book_name;
	private String author;
	private double cost;
	private int pages;
	private int copies;
	
	//Constructor
	public Book(int n, String name, String a, double c, int p, int co) {
		book_number = n;
		book_name = name;
		author = a;
		cost = c;
		pages = p;
		copies = co;
	}
	
	//called when Book object is printed
	public String toString() {
		String s = "";
		s += "Book Number: " + book_number + "\n";
		s += "Book Name: " + book_name + "\n";
		s += "Author: " + author + "\n";
		s += "Cost: " + cost + "\n";
		s += "Pages: " + pages + "\n";
		s += "Number of Copies: " + copies + "\n";
		s += "------------------------------\n";
		return s;
	}
	
	
	
}
