import java.util.Scanner;

public class Modulo
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie eine Zahl ein: ");
        int eingabe = scanner.nextInt();
        int modulo = eingabe % 7;
        if (modulo == 0)
        {
            System.out.println("Die Zahl ist ganzzahlig durch 7 teilbar.");
        }
        else
        {
            System.out.println("Die Zahl ist nicht ganzzahlig durch 7 teilbar.");
        }
    }
}

