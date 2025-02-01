public class Alkohol
{



    static double dichte = 0.8;

    public static int berechneMasse(int volumen, double alkvolanteil){

        return (int)(volumen * alkvolanteil * dichte);

    }

    public static double berechneAlkKonzentration(int alkoholMasse, double gewicht, char geschlecht){
        double reduktionsfaktor;
        if(geschlecht == 'm'){
             reduktionsfaktor = 0.7;
        }else if(geschlecht == 'w'){
            reduktionsfaktor = 0.6;
        }else if(geschlecht == 'j'){
            reduktionsfaktor = 0.5;
        }else{
            System.out.println("Das eingegebene Geschlecht existiert nicht!");
            return -1.0;
        }

        return alkoholMasse / (gewicht * reduktionsfaktor);

    }

    public static void main(String[] args){
        int Bier = berechneMasse(1000, 0.05);
        System.out.println("Die Alkoholmasse von Bier beträgt: " + Bier);

        double Person = berechneAlkKonzentration(Bier,70, 'm');
        if(Person >= 0.5){
            System.out.println("Sie dürfen kein Auto mehr fahren!!!");
        }else if(Person >= 0.3){
            System.out.println("Sie sollten kein Auto mehr fahren!!!");
        }
        System.out.println(Person);
    }
}
