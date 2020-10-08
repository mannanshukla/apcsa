/*
 * mannan shukla
 * 9/23
 * writing a test class for the student class
 */

public class StudentTest{
    public static void main(String ARGS[]){
        /* create an object (instance) for the "student" class
         * <class> <object> = new <class>(<params>); */

        student s1 = new student(); /*will call the empty constructor*/
        student s2 = new student("Jane", 11, 3.45, 20.00);
        student s3 = new student("bob");

        student s4 = new student();
        system.out.println;
        //<objectname>.methodname();
        System.out.println(s2.getGrade());
        s2.moveUpAGrade();
        System.out.println(s2.getGrade());

    }
}
