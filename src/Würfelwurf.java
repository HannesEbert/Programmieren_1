public class Würfelwurf {
    public static void main(String[] args)
    {
        int würfel = ((int) (Math.random() * 6 + 1));

        if (würfel == 1) {
            System.out.println("Eins gewürfelt");
        } else if (würfel == 2) {
            System.out.println("Zwei gewürfelt");
        } else if (würfel == 3) {
            System.out.println("Drei gewürfelt");
        } else if (würfel == 4) {
            System.out.println("Vier gewürfelt");
        } else if (würfel == 5) {
            System.out.println("Fünf gewürfelt");
        } else if (würfel == 6) {
            System.out.println("Sechs gewürfelt");
        }
    }
}
