package service;

import model.*;

public class ClinicaService {
    private static ClinicaService INSTANCE;

    Logger loggie = Logger.getInstance();

    TabelAfectiune tAf = TabelAfectiune.getInstance();
    TabelMedic tMd = TabelMedic.getInstance();
    TabelPacient tPac = TabelPacient.getInstance();
    TabelIstoricAfectiuni tIAf = TabelIstoricAfectiuni.getInstance();
    TabelProgramare tPrg = TabelProgramare.getInstance();
    TabelRegistruTratament tReg = TabelRegistruTratament.getInstance();
    TabelTratament tTrat = TabelTratament.getInstance();

    public static ClinicaService getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new ClinicaService();
        }

        return INSTANCE;
    }

    // --- tAf - Tabel_Afectiune ---
    public void citesteAfectiuni(String path) {
        tAf.citesteAfectiuni(path);
        //loggie.logThis("src/files/auditLog.csv", "citesteAfectiuni");
    }

    public void adaugaAfectiune(String denumire, String descriere) {
        tAf.adaugaAfectiune(denumire, descriere);
        loggie.logThis("src/files/auditLog.csv", "adaugaAfectiune");
    }

    public void afiseazaAfectiune(int k) {
        tAf.afiseazaAfectiune(k);
        loggie.logThis("src/files/auditLog.csv", "afiseazaAfectiune");
    }

    public Afectiune getAfectiuneByIndex(int k) {
        loggie.logThis("src/files/auditLog.csv", "getAfectiuneByIndex");
        return tAf.getAfectiuneByIndex(k);
    }

    public Afectiune getAfectiuneByDenumire(String den) {
        loggie.logThis("src/files/auditLog.csv", "getAfectiuneByDenumire");
        return tAf.getAfectiuneByDenumire(den);
    }

    public void afiseazaAfectiuni() {
        tAf.afiseazaAfectiuni();
        loggie.logThis("src/files/auditLog.csv", "afiseazaAfectiuni");
    }


    // --- tMd - Tabel_Medic ---
    public void citesteMedici(String path) {
        tMd.citesteMedici(path);
        //loggie.logThis("src/files/auditLog.csv", "citesteMedici");
    }

    public void adaugaMedic(String nume, String prenume, String specializare) {
        tMd.adaugaMedic(nume, prenume, specializare);
        loggie.logThis("src/files/auditLog.csv", "adaugaMedic");
    }

    public Medic getMedicByIndex(int k) {
        loggie.logThis("src/files/auditLog.csv", "getMedicByIndex");
        return tMd.getMedicByIndex(k);
    }

    public Medic getMedicByNumeComplet(String nume, String prenume) {
        loggie.logThis("src/files/auditLog.csv", "getMedicByNumeComplet");
        return tMd.getMedicByNumeComplet(nume, prenume);
    }

    public void afiseazaMedic(int k) {
        tMd.afiseazaMedic(k);
        loggie.logThis("src/files/auditLog.csv", "afiseazaMedic");
    }

    public void afiseazaMedici() {
        tMd.afiseazaMedici();
        loggie.logThis("src/files/auditLog.csv", "afiseazaMedici");
    }


    // --- tPac - Tabel_Pacienti ---
    public void citestePacienti(String path) {
        tPac.citestePacienti(path);
        //loggie.logThis("src/files/auditLog.csv", "citestePacienti");
    }

    public void adaugaPacient(String nume, String prenume, String data) {
        tPac.adaugaPacient(nume, prenume, data);
        loggie.logThis("src/files/auditLog.csv", "adaugaPacient");
    }

    public Pacient getPacientByIndex(int k) {
        loggie.logThis("src/files/auditLog.csv", "getPacientByIndex");
        return tPac.getPacientByIndex(k);
    }

    public Pacient getPacientByNumeComplet(String nume, String prenume) {
        loggie.logThis("src/files/auditLog.csv", "getPacientByNumeComplet");
        return tPac.getPacientByNumeComplet(nume, prenume);
    }

    public void afiseazaPacient(int k) {
        tPac.afiseazaPacient(k);
        loggie.logThis("src/files/auditLog.csv", "afiseazaPacient");
    }

    public void afiseazaPacienti() {
        tPac.afiseazaPacienti();
        loggie.logThis("src/files/auditLog.csv", "afiseazaPacienti");
    }


    // --- tIAf - Tabel_Istoric_Afectiuni ---
    public void adaugaInIstoric(int id_pactient, int id_afectiune) {
        tIAf.adaugaInIstoric(id_pactient, id_afectiune);
        loggie.logThis("src/files/auditLog.csv", "adaugaInIstoric");
    }

    public IstoricAfectiuni getIstoricByIndex(int k) {
        loggie.logThis("src/files/auditLog.csv", "getIstoricByIndex");
        return tIAf.getIstoricByIndex(k);
    }

    public void afiseazaDinIstoric(int k) {
        tIAf.afiseazaDinIstoric(k);
        loggie.logThis("src/files/auditLog.csv", "afiseazaDinIstoric");
    }

    public void afiseazaIstoric() {
        tIAf.afiseazaIstoric();
        loggie.logThis("src/files/auditLog.csv", "afiseazaIstoric");
    }


    // --- tPrg - Tabel_Programare ---
    public void adaugaProgramare(int id_medic, int id_pactient, String data, String ora) {
        tPrg.adaugaProgramare(id_medic, id_pactient, data, ora);
        loggie.logThis("src/files/auditLog.csv", "adaugaProgramare");
    }

    public Programare getProgramareByIndex(int k) {
        loggie.logThis("src/files/auditLog.csv", "getProgramareByIndex");
        return tPrg.getProgramareByIndex(k);
    }

    public Programare getProgramareByIdDate(int id, String data, String ora) {
        loggie.logThis("src/files/auditLog.csv", "getProgramareByIdDate");
        return tPrg.getProgramareByIdDate(id, data, ora);
    }

    public void afiseazaProgramare(int k) {
        tPrg.afiseazaProgramare(k);
        loggie.logThis("src/files/auditLog.csv", "afiseazaProgramare");
    }

    public void afiseazaProgramari() {
        tPrg.afiseazaProgramari();
        loggie.logThis("src/files/auditLog.csv", "afiseazaProgramari");
    }


    // --- tReg - Tabel_Registru_Tratament ---
    public void adaugaInRegistru(int id_medic, int id_pactient, int id_tratament) {
        tReg.adaugaInRegistru(id_medic, id_pactient, id_tratament);
        loggie.logThis("src/files/auditLog.csv", "adaugaInRegistru");
    }

    public RegistruTratament getRegistruByIndex(int k) {
        loggie.logThis("src/files/auditLog.csv", "getRegistruByIndex");
        return tReg.getRegistruByIndex(k);
    }

    public void afiseazaDinRegistru(int k) {
        tReg.afiseazaDinRegistru(k);
        loggie.logThis("src/files/auditLog.csv", "afiseazaDinRegistru");
    }

    public void afiseazaRegistru() {
        tReg.afiseazaRegistru();
        loggie.logThis("src/files/auditLog.csv", "afiseazaRegistru");
    }


    // --- tTrat - Tabel_Tratament ---
    public void citesteTratamente(String path) {
        tTrat.citesteTratamente(path);
        //loggie.logThis("src/files/auditLog.csv", "citesteTratamente");
    }

    public void adaugaTratament(String denumire, String descriere, int pret) {
        tTrat.adaugaTratament(denumire, descriere, pret);
        loggie.logThis("src/files/auditLog.csv", "adaugaTratament");
    }

    public Tratament getTratamentByIndex(int k) {
        loggie.logThis("src/files/auditLog.csv", "getTratamentByIndex");
        return tTrat.getTratamentByIndex(k);
    }

    public Tratament getTratamentByDenumire(String den) {
        loggie.logThis("src/files/auditLog.csv", "getTratamentByDenumire");
        return tTrat.getTratamentByDenumire(den);
    }

    public void afiseazaTratament(int k) {
        tTrat.afiseazaTratament(k);
        loggie.logThis("src/files/auditLog.csv", "afiseazaTratament");
    }

    public void afiseazaTratamente() {
        tTrat.afiseazaTratamente();
        loggie.logThis("src/files/auditLog.csv", "afiseazaTratamente");
    }
}
