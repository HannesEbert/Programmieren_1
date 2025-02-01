public class Personenknoten
{
    private int alter;
    private String nachname;
    public Personenknoten next;
    public Personenknoten prev;

    public Personenknoten(int alter, String nachname){
       this.alter = alter;
       this.nachname = nachname;
       this.next = null;
       this.prev = null;
    }

    // Getter definieren
    public int getAlter(){
        return alter;
    }

    public String getNachname(){
        return nachname;
    }

    public static void main(String[] args){

        Liste MeineListe = new Liste();

        MeineListe.einträgeErstellen();

        MeineListe.listeAusgeben();
    }
}
