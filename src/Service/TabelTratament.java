package Service;

import Model.Afectiune;
import Model.Medic;
import Model.Tratament;

public class TabelTratament {
    private int lastId = 0;
    private int nr = 0;
    private Tratament[] tratamente = new Tratament[100];

    public void adaugaTratament(String denumire, String descriere, int pret) {
        ++lastId;
        ++nr;
        tratamente[nr] = new Tratament(lastId, denumire, descriere, pret);
    }

    public Tratament getTratamentByIndex(int k) {
        Tratament trAux = new Tratament();
        if (k > nr) {
            System.out.println("Nu exista inregistrarea.");
            return trAux;
        }
        else {
            trAux.setId(tratamente[k].getId());
            trAux.setDenumire(tratamente[k].getDenumire());
            trAux.setDescriere(tratamente[k].getDescriere());
            trAux.setPret(tratamente[k].getPret());
        }

        return trAux;
    }

    public Tratament getTratamentByDenumire(String den) {
        Tratament trAux = new Tratament();
        boolean found = false;
        for(int i = 1; i<= nr; i++) {
            if( tratamente[i].getDenumire() == den ) {
                found = true;
                trAux.setId(tratamente[i].getId());
                trAux.setDenumire(tratamente[i].getDenumire());
                trAux.setDescriere(tratamente[i].getDescriere());
                trAux.setPret(tratamente[i].getPret());
            }
        }

        if(!found) System.out.println("Nu exista " + den + ".");
        return trAux;
    }

    public void afiseazaTratament(int k) {
        if (k > nr)
            System.out.println("Nu exista inregistrarea.");
        else
            System.out.println(tratamente[k].getId() + ". " +
                    tratamente[k].getDenumire() + " - " +
                    tratamente[k].getDescriere() + " - " +
                    tratamente[k].getPret());
    }

    public void afiseazaTratamente() {
        for(int k=1; k<=nr; k++) {
            System.out.println(tratamente[k].getId() + ". " +
                    tratamente[k].getDenumire() + " - " +
                    tratamente[k].getDescriere() + " - " +
                    tratamente[k].getPret());
        }
        System.out.println();
        System.out.println();
    }
}
