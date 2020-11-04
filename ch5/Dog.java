/*
 * name => mannan shukla
 * date => november 3rd
 * about => study guide dog class
 */

public class Dog{

    /*instance variables*/
    private String name;
    private int dog_age;

    /*constructors*/
    public Dog(String n){
        name = n;
        dog_age = 1;
    }

    public Dog(String n, int a){
        name = n;
        dog_age = a;
    }

    /*methods*/
    public int getPeopleAge(int years){
        int people_age = dog_age * years;
        return people_age;
    }

    public String getName(){
        return name;
    }

    public void increaseAgeByOne(){
        dog_age++;
    }

}
