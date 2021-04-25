package service;

import model.Medic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TabelMedic {
    private static TabelMedic INSTANCE;

    private int lastId = 0;
    private int nr = 0;
    private Medic[] medici = new Medic[100];

    public static TabelMedic getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new TabelMedic();
        }

        return INSTANCE;
    }

    public void citesteMedici(String path) {
        try {
            File myObj = new File(path);
            Scanner myReader = new Scanner(myObj);
            String[] parts;
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                parts = data.split(",");

                adaugaMedic(parts[0], parts[1], parts[2]);

                //System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void adaugaMedic(String nume, String prenume, String specializare) {
        ++lastId;
        ++nr;
        medici[nr] = new Medic(lastId, nume, prenume, specializare);
    }

    public Medic getMedicByIndex(int k) {
        Medic mdAux = new Medic();
        if (k > nr || k < 0) {
            System.out.println("Nu exista inregistrarea.");
            return mdAux;
        }
        else {
            mdAux.setId(medici[k].getId());
            mdAux.setNume(medici[k].getNume());
            mdAux.setPrenume(medici[k].getPrenume());
            mdAux.setSpecializare(medici[k].getSpecializare());
        }

        return mdAux;
    }

    public Medic getMedicByNumeComplet(String nume, String prenume) {
        Medic mdAux = new Medic();
        boolean found = false;
        for (int i = 1; i <= nr; i++) {
            if (medici[i].getNume() == nume && medici[i].getPrenume() == prenume) {
                found = true;
                mdAux.setId(medici[i].getId());
                mdAux.setNume(medici[i].getNume());
                mdAux.setPrenume(medici[i].getPrenume());
                mdAux.setSpecializare(medici[i].getSpecializare());
            }
        }

        if(!found) System.out.println("Nu exista medicul " + nume + " " + prenume + ".");
        return mdAux;
    }

    public void afiseazaMedic(int k) {
        if (k > nr || k < 0)
            System.out.println("Nu exista inregistrarea.");
        else
            System.out.println(medici[k].getId() + ". " +
                    medici[k].getNume() + " " +
                    medici[k].getPrenume() + " - " +
                    medici[k].getSpecializare());
    }

    public void afiseazaMedici() {
        System.out.println("Medici:");

        for(int k=1; k<=nr; k++) {
            System.out.println(medici[k].getId() + ". " +
                    medici[k].getNume() + " " +
                    medici[k].getPrenume() + " - " +
                    medici[k].getSpecializare());
        }

        System.out.println();
        System.out.println();
    }
}
