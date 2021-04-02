package Service;

import Model.Afectiune;

public class TabelAfectiune {
    private int lastId = 0;
    private int nr = 0;
    private Afectiune[] afectiuni = new Afectiune[100];

    public void adaugaAfectiune(String denumire, String descriere) {
        ++lastId;
        ++nr;
        afectiuni[nr] = new Afectiune(lastId, denumire, descriere);
    }

    public void afiseazaAfectiune(int k) {
        if (k > nr)
            System.out.println("Nu exista inregistrarea.");
        else
            System.out.println(afectiuni[k].getId() + ". " +
                    afectiuni[k].getDenumire() + " - " +
                    afectiuni[k].getDescriere());
    }

    public Afectiune getAfectiuneByIndex(int k) {
        Afectiune afAux = new Afectiune();
        if (k > nr) {
            System.out.println("Nu exista inregistrarea.");
            return afAux;
        }
        else {
            afAux.setId(afectiuni[k].getId());
            afAux.setDenumire(afectiuni[k].getDenumire());
            afAux.setDescriere(afectiuni[k].getDescriere());
        }

        return afAux;
    }

    public Afectiune getAfectiuneByDenumire(String den) {
        Afectiune afAux = new Afectiune();
        boolean found = false;
        for(int i = 1; i<= nr; i++) {
            if( afectiuni[i].getDenumire() == den ) {
                found = true;
                afAux.setId(afectiuni[i].getId());
                afAux.setDenumire(afectiuni[i].getDenumire());
                afAux.setDescriere(afectiuni[i].getDescriere());
            }
        }

        if(!found) System.out.println("Nu exista '" + den + "'.");
        return afAux;
    }

    public void afiseazaAfectiuni() {
        for(int k=1; k<=nr; k++) {
            System.out.println(afectiuni[k].getId() + ". " +
                    afectiuni[k].getDenumire() + " - " +
                    afectiuni[k].getDescriere());
        }
        System.out.println();
        System.out.println();
    }

    public int getLastId() {
        return lastId;
    }

    public void setLastId(int lastId) {
        this.lastId = lastId;
    }

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }
}
