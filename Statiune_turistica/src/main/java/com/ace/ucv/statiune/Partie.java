package com.ace.ucv.statiune;

import java.util.List;

public class Partie {
    private String tip;
    private Integer numarPatinoare;
    private Integer numarMonitori;
    private List<SportBuilder.Sport> sporturi;

    public Integer getNumarPatinoare() {
        return numarPatinoare;
    }

    public void setNumarPatinoare(Integer numarPatinoare) {
        this.numarPatinoare = numarPatinoare;
    }

    public Integer getNumarMonitori() {
        return numarMonitori;
    }

    public void setNumarMonitori(Integer numarMonitori) {
        this.numarMonitori = numarMonitori;
    }

    public Partie(){}

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public List<SportBuilder.Sport> getSporturi() {
        return sporturi;
    }

    public void setSporturi(List<SportBuilder.Sport> sporturi) {
        this.sporturi = sporturi;
    }

    public Partie(String tip, Integer numarPatinoare, Integer numarMonitori, List<SportBuilder.Sport> sporturi) {
        this.tip = tip;
        this.numarPatinoare = numarPatinoare;
        this.numarMonitori = numarMonitori;
        this.sporturi = sporturi;
    }

    @Override
    public String toString() {
        return "Partie{" +
                "tip='" + tip + '\'' +
                ", sporturi=" + sporturi +
                ", numar patinoare=" + numarPatinoare +
                ", numar monitori=" + numarMonitori +
                '}';
    }






}
