public class StringReverse
{
    public static void reverse(String eingabe){

        char[] neu = eingabe.toCharArray();
        for(int i = neu.length - 1; i >= 0; i--){
            System.out.print(neu[i]);
        }
    }
    public static void main(String[] args){

        reverse("0.1.2.3.4.5.6.7.8.9.0");

    }
}
