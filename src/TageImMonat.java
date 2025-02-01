import java.util.Scanner;

public class TageImMonat
{
    public static int tageImMonat(String monat)
    {
        int tage = switch (monat) {
            case "Februar" -> 28;
            case "April", "Juni", "September", "November" -> 30;
            case "Januar", "März", "Mai", "Juli", "August", "Oktober",
                 "Dezember" -> 31;
            default -> throw new RuntimeException("falscher Monatsname");
        };

        return tage;
    }


    public static void main(String[] args){

        boolean falscheEingabe;
        do {
            Scanner scanner = new Scanner(System.in);
            try {
                System.out.println("Monat eingeben: ");
                String eingabe = scanner.nextLine();
                int ausgabe = tageImMonat(eingabe);
                System.out.println("Der Monat " + eingabe + " hat " + ausgabe + " Tage");
                falscheEingabe = false;
            } catch (RuntimeException Fehler) {
                System.out.println("Ungültige eingabe! Bitte versuchen Sie es erneut.");
                falscheEingabe = true;
            }
        }while (falscheEingabe);




    }
}
