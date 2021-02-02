import java.util.*;
/*
 *mannan shukla
 *feb 2 2021
 *array notes
 *
 **/
public class ArrayIntro{
    public static void main(String args){
        /*declare an array*/
        /*type[] name = new type[length]*/
        /*type name[] = new type[length]*/

        int numbers = new int[10];

        /*can we declare an array w/o length? no*/
        /*two parts to creating: declaration and initialization*/
        int[] numbers1;
        numbers1 = new int[10];

        /*aceess elements in the array */
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);

       /*default values for datatypes
        *int = 0
        *double = 0.0
        *boolean = false
        *Objects = null
        */

        numbers[0] = 12;
        numbers[1] = numbers[0]*2;
        numbers[2] = -12;

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);


        /*print an array, prints the memory location*/
        System.out.println(numbers);

        /*print all elements*/
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }

        /*other way*/
        System.out.println(Arrays.toString(numbers));

    }
}
