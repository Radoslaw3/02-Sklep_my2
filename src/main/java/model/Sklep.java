package model;

import java.io.Serializable;
import java.util.*;

public class Sklep implements Serializable {
    // skladowe
    private Collection<Produkt> produkty;
    private String nazwa;

    public Sklep(String nazwa) {
        this.produkty = new ArrayList<>();
        this.nazwa = nazwa;
    }

    // metody
    public void dodaj(Produkt produkt) {
        produkty.add(produkt);
    }

    public void usun(long id) {
        Iterator<Produkt> iterator = produkty.iterator();
        while(iterator.hasNext()) {
            Produkt produkt = iterator.next();
            if (produkt.getId() == id) {
                iterator.remove();
            }
        }
    }

    public void wyswietl() {
//        for (int i = 0; i < komputery.size(); i++) {
//            komputery.get(i);
//        }

        for (Produkt tmp : produkty) {
            System.out.println(tmp);
        }

    }

    public void wyswietlPosortowaneCenowo() {
        List<Produkt> kopiaProdukty = new ArrayList<>(produkty);
        Collections.sort(kopiaProdukty);
        for (Produkt tmp : kopiaProdukty) {
            System.out.println(tmp);
        }
    }

    public void wyswietlPosortowanePoNazwie() {

        Comparator<Produkt> nazwaKomparator = new Comparator<Produkt>() {
            @Override
            public int compare(Produkt o1, Produkt o2) {
                if (o1.nazwa.compareTo(o2.nazwa) < 0) {
                    return -1;
                } else if (o1.nazwa.compareTo(o2.nazwa) > 0) {
                    return 1;
                } else {
                    return 0;
                }
            }
        };

        Comparator<Produkt> nazwaKomparator2 = new ProduktKomparator();

        List<Produkt> kopiaProdukty = new ArrayList<>(produkty);
        Collections.sort(kopiaProdukty, nazwaKomparator);
        for (Produkt tmp : kopiaProdukty) {
            System.out.println(tmp);
        }
    }
}
