package com.ace.ucv.statiune;

import java.util.ArrayList;
import java.util.List;

public class Statiune {
    private List<Partie> partii = new ArrayList<>();
    private List<Cazare> cazari = new ArrayList<>();

    public Statiune() {
    }

    public Statiune(List<Partie> partii, List<Cazare> cazari) {
        this.partii = partii;
        this.cazari = cazari;
    }

    public List<Partie> getPartii() {
        return partii;
    }

    public void setPartii(List<Partie> partii) {
        this.partii = partii;
    }

    public List<Cazare> getCazari() {
        return cazari;
    }

    public void setCazari(List<Cazare> cazari) {
        this.cazari = cazari;
    }

    @Override
    public String toString() {
        return "Statiune{" +
                "partii=" + partii +
                ", cazari=" + cazari +
                '}';
    }



}

