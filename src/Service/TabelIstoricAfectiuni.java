package Service;

import Model.IstoricAfectiuni;

public class TabelIstoricAfectiuni {
    private int lastId = 0;
    private int nr = 0;
    private IstoricAfectiuni[] istoric = new IstoricAfectiuni[100];

    public void adaugaInIstoric(int id_pacient, int id_afectiune) {
        ++lastId;
        ++nr;
        istoric[nr] = new IstoricAfectiuni(lastId, id_pacient, id_afectiune);
    }

    public IstoricAfectiuni getIstoricByIndex(int k) {
        IstoricAfectiuni iAfAux = new IstoricAfectiuni();
        if (k > nr) {
            System.out.println("Nu exista inregistrarea.");
            return iAfAux;
        }
        else {
            iAfAux.setId(istoric[k].getId());
            iAfAux.setIdPacient(istoric[k].getIdPacient());
            iAfAux.setId_afectiune(istoric[k].getId_afectiune());
        }

        return iAfAux;
    }

    public void afiseazaDinIstoric(int k) {
        if (k > nr)
            System.out.println("Nu exista inregistrarea.");
        else
            System.out.println(istoric[k].getId() + ". " +
                    istoric[k].getIdPacient() + " - " +
                    istoric[k].getId_afectiune());
    }

    public void afiseazaIstoric() {
        for(int k=1; k<=nr; k++) {
            System.out.println(istoric[k].getId() + ". " +
                    istoric[k].getIdPacient() + " - " +
                    istoric[k].getId_afectiune());
        }
        System.out.println();
        System.out.println();
    }

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }
}
