package Model;

public class Programare {
    private int id;
    private int id_medic;
    private int id_pacient;
    private String data;
    private String ora;

    public Programare(int id_, int id_medic_, int id_pacient_, String data_, String ora_) {
        id = id_;
        id_medic = id_medic_;
        id_pacient = id_pacient_;
        data = data_;
        ora = ora_;
    }

    public Programare() {
        id = -1;
        id_medic = -1;
        id_pacient = -1;
        data = "zz/ll/aaaa";
        ora = "xx:xx";
    }

    public void afiseazaProgramare() {
        System.out.println(id + ". " +
                id_medic + " - " +
                id_pacient + " - " +
                data + " - " +
                ora);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_medic() {
        return id_medic;
    }

    public void setId_medic(int id_medic) {
        this.id_medic = id_medic;
    }

    public int getId_pacient() {
        return id_pacient;
    }

    public void setId_pacient(int id_pacient) {
        this.id_pacient = id_pacient;
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
