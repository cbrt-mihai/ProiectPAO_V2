package service;

import model.Tratament;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static main.Main.clinica;
import static main.Main.loggie;

public class TabelTratament {
    private static TabelTratament INSTANCE;

    private int lastId = 0;
    private int nr = 0;
    private Tratament[] tratamente = new Tratament[100];

    public static TabelTratament getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new TabelTratament();
        }

        return INSTANCE;
    }

    public void citesteTratamente(String path) {
        try {
            loggie.logThis("src/files/auditLog.csv", "citesteTratamente");

            File myObj = new File(path);
            Scanner myReader = new Scanner(myObj);
            String[] parts;
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                parts = data.split(",");

                clinica.adaugaTratament(parts[0], parts[1], Integer.parseInt(parts[2]));

                //System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void adaugaTratament(String denumire, String descriere, int pret) {
        ++lastId;
        ++nr;
        tratamente[nr] = new Tratament(lastId, denumire, descriere, pret);
    }

    public Tratament getTratamentByIndex(int k) {
        Tratament trAux = new Tratament();
        if (k > nr || k < 0) {
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
        if (k > nr || k < 0)
            System.out.println("Nu exista inregistrarea.");
        else
            System.out.println(tratamente[k].getId() + ". " +
                    tratamente[k].getDenumire() + " - " +
                    tratamente[k].getDescriere() + " - " +
                    tratamente[k].getPret());
    }

    public void afiseazaTratamente() {
        System.out.println("Tratamente:");

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
