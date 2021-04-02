package Model;

class Persoana {
    private int id;
    private String nume;
    private String prenume;

    Persoana(int id_, String nume_, String prenume_) {
        id = id_;
        nume = nume_;
        prenume = prenume_;
    }

    Persoana() {
        id = -1;
        nume = "null";
        prenume = "null";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }
}
