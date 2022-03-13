package com.ace.ucv.statiune;

import java.util.List;

public class Cazare {
    private String tip;
    private int capacitateCazare;
    private List<Turist> turisti;

    public Cazare() {
    }

    public Cazare(String tip, int capacitateCazare) {
        this.tip = tip;
        this.capacitateCazare = capacitateCazare;

    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public int getCapacitateCazare() {
        return capacitateCazare;
    }

    public void setCapacitateCazare(int capacitateCazare) {
        this.capacitateCazare = capacitateCazare;
    }

    public List<Turist> getTuristi() {
        return turisti;
    }

    public void setTuristi(List<Turist> turisti) {
        this.turisti = turisti;
    }

    @Override
    public String toString() {
        return "Cazare{" +
                "tip='" + tip + '\'' +
                ", capacitateCazare=" + capacitateCazare +
                ", turisti=" + turisti +
                '}';
    }
}
