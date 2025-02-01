public class pqFormel
{
    public static void main(String[] args)
    {
        // Eingabe
        double p = 15;
        double q = 15;
        // Berechnung
        double klammer = (p / 2);
        double unterWurzel = (klammer * klammer) - q;
        double wurzel = Math.sqrt(unterWurzel);

        double ergebnisEins = -(klammer) + wurzel;
        double ergebnisZwei = -(klammer) - wurzel;


        // Ausgabe
        System.out.println("x1 = " + ergebnisEins);
        System.out.println("x2 = " + ergebnisZwei);
    }
}
