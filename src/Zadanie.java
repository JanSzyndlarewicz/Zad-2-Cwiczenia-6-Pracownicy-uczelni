public class Zadanie {
    private int priorytet;
    private int przyblizonyCzasRealizacji;
    private String zadanie;
    private String opisZadania;
    private String deadLine;


    public Zadanie() {
        priorytet = 0;
        przyblizonyCzasRealizacji = 0;
        zadanie = "";
        opisZadania = "";
        deadLine = "";
    }


    public Zadanie(int priorytet, int przyblizonyCzasRealizacji, String zadanie, String opisZadania, String deadLine) {
        this.priorytet = priorytet;
        this.przyblizonyCzasRealizacji = przyblizonyCzasRealizacji;
        this.zadanie = zadanie;
        this.opisZadania = opisZadania;
        this.deadLine = deadLine;
    }

    public int getPriorytet() {
        return priorytet;
    }

    public void setPriorytet(int priorytet) {
        this.priorytet = priorytet;
    }

    public int getPrzyblizonyCzasRealizacji() {
        return przyblizonyCzasRealizacji;
    }

    public void setPrzyblizonyCzasRealizacji(int przyblizonyCzasRealizacji) {
        this.przyblizonyCzasRealizacji = przyblizonyCzasRealizacji;
    }

    public String getZadanie() {
        return zadanie;
    }

    public void setZadanie(String zadanie) {
        this.zadanie = zadanie;
    }

    public String getOpisZadania() {
        return opisZadania;
    }

    public void setOpisZadania(String opisZadania) {
        this.opisZadania = opisZadania;
    }

    public String getDeathLine() {
        return deadLine;
    }

    public void setDeathLine(String deathLine) {
        this.deadLine = deathLine;
    }
}
