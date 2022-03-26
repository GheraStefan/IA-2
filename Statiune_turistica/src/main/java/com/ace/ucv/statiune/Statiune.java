package com.ace.ucv.statiune;

import java.util.ArrayList;
import java.util.List;

public class Statiune {
    private static Statiune statiune = null;
    private List<Partie> partii = new ArrayList<>();
    private List<Cazare> cazari = new ArrayList<>();

    private Statiune() {
    }

    public static Statiune getInstance() {
        //se verifica daca statiunea a fost initializata
        if (statiune == null) {
            statiune = new Statiune();
        }
        return statiune;
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

