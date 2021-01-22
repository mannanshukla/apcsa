/*
 *mannan shukla
 *practice string methods and its uses
 */
public class StringLesson1{
    public static void main(String args[]){
       String name = "Python has been named the top programming language.";
       /*string methods are immutable and none of the
        *String methods will change the value of a string*/
       name.concat("!!!!");
       System.out.println(name);

       /*substring*/
       String program = "python";
       program = program.substring(2,5);
       System.out.println(program);
       program = "python".substring(2); /*starts at 2 ends at end*/

       /*print "Python language" with substring*/
       String p = name.substring(0,6)+name.substring(41,50);
       System.out.println(p);

       /*compareTo*/
       /*compareTo() - dictionary*/
       String a = "Python";
       String a1 = "Java";
       int c = a.compareTo(a1);
       System.out.println(c);
       c = a1.compareTo(a);
       System.out.println(c);
    }
}
