public class Flasche
{
    String Name;
    String Text;
    int Kapazität; // In Milliliter
    int Füllstand;

    public Flasche(String Name, String Text, int Kapazität){
        if(0 < Kapazität){
            this.Name = Name;
            this.Text = Text;
            this.Kapazität = Kapazität;
            this.Füllstand = Kapazität;
        }
        else{
            this.Name = Name;
            this.Text = Text;
            this.Kapazität = 1000;
            this.Füllstand = 1000;
        }
    }

    public int getFüllstand(){
        return Füllstand;
    }

    public void print(Flasche eingabe){
        System.out.println("    Name: " + eingabe.Name);
        System.out.println("    Text: " + eingabe.Text);
        System.out.println("    Kapazität: " + eingabe.Kapazität);
        System.out.println("    Füllstand: " + eingabe.Füllstand);
    }

    public int reduziereFüllstand(int reduzierendeMenge){
        if((this.Füllstand - reduzierendeMenge) <= 0){
            int zwischenSpeicher = this.Füllstand;
            this.Füllstand = 0;
            return zwischenSpeicher;
        }
        else{
            this.Füllstand = this.Füllstand - reduzierendeMenge;
            return reduzierendeMenge;
        }
    }

    public void istLeer(Flasche eingabe){
        if (eingabe.Füllstand == 0){
            System.out.println("Die Flasche ist leer.");
        }
        else{
            System.out.println("In der Flasche sind noch " + eingabe.Füllstand + "ml.");
        }
    }


    public static void main(String[] args){

        Flasche Flasche1 = new Flasche("Prog 1", "SoSe23", 750);
        Flasche Flasche2 = new Flasche("Ungültig", "Nur zum Test", 0);

        System.out.println(Flasche1.reduziereFüllstand(500) + "ml wurden entnommen.");

        System.out.println("Flasche 1:");
        Flasche1.print(Flasche1);
        Flasche1.istLeer(Flasche1);
        System.out.println("Flasche 2:");
        Flasche2.print(Flasche2);

        do {
            System.out.println(Flasche1.reduziereFüllstand(50) + " ml entnommen");
            System.out.println("    " + Flasche1.getFüllstand() + " ml sind noch in der Flasche.");
        }
        while (0 < Flasche1.getFüllstand());
    }
}















