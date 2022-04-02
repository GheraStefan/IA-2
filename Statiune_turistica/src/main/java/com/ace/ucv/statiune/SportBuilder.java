package com.ace.ucv.statiune;

public class SportBuilder {

    private String nume;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

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

    public Sport build() {
        if (nume == null) {
            throw new RuntimeException("Nume is not set.");
        }

        Sport sport = new Sport();
        sport.setNume(nume);

        return sport;
    }
}