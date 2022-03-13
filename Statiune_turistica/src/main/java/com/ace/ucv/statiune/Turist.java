package com.ace.ucv.statiune;

public class Turist extends Persoana {
    private boolean esteIncepator;
    public Turist(){}

    public Turist(String nume, int varsta) {
        super(nume, varsta);
    }

    public boolean isEsteIncepator() {
        return esteIncepator;
    }

    public void setEsteIncepator(boolean esteIncepator) {
        this.esteIncepator = esteIncepator;
    }

    @Override
    public String toString() {
        return "Turist{" +
                "esteIncepator=" + esteIncepator +
                ", nume=" + getNume() +
                ", varsta=" +getVarsta() +
                '}';
    }
}
