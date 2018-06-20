package model;

import java.math.BigDecimal;

public class Dron extends Produkt {

    private double zasieg;
    private boolean czyMaKamere;

    public Dron(String nazwa, BigDecimal cena, double zasieg, boolean czyMaKamere) {
        super(nazwa, cena);
        this.zasieg = zasieg;
        this.czyMaKamere = czyMaKamere;
    }

    public double getZasieg() {
        return zasieg;
    }

    public boolean isCzyMaKamere() {
        return czyMaKamere;
    }

    @Override
    public String toString() {
        return "Dron{" +
                "zasieg=" + zasieg +
                ", czyMaKamere=" + czyMaKamere +
                ", id=" + id +
                ", nazwa='" + nazwa + '\'' +
                ", cena=" + cena +
                '}';
    }
}
