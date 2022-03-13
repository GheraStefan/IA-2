package com.ace.ucv.statiune;

import java.util.List;

public class Partie {
    private String tip;
    private List<Sport> sporturi;
    public Partie(){}

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public List<Sport> getSporturi() {
        return sporturi;
    }

    public void setSporturi(List<Sport> sporturi) {
        this.sporturi = sporturi;
    }

    public Partie(String tip, List<Sport> sporturi) {
        this.tip = tip;
        this.sporturi = sporturi;
    }

    @Override
    public String toString() {
        return "Partie{" +
                "tip='" + tip + '\'' +
                ", sporturi=" + sporturi +
                '}';
    }
}
