import java.util.*;
public class Weather{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("How many days' temperatures?");
        int len = sc.nextInt();
        double avg = 0.0;
        int count = 0;
        int temp = 0;
        int[] days = new int[len];

        for(int i = 0; i < days.length; i++){
            temp = i+1;
            System.out.println("Day "+temp+"s high temp:");
            days[i] = sc.nextInt();
            avg = avg+=days[i];
        }

        avg = avg/len;

        System.out.println("Average temp = "+avg);

        for(int i = 0; i < days.length; i++){
            if(days[i] > avg){
                count++;
            }
        }

        System.out.println(count+" days were above average");
    }
}
