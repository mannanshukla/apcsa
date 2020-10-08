/*
 * mannan shukla
 * 10/8
 * arithmatic operatiors:
 * +,-,*,/,%
 *
 * type casting
 */
public class OperationsTest{
    public static void main(String args[]){
        int x = 5, y = 4;
        System.out.println(x + y);

        System.out.println(x - y);

        System.out.println(x * y);

        System.out.println(x / y); /*x and y are int so result is int*/

        System.out.println(x % y); /* % remainder when x divided by y*/

        double a = 3/4; /* is 0.0*/

        System.out.println(a);

        /*if one value is double then the later values will be double*/

        double a2 = 3.0/4; /*is 0.75*/

        /* converting literal const from int to double -> add .0 at the end of the number*/

        int i = 8, int j = 15;
        double div = (double)i/j; /*user(double) to convert int to double*/
        System.out.println(div);

        final double PI = 3.14159;
        /* r =5 */
        double vol_sphere = (double)4 / 3 * PI * 5 * 5 * 5;
        System.out.println(vol_sphere);

        i++; /*i+1*/
        i --; /*i-1*/
        i += j; /*i = i+j*/
        i -= j; /*i = i - j*/
        i *= j; /*i = i * j*/
        i /= j; /*i = i / j*/
        i %= j; /*i = i % j*/
    }
}
