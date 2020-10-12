/*
 * mannan shukla
 * 10/12
 * test the fraction class
 */

public class FractionTest{
    public static void main(String args[]){
        Fraction f1 = new Fraction(3,4); /*fraction 3/4*/
        System.out.println(f1.value()); /*f1 is object for fraction class
                                 * will print the memory location
                                 */
        Fraction f2 = new Fraction();
        System.out.println(f2);

        Fraction f3 = new Fraction(4);
        System.out.println(f3);

        
    }
}
