package main;

import service.*;

import java.util.Scanner;

public class Main {
    public static TabelClinica clinica = new TabelClinica();

    public static void main(String [] args) {
        init();
        test();
    }

    public static void init() {
        clinica.adaugaAfectiune("Raceala", "O simpla raceala");
        clinica.adaugaAfectiune( "Gripa","O raceala mai grava");
        clinica.adaugaAfectiune( "Covid-19", "O gripa mai grava");

        clinica.adaugaMedic( "Dintescu", "Cornel", "Dentist");
        clinica.adaugaMedic( "Ripper", "Andrei", "Chirurg");
        clinica.adaugaMedic( "Fat", "Joe", "Nutritionist");

        clinica.adaugaPacient( "Pop", "Popescu", "12/04/1997");
        clinica.adaugaPacient( "Xavier", "Charles", "06/10/2001");
        clinica.adaugaPacient( "Viteazu", "Mihai", "15/01/1558");

        clinica.adaugaInIstoric( 1,2);
        clinica.adaugaInIstoric( 2,2);
        clinica.adaugaInIstoric( 3,1);

        clinica.adaugaProgramare( 1, 2, "10/03/2021", "14:00");
        clinica.adaugaProgramare( 2, 3, "14/04/2021", "12:45");
        clinica.adaugaProgramare( 3, 1, "7/05/2021", "17:30");

        clinica.adaugaInRegistru( 1,2, 3);
        clinica.adaugaInRegistru( 2,1, 2);
        clinica.adaugaInRegistru( 3,3, 2);

        clinica.adaugaTratament( "EKG", "Scanare inima", 200);
        clinica.adaugaTratament( "Radiografie", "Scanare oase/organe", 75);
        clinica.adaugaTratament( "B o n k", "Reset cranio-psihologic", 0);
    }

    public static void test() {
        clinica.getAfectiuneByDenumire("Covid-19").afiseazaAfectiune();
        clinica.getAfectiuneByDenumire("Hemoragie interna").afiseazaAfectiune();

        clinica.getAfectiuneByIndex(5).afiseazaAfectiune();
        clinica.getAfectiuneByIndex(2).afiseazaAfectiune();
        clinica.getPacientByNumeComplet("Alex", "Popa");
    }
}
