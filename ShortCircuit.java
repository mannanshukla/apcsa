/*
 * mannan shukla
 * november 17 2020
 * lern about short circuit evaluation in conditionals
 */
public class ShortCircuit{
    public static void main(String args[]){
        int x = 15;
        int y = 0;

        /* condition that checks if x divided by y
         * evals to greater than 3*/

        if(y != 0 && x/y > 3){
            System.out.println("x/y > 3");
        }
    }
}
