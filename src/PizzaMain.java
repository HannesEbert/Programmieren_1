public class PizzaMain
{
    public static void main(String[] args){
        //Array erstellt
        Pizza[] Pizzen = new Pizza[5];

        // Pizzen angelegt
        Pizzen[0] = new Pizza("Schinken", 26, 13.50);
        Pizzen[1] = new Pizza("Salami", 25, 12.75);
        Pizzen[2] = new Pizza("Shrimps", 28, 15.30);
        Pizzen[3] = new Pizza("Vier Käse", 30, 10.0);
        Pizzen[4] = new Pizza("Speziale", 27, 13.75);

        for (int i = 0; i < Pizzen.length; i++){
            Pizza.PreisLeistung(Pizzen[i].Durchmesser, Pizzen[i].Preis);
        }

    }
}
