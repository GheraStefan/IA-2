package com.ace.ucv.statiune;

import java.util.List;

public class Studiu {
    private Statiune statiune;

    public Studiu(Statiune statiune) {
        this.statiune = statiune;
    }

    public Studiu() {
    }

    public Statiune getStatiune() {
        return statiune;
    }

    public void setStatiune(Statiune statiune) {
        this.statiune = statiune;
    }

    public int getNumarMonitori() {
        int numarMonitori = 0;
        List<Partie> partii = statiune.getPartii();
        // Parcurgem fiecare partie in parte si contorizam numarul total de monitori
        for (Partie partie : partii) {
            numarMonitori += partie.getNumarMonitori();
        }
        return numarMonitori;
    }

    public int getNumarPartii() {
        List<Partie> partii = statiune.getPartii();
        return partii.size();
    }

    public int getNumarTuristi() {
        int numarTuristi = 0;
        List<Cazare> cazari = statiune.getCazari();
        for (Cazare cazare : cazari) {
            numarTuristi += cazare.getTuristi().size();
        }
        return numarTuristi;
    }

    public int getNumarPatinoare() {
        int numarPatinoare = 0;
        List<Partie> partii = statiune.getPartii();
        for (Partie partie : partii) {
            numarPatinoare += partie.getNumarPatinoare();
        }
        return numarPatinoare;
    }

    public int getCapacitateCazare() {
        int capacitateCazare = 0;
        List<Cazare> cazari = statiune.getCazari();
        for (Cazare cazare : cazari){
            capacitateCazare += cazare.getCapacitateCazare();
        }
        return capacitateCazare;
    }

    @Override
    public String toString() {
        return "Studiu{" +
                "statiune=" + statiune +
                ", numarMonitori=" + getNumarMonitori() +
                ", numarPartii=" + getNumarPartii() +
                ", numarTuristi=" + getNumarTuristi() +
                ", numarPatinoare=" + getNumarPatinoare() +
                ", capacitateCazare=" + getCapacitateCazare() +
                '}';
    }
}
