package com.ace.ucv.statiune;

public class FacadeStatiune {
    Statiune statiune;
    Aplicatie aplicatie;
    Studiu studiu;

    public FacadeStatiune(Statiune s)
    {
        statiune = s;
        aplicatie = new Aplicatie();
        studiu = new Studiu(statiune);
    }

    public Statiune creare_statiune()
    {
        int input;

        do {
            System.out.println("1. Adaugare cazare");
            System.out.println("2. Adaugare partie");
            System.out.println("3. Vizualizare studiu");
            System.out.println("0. Iesire");
            System.out.println("Introduceti un numar: ");

            input = aplicatie.getScanner().nextInt();
            switch (input) {
                case 1:
                    statiune.getCazari().add(aplicatie.createCazare());
                    for (Cazare cazare1 : statiune.getCazari()) {
                        System.out.println(cazare1);
                    }
                    break;
                case 2:
                    statiune.getPartii().add(aplicatie.createPartie());
                    for (Partie partie : statiune.getPartii()) {
                        System.out.println(partie);
                    }
                    break;
                case 3:
                    System.out.println("Detaliile statiunii: ");
                    System.out.println(studiu);
                    break;
            }
        } while (input != 0);

        return statiune;
    }
}
