public class Textdokument
{
    private char[][] Dokument;



    public Textdokument(char[][] Dokument){
        this.Dokument = Dokument;
        AusgabeArray();
    }

    public void AusgabeArray(){
        for (int z = 0; z < Dokument.length; z++){
            for (int s = 0; s < Dokument[z].length; s++){
                System.out.print(Dokument[z][s]);
            }
            System.out.println("");
        }
    }

    public int zaehleZeichen(){
        int zaehler = 0;
        for (int z = 0; z < Dokument.length; z++){
            for (int s = 0; s < Dokument[z].length; s++){
                if((Dokument[z][s]) != ' ') {
                    zaehler++;
                }
            }
        }
        return zaehler;
    }

    public boolean vertauscheZeilen(int Zeile1, int Zeile2){
        if ((Zeile1 > Dokument.length - 1 || Zeile1 < 0) || (Zeile2 > Dokument.length - 1 || Zeile2 < 0)){
            return false;
        }
        // Heraussuchen von Zeile1
        char[] Dreieck1 = new char[1];
        for (int z = 0; z < Dokument.length; z++){
            if (z == Zeile1){
                Dreieck1 = Dokument[z];
            }
        }
        char[] Dreieck2 = new char[1];
        for (int z = 0; z < Dokument.length; z++){
            if (z == Zeile2){
                Dreieck2 = Dokument[z];
            }
        }
        for (int i = 0; i < Dokument.length; i++){
            if (i == Zeile1){
                Dokument[i] = Dreieck2;
            }
            if (i == Zeile2){
                Dokument[i] = Dreieck1;
            }
        }
        return true;
    }

    public void fuegeEinTextdokument(char[][] einfügen, int zeilenposition){
        if (zeilenposition < 0 || zeilenposition > Dokument.length - 1){
            throw new RuntimeException("Ungültige Zeilenposition");
        }

        boolean isEingefügt = false;
        char[][] zwischenspeicher = new char[Dokument.length + einfügen.length][];
        for (int z = 0; z < Dokument.length; z++){
            if  (z == zeilenposition){
                for(int i = 0; i < einfügen.length; i++){
                    zwischenspeicher[z + i] = einfügen[i];
                }
                isEingefügt = true;
            }
            //for (int e = 0; e < Dokument[z].length; e++){
                if(isEingefügt) {
                    zwischenspeicher[z + einfügen.length] = Dokument[z];
                }else{
                    zwischenspeicher[z] = Dokument[z];
                }
            //}
        }

        // METHODE ERFRAGEN UM PROBLEM ZU LÖSEN OHNE RUNTIME EXCEPTION!!!!!
        try {
            for (int z = 0; z < zwischenspeicher.length; z++) {
                Dokument[z] = zwischenspeicher[z];
            }
        }
        catch (RuntimeException Fehler){
            AusgabeArray();
            System.out.println("Kein Platz im Array");
        }
    }





    public static void main(String[] args){

        String[] testZeilen = {
                "1.1 Hallo",
                "1.2 Wie geht's?",
                "1.3 Das ist ein Test"
        };
        char[][] TestArray = new char[testZeilen.length][];
        for (int i = 0; i < testZeilen.length; i++) {
            TestArray[i] = testZeilen[i].toCharArray(); // Zweites Array: Zeichen
        }
        Textdokument Test = new Textdokument(TestArray);
        System.out.println(Test.zaehleZeichen());


        String[] testZeilen2 = {
                "2.1.++++++++++++",
                "2.2.Halloooooo????",
                "2.3.Cro"
        };
        char[][] TestArray2 = new char[testZeilen.length][];
        for (int i = 0; i < testZeilen2.length; i++) {
            TestArray2[i] = testZeilen2[i].toCharArray(); // Zweites Array: Zeichen
        }
        Textdokument Test2 = new Textdokument(TestArray2);
        System.out.println(Test2.zaehleZeichen());


        Test.fuegeEinTextdokument(TestArray2, 1);



        /*
        System.out.println(Test.vertauscheZeilen(0, 2));
        Test.AusgabeArray();

        System.out.println(Test.vertauscheZeilen(0, 1));
        Test.AusgabeArray();
        */

    }
}
