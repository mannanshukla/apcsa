//mannan shukla
//feb 16
//implementation of the library class

public class LibraryTest {

	public static void main(String[] args) {
		Library l = new Library(5, "RHS", "Robbinsville, NJ");
		System.out.println(l);
		
		// add a book to the collection
		Book java_methods = new Book(1001, "Java Methods", "Litvin", 39.95, 670, 3);
		l.add_Book(java_methods);
		System.out.println(l);
		
		// add more books to the collection and print list after each addition
		Book windupbird = new Book(1002, "the wind up bird chronicle, ", "haruki murakami", 19.99, 223, 2);
		l.add_Book(windupbird);
		System.out.println(l);
		
		Book sputnik = new Book(1003, "sputnik, sweetheart", "haruki murakami", 14.99, 416, 3);
		l.add_Book(sputnik);
		System.out.println(l);
		
		Book nineteeneightyfour = new Book(1004, "1984", "george orwell", 17.99, 158, 2);
		l.add_Book(nineteeneightyfour);
		System.out.println(l);
		
		Book animalfarm = new Book(1005, "Animal Farm", "george orwell", 13.99, 112, 1);
		l.add_Book(animal_farm);
		System.out.println(l);
	}

}
