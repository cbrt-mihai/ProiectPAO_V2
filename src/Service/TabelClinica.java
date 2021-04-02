package Service;

import Model.*;

public class TabelClinica {
    TabelAfectiune tAf = new TabelAfectiune();
    TabelMedic tMd = new TabelMedic();
    TabelPacient tPac = new TabelPacient();
    TabelIstoricAfectiuni tIAf = new TabelIstoricAfectiuni();
    TabelProgramare tPrg = new TabelProgramare();
    TabelRegistruTratament tReg = new TabelRegistruTratament();
    TabelTratament tTrat = new TabelTratament();

    // --- tAf - Tabel_Afectiune ---
    public void adaugaAfectiune(String denumire, String descriere) {
        tAf.adaugaAfectiune(denumire, descriere);
    }

    public void afiseazaAfectiune(int k) {
        tAf.afiseazaAfectiune(k);
    }

    public Afectiune getAfectiuneByIndex(int k) {
        return tAf.getAfectiuneByIndex(k);
    }

    public Afectiune getAfectiuneByDenumire(String den) {
        return tAf.getAfectiuneByDenumire(den);
    }

    public void afiseazaAfectiuni() {
        tAf.afiseazaAfectiuni();
    }


    // --- tMd - Tabel_Medic ---
    public void adaugaMedic(String nume, String prenume, String specializare) {
        tMd.adaugaMedic(nume, prenume, specializare);
    }

    public Medic getMedicByIndex(int k) {
        return tMd.getMedicByIndex(k);
    }

    public Medic getMedicByNumeComplet(String nume, String prenume) {
        return tMd.getMedicByNumeComplet(nume, prenume);
    }

    public void afiseazaMedic(int k) {
        tMd.afiseazaMedic(k);
    }

    public void afiseazaMedici() {
        tMd.afiseazaMedici();
    }


    // --- tPac - Tabel_Pacienti ---
    public void adaugaPacient(String nume, String prenume, String data) {
        tPac.adaugaPacient(nume, prenume, data);
    }

    public Pacient getPacientByIndex(int k) {
        return tPac.getPacientByIndex(k);
    }

    public Pacient getPacientByNumeComplet(String nume, String prenume) {
        return tPac.getPacientByNumeComplet(nume, prenume);
    }

    public void afiseazaPacient(int k) {
        tPac.afiseazaPacient(k);
    }

    public void afiseazaPacienti() {
        tPac.afiseazaPacienti();
    }


    // --- tIAf - Tabel_Istoric_Afectiuni ---
    public void adaugaInIstoric(int id_pactient, int id_afectiune) {
        tIAf.adaugaInIstoric(id_pactient, id_afectiune);
    }

    public IstoricAfectiuni getIstoricByIndex(int k) {
        return tIAf.getIstoricByIndex(k);
    }

    public void afiseazaDinIstoric(int k) {
        tIAf.afiseazaDinIstoric(k);
    }

    public void afiseazaIstoric() {
        tIAf.afiseazaIstoric();
    }


    // --- tPrg - Tabel_Programare ---
    public void adaugaProgramare(int id_medic, int id_pactient, String data, String ora) {
        tPrg.adaugaProgramare(id_medic, id_pactient, data, ora);
    }

    public Programare getProgramareByIndex(int k) {
        return tPrg.getProgramareByIndex(k);
    }

    public Programare getProgramareByIdDate(int id, String data, String ora) {
        return tPrg.getProgramareByIdDate(id, data, ora);
    }

    public void afiseazaProgramare(int k) {
        tPrg.afiseazaProgramare(k);
    }

    public void afiseazaProgramari() {
        tPrg.afiseazaProgramari();
    }


    // --- tReg - Tabel_Registru_Tratament ---
    public void adaugaInRegistru(int id_medic, int id_pactient, int id_tratament) {
        tReg.adaugaInRegistru(id_medic, id_pactient, id_tratament);
    }

    public RegistruTratament getRegistruByIndex(int k) {
        return tReg.getRegistruByIndex(k);
    }

    public void afiseazaDinRegistru(int k) {
        tReg.afiseazaDinRegistru(k);
    }

    public void afiseazaRegistru() {
        tReg.afiseazaRegistru();
    }


    // --- tTrat - Tabel_Tratament ---
    public void adaugaTratament(String denumire, String descriere, int pret) {
        tTrat.adaugaTratament(denumire, descriere, pret);
    }

    public Tratament getTratamentByIndex(int k) {
        return tTrat.getTratamentByIndex(k);
    }

    public Tratament getTratamentByDenumire(String den) {
        return tTrat.getTratamentByDenumire(den);
    }

    public void afiseazaTratament(int k) {
        tTrat.afiseazaTratament(k);
    }

    public void afiseazaTratamente() {
        tTrat.afiseazaTratamente();
    }
}
