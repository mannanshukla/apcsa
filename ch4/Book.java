/*
 * name mannan shukla
 * 9/25/20
 * creating a book class with 2 fields and one constructor
 * */

public class Book{
    public static void main(String ARGS[]){
        /*instance variables*/
        private int numPages;
        private int currentPage;

        /*constructor with one param*/
        public book(int n){
            numPages = n;
            currentPage = 1; /*start reading from the first page*/
        }
        
        /* acessor method */
        public int getNumPages(){
            return numPages;
        }

        public int getCurrentPage(){
            return currentPage;
        }

        public void nextPage(){
            if(currentPage < numPages){
                currentPage++;
            }
        }
    }
}
