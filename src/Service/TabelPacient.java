package service;

import model.Pacient;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TabelPacient {
    private static TabelPacient INSTANCE;

    private int lastId = 0;
    private int nr = 0;
    private Pacient[] pacienti = new Pacient[100];

    public static TabelPacient getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new TabelPacient();
        }

        return INSTANCE;
    }

    public void citestePacienti(String path) {
        try {
            File myObj = new File(path);
            Scanner myReader = new Scanner(myObj);
            String[] parts;
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                parts = data.split(",");

                adaugaPacient(parts[0], parts[1], parts[2]);

                //System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

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
        System.out.println("Pacienti:");

        for(int k=1; k<=nr; k++) {
            System.out.println(pacienti[k].getId() + ". " +
                    pacienti[k].getNume() + " " +
                    pacienti[k].getPrenume() + " - " +
                    pacienti[k].getDataNasterii() + " - " +
                    pacienti[k].isEsteActiv());
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
