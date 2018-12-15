package com.javacze;

interface Pojazd {

    void przyspiesz();

    void hamuj();
}

class Bmw implements Pojazd {

    private static final int przyspieszenie = 10;
    private static final int topSpeed = 250;

    private int predkosc = 0;

    @Override
    public void przyspiesz() {
        if (predkosc < topSpeed) {
            predkosc += przyspieszenie;
        }
    }

    @Override
    public void hamuj() {
        if (predkosc > 0) {
            predkosc -= przyspieszenie;
        }
    }

    @Override
    public String toString() {
        return "Bmw{" +
            "predkosc=" + predkosc +
            '}';
    }
}

class Rower implements Pojazd {

    private static final int przyspieszenie = 2;
    private static final int topSpeed = 50;
    private static final int wspolczynnikHamowania = 3;

    private int predkosc = 0;

    @Override
    public void przyspiesz() {
        if (predkosc < topSpeed) {
            predkosc += przyspieszenie;
        }
    }

    @Override
    public void hamuj() {
        if (predkosc > 0) {
            predkosc -= wspolczynnikHamowania;
        }
    }

    @Override
    public String toString() {
        return "Rower{" +
            "predkosc=" + predkosc +
            '}';
    }
}

public class Main {

    public static void main(String[] args) {
        Pojazd bmw = new Bmw();
        Pojazd rower = new Rower();

        symuluj(bmw, rower);
    }

    private static void symuluj(Pojazd... pojazdy) {

        for (int i = 0; i < 5; i++) {
            for (Pojazd pojazd : pojazdy) {
                pojazd.przyspiesz();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (Pojazd pojazd : pojazdy) {
                pojazd.hamuj();
            }
        }

        for (Pojazd pojazd: pojazdy){
            System.out.println(pojazd);
        }
    }
}

