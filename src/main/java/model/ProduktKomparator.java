package model;

import java.util.Comparator;

public class ProduktKomparator implements Comparator<Produkt> {
    @Override
    public int compare(Produkt o1, Produkt o2) {
        return o1.nazwa.compareTo(o2.nazwa);
    }
}
