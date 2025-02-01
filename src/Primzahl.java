import java.util.Scanner;

public class Primzahl
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Bitte zu überprüfende Zahl eingeben: ");
        int n = input.nextInt();
        boolean prüfung = true;
        int zaehler = 3;

        int zaehler2 = 1;

        if ((n <= 1) || (n % 2 == 0))
        {
            prüfung = false;
        }
        else
        {
            while (zaehler < n)
            {
                if (n % zaehler == 0)
                {
                    prüfung = false;
                    break;
                }
                zaehler = zaehler + 2;
            }
        }
        if (prüfung)
        {
            System.out.println("Die Zahl " + n + " ist eine Primzahl");
        }
        else
        {
            System.out.println("Die Zahl " + n + " ist keine Primzahl");
        }
    }
}
