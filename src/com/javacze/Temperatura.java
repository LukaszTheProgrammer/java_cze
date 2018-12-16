package com.javacze;

public class Temperatura {
    private double wartosc;
    private JednostkiTemperatury jedostka;

    public Temperatura(double wartosc, JednostkiTemperatury jedostka) {
        this.wartosc = wartosc;
        this.jedostka = jedostka;
    }

    public JednostkiTemperatury getJednostka() {
        return jedostka;
    }

    public double geWartosc() {
        return wartosc;
    }

    @Override
    public String toString() {
        return ""+wartosc+" "+jedostka;
    }
}
