import java.util.Arrays;

public class StringMethoden
{
    public static String deleteStartingSpace(String sentence){

        boolean isSpace = true;
        char[] array = sentence.toCharArray();
        String ausgabe = "";
        for(int i = 0; i < array.length; i++){
            if(!(isSpace && array[i] == ' ')){
                ausgabe = ausgabe + array[i];
                isSpace = false;
            }
        }
        return ausgabe;
    }
    public static String deleteEndingSpace(String sentence){
        String übergabe = "";
        char[] array = sentence.toCharArray();
        for(int i = 0; i < array.length; i++){
            übergabe = array[i] + übergabe;
        }
        array = deleteStartingSpace(übergabe).toCharArray();
        übergabe = "";
        for(int i = 0; i < array.length; i++){
            übergabe = array[i] + übergabe;
        }
        return übergabe;
    }
    public static String deleteMultipleSpace(String sentence){
        boolean isSpace = true;
        char[] array = sentence.toCharArray();
        String ausgabe = "";
        for(int i = 0; i < array.length; i++){
            if(array[i] == ' '){
                if(!isSpace) {
                    ausgabe = ausgabe + array[i];
                    isSpace = true;
                }
            }else{
                ausgabe = ausgabe + array[i];
                isSpace = false;
            }
        }
        return ausgabe;
    }


    public static void main(String[] args){
        System.out.println(deleteStartingSpace("    Ich gehe morgen mit meinen 11 Freund*innen zum Essen!     "));
        System.out.println(deleteEndingSpace("    Ich gehe morgen mit meinen 11 Freund*innen zum Essen!     "));
        System.out.println(deleteMultipleSpace(   "Ich gehe    morgen    mit  meinen  11   Freund*innen       zum Essen!"   ));
    }
}
