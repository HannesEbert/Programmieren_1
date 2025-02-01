public class Zielort
{
    String name;
    int distanz;
    Zielort next;

    public Zielort(String name, int distanz){
        this.name = name;
        this.distanz = distanz;
        this.next = null;

    }
    // Getter und Setter für Name
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    // Getter & Setter für Distanz
    public int getDistanz(){
        return distanz;
    }
    public void setDistanz(int distanz){
        this.distanz = distanz;
    }

    @Override
    public String toString(){
        return "Ortsname: " + name + " Distanz: " + distanz + " km";
    }











}
