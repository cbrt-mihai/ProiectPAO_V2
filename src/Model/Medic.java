package Model;

public class Medic extends Persoana {
    //private int id;
    //private String nume;
    //private String prenume;
    private String specializare;

    public Medic(int id_, String nume_, String prenume_, String specializare_) {
        /*
        id = id_;
        nume = nume_;
        prenume = prenume_;*/
        super(id_, nume_, prenume_);
        specializare = specializare_;
    }

    public Medic() {
        /*
        id = -1;
        nume = "null";
        prenume = "null";*/
        super(-1, "null", "null");
        specializare = "null";
    }

    public void afiseazaMedic() {
        System.out.println(super.getId() + ". " +
                super.getNume() + " " +
                super.getPrenume() + " - " +
                specializare);
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

    public String getSpecializare() {
        return specializare;
    }

    public void setSpecializare(String specializare) {
        this.specializare = specializare;
    }
}
