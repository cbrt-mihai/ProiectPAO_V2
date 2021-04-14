package model;

public class Pacient extends Persoana {
    //private int id;
    //private String nume;
    //private String prenume;
    private String dataNasterii;
    private boolean esteActiv;

    public Pacient(int id, String nume, String prenume, String dataNasterii) {
        /*
        id = id_;
        nume = nume_;
        prenume = prenume_;*/
        super(id, nume, prenume);
        this.dataNasterii = dataNasterii;
        esteActiv = true;
    }

    public Pacient() {
        /*
        id = -1;
        nume = "null";
        prenume = "null";*/
        super(-1, "null", "null");
        dataNasterii = "zz/ll/aaaa";
        esteActiv = false;
    }

    public void afiseazaPacient() {
        System.out.println(super.getId() + ". " +
                super.getNume() + " " +
                super.getPrenume() + " - " +
                dataNasterii + " - " +
                esteActiv);
    }


    public int getId() {
        return super.getId();
    }

    public void setId(int id) {
        super.setId(id);
    }

    public String getNume() {
        return super.getNume();
    }

    public void setNume(String nume) {
        super.setNume(nume);
    }

    public String getPrenume() {
        return super.getPrenume();
    }

    public void setPrenume(String prenume) {
        super.setPrenume(prenume);
    }

    public String getDataNasterii() {
        return dataNasterii;
    }

    public void setDataNasterii(String dataNasterii) {
        this.dataNasterii = dataNasterii;
    }

    public boolean isEsteActiv() {
        return esteActiv;
    }

    public void setEsteActiv(boolean esteActiv) {
        this.esteActiv = esteActiv;
    }
}
