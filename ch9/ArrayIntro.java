import java.util.*;
import java.util.Arrays;
import java.util.List;
/*
 *mannan shukla
 *feb 2 2021
 *array notes
 *
 **/
public class ArrayIntro{
    public static void main(String args[]){
        /*declare an array*/
        /*type[] name = new type[length]*/
        /*type name[] = new type[length]*/

        int[] numbers = new int[10];

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

        /*write a set of code to swap the first and last element in an array*/
        int[] a = new int[4];
        a[0] = 1;
        a[1] = 7;
        a[2] = 3;
        a[3] = 8;

        System.out.println("Original Array");
        for(int i = 0; i < a.length; i++){
                System.out.println(a[i]);
        }

        int temp = 0;
        int maxindex = a.length-1;
        temp = a[0];
        a[0] = a[maxindex];
        a[maxindex] = temp;

        System.out.println("modified array");

        for(int i = 0; i < a.length; i++){
                System.out.println(a[i]);
        }

        /*Test if all elements in an int array are in ascending order*/
        boolean flag = false;
        for(int i = 0; i < a.length; i++){

                if(a[i] <= a[i+1]){
                        flag = true;
                }
                else{
                        flag = false;
                }


        }

        if(flag){
           System.out.println("array is in ascending order");
        }

        else{
                System.out.println("array isn't in ascending order");
        }
    }
}
