/*
 * name mannnan shukla
 * 9/25/20
 * writing a test class for "Book"
 * */
public class BookTest{
    public static void main(String args[]){
        /*creating a book object*/
        book harrypotter = new Book(345);
        System.out.println(harrypotter.getNumPages());
        System.out.println(harrypotter.getCurrentPage());
        harrypotter.nextPage();
        System.out.println(harrypotter.getCurrentPage());

        book becker = new Book(3);
        System.out.println(becker.getCurrentPage());
        becker.nextPage();
        System.out.println(becker.getCurrentPage());
        becker.nextPage();
        System.out.println(becker.getCurrentPage());
        becker.nextPage();
        System.out.println(becker.getCurrentPage());
    }
}
