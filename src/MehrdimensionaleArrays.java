public class MehrdimensionaleArrays
{
    double ZeilenMax;
    double[] AlleZeilenMax = new double[5];






    public void ZeilenMaxima(double[][] DoubleMatrix){
        for (int i = 0; i < DoubleMatrix.length; i++){

            System.out.println("---------------");
            ZeilenMax = DoubleMatrix[i][0];

            for (int j = 0; j < DoubleMatrix[i].length; j++){
                if (DoubleMatrix[i][j] > ZeilenMax){
                    ZeilenMax = DoubleMatrix[i][j];
                }
                System.out.println(DoubleMatrix[i][j]);
            }

            AlleZeilenMax[i] = ZeilenMax;
        }


        System.out.println("Fertig.");
        for (int i = 0; i < AlleZeilenMax.length; i++) {
            System.out.println("Zeilenmaximum von Zeile " + (i + 1) + ": " + AlleZeilenMax[i]);
        }

    }

    public static void main(String[] args){

        double[][] DoubleMatrix = {{1.1, 1.2, 1.3}, {2.1, 2.2, 2.3}, {3.1, 3.2, 3.3}, {4.1, 4.2, 4.3}};

        MehrdimensionaleArrays obj = new MehrdimensionaleArrays();
        obj.ZeilenMaxima(DoubleMatrix);

    }
}
