public class Auto
{
        int Arraynummer;
        String Marke;
        float Hubraum;
        String Farbe;
        int PS;
        double UVP;
        int Kilometer;

        // Falls Hubraum kleiner 0, dann auf 1600 setzen
        public void setHubraum(int Hubraum){
                if(Hubraum>0){
                        this.Hubraum = Hubraum;
                }
                else{
                        this.Hubraum = 1600;
                }
        }

        public Auto(int Arraynummer, String Marke, float Hubraum, String Farbe, int PS, double UVP, int Kilometer){
                this.Arraynummer = Arraynummer;
                this.Marke = Marke;
                this.Hubraum = Hubraum;
                this.Farbe = Farbe;
                this.PS = PS;
                this.UVP = UVP;
                this.Kilometer = Kilometer;
        }

        public void printInfo(){
                System.out.println("Arraynummer: " + Arraynummer + "     " + "Marke: " + Marke + ", Hubraum: " + Hubraum + ", Farbe: " + Farbe + ", PS: " + PS + ", UVP: " + UVP + ", Kilometer: " + Kilometer);
        }
}
