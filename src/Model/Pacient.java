package Model;

public class Pacient extends Persoana {
    //private int id;
    //private String nume;
    //private String prenume;
    private String data_nasterii;
    private boolean isActive;

    public Pacient(int id_, String nume_, String prenume_, String data_nasterii_) {
        /*
        id = id_;
        nume = nume_;
        prenume = prenume_;*/
        super(id_, nume_, prenume_);
        data_nasterii = data_nasterii_;
        isActive = true;
    }

    public Pacient() {
        /*
        id = -1;
        nume = "null";
        prenume = "null";*/
        super(-1, "null", "null");
        data_nasterii = "zz/ll/aaaa";
        isActive = false;
    }

    public void afiseazaAfectiune() {
        System.out.println(super.getId() + ". " +
                super.getNume() + " " +
                super.getPrenume() + " - " +
                data_nasterii + " - " +
                isActive);
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

    public String getData_nasterii() {
        return data_nasterii;
    }

    public void setData_nasterii(String data_nasterii) {
        this.data_nasterii = data_nasterii;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
