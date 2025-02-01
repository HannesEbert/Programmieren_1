import java.util.Scanner;

public class Schaltjahr {
    public static void main(String[] args) {
        Scanner jahr = new Scanner(System.in);
        System.out.println("Welche Schaltjahr: ");
        int eingabe = jahr.nextInt();

        if (((eingabe % 4) == 0) && (((eingabe % 100) != 0) || (eingabe % 400 == 0))) {
            System.out.println("Das eingegebene Jahr ist ein Schaltjahr");
        }
        else {
            System.out.println("Das eingegebene Jahr ist kein Schaltjahr");
        }
    }
}
