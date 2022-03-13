package com.ace.ucv.statiune;



import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        System.out.println("##################### cazare #####################");
        Cazare cazare = mapper.readValue(Main.class.getClassLoader().getResource("cazare.json"), Cazare.class);
        System.out.println(cazare);
        System.out.println(cazare.getTuristi());

        System.out.println("##################### partie #####################");
        Partie partie = mapper.readValue(Main.class.getClassLoader().getResource("partie.json"), Partie.class);
        System.out.println(partie);

        System.out.println("##################### monitor #####################");
        Monitor monitor = mapper.readValue(Main.class.getClassLoader().getResource("monitor.json"),Monitor.class);
        System.out.println(monitor);

        System.out.println("##################### persoana #####################");
        Persoana persoana = mapper.readValue(Main.class.getClassLoader().getResource("persoana.json"),Persoana.class);
        System.out.println(persoana);

        System.out.println("##################### sport #####################");
        Sport sport = mapper.readValue(Main.class.getClassLoader().getResource("sport.json"),Sport.class);
        System.out.println(sport);

        System.out.println("##################### statiune #####################");
        Statiune statiune = mapper.readValue(Main.class.getClassLoader().getResource("statiune.json"),Statiune.class);
        System.out.println(statiune);

        System.out.println("##################### studiu #####################");
        Studiu studiu = mapper.readValue(Main.class.getClassLoader().getResource("studiu.json"),Studiu.class);
        System.out.println(studiu);

        System.out.println("##################### turist #####################");
        Turist turist = mapper.readValue(Main.class.getClassLoader().getResource("turist.json"),Turist.class);
        System.out.println(turist);


    }
}
