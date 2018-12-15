package com.javacze;

class Osoba {

    private String imie;
    private String nazwisko;

    Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    @Override
    public String toString() {
        return "Osoba{" + "imie='" + imie + '\''
            + ", nazwisko='" + nazwisko + '\''
            + '}';
    }
}
public class Main {

    public static void main(String[] args) {

        // zmienna ktora mówi o rozmiarze tablic uzytkownicy.length;

        // przyklad odnoszenia sie do poszczegolnych elementów System.out.println(uzytkownicy[i]);


        String[] uzytkownicy = new String[]{"Jan", "Aga", "Zenon", "Maria"};
        for(int i=0 ; i < uzytkownicy.length; ++i){
            System.out.println(uzytkownicy[i]);
        }
        System.out.println("");

        for(int i=uzytkownicy.length-1 ; i >= 0; --i){
            System.out.println(uzytkownicy[i]);
        }
        System.out.println("");

        int [] liczby = new int[]{1,2,45,67,80,34,90,23};
        for(int i=0 ; i < liczby.length; ++i){
            System.out.println(liczby[i]);
        }

        boolean [] bools = new boolean[]{true,false,false};
        for(int i=0 ; i < bools.length; ++i){
            System.out.println(bools[i]);
        }
        System.out.println("");

        Osoba [] ludzie = new Osoba[]{new Osoba("Jan", "Kowalski"), new Osoba("Tomek", "Nowak")};
        for(int i=0 ; i < ludzie.length; ++i){
            System.out.println(ludzie[i]);
        }
    }
}

