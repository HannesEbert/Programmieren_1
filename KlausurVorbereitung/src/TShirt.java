public class TShirt
{
    String farbe;
    String marke;
    TShirt next;
    TShirt prev;

    public TShirt(String farbe, String marke){

        this.farbe = farbe;
        this.marke = marke;
        this.next = null;
        this.prev = null;
    }

    public String getFarbe(){
        return farbe;
    }
    public String getMarke(){
        return marke;
    }


    public static void main(String[] args){

    Stack.insert();
    Stack.retreiveContent();
    }
}
