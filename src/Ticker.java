public class Ticker
{
    private char[] nachricht;
    private int Groesse;
    private String Nachricht;


    public Ticker(int Groesse, String Nachricht){
        this.Groesse = Groesse;
        this.Nachricht = Nachricht;
        this.nachricht = new char[Groesse];
        StringInCharArray();
    }

    public void StringInCharArray(){
        for ( int i = 0; i < Nachricht.length(); i++){
            nachricht[i] = Nachricht.charAt(i);
        }
    }

    // Nachrichtenpuffer mit Leerzeichen befüllen
    public void nachrichtBefüllen(){
        for (int i = 0; i < nachricht.length; i++){
            nachricht[i] = ' ';
        }
    }

    // Gibt die Größe der Nachricht[] zurück
    public int getGroesse(){
        return Groesse;
    }

    /*
    public void setNachricht(char[] nachricht){
        for (int i = 0; i < )
    }
    */

    // Gibt eine Kopie des Nachrichtenpufferinhalts zurück
    public char[] getNachricht(){
        return nachricht;
    }

    // Nachricht zurücksetzen mit bestimmten zeichen
    public void resetNachricht(char zeichen){
        for (int i = 0; i < nachricht.length; i++){
            nachricht[i] = zeichen;
        }
    }
    public void resetNachricht(){
        resetNachricht('+');
    }

    public void rotateNachricht(int distance){
        char[] kopie = new char[nachricht.length];
        if(distance > nachricht.length){
            rotateNachricht(distance - nachricht.length);
        } else {

            for (int i = 0; i < nachricht.length; i++) {

                int neuerStand = i;

                for (int d = 0; d < distance; d++) {

                    if (i - d == 0) {
                        neuerStand = nachricht.length - 1;
                    } else {
                        neuerStand = neuerStand - 1;
                    }
                }
                kopie[neuerStand] = nachricht[i];
            }
            for (int i = 0; i < kopie.length; i++) {
                nachricht[i] = kopie[i];
            }
        }
    }

    public static void main(String[] args){

        Ticker Test = new Ticker(45, "Wettervorhersage: Schnee in Wuerzburg");
        System.out.println(Test.getNachricht());
        Test.rotateNachricht(14);
        System.out.println(Test.getNachricht());
    }
}
