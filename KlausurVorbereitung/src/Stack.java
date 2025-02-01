public class Stack
{
    static TShirt start;
    static TShirt end;

    public static void push(String farbe, String marke){

        TShirt neuesShirt = new TShirt(farbe, marke);

        if(start == null){
            start = neuesShirt;
            end = neuesShirt;
            return;
        }
        if(start == end){
            start.next = neuesShirt;
            end = neuesShirt;
            return;
        }
        end.next = neuesShirt;
        end = neuesShirt;
    }

    public static TShirt pop(){
        TShirt oben = end;
        end.prev.next = null;
        end = end.prev;
        return oben;
    }

    public static void isEmpty(){
        if(start == null){
            System.out.println("Der Stapel ist leer!");
            return;
        }
        System.out.println("Es liegen Shirts auf dem Stapel!");
    }

    public static void retreiveContent(){
        System.out.printf("%-5s %-15s %-15s %n", "Nr.", "Farbe", "Marke");
        System.out.println("--------------------------------------");
        TShirt temp = start;
        int count = 1;
        while (temp != null){
            System.out.printf("%-5d %-15s %-15s %n", count, temp.getFarbe(), temp.getMarke());
            temp = temp.next;
            count++;
        }

    }

    // Fügt Beispiel Datensätze ein :)
    public static void insert(){
        push("Rot", "Nike");
        push("Blau", "Adidas");
        push("Schwarz", "Puma");
        push("Weiß", "Reebok");
        push("Grün", "Under Armour");
        push("Gelb", "H&M");
        push("Orange", "Zara");
        push("Lila", "Lacoste");
        push("Pink", "Gucci");
        push("Braun", "Levi's");
        push("Grau", "New Balance");
        push("Dunkelblau", "Tommy Hilfiger");
        push("Hellblau", "Hollister");
        push("Türkis", "Calvin Klein");
        push("Beige", "Boss");
        push("Dunkelgrün", "Fila");
        push("Bordeaux", "Diesel");
        push("Neonpink", "Supreme");
        push("Olivgrün", "Balenciaga");
        push("Gold", "Versace");
    }
}
