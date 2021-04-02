package Model;

public class Afectiune {
    private int id;
    private String denumire;
    private String descriere;

    public Afectiune(int id_, String denumire_, String descriere_) {
        id =  id_;
        denumire = denumire_;
        descriere = descriere_;
    }

    public Afectiune() {
        id = -1;
        denumire = "null";
        descriere = "null";
    }

    public void afiseazaAfectiune() {
        System.out.println("id" + ". " +
                "denumire"+ " - " +
                "descriere");
        System.out.println(id + ". " +
                denumire+ " - " +
                descriere);
        System.out.println();
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
}
