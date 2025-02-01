public class EchteLottoziehungR {
    static class Knoten {

        int zahl;
        Knoten next;

        Knoten(int zahl) {
            this.zahl = zahl;
            this.next = null;
        }
    }

    // Erstellen eine Liste mit 1 bis 49 die Sotiert ist
    public static void main(String[] args) {

        Knoten ersteListe = erstelleLottoListe();

        Knoten ausgabeListe = ausgabeListeErstellen(ersteListe);

    }

    public static Knoten erstelleLottoListe() {
        Knoten start = new Knoten(1);

        Knoten aktuell = start;

        for (int i = 2; i <= 49; i++) {
            aktuell.next = new Knoten(i);
            aktuell = aktuell.next;
        }
        return start;
    }

    public static Knoten ausgabeListeErstellen(Knoten start) {
        Knoten out = null; // Die Liste die die Entfernten Zahlen haben sollte

        for (int i = 0; i < 7; i++) {
            int index = (int) (Math.random() * 49) + 1;

            Knoten current = start;

            for (int j = i; j < index; j++) {
                current = current.next;
            }

            out = current.next;
            current.next = current.next.next;

            Knoten out_iter = out;
            while (out_iter.next != null) {
                out_iter = out_iter.next;
            }

        }

        return out;
    }
}
