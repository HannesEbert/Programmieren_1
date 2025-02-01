import java.util.Scanner;

public class Knoten
{
    String Wort;
    String Bedeutung;
    Knoten left;
    Knoten right;


    public Knoten(String Wort, String Bedeutung){
        this.Wort = Wort;
        this.Bedeutung = Bedeutung;
        this.left = null;
        this.right = null;
    }

    public String getWort(){
        return Wort;
    }
    public String getBedeutung(){
        return Bedeutung;
    }

    public static void trennzeile(){
        System.out.println("---------------------------------------");
    }

    public static void option1(){
        System.out.println("Geben Sie ein Wort ein: ");
        Scanner scannerW = new Scanner(System.in);
        String eingabeWort = scannerW.nextLine();
        System.out.println("Geben Sie eine Bedeutung für das Wort ein: ");
        Scanner scannerB = new Scanner(System.in);
        String eingabeBedeutung = scannerB.nextLine();
        Baum.insert(eingabeWort, eingabeBedeutung);
    }

    public static void option2(){
        System.out.println("Geben Sie ein Wort ein: ");
        Scanner scannerW = new Scanner(System.in);
        String eingabeWort = scannerW.nextLine();
        System.out.println("Die Bedeutung von " + eingabeWort + " ist: " + Baum.search(eingabeWort));
    }

    public static void main(String[] args){

        Baum.einfügenVieleWörter();


        while(true) {
            trennzeile();
            System.out.println("Wählen Sie eine der Folgenden Optionen: ");
            trennzeile();
            System.out.println("1 - Einfügen in das Wörterbuch");
            System.out.println("2 - Suchen im Wörterbuch");
            System.out.println("3 - Ende");
            trennzeile();
            Scanner scanner = new Scanner(System.in);
            int eingabe = scanner.nextInt();
            if(eingabe != 1 && eingabe != 2 && eingabe != 3){
                System.out.println("Keine Gültige Eingabe!");
                continue;
            }
            if (eingabe == 1) {
                option1();
            }
            else if (eingabe == 2) {
                option2();
            }
            else if (eingabe == 3) {
                break;
            }
            trennzeile();
            Baum.print();
        }
    }
}
