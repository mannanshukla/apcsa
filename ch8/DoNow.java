public class DoNow{

     
     public static boolean isEmail(String str){
            if(str.contains("@") && str.contains(".")){
                if(str.indexOf("@") < str.lastIndexOf(".")){
                    if(str.charAt(0) != '@'){
                        return true;
                    }
                    else{return false;}
                }
                else{return false;}
            }
            else{return false;}
            
        }
        
     public static void main(String []args){
         
        
        
        System.out.println(isEmail("abc@yahoo.com")); // valid
        System.out.println(isEmail("a.bc@gmail.com")); // valid
        System.out.println(isEmail("a.bc@msncom")); // not valid
        System.out.println(isEmail("abc@yahoocom")); // not valid
        System.out.println(isEmail("@yahoo.com")); // not valid
        System.out.println(isEmail("abcyahoo.com")); // not valid 
     }
}
