public class Zadanie {
    private int priorytet;
    private int przyblizonyCzasRealizacji;
    private String zadanie;
    private String opisZadania;
    private String deathLine;


    public Zadanie() {
        priorytet = 0;
        przyblizonyCzasRealizacji = 0;
        zadanie = "";
        opisZadania = "";
        deathLine = "";
    }


    public Zadanie(int priorytet, int przyblizonyCzasRealizacji, String zadanie, String opisZadania, String deathLine) {
        this.priorytet = priorytet;
        this.przyblizonyCzasRealizacji = przyblizonyCzasRealizacji;
        this.zadanie = zadanie;
        this.opisZadania = opisZadania;
        this.deathLine = deathLine;
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
        return deathLine;
    }

    public void setDeathLine(String deathLine) {
        this.deathLine = deathLine;
    }
}
