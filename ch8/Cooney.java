/*
mannan shukla
cooney cli implementation
jan 28th 2021
*/
import java.util.Scanner;
public class Cooney{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        String s = "";
        Boolean flag;
        int count = 1;

        while(count <= 5){
            System.out.println("Enter a String to check \n");
            s = sc.next();
            flag = false;
            for(int i = 0; i < s.length() - 1; i++){
                String ch1 = Character.toString(s.charAt(i));
                String ch2 = Character.toString(s.charAt(i+1));
    
                if(ch1.equals(ch2)){
                    System.out.println("Cooney likes "+s+"\n");
                    flag = true;
                    count++;
                    break;
                }
    
            }
    
            if(!flag){
                System.out.println("Cooney dislikes "+s+"\n");
                count = 1;
            }

            
        }

        sc.close();
    }
}
