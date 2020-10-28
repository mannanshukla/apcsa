/*
 * mannan shukla
 * oct 20
 * chapter 5 practice problems from textbook
 */

public class pt3{
    public static void main(String args[]){
        /*11*/
        double y = Math.round(x);

        /*12*/
        /*see attached file*/
        
        /*13*/
        /*see QuadraticEquation.java*/
        
        /*14*/
        /*int (temp) cannot hold a double value*/

        /*15*/
        public int swapNumbers(int n){
            int tens = (n/10) % 10;
            int units = n%10;
            int rest = n - n%100;
            return rest + units*10 + tens;
        }

    }
}
