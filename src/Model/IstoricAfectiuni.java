package Model;

public class IstoricAfectiuni {
    private int id;
    private int idPacient;
    private int idAfectiune;

    public IstoricAfectiuni(int id_, int idPacient_, int idAfectiune_) {
        id = id_;
        idPacient = idPacient_;
        idAfectiune = idAfectiune_;
    }

    public IstoricAfectiuni() {
        id = -1;
        idPacient = -1;
        idAfectiune = -1;
    }

    public void afiseazaInformatii() {
        System.out.println(id + ". " +
                idPacient + " - " +
                idAfectiune);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdPacient() {
        return idPacient;
    }

    public void setIdPacient(int idPacient) {
        this.idPacient = idPacient;
    }

    public int getId_afectiune() {
        return idAfectiune;
    }

    public void setId_afectiune(int id_afectiune) {
        this.idAfectiune = id_afectiune;
    }
}
