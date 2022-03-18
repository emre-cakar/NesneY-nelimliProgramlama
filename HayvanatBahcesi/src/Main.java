public class Main {
    public static void main(String[] args) {
        Hayvanlar h1=new At("Beygir", 450, 20,"sari");
        Hayvanlar h2=new Essek("Essek", 150, 15,"beyaz");
        Hayvanlar h3=new Zebra("zebra", 400, 50,"sari");
        Hayvanlar h4=new Kaplan("kaplan", 40, 40,"mor");
        Hayvanlar h5=new Aslan("aslan", 50, 10,"mavi");
        Hayvanlar h6=new Sican("sican", 450, 20,"sari");
        Hayvanlar h7=new Kunduz("kunduz", 450, 20,"sari");

        System.out.println(h1.toString());
        System.out.println(h2.toString());
        System.out.println(h3.toString());
        System.out.println(h4.toString());
        System.out.println(h5.toString());
        System.out.println(h6.toString());
        System.out.println(h7.toString());

    }
}
