/*
 * mannan shukla
 * 10/8
 * variables and data types
 * constants
 */

public class ArithmaticTest{
    public static void main(String args[]){
        /*local variables
         * don't use private public or static*/
        int x; /*declaration, creates space in memory w/o value*/

        /*you have to initialize the local variables*/
        x = 5; /*initialization*/

        int y = -1; /*declaration and initailization together*/
        /*can't combine two data types using commas*/
        double a, b, c; /*same data types combined with commas*/
        
        System.out.println(x);

        /* int double boolean char*/
        String name = "java";
        /* constants
         * values that can't be changed
         * literal and symbolic
         */

        x = 10; /*10 is a literal constant*/
        String str = "python"; /*"" is a literal constant*/

        /*symbolic: values stored in a variable that cannot be changed*/

        final String STR1 = "Basic";
        /* final vars are given in all CAPS*/
        final int OZ_IN_LB = 16;
    }
}
