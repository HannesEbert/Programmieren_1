import java.util.Scanner;

public class Martikelnummer
{
    public static void main(String[] args)
    {
        Scanner eingabe = new Scanner(System.in);
        System.out.print("Geben Sie ihre Martikelnummer ein: ");
        int martikelnummer = eingabe.nextInt();

        String umw = String.valueOf(martikelnummer);
        String ersteZweiZiffern = umw.substring(0, 2);
        int nachUmw = Integer.parseInt(ersteZweiZiffern);

        if ((nachUmw == 50) || (nachUmw == 51) || (nachUmw == 61)){
            System.out.println("Martikelnummer ist gültig.");
        }
        else{
            System.out.println("Martikelnummer nicht gültig!");
        }
    }
}
