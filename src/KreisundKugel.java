public class KreisundKugel
{
    public static void main(String[] args)
    {
        double radius = 10;
        double pi = Math.PI;

        double ergebnisKreisfläche = pi * (radius * radius);
        double ergebnisKreisumfang = 2 * pi * radius;
        double kugelVolumen = (4/3) * pi * radius * radius * radius;

        System.out.println("Kreisfläche = " + ergebnisKreisfläche);
        System.out.println("Kreisumfang = " + ergebnisKreisumfang);
        System.out.println("Kugelvolumen = " + kugelVolumen);
    }
}
