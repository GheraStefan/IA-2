package com.ace.ucv.statiune;
//am facut citire de la consola, crearea meniului cu optiuni si afisarea studiului pe baza valorilor din statiune.
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aplicatie {
    Scanner scanner = new Scanner(System.in);
    String nume = "";
    SportFactory sportFactory = new SportFactory();

    public Turist creazaTurist() {
        String input;
        int varsta;
        boolean incepator;

        System.out.print("Numele turistului:");
        nume = scanner.next();
        System.out.print("Varsta turistului:");
        varsta = scanner.nextInt();
        System.out.print("Este turistul incepator ? (y/n):");
        input = scanner.next();

        if (input == "y") {
            incepator = true;
        } else {
            incepator = false;
        }
        return new Turist(nume, varsta, incepator);
    }

    public SportBuilder.Sport createSport() {
        Scanner in = new Scanner(System.in);
        System.out.println("Sporturi disponibile: \n1.Patinaj\n2.Schi");
        int option = in.nextInt();

        return sportFactory.getSport(option);
    }

    public Partie createPartie() {
        String tip;
        int numarPatinoare;
        int numarMonitori;
        int numarSporturi;

        System.out.print("Tipul partiei:");
        tip = scanner.next();
        System.out.print("Numar patinoare:");
        numarPatinoare = scanner.nextInt();
        System.out.print("Numar monitori:");
        numarMonitori = scanner.nextInt();
        System.out.print("Cate sporturi se practica ?");
        numarSporturi = scanner.nextInt();

            List<SportBuilder.Sport> sporturi = new ArrayList<>();
            for (int i = 0; i < numarSporturi; i++) {
                SportBuilder.Sport sport = createSport();
                sporturi.add(sport);
            }
        return new Partie(tip, numarPatinoare, numarMonitori, sporturi);
    }

    public Cazare createCazare() {
        String tip;
        int capacitateCazare;

        System.out.print("Tipul cazarii:");
        tip = scanner.next();
        System.out.print("Capacitate cazare:");
        capacitateCazare = scanner.nextInt();

        System.out.print("Numarul turisti de la cazare:");
        int numarTuristi = scanner.nextInt();
        List<Turist> turisti = new ArrayList<>();
        for (int i=0; i<numarTuristi; i++) {
            Turist turist = creazaTurist();
            turisti.add(turist);
        }
        return new Cazare(tip, capacitateCazare, turisti);
    }

    public Scanner getScanner() {
        return scanner;
    }
}
