public class arrex{
    public static void main(String args[]){
                /*write a set of code to swap the first and last element in an array*/
                int[] a = new int[4];
                a[0] = 8;
                a[1] = 3;
                a[2] = 7;
                a[3] = 1;
        
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
                        if(a[i] == a[a.length-1]){
                            ;
                        }
                        else if(a[i] <= a[i+1]){
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