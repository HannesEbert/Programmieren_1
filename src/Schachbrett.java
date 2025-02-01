public class Schachbrett {
    //markiert alle bedrohten Felder
    boolean[][] brett = new boolean[8][8];

    public String setzeTurm(int xvar, int yvar){
        String ausgabe = "";
        for(int x = 0; x < brett.length; x++){

            for(int y = 0; y < brett[x].length; y++){

                if(x == xvar || y == yvar){
                    brett[x][y] = true;
                }

                if(brett[x][y]){
                    ausgabe = ausgabe + "x ";
                }else{
                    ausgabe = ausgabe + "o ";
                }
            }
            ausgabe = ausgabe + "\n";
        }
        return ausgabe;
    }

// WIE toString() einbauen???

    public static void main(String[] args){

        Schachbrett s = new Schachbrett();
        //s.setzeTurm(3, 5);
        System.out.println(s.setzeTurm(3, 5));

    }
}
