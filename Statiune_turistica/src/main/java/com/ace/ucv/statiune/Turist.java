package com.ace.ucv.statiune;

import java.util.Scanner;

public class Turist extends Persoana {
    private boolean esteIncepator;
    public Turist(){}

    public boolean isEsteIncepator() {
        return esteIncepator;
    }

    public Turist(String nume, int varsta, boolean esteIncepator) {
        super(nume, varsta);
        this.esteIncepator = esteIncepator;
    }

    public Turist(boolean esteIncepator) {
        this.esteIncepator = esteIncepator;
    }

    public void setEsteIncepator(boolean esteIncepator) {
        this.esteIncepator = esteIncepator;
    }



    @Override
    public String toString() {
        return "Turist{" +
                "nume=" + getNume() +
                ", esteIncepator=" + esteIncepator +
                ", varsta=" + getVarsta() +
                '}';
    }
}
