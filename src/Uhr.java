public class Uhr
{

    private int Stunden;
    private int Minuten;
    private int Sekunden;

    public Uhr(int std, int min, int sek){
        if((0 <= std)&&(std < 60) && (0 <= min)&&(min < 60) && (0 <= sek)&&(sek < 60)) {
            Stunden = std;
            Minuten = min;
            Sekunden = sek;
        }
        else{
            Stunden = 12;
            Minuten = 0;
            Sekunden = 0;
        }
    }

    // Liefert die Stunden der Uhrzeit
    public int getStd(){
        return Stunden;
    }

    // Liefert die Minuten der Uhrzeit
    public int getMin(){
        return Minuten;
    }

    // Liefert die Sekunden der Uhrzeit
    public int getSek(){
        return Sekunden;
    }

    // Setzt die Uhrzeit auf die angegebenen Parameter
    public void setUhr(int std, int min, int sek){
        if((0 <= std)&&(std < 60) && (0 <= min)&&(min < 60) && (0 <= sek)&&(sek < 60)) {
            Stunden = std;
            Minuten = min;
            Sekunden = sek;
        }
        else{
            System.out.println("Die eingegebene Uhrzeit ist ungültig!");
        }
    }

    // Zählt die Uhrzeit um 1 Sekunde hoch
    public void naechsteSek(){
        Sekunden++;
        if (Sekunden == 60){
            Sekunden = 0;
            Minuten++;
        }
        if (Minuten == 60){
            Minuten = 0;
            Stunden ++;
        }
        if (Stunden == 24){
            Stunden = 0;
        }
    }

    public String ausgabe(){
        return String.format("%02d:%02d:%02d", Stunden, Minuten, Sekunden);
    }


    // MAIN METHODE
    public static void main(String[] args){

        // Platz einräumen für 24 Uhrzeiten
        Uhr[] Weltzeit = new Uhr[24];

        // 24 Uhrzeiten initialisieren
        for(int i = 0; i < Weltzeit.length; i++) {
            Weltzeit[i] = new Uhr(i, 23, 7);
        }

        // Ausgabe der Initialisierten Uhrzeiten
        System.out.println("Initialisierte Uhrzeiten: ");
        for (int i = 0; i < Weltzeit.length; i++){
            System.out.println("Uhr " + i + ": " + Weltzeit[i].ausgabe());
        }

        // Uhrzeit um eine Sekunde Hochzählen
        for (Uhr uhr : Weltzeit) {
            uhr.naechsteSek();
        }

        // Ausgabe nach dem Hochzählen
        System.out.println("Neue Uhrzeiten: ");
        for (int i = 0; i < Weltzeit.length; i++){
            System.out.println("Uhr " + i + ": " + Weltzeit[i].ausgabe());
        }
    }
}




