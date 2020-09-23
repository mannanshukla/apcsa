/*
 * name: mannan shukla
 * date: 9/23/2020
 * write a student calss with instance variables and behaviors
 */

public class student{
    /*declaring the variable*/
    private String name;
    private int grade;
    private double GPA;
    private double lunch_balance;

    /*constructors are used to set values to instance variables*/
    public student(){ /*sets default values*/
        name="No Name";
        grade=0;
        GPA=4.0;
        lunch_balance=0;
    }

    public student(String n, int g, double gpa, double l){
        /*instance variable = param value*/
        name = n;
        grade = g;
        GPA = gpa;
        lunch_balance = l;
    }


    /*behavior for student to move up a grade*/
    public void moveUpAGrade(){
        grade++;
        /*increment grade*/
    }

    /*getter method for grade*/
    public int getGrade(){
        return grade;
    }
}
