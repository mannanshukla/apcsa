/*
 * mannan shukla
 * september 30th 2020
 * a Person class to make a person object */

public class Person{
    /* add one more attribute to Person class setting weight */
    private String name;
    private int age;
    private boolean isAdult;
    private int weight;

    public Person(String nm, int ag, boolean ad, int w){
        name = nm;
        age = ag;
        isAdult = ad;
        weight = w;
    }

    public void increaseAge(){
        age += 1;
    }

    /* add two methods to gain and lose weight */

    public void weightGain(int gain){
        weight = weight + gain;
    }

    public void weightLoss(int loss){
        weight = weight - loss;
    }
}

    
