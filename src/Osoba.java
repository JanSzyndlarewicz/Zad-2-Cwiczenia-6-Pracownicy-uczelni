public abstract class Osoba {
    private String name, second_name, id, birthdate;

    public Osoba(){
        name = "Imię";
        second_name = "Nazwisko";
        id = "000000";
        birthdate = "01.01.1900";
    }

    public Osoba(String name, String second_name, String id, String birthdate){
        this.name = name;
        this.second_name = second_name;
        this.id = id;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecond_name() {
        return second_name;
    }

    public void setSecond_name(String second_name) {
        this.second_name = second_name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }


}
