package Service;

import Model.RegistruTratament;

public class TabelRegistruTratament {
    private int lastId = 0;
    private int nr = 0;
    private RegistruTratament[] registru = new RegistruTratament[100];

    public void adaugaInRegistru(int id_medic, int id_pacient, int id_tratament) {
        ++lastId;
        ++nr;
        registru[nr] = new RegistruTratament(lastId, id_medic, id_pacient, id_tratament);
    }

    public RegistruTratament getRegistruByIndex(int k) {
        RegistruTratament regAux = new RegistruTratament();
        if (k > nr) {
            System.out.println("Nu exista inregistrarea.");
            return regAux;
        }
        else {
            regAux.setId(registru[k].getId());
            regAux.setIdMedic(registru[k].getIdMedic());
            regAux.setIdPacient(registru[k].getIdPacient());
            regAux.setIdTratament(registru[k].getIdTratament());
        }

        return regAux;
    }

    public void afiseazaDinRegistru(int k) {
        if (k > nr)
            System.out.println("Nu exista inregistrarea.");
        else
            System.out.println(registru[k].getId() + ". " +
                    registru[k].getIdMedic() + " - " +
                    registru[k].getIdPacient() + " - " +
                    registru[k].getIdTratament());
    }

    public void afiseazaRegistru() {
        for(int k=1; k<=nr; k++) {
            System.out.println(registru[k].getId() + ". " +
                    registru[k].getIdMedic() + " - " +
                    registru[k].getIdPacient() + " - " +
                    registru[k].getIdTratament());
        }
        System.out.println();
        System.out.println();
    }
}
