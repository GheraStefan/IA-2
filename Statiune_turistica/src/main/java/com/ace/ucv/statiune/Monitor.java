package com.ace.ucv.statiune;

public class Monitor extends Persoana {
    public Monitor(String nume, int varsta) {
        super(nume, varsta);
    }

    public Monitor() {
    }

    @Override
    public String toString() {
        return "Persoana{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                '}';
    }
}
