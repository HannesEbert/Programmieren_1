import java.time.LocalTime;
public class Uhrzeit
{
    public static void main(String[] args)
    {
        int tagesSekunden = 86400;

        int stunden = 12;
        int minuten = 30;
        int sekunden = 0;

        // Aufgabe A
        int minutenGesamt = stunden * 60 + minuten;
        int vergangeneSekunden = minutenGesamt * 60 + sekunden;
        System.out.println("Sekunden seit Mitternacht: " + vergangeneSekunden);

        // Aufgabe B
        System.out.println("Verbleibende Sekunden für diesen Tag: " + (86400 - vergangeneSekunden));

        // Aufgabe C
        System.out.println((float)vergangeneSekunden / tagesSekunden * 100 + "%");
    }
}