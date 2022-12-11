public class Prywatny extends Klient{

    private int iloscDzieci;
    private boolean czyZamozny;

    private int limit;

    public Prywatny() {
        super();
        iloscDzieci = 0;
        czyZamozny = false;
        limit = 0;
    }

    public Prywatny(String name, String second_name, String id, Date birthdate, String nrKarty, int znizka, int pkt, int iloscDzieci, boolean czyZamozny, int limit) {
        super(name, second_name, id, birthdate, nrKarty, znizka, pkt);
        this.iloscDzieci = iloscDzieci;
        this.czyZamozny = czyZamozny;
        this.limit = limit;
    }
}
