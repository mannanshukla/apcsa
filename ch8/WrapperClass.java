/*
 *mannan shukla
 *jan 22 2021
 *wrapper class from class
 */

public class WrapperClass{
    public static void main(String args[]){
        /*Integer, Double, Character, Boolean*/
        /*toString() - converts any datatype to string*/

        int x = 4;
        String n = Integer.toString(x);
        n = ""+x;

        /*converting string to primative data type*/
        String ss = "123-45-6789";
        String ssn = ss.replace("-","");
        int ssNumber = Integer.parseInt(ssn);

        System.out.println(ssNumber);

    }
}
