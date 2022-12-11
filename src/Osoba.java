public abstract class Osoba {
    private String name, second_name, id;
    private Date birthdate;

    public Osoba(){
        name = "Imię";
        second_name = "Nazwisko";
        id = "000000";
        birthdate = new Date();
    }

    public Osoba(String name, String second_name, String id, Date birthdate){
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

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }
}
