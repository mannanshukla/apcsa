public class School{
    
    public School(){ //no argument constructor
    }

    // you can have many constructors in one class
    
    public School(int s){ //one argument constructor (int)
    }

    public School(String s, int n){ //2 arguments
    }

   // accessor (get) and mutator (set) methods
   // get methods are view permission: return the value fo the variable
   // set methods are edit permission: giving permission to change the value of a variable
   //
   // get method to retrieve the name of the school (school_name)
   public String getSchoolName(){
       return school_name;
   }

   // set method to change no_of_teachers
   public void setNoOfTeachers(int n){
       no_of_teachers=n;
    }

    //other methods as public or private
}
