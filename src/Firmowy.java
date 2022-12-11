public class Firmowy extends Klient{

    private String NIP;
    private String REGON;

    public Firmowy() {
        super();
        NIP = "";
        REGON = "";
    }

    public Firmowy(String name, String second_name, String id, String birthdate, String nrKarty, int znizka, int pkt, String NIP, String REGON) {
        super(name, second_name, id, birthdate, nrKarty, znizka, pkt);
        this.NIP = NIP;
        this.REGON = REGON;
    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public String getREGON() {
        return REGON;
    }

    public void setREGON(String REGON) {
        this.REGON = REGON;
    }

}
