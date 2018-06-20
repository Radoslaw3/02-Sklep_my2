package model;

import java.io.Serializable;
import java.math.BigDecimal;

public class Produkt implements Comparable<Produkt>, Serializable {
    protected long id;

    @Override
    public int compareTo(Produkt o) {
        if (this.cena.compareTo(o.cena) < 0) {
            return -1;
        } else if (this.cena.compareTo(o.cena) > 0) {
            return 1;
        } else {
            return 0;
        }
    }

    protected String nazwa;
    protected BigDecimal cena;

    private static long generatorId = 0L;

    public Produkt(String nazwa, BigDecimal cena) {
        this.nazwa = nazwa;
        this.cena = cena;
        generatorId++;
        this.id = generatorId;
    }

    public long getId() {
        return id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public BigDecimal getCena() {
        return cena;
    }
}
