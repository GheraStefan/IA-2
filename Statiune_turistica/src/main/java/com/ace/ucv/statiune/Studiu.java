package com.ace.ucv.statiune;

public class Studiu {
    private int numarMonitori;
    private Statiune statiune;
    private int numarPartii;
    private int numarTuristi;
    private int numarPatinoare;
    private int capacitateCazare;

    public Studiu(int numarMonitori, Statiune statiune, int numarPartii, int numarTuristi, int numarPatinoare, int capacitateCazare) {
        this.numarMonitori = numarMonitori;
        this.statiune = statiune;
        this.numarPartii = numarPartii;
        this.numarTuristi = numarTuristi;
        this.numarPatinoare = numarPatinoare;
        this.capacitateCazare = capacitateCazare;
    }

    public Studiu() {
    }

    public int getNumarMonitori() {
        return numarMonitori;
    }

    public void setNumarMonitori(int numarMonitori) {
        this.numarMonitori = numarMonitori;
    }

    public Statiune getStatiune() {
        return statiune;
    }

    public void setStatiune(Statiune statiune) {
        this.statiune = statiune;
    }

    public int getNumarPartii() {
        return numarPartii;
    }

    public void setNumarPartii(int numarPartii) {
        this.numarPartii = numarPartii;
    }

    public int getNumarTuristi() {
        return numarTuristi;
    }

    public void setNumarTuristi(int numarTuristi) {
        this.numarTuristi = numarTuristi;
    }

    public int getNumarPatinoare() {
        return numarPatinoare;
    }

    public void setNumarPatinoare(int numarPatinoare) {
        this.numarPatinoare = numarPatinoare;
    }

    public int getCapacitateCazare() {
        return capacitateCazare;
    }

    public void setCapacitateCazare(int capacitateCazare) {
        this.capacitateCazare = capacitateCazare;
    }

    @Override
    public String toString() {
        return "Studiu{" +
                "numarMonitori=" + numarMonitori +
                ", statiune=" + statiune +
                ", numarPartii=" + numarPartii +
                ", numarTuristi=" + numarTuristi +
                ", numarPatinoare=" + numarPatinoare +
                ", capacitateCazare=" + capacitateCazare +
                '}';
    }
}
