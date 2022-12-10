public class Firmowy extends Klient{

    private String NIP;
    private String REGON;

    private int limit;

    public Firmowy() {
        super();
        NIP = "";
        REGON = "";
        limit = 0;
    }

    public Firmowy(String name, String second_name, String id, String birthdate, String nrKarty, int znizka, int pkt, String NIP, String REGON, int limit) {
        super(name, second_name, id, birthdate, nrKarty, znizka, pkt);
        this.NIP = NIP;
        this.REGON = REGON;
        this.limit = limit;
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

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }


}
