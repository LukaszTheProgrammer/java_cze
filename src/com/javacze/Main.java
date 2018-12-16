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

    public static Day of(String p){
        for (Day zmienna : Day.values()){
            if(zmienna.toString().equals(p)){
                return zmienna;
            }
        }
        throw new IllegalArgumentException("Nie znaleziono Day::"+p);
    }
}

public class Main {

    public static void main(String[] args) {
        // Day.valueOf(String) == Day.of(String)
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
        /*
        złe inicjalizacje enum'a typu Day. Możliwe tylko wartości zdefioniowane
        w enumie Day

        Day z = 1;
        Day z2 = "";
        Day z3 = boolean;
        Day z4 = 'a';
        */


        Day zmienna = Day.valueOf("WTOREK");
        Day zmienna2 = Day.of("PIATEK");
        //Day zmienna2 = Day.valueOf("PON"); błąd! nazwa stałej musi się zgadzać 1 do 1 z nazwą podaną do valueOf
        System.out.println(zmienna2);



    }

}

