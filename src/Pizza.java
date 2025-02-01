public class Pizza
{
    String PizzaName;
    int Durchmesser;
    double Preis;
    double PreisProQM;

    // Passender Konstruktor

    public Pizza(String PizzaName, int Durchmesser, double Preis){
        this.PizzaName = PizzaName;
        this.Durchmesser = Durchmesser;
        this.Preis = Preis;
        this.PreisProQM = PreisProQM;
    }

    public static void PreisLeistung(int Durchmesser, double Preis){
        double flächeKr = Math.PI * (Math.pow((Durchmesser / 2.0), 2));
        System.out.println(Preis / flächeKr);
    }



}
