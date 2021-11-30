package java_examples.interview_recipes;

public class StringContainsOnlyDigit {

    public static boolean isNumeric(CharSequence cs){

        if(cs.length()==0 || cs==null){
            return false;
        }

       for(int i = 0; i<cs.length();i++){
           if(!Character.isDigit(cs.charAt(i))){
               // return false as soon as we get any non-numeric character
               return false;
           }
       }
       return true;
    }

    public static void main(String[] arg){
        System.out.println(isNumeric("gaurav"));
        System.out.println(isNumeric("gaurav1"));
        System.out.println(isNumeric("12345"));
        System.out.println(isNumeric("-12345"));
        System.out.println(isNumeric("1234.5"));
        System.out.println(isNumeric(""));
    }
}
