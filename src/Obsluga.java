public class Obsluga {

    public Date getBirthdate(Klient klient){
        return klient.getBirthdate();
    }

    public void setBirthdate(Klient klient, Date birthdate){
        klient.setBirthdate(birthdate);
    }

    public String getNumerKarty(Klient klient){
        return klient.getNrKarty();
    }

    public void setNumerKarty(Klient klient, String nrKarty){
        klient.setNrKarty(nrKarty);
    }

    public int getZnizka (Klient klient){
        return klient.getZnizka();
    }

    public void setZnizka(Klient klient, int znizka){
        klient.setZnizka(znizka);
    }

    public int getPkt(Klient klient){
        return klient.getPkt();
    }



}
