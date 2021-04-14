package model;

public class RegistruTratament {
    private int id;
    private int idMedic;
    private int idPacient;
    private int idTratament;

    public RegistruTratament(int id, int idMedic, int idPacient, int idTratament) {
        this.id = id;
        this.idMedic = idMedic;
        this.idPacient = idPacient;
        this.idTratament = idTratament;
    }

    public RegistruTratament() {
        id = -1;
        idMedic = -1;
        idPacient = 1;
        idTratament = -1;
    }

    public void afiseazaRegistruTratament() {
        System.out.println(id + ". " +
                idMedic + " - " +
                idPacient + " - " +
                idTratament);
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

    public int getIdTratament() {
        return idTratament;
    }

    public void setIdTratament(int idTratament) {
        this.idTratament = idTratament;
    }
}
