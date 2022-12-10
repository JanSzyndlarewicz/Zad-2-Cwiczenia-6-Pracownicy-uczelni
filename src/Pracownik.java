public abstract class Pracownik extends Osoba {
    private String title;
    private Zadanie[] zadanie;


    public Pracownik(){
        super();
        title = "";
        zadanie = null;
    }

    public Pracownik(String name, String second_name, String id, String birthdate, String title, Zadanie[] zadanie){
        super(name, second_name, id, birthdate);
        this.title = title;
        this.zadanie = zadanie;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Zadanie[] getZadanie() {
        return zadanie;
    }

    public void setZadanie(Zadanie[] zadanie) {
        this.zadanie = zadanie;
    }
}
