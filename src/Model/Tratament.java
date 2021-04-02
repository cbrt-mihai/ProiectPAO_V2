package Model;

public class Tratament {
    private int id;
    private String denumire;
    private String descriere;
    private int pret;

    public Tratament(int id_, String denumire_, String descriere_, int pret_) {
        id = id_;
        denumire = denumire_;
        descriere = descriere_;
        pret = pret_;
    }

    public Tratament() {
        id = -1;
        denumire = "null";
        descriere = "null";
        pret = -999;
    }

    public void afiseazaTratament() {
        System.out.println(id + ". " +
                denumire + " - " +
                descriere + " - " +
                pret);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public String getDescriere() {
        return descriere;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }
}
