public class AutoFabrik
{
    private static int ProduzierteAutos;
    private String Marke;

    public AutoFabrik(String Marke){
        ProduzierteAutos++;
        this.Marke = Marke;
        AutoProduziert();
    }

    public int getProduzierteAutos(){
        return ProduzierteAutos;
    }

    public String getMarke(){
        return Marke;
    }

    public void AutoProduziert(){
        System.out.println("Es wurden " + ProduzierteAutos + " Autos Produziert.");
    }

    public static void main(String[] args){

        for (int i = 1; i <= 100; i++) {
            AutoFabrik Auto = new AutoFabrik("Audi");
        }
    }
}
