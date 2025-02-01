import java.util.Scanner;

public class SpaceInvaders
{
    static int woSchiff = (int) (Math.random() * 8 + 1);


    public static void bewege(char eingabe){
        if(eingabe == 'a'){
            if (woSchiff == 1){
                return;
            }
            else{
                woSchiff--;
            }
        } else if(eingabe == 'b'){
            if (woSchiff == 8){
                return;
            }
            else{
                woSchiff++;
            }
        }
        System.out.println("");
        SpielfeldErstellen();

    }

    public static void SpielfeldErstellen(){

        for(int i = 1; i <= 8; i++){
            System.out.print("o");
            System.out.print(" ");
        }
        for(int i = 1; i <= 3; i++){
            for(int j = 1; j <= 8; j++){
                System.out.print("  ");
            }
            System.out.println("");
        }

        for(int i = 1; i <= 8; i++){
            if(woSchiff == i){
                System.out.print("V");
                System.out.print(" ");
            }
            else{
                System.out.print("  ");
            }
        }
    }

    public static void main(String[] args){

        SpielfeldErstellen();
        Scanner scanner = new Scanner(System.in);
        char eingabe = scanner.next().charAt(0);
        
        while(eingabe != 'x'){
            bewege(eingabe);
            scanner = new Scanner(System.in);
            eingabe = scanner.next().charAt(0);
        }
    }
}
