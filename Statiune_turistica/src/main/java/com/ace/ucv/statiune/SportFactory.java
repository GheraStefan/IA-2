package com.ace.ucv.statiune;

public class SportFactory {

    private final SportBuilder sportPeGheata;
    private final SportBuilder sportMontan;

    public SportFactory() {
        sportPeGheata = new SportBuilder();
        sportPeGheata.setNume("Patinaj");

        sportMontan = new SportBuilder();
        sportMontan.setNume("Schi");
    }

    public SportBuilder.Sport getSport(int option) {
        SportBuilder.Sport sport = null;
        if (option == 1) {
            sport = sportPeGheata.build();
        } else if (option == 2) {
            sport = sportMontan.build();
        }
        return sport;
    }
}
