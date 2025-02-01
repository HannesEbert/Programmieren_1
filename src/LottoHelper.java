public class LottoHelper
{
    static EchteLottoziehung start = null;
    static int count = 0;

    public static int[] zieheZahlen(int zahlen){
        int wieVieleZahlen = 49;
        for(int i = 1; i <= wieVieleZahlen; i++){
            EchteLottoziehung neueZahl = new EchteLottoziehung(i);
            LottoHelper.anhängen(neueZahl);
        }

        int[] gezogeneZahlen = new int[6];
        for(int i = 0; i < 6; i++){
            int random = (int) (Math.random() * (wieVieleZahlen - i) + 1);
            gezogeneZahlen[i] = LottoHelper.aushängen(random);
        }
        return gezogeneZahlen;
    }

    public static void anhängen(EchteLottoziehung knoten){
        //Beginn wenn Liste noch kein Element besitzt
        if(start == null){
            start = knoten;
            //System.out.println(knoten.getZahl() + " erfolgreich eingefügt!");
            return;
        }

        EchteLottoziehung temp = start;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = knoten;
        //System.out.println(knoten.getZahl() + " erfolgreich eingefügt!");
    }


    public static void ausgabe(){

        EchteLottoziehung temp = start;
        if(start == null){
            System.out.println("Kein Inhalt der Liste vorhanden!");
            return;
        }
        System.out.print("start -> ");
        while(temp != null){
            System.out.print(temp.getZahl() + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }




    public static int aushängen(int zahl){
        /*
        if(start == null){
            return 0;
        }
        */

        if(zahl == 1){
            int ausgabe = start.getZahl();
            start = start.next;
            return ausgabe;
        }
        EchteLottoziehung temp = start;
        EchteLottoziehung tempPrev = start;
        for(int i = 1; i < zahl; i++) {
            tempPrev = temp;
            temp = temp.next;
        }
        if(temp.next != null){
            tempPrev.next = temp.next;
        }
        else {
            tempPrev.next = null;
        }

        return temp.getZahl();
    }

    // Bubble-Sort Array[]
    public static int[] sort(int[] Array) {

        boolean isSort = false;
        int length = Array.length;

        while (!isSort) {
            // wenn i > i+1 -> Tausche beide und geh eins weiter
            for (int i = 0; i < length - 1; i++) {
                if (Array[i] > Array[i + 1]) {
                    int temp = Array[i];
                    Array[i] = Array[i + 1];
                    Array[i + 1] = temp;
                }
            }

            //wenn i < i+1 -> Liste sortiert, wenn nicht Liste unsortiert und abbruch
            for (int i = 0; i < length - 1; i++) {
                if (Array[i] < Array[i + 1]) {
                    isSort = true;
                } else {
                    isSort = false;
                    break;
                }
            }
        }
        return Array;
    }
}



