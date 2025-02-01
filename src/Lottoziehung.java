public class Lottoziehung
{
    int zahl;
    Lottoziehung next;
    static Lottoziehung start;

    public Lottoziehung(int zahl){
        this.zahl = zahl;
        this.next = null;
    }

    public static void ZahlenHinzufügen(){
        for(int i = 1; i <= 49; i++) {
            Lottoziehung liste = new Lottoziehung(i);
            if(start == null){
                start = liste;
                continue;
            }
            Lottoziehung current = start;
            while (current.next != null){
                current = current.next;
            }
            current.next = liste;
        }
    }

    public static void ZahlenAusgeben(){
        Lottoziehung current = start;
        while (current != null){
            System.out.println(current.zahl);
            current = current.next;
        }
        System.out.println("null");
    }

    public static void ZahlZiehen(int gezogeneZahl){
        if (start == null) {
            return;
        }
        if (start.zahl == gezogeneZahl) {
            start = start.next;
            System.out.println("Es wurde die Zahl " + gezogeneZahl + " entfernt.");
            return;
        }

        Lottoziehung temp = start;
        while (temp.next != null && temp.next.zahl != gezogeneZahl){
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
            System.out.println("Es wurde die Zahl " + gezogeneZahl + " entfernt.");
        }

    }

    public static void main(String[] args){

        ZahlenHinzufügen();

        // Ziehen und ausgeben der Zahlen
        for (int i = 1; i <= 6; i++){
            int random = (int)(Math.random() * 49 + 1);
            ZahlZiehen(random);
        }

        //ZahlenAusgeben();

    }
}
