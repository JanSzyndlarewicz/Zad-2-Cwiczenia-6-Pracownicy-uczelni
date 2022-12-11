public abstract class Klient extends Osoba{
    private String nrKarty;
    private int znizka;
    private int pkt;

    public Klient() {
        super();
        nrKarty = "";
        znizka = 0;
        pkt = 0;
    }

    public Klient(String name, String second_name, String id, Date birthdate, String nrKarty, int znizka, int pkt) {
        super(name, second_name, id, birthdate);
        this.nrKarty = nrKarty;
        this.znizka = znizka;
        this.pkt = pkt;
    }

    public int getPkt() {
        return pkt;
    }

    public void setPkt(int pkt) {
        this.pkt = pkt;
    }

    public String getNrKarty() {
        return nrKarty;
    }

    public void setNrKarty(String nrKarty) {
        this.nrKarty = nrKarty;
    }

    public int getZnizka() {
        return znizka;
    }

    public void setZnizka(int znizka) {
        this.znizka = znizka;
    }
}
