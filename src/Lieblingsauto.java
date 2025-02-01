public class Lieblingsauto
{
    public static void main(String[] args) {

        Auto[] Auto_Liste = new Auto[3];

        Auto_Liste[0] = new Auto(0, "Audi", 4, "Midnight", 560, 131000, 10123);
        Auto_Liste[1] = new Auto(1, "VW", 0, "Silver", 432, 57000, 66527);
        Auto_Liste[2] = new Auto(2, "BMW", 2, "Mint Green", 387, 76340, 84578);

        float maxHubraum = Auto_Liste[0].Hubraum;
        int stelleArray = 0;

        //  Hubraum ändern (Ausklammern wenn nicht benötigt)!!!
        int HubraumÄndern = 1000;
        int AutoNummerArray = 0;

        Auto_Liste[AutoNummerArray].setHubraum(HubraumÄndern);


        //  Alle Autos auflisten
        for (int i = 0; i < Auto_Liste.length; i++) {
            Auto_Liste[i].printInfo();
        }



        //  Größter Hubraum bestimmen
        for (int i = 1; i < Auto_Liste.length; i++){
            if(Auto_Liste[i].Hubraum > maxHubraum){
                maxHubraum = Auto_Liste[i].Hubraum;
                stelleArray = i;
            }
        }

        System.out.println("Das Auto mit dem größten Hubraum: ");
        Auto_Liste[stelleArray].printInfo();

    }
}
