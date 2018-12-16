package com.javacze;

enum Compass {
    NORTH, SOUTH, EAST, WEST;
}

enum Day {
    PONIEDZIALEK("Pn"), WTOREK("Wt"),
    SRODA("Sr"), CZWARTEK("Czw"), PIATEK("Pt"),
    SOBOTA("Sb"), NIEDZIELA("Nd");

    String nazwaSkrocona;

    Day(String nazwaSkrocona) {
        this.nazwaSkrocona = nazwaSkrocona;
    }
}

public class Main {

    public static void main(String[] args) {
        for (Day zmienna : Day.values()) {
            if(zmienna == Day.SOBOTA || zmienna == Day.NIEDZIELA){
                System.out.println("Jest Weekend!");
            }
            System.out.println(zmienna);
        }
        System.out.println("");
        for (Compass zmienna : Compass.values()) {
            System.out.println(zmienna);
        }

    }

}

