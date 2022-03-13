package com.ace.ucv.statiune;

import java.util.List;
import java.util.stream.Collectors;

public class Sport {
    private String nume;
    private List<Turist> turisti;


    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public List<Turist> getTuristi() {
        return turisti;
    }

    public void setTuristi(List<Turist> turisti) {
        this.turisti = turisti;
    }

    public Sport() {
    }

    public Sport(String nume, List<Turist> turisti) {
        this.nume = nume;
        this.turisti = turisti;

    }


    @Override
    public String toString() {
        return "Sport{" +
                "nume='" + nume + '\'' +
                ",turisti=" +   turisti +
                '}';
    }
}
