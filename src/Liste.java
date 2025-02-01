public class Liste
{
    Personenknoten start;

    public Liste(){
        start = null;
    }

    public void sortiertEinfügen(int alter, String nachname){
        Personenknoten neuerEintrag = new Personenknoten(alter, nachname);

        // In eine Leere Liste einfügen
        if(start == null) {
            start = neuerEintrag;
            return;
        }

        // Als erstes einfügen
        if(alter < start.getAlter()){
            neuerEintrag.next = start;
            start.prev = neuerEintrag;
            start = neuerEintrag;
            return;
        }

        // Richtigen Platz Suchen
        Personenknoten temp = start;
        while (temp.next != null && temp.next.getAlter() < alter){
            temp = temp.next;
        }
        // Wenn am Ende eingefügt wird
        if(temp.next == null){
            temp.next = neuerEintrag;
            neuerEintrag.prev = temp;
            return;
        }

        // Wenn Platz gefunden dann Einfügen
        neuerEintrag.next = temp.next;
        neuerEintrag.prev = temp;
        temp.next.prev = neuerEintrag;
        temp.next = neuerEintrag;
    }

    public void listeAusgeben(){
        // Ausgabe wenn liste leer ist
        if (start == null){
            System.out.println("Die Liste ist Leer!");
        }
        System.out.println("Hier ist die Liste der Personen: ");
        System.out.println("--------------------------------");
        // Ausgabe nach Alter von klein -> groß
        Personenknoten temp = start;
        while (temp != null){
            System.out.print(temp.getNachname() + ", " + temp.getAlter() + " -> ");
            if(temp.next == null){
                break;
            }
            temp = temp.next;
        }
        System.out.print("null (end)\n -> ");
        // Ausgabe nach Alter von groß -> klein
        while (temp  != null){
            System.out.print(temp.getNachname() + ", " + temp.getAlter() + " -> ");
            temp = temp.prev;
        }
        System.out.print("null");
    }

    public void einträgeErstellen(){
        sortiertEinfügen(18, "Arnold");
        sortiertEinfügen(25, "Bauer");
        sortiertEinfügen(45, "Müller");
        sortiertEinfügen(67, "Schuster");
        sortiertEinfügen(21, "Schmidt");
        sortiertEinfügen(32, "Huber");
        sortiertEinfügen(54, "Wagner");
        sortiertEinfügen(29, "Becker");
        sortiertEinfügen(41, "Hoffmann");
        sortiertEinfügen(73, "Richter");
        sortiertEinfügen(36, "Klein");
        sortiertEinfügen(48, "Schäfer");
        sortiertEinfügen(27, "Neumann");
        sortiertEinfügen(39, "Schwarz");
        sortiertEinfügen(59, "Zimmermann");
        sortiertEinfügen(31, "Krüger");
        sortiertEinfügen(50, "Lange");
        sortiertEinfügen(62, "Meier");
        sortiertEinfügen(22, "Lehmann");
        sortiertEinfügen(44, "Schmid");
        sortiertEinfügen(70, "Herrmann");
        sortiertEinfügen(35, "Krause");
        sortiertEinfügen(56, "Maier");
        sortiertEinfügen(63, "Köhler");
        sortiertEinfügen(40, "Mayer");
        sortiertEinfügen(47, "Walter");
        sortiertEinfügen(58, "König");
        sortiertEinfügen(33, "Hubert");
        sortiertEinfügen(42, "Fuchs");
        sortiertEinfügen(26, "Peters");
        sortiertEinfügen(55, "Weber");
        sortiertEinfügen(49, "Engel");
        sortiertEinfügen(68, "Graf");
        sortiertEinfügen(23, "Dietrich");
        sortiertEinfügen(46, "Ludwig");
        sortiertEinfügen(37, "Eckert");
        sortiertEinfügen(53, "Götz");
        sortiertEinfügen(24, "Heinrich");
        sortiertEinfügen(61, "Arnold");
        sortiertEinfügen(34, "Scholz");
        sortiertEinfügen(52, "Jakob");
        sortiertEinfügen(60, "Simon");
        sortiertEinfügen(28, "Reinhardt");
        sortiertEinfügen(38, "Ulrich");
        sortiertEinfügen(43, "Kaufmann");
        sortiertEinfügen(51, "Schreiber");
        sortiertEinfügen(30, "Brandt");
        sortiertEinfügen(64, "Franz");
        sortiertEinfügen(66, "Berger");
        sortiertEinfügen(57, "Seidel");
        sortiertEinfügen(65, "Böttcher");
        sortiertEinfügen(69, "Bischof");
    }
}
