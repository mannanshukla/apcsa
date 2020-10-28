/*
 * mannan shukla
 * ch 5 q 13
 * october 19th
 * quadratic formula program with math methods
 */

public class QuadraticFormula{
    public static void main(String args[]){

        int a = 1, b = 6, c = 9;
        /*change values of a,b,c*/
        double x1, x2;

        double sqrtEx = Math.sqrt(b*b-4*a*c);
        x1 = ((-1*b) + sqrtEx) / (2*a);
        x2 = ((-1*b) - sqrtEx) / (2*a);

        System.out.println("the results are "+x1+" and "+x2);
    }
}
