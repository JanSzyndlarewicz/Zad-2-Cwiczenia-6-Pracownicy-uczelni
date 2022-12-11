public class Main {
    public static void main(String[] args) {
        Prywatny[] prywatny = new Prywatny[100];
        Firmowy[] firmowy = new Firmowy[100];
        Pracownik[] pracownik = new Pracownik[100];

        prywatny[0] = new Prywatny("Jan", "Szyndlarewicz", "2345678", new Date(12, 7, 2004), "9876543", 20, 1500, 2, true, 20);
        prywatny[1] = new Prywatny("Kuba", "Gor", "25435678", new Date(11, 4, 2000), "9843543", 20, 200, 1, true, 20);
        Obsluga obsluga = new Obsluga();
        obsluga.setNumerKarty(prywatny[0], "31321321312");
        System.out.println(obsluga.getBirthdate(prywatny[0]));
        System.out.println(obsluga.getBirthdate(prywatny[1]));

    }
}