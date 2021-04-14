package model;

public class Programare {
    private int id;
    private int idMedic;
    private int idPacient;
    private String data;
    private String ora;

    public Programare(int id, int idMedic, int idPacient, String data, String ora) {
        this.id = id;
        this.idMedic = idMedic;
        this.idPacient = idPacient;
        this.data = data;
        this.ora = ora;
    }

    public Programare() {
        id = -1;
        idMedic = -1;
        idPacient = -1;
        data = "zz/ll/aaaa";
        ora = "xx:xx";
    }

    public void afiseazaProgramare() {
        System.out.println(id + ". " +
                idMedic + " - " +
                idPacient + " - " +
                data + " - " +
                ora);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdMedic() {
        return idMedic;
    }

    public void setIdMedic(int idMedic) {
        this.idMedic = idMedic;
    }

    public int getIdPacient() {
        return idPacient;
    }

    public void setIdPacient(int idPacient) {
        this.idPacient = idPacient;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getOra() {
        return ora;
    }

    public void setOra(String ora) {
        this.ora = ora;
    }
}
