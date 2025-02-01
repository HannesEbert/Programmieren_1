public class TicTacToe
{
    private static double Random;
    private static String[][][] Spielfeld = new String[3][3][3];
    private static boolean[][][] Spiel = new boolean[3][3][3];

    public TicTacToe(){
        TicTacToe.SpielfeldBefüllen();
        TicTacToe.SpielfeldAusgeben();
        TicTacToe.SpielSimulieren();
        TicTacToe.SpielAusgeben();
    }

    private static void SpielfeldBefüllen(){
        for (int x = 0; x < Spielfeld.length; x++){

            for (int y = 0; y < Spielfeld[x].length; y++){
                for (int z = 0; z < Spielfeld[x][y].length; z++){
                    Spielfeld[x][y][z] = (x + 1) + "." + (y + 1) + "." + (z + 1);
                }
            }
        }
    }




    private static void SpielfeldAusgeben(){
        System.out.println("\t\t\t Sp1:\tSp2:\tSp3:");
        for (int x = 0; x < Spielfeld.length; x++){

            for (int y = 0; y < Spielfeld[x].length; y++){
                System.out.print("Zeile " + (x + 1) + ":\t");
                for (int z = 0; z < Spielfeld[x][y].length; z++){
                    System.out.print(Spielfeld[x][y][z] + "\t");
                }
                System.out.println(" ");
            }
            System.out.println(" ");
        }
    }

    private static void SpielSimulieren(){
        for (int x = 0; x < Spielfeld.length; x++){
            for (int y = 0; y < Spiel[x].length; y++){
                for (int z = 0; z < Spiel[x][y].length; z++){
                    Random = Math.random()* 10.0 + 1.0;
                    if(Random > 4){
                        Spiel[x][y][z] = true;
                    }
                }
            }
        }
    }

    private static void SpielAusgeben(){
        System.out.println("\t\t\t Sp1:\tSp2:\tSp3:");
        for (int x = 0; x < Spiel.length; x++){

            for (int y = 0; y < Spiel[x].length; y++){
                System.out.print("Zeile " + (x + 1) + ":\t");
                for (int z = 0; z < Spiel[x][y].length; z++){
                    System.out.print(Spiel[x][y][z] + "\t");
                }
                System.out.println(" ");
            }
            System.out.println(" ");
        }
    }

/*
    public void SteinSetzen(String eingabe){

        for (int x = 0; x < Spielfeld.length; x++){

            for (int y = 0; y < Spielfeld[x].length; y++){

                for (int z = 0; z < Spielfeld[x][y].length; z++){
                    if(eingabe.equals(Spielfeld[x][y][z])){
                        if (Zaehler % 2 == 0){
                            Spiel[x][y][z] = true;
                        }
                    }
                }
            }
        }

        System.out.println("\t\t\t Sp1:\tSp2:\tSp3:");
        for (int x = 0; x < Spielfeld.length; x++){
            for (int y = 0; y < Spielfeld[x].length; y++){
                System.out.print("Zeile " + (x + 1) + ":\t");
                for (int z = 0; z < Spielfeld[x][y].length; z++){
                    System.out.print(Spiel[x][y][z] + "\t");
                }
                System.out.println(" ");
            }
            System.out.println(" ");
        }
        Zaehler++;
    }
*/
    public static void main(String[] args){

        TicTacToe Spiel1 = new TicTacToe();
    }
}








