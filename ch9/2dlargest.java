/**
 *mannan shukla 
 * feb 17 2021 
 *Write a program that prints the value of the largest positive element in a 2-D array, or prints 0 if all elements are negative
 */

public class 2dlargest {

    public static void main(String[] args){

    int[][] pos = {

            {1 , 2 , 3 , 4 },
            {5 , 6 , 7 , 8 },
            {23, 78, 12, 59}

    };

    int[][] neg = {

            {-1, -4, -5, -1, -4},
            {-2, -3, -6, -8, -9}

        };

    System.out.println(largestval(pos));
    System.out.println(largestval(neg));

    }


    public static int largestval(int arr[][]){

        boolean allneg = true;
        int maximum = array[0][0];

        for(int counter = 0; counter < arr.length; counter++){

            for(int i = 0; i < arr[counter].length; i++){

                if(arr[counter][i] >= 0){

                    allneg = false;

                }
                if(arr[counter][i] > maximum){

                    maximum = array[counter][i];

                }

            }

        }

        if(allneg){

            return 0;

        }

        return maximum;

    }

}
