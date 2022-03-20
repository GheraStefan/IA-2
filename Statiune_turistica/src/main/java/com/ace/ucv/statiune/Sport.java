package com.ace.ucv.statiune;

import java.util.List;
import java.util.stream.Collectors;

public class Sport {
    private String nume;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Sport() {
    }

    public Sport(String nume) {
        this.nume = nume;

    }


    @Override
    public String toString() {
        return "Sport{" +
                "nume='" + nume + '\'' +
                '}';
    }
}
