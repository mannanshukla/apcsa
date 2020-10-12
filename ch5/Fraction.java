/*
 * mannan shukla
 * 10/12
 * fraction class with attribute numerator and denominator
 * topics: global variable, scope, converting to string
 */

public class Fraction{
        private int num, denom;
        /*fields are global variables
         * fields have scope throughout the whole class
         * all methods have access to these fields
         */

        public Fraction(){
            num = 0;
            denom = 1;
        }

        public Fraction(int n, int d){
            num = n;
            denom = d;
        }

        public String toString(){ /*no param and returns string*/
            return num + "/" + denom;
        }

        public Fraction(int n){
            num = n;
            denom = 1;
        }

        public double value(){
            return (double)num/denom;
        }
}
