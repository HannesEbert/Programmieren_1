public class Ersetze
{
    public static int ersetze(char[] eingabe){
        int count = 0;
        for (int i = 0; i < eingabe.length; i++){
            if(eingabe[i] == '.') {
                count++;
            }
        }
        if(count == 0){
            return count;
        }
        else{
            return count - 1;
        }
    }

    public static void main(String[] args){

        String eingabe = "Graphik.Init.Datei.ini";
        int punkte = ersetze(eingabe.toCharArray());
        char[] altesArray = eingabe.toCharArray();
        char[] neuesArray = new char[eingabe.length()];
        for(int i = 0; i < eingabe.length(); i++){
            if(altesArray[i] == '.' && punkte != 0){
                System.out.print('_');
                punkte--;
            }
            else{
                System.out.print(altesArray[i]);
            }
        }
    }
}
