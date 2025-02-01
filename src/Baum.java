import java.util.Objects;

public class Baum {

    static Knoten root;

    public static void insert(String wort, String bedeutung){

        if(Objects.equals(wort, "")){
            System.out.println("Ungültige Eingabe für das Wort");
            return;
        }

        Knoten neu = new Knoten(wort, bedeutung);
        if(root == null){
            root = neu;
            return;
        }

        Knoten temp = root;
        boolean endeGefunden = false;

        while(!endeGefunden){
            if(neu.getWort().compareTo(temp.getWort()) < 0){
                if(temp.left == null){
                    temp.left = neu;
                    endeGefunden = true;
                }else{
                    temp = temp.left;
                }
            }else{
                if(temp.right == null){
                    temp.right = neu;
                    endeGefunden = true;
                }else{
                    temp = temp.right;
                }
            }
        }
    }

    public static void print(){

        if(root == null){
            return;
        }
        Knoten temp = root;
        System.out.println("Alle Einträge im Wörterbuch: ");
        printHelp(temp);
        System.out.println("");
    }
    public static void printHelp(Knoten k){
        if(k == null){
            return;
        }
        printHelp(k.left);
        System.out.print(k.getWort() + ", ");
        printHelp(k.right);
    }


    public static String search(String w){

        if(root == null){
            return "Kein Inhalt im Baum vorhanden";
        }
        Knoten temp = root;
        boolean wortGefunden = false;
        String bedeutungGefunden = "FEHLER - Wort nicht im Baum enthalten";
        try {
            while (!wortGefunden) {

                if (w.compareTo(temp.getWort()) == 0) { // Wenn Treffer dann "abbruch"
                    bedeutungGefunden = temp.getBedeutung();
                    wortGefunden = true;
                } else if (w.compareTo(temp.getWort()) < 0) {
                    temp = temp.left; // Gehe Linken Ast
                } else {
                    temp = temp.right; // Gehe Rechten Ast
                }
            }
        } catch (NullPointerException e){
            return bedeutungGefunden;
        }
        return bedeutungGefunden;
    }


    public static void einfügenVieleWörter(){

        Baum.insert("Apfel", "Eine Frucht");
        Baum.insert("Banane", "Gelbe Frucht");
        Baum.insert("Zebra", "Ein Tier mit Streifen");
        Baum.insert("Hund", "Der beste Freund des Menschen");
        Baum.insert("Maus", "Kleines Nagetier");
        Baum.insert("Elefant", "Großes Säugetier mit Rüssel");
        Baum.insert("Giraffe", "Langhalsiges Tier aus Afrika");
        Baum.insert("Delfin", "Intelligentes Meerestier");
        Baum.insert("Krokodil", "Gefährliches Reptil");
        Baum.insert("Buch", "Eine Sammlung von geschriebenen Seiten");
        Baum.insert("Schule", "Ort des Lernens");
        Baum.insert("Tisch", "Möbelstück mit vier Beinen");
        Baum.insert("Auto", "Fahrzeug mit vier Rädern");
        Baum.insert("Zug", "Ein Transportmittel auf Schienen");
        Baum.insert("Flugzeug", "Transportmittel, das fliegen kann");
        Baum.insert("Wasser", "Eine lebenswichtige Flüssigkeit");
        Baum.insert("Feuer", "Heiße Flammen, die Dinge verbrennen");
        Baum.insert("Berg", "Hohe Erhebung in der Landschaft");
        Baum.insert("Wald", "Gebiet mit vielen Bäumen");
        Baum.insert("Sonne", "Der Stern in unserem Sonnensystem");
        Baum.insert("Mond", "Der natürliche Satellit der Erde");
        Baum.insert("Computer", "Elektronisches Gerät zur Verarbeitung von Daten");
        Baum.insert("Roboter", "Maschine, die automatisch arbeitet");
        Baum.insert("Musik", "Kunst der Klänge und Töne");
        Baum.insert("Kunst", "Kreativer Ausdruck durch verschiedene Medien");
        Baum.insert("Sport", "Körperliche Aktivität zur Fitness und Unterhaltung");
        Baum.insert("Fußball", "Beliebte Sportart mit einem Ball");
        Baum.insert("Schach", "Strategiespiel mit 64 Feldern");
        Baum.insert("Eis", "Gefrorenes Wasser oder eine Süßspeise");
        Baum.insert("Kaffee", "Ein beliebtes Heißgetränk");
        Baum.insert("Tee", "Ein Getränk aus aufgebrühten Blättern");
        Baum.insert("Zucker", "Süßungsmittel aus Pflanzen");
        Baum.insert("Schokolade", "Süße Leckerei aus Kakao");
        Baum.insert("Pferd", "Ein großes, starkes Tier, das geritten werden kann");
        Baum.insert("Katze", "Beliebtes Haustier mit Schnurrhaaren");
        Baum.insert("Vogel", "Ein Tier mit Flügeln, das fliegen kann");
        Baum.insert("Schnecke", "Langsames Tier mit Gehäuse");
        Baum.insert("Baum", "Eine große Pflanze mit Stamm und Blättern");
        Baum.insert("Blume", "Eine schöne Pflanze mit Blüten");
        Baum.insert("Garten", "Ein Bereich, in dem Pflanzen wachsen");
    }
}
