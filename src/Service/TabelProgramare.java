package Service;

import Model.Medic;
import Model.Pacient;
import Model.Programare;

public class TabelProgramare {
    private int lastId = 0;
    private int nr = 0;
    private Programare[] programari = new Programare[100];

    public void adaugaProgramare(int id_medic, int id_pacient, String data, String ora) {
        ++lastId;
        ++nr;
        programari[nr] = new Programare(lastId, id_medic, id_pacient, data, ora);
    }

    public Programare getProgramareByIndex(int k) {
        Programare prgAux = new Programare();
        if (k > nr) {
            System.out.println("Nu exista inregistrarea.");
            return prgAux;
        }
        else {
            prgAux.setId(programari[k].getId());
            prgAux.setId_medic(programari[k].getId_medic());
            prgAux.setId_pacient(programari[k].getId_pacient());
            prgAux.setData(programari[k].getData());
            prgAux.setOra(programari[k].getOra());
        }

        return prgAux;
    }

    public Programare getProgramareByIdDate(int id, String data, String ora) {
        Programare prgAux = new Programare();
        boolean found = false;
        for (int i = 1; i <= nr; i++) {
            if ( (programari[i].getId_pacient() == id) && (programari[i].getData() == data) && (programari[i].getOra() == ora) ) {
                found = true;
                prgAux.setId(programari[i].getId());
                prgAux.setId_medic(programari[i].getId_medic());
                prgAux.setId_pacient(programari[i].getId_pacient());
                prgAux.setData(programari[i].getData());
                prgAux.setOra(programari[i].getOra());
            }
        }

        if(!found) System.out.println("Nu exista programarea pacientului cu id " + id + " in data de " + data + " la ora " + ora + ".");
        return prgAux;
    }

    public void afiseazaProgramare(int k) {
        if (k > nr)
            System.out.println("Nu exista inregistrarea.");
        else
            System.out.println(programari[k].getId() + ". " +
                    programari[k].getId_medic() + " - " +
                    programari[k].getId_pacient() + " - " +
                    programari[k].getData() + " " +
                    programari[k].getOra());
    }

    public void afiseazaProgramari() {
        for(int k=1; k<=nr; k++) {
            System.out.println(programari[k].getId() + ". " +
                    programari[k].getId_medic() + " - " +
                    programari[k].getId_pacient() + " - " +
                    programari[k].getData() + " " +
                    programari[k].getOra());
        }
        System.out.println();
        System.out.println();
    }
}
