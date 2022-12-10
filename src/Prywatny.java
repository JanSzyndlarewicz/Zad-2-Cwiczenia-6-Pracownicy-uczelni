public class Prywatny extends Klient{

    private int iloscDzieci;
    private boolean czyZamozny;

    public Prywatny() {
        super();
        iloscDzieci = 0;
        czyZamozny = false;
    }

    public Prywatny(String name, String second_name, String id, String birthdate, String nrKarty, int znizka, int pkt, int iloscDzieci, boolean czyZamozny) {
        super(name, second_name, id, birthdate, nrKarty, znizka, pkt);
        this.iloscDzieci = iloscDzieci;
        this.czyZamozny = czyZamozny;
    }
}
