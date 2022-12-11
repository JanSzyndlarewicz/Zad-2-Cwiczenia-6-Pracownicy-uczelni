public class Main {
    public static void main(String[] args) {
        Prywatny klient = new Prywatny("Jan", "Szyndlarewicz", "2345678", "19.07.2004", "9876543", 20, 1500, 2, true, 20);
        Obsluga obsluga = new Obsluga();
        obsluga.setNumerKarty(klient, "31321321312");
        System.out.println(obsluga.getNumerKarty(klient));

    }
}