//mannan shukla
//feb 16
//library class

public class Library {
	private Book[] books; // declaration but no initialization
	private String name;
	private String address;
	
	// constructor
	public Library(int book_count, String n, String a) {
		books = new Book[book_count];
		name = n;
		address = a;
	}
	// add a book at the end of the array
	//precondition - there is always space in the array
	public void add_Book(Book b) {
		for (int i = 0; i < books.length; i++) {
			if(books[i] == null) {
				books[i] = b;
				break;
			}
		}
	}
	public String toString() {
		String s = "";
		for(Book b: books) {
			if(b != null) {
				s += b.toString();
			}
		}
		return s;
	}
}
