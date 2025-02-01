import java.util.Locale;
import java.util.Scanner;

public class Pizzarechner
{
    public static void main(String[] args)
    {
        Locale.setDefault(new Locale("de", "DE"));

        Scanner sc1 = new Scanner(System.in);
        System.out.print("Größe von Pizza 1 (26/28/30): ");
        int größe1 = sc1.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Preis von Pizza 1: ");
        float preis1 = sc2.nextFloat();

        double krFlPi1 = Math.PI * ((größe1 * größe1) / 4);
        double preisProFl1 = (krFlPi1 / preis1);

        Scanner sc3 = new Scanner(System.in);
        System.out.print("Größe von Pizza 2 (26/28/30): ");
        int größe2 = sc3.nextInt();

        Scanner sc4 = new Scanner(System.in);
        System.out.println("Preis von Pizza 2: ");
        float preis2 = sc4.nextFloat();

        double krFlPi2 = Math.PI * ((größe2 * größe2) / 4.0);
        double preisProFl2= (krFlPi2 / preis2);

        /*System.out.println(krFlPi1);
        System.out.println(krFlPi2);
        System.out.println(preisProFl1);
        System.out.println(preisProFl2);*/


        if (preisProFl1 > preisProFl2){
            System.out.println("Das Preis/Leistungsverhältnis von Pizza 1 ist besser.");
        } else if (preisProFl1 < preisProFl2) {
            System.out.println("Das Preis/Leistungsverhältnis von Pizza 2 ist besser.");
        }
        else {
            System.out.println("Das Preis/Leistungsverhältnis ist das gleiche.");
        }
    }
}
