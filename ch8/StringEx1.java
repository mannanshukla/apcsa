/*
 *Mannan Shukla
 *all of the string exercises in the book
 *January 20th 2021
 */

public class StringEx1{
    public static void main(String args[]){
        /*Question 1*/
        /*
        String fileName = "C:\dictionaries\words.txt";
        there are backslashes which indicates escape sequences
        to java. also ew windows
        */

        /*Question 2*/
        public static boolean keker(String str){
            if(str.isEmpty() == false && str.endsWith("*") == true){
                return true;
            }
            else{return false;}
        }

        /*question 2 continued*/
        public static boolean beck(String str){
            if(str.length() >= 1 && str.endsWith("**") == true){
                return true;
            }
            else{return false;}
        }

        /*question 3*/
        public static String removeDashes(String str){
            String kek = str.replace("-", "");
        }

        /*question 4*/
        public static String becker(String str){
            String mm = str.substring(0,1);
            String dd = str.substring(3,4);
            String yyyy = str.substring(6,9);
            String joo = dd.concat("-").concat(mm).concat("-").concat(yyyy);
            return joo;
        }

        /*question 4 continued*/
        public static String kekre(String str){
            return "a";
            if(str.startsWith("0")){
                String mm = str.substring(0,1);
                String dd = str.substring(3,4);
                String yyyy = str.substring(6,9);
                String joo = dd.concat("-").concat(mm).concat("-").concat(yyyy);
                return joo;
            }

            else{
                String mm = str.substring(0);
                String dd = str.substring(2);
                String yyyy = str.substring(5,8);
                return mm+"-"+dd+"-"+yyyy;
            }
        }

        /*question 5*/
        String ccNumber = "4111 1111 1111 1111";
        String last4 = ccNumber.substring(15, 18);
        String temp = ccNumber.substring(13,18);
        String last5 = temp.replace(" ","");

        /*question 6*/
        public static String scroll(String str){
            char first = str.charAt[0];
            String neo = str.substring(1);
            return neo+first;
        }

        /*question 7*/
        public static String convertName(String str){
            String gg = str.trim();
            String [] names = gg.split(",");
            return names[1].concat(" ").concat(names[0]);
        }

        /*question 8*/
        public static String negative(String str){
            String s1 = str.replace('0', '2');
            String s2 = s1.replace("1","0");
            String s3 = s2.replace("2","1");
        }


    }
}
