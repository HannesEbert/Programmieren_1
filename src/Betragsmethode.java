public class Betragsmethode
{




    public static int Betrag(int eingabe){
        int ausgabe;
        if(0 <= eingabe){
            ausgabe = eingabe;
        }else {
            ausgabe = (-1 * eingabe);
        }
        return ausgabe;
    }
    public static float Betrag(float eingabe){
        float ausgabe;
        if(0 <= eingabe){
            ausgabe = eingabe;
        }else {
            ausgabe = (-1 * eingabe);
        }
        return ausgabe;
    }
    public static double Betrag(double eingabe){
        double ausgabe;
        if(0 <= eingabe){
            ausgabe = eingabe;
        }else {
            ausgabe = (-eingabe);
        }
        return ausgabe;
    }
    public static short Betrag(short eingabe){
        short ausgabe;
        if(0 <= eingabe){
            ausgabe = eingabe;
        }else {
            ausgabe = (short) -eingabe;
        }
        return ausgabe;
    }
    public static long Betrag(long eingabe){
        long ausgabe;
        if(0 <= eingabe){
            ausgabe = eingabe;
        }else {
            ausgabe = (- 1 * eingabe);
        }
        return ausgabe;
    }

    public static void main(String[] args){

        System.out.println(Betragsmethode.Betrag(-100));
    }
}
