package service;

import model.Pacient;

public class TabelPacient {
    private int lastId = 0;
    private int nr = 0;
    private Pacient[] pacienti = new Pacient[100];

    public void adaugaPacient(String nume, String prenume, String data) {
        ++lastId;
        ++nr;
        pacienti[nr] = new Pacient(lastId, nume, prenume, data);
    }

    public Pacient getPacientByIndex(int k) {
        Pacient pcAux = new Pacient();
        if (k > nr || k < 0) {
            System.out.println("Nu exista inregistrarea.");
            return pcAux;
        }
        else {
            pcAux.setId(pacienti[k].getId());
            pcAux.setNume(pacienti[k].getNume());
            pcAux.setPrenume(pacienti[k].getPrenume());
            pcAux.setDataNasterii(pacienti[k].getDataNasterii());
        }

        return pcAux;
    }

    public Pacient getPacientByNumeComplet(String nume, String prenume) {
        Pacient pcAux = new Pacient();
        boolean found = false;
        for (int i = 1; i <= nr; i++) {
            if (pacienti[i].getNume() == nume && pacienti[i].getPrenume() == prenume) {
                found = true;
                pcAux.setId(pacienti[i].getId());
                pcAux.setNume(pacienti[i].getNume());
                pcAux.setPrenume(pacienti[i].getPrenume());
                pcAux.setDataNasterii(pacienti[i].getDataNasterii());
            }
        }

        if(!found) System.out.println("Nu exista pacientul " + nume + " " + prenume + ".");
        return pcAux;
    }

    public void afiseazaPacient(int k) {
        if (k > nr || k < 0) {
            System.out.println("Nu exista inregistrarea.");
            System.out.println();
        }
        else {
            System.out.println(pacienti[k].getId() + ". " +
                    pacienti[k].getNume() + " " +
                    pacienti[k].getPrenume() + " - " +
                    pacienti[k].getDataNasterii() + " - " +
                    pacienti[k].isEsteActiv());
            System.out.println();
        }
    }

    public void afiseazaPacienti() {
        for(int k=1; k<=nr; k++) {
            System.out.println(pacienti[k].getId() + ". " +
                    pacienti[k].getNume() + " " +
                    pacienti[k].getPrenume() + " - " +
                    pacienti[k].getDataNasterii() + " - " +
                    pacienti[k].isEsteActiv());
        }
        System.out.println();
    }

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }
}
