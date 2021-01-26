/*
 *mannan shukla
 *thing test
 *jan 26th 2021
 */

public class ThingTest{
    public static void main(String args[]){
        /*part a*/
        Thing snack = new Thing("potato chip");

        /*part b*/
        Thing favFood = new Thing("pizza");
        favFood.printMessage();

        /*part c*/
        /*
         *1) create object something "ABCD"
         *2) use getName() to get the inst var name
         *3) generate rand numb 0 to length -1
         *4) use substring to remove chosen char
         *5) use setName() to replace old name
         */

        Thing something = new Thing("abcd");
        String n = something.getName();
        int min = 0, max = n.length()-1;
        int range = max - min + 1;
        int pos = (int)(Math.random() * range);
        String ch = Character.toString(n.charAt(pos));
        //n = n.replace(ch, "");
        String q = n.substring(0, pos)+n.substring(pos+1);
        something.setname(q);
    }
}
