public class Raum
{
    private String Raumkennung;
    private int MaximaleAnzahl;
    private boolean RaumBelegt;
    private int StudentenImRaum;
    private int[] Studenten;

    public Raum(String Raumkennung, int MaximaleAnzahl, boolean RaumBelegt){
        if(0 < MaximaleAnzahl) {
            this.Raumkennung = Raumkennung;
            this.MaximaleAnzahl = MaximaleAnzahl;
            this.RaumBelegt = RaumBelegt;
        }
    }

    // Ein Student verlässt den Raum


    // StudentenArray getter

    public int[] Studenten(){
        return Studenten;
    }

    // StudentenImRaum getter
    public int getStudentenImRaum(){
        return StudentenImRaum;
    }

            // Raumkennung und MaximaleAnzahl können nur getter
    public String getRaumkennung(){
        return Raumkennung;
    }
    public int getMaximaleAnzahl(){
        return MaximaleAnzahl;
    }

            // RaumBelegt kann setter und getter
    public boolean isRaumBelegt(){
        return RaumBelegt;
    }
    public void setRaumBelegt(boolean RaumBelegt){
        this.RaumBelegt = RaumBelegt;
    }

    public String AbfrageBelegt(boolean tf, String RaumName){
        if (tf){
            return "Der Raum " + RaumName + " ist belegt!";
        }else {
            return "Der Raum " + RaumName + " ist Frei!";
        }
    }

}
