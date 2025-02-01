public class RaumMain
{
    public static void main(String[] args){
        /*
        boolean[] Studenten = new boolean[100];
        for (int i = 0; i < Studenten.length; i++){
            double random = Math.random();
            if (random < 0.5){
                Studenten[i] = true;
            }else{
                Studenten[i] = false;
            }
        }
        */

        Raum ersterRaum = new Raum("l.2.1", 155, false);
        //Raum zweiterRaum = new Raum("l.2.15", 45, false);

        ersterRaum.setRaumBelegt(true);

        System.out.println(ersterRaum.AbfrageBelegt(ersterRaum.isRaumBelegt(), ersterRaum.getRaumkennung()));
        //System.out.println(ersterRaum.AbfrageBelegt(zweiterRaum.isRaumBelegt(), zweiterRaum.getRaumkennung()));


    }
}

