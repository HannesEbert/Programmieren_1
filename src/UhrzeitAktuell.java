import java.time.LocalTime;
public class UhrzeitAktuell
{
    public static void main(String[] args)
    {
        float tagesSekunden = 86400;

        //Aufgabe D
        LocalTime time = LocalTime.parse(LocalTime.now().toString());
        int vergangeneSekunden = time.toSecondOfDay();

        System.out.println("Aktuelle Uhrzeit: " + time.getHour()+":"+time.getMinute()+":"+time.getSecond());
        //LocalTime.now();

        // Aufgabe A
        System.out.println("Sekunden seit Mitternacht: " + vergangeneSekunden);

        // Aufgabe B
        System.out.println("Verbleibende Sekunden für diesen Tag: " + (86400 - vergangeneSekunden));

        // Aufgabe C
        System.out.println(vergangeneSekunden / tagesSekunden * 100 + "% des Tages sind schon vergangen");
    }
}

