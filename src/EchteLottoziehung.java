public class EchteLottoziehung
{
    int zahl;
    EchteLottoziehung next;

    public EchteLottoziehung(int zahl){
        this.zahl = zahl;
        this.next = null;
    }

    // Getter Setter für Zahl
    public int getZahl(){
        return zahl;
    }
    public void setZahl(int neueZahl){
        this.zahl = neueZahl;
    }

    // MAIN METHODE
    public static void main(String[] args){

        //Zieht Zahlen mit hilfe der Methode "zieheZahlen"
        int[] gezogeneZahlen = LottoHelper.zieheZahlen(49);

        // int[] mit sortier Methode füllen
        int[] sortierteZahlen = LottoHelper.sort(gezogeneZahlen);
        // int[] ausgeben
        System.out.println("Die gezogenen Zahlen der Lottoziehung lauten: ");
        for(int i = 0; i < sortierteZahlen.length; i++){
            System.out.print(sortierteZahlen[i] + ", ");
        }
    }
}
