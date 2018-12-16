package com.javacze;

class Matematyka {

    static int dodaj(int i, int k) {
        return i + k;
    }

    static int dodaj(String i, String k) {
        return Integer.valueOf(i) + Integer.valueOf(k); //Integer.valueOf konwertuje ze Stringa na Integer
    }

    static int dodaj(int[] ints) {
        int suma = 0;
        for(int i: ints){
            suma += i;
        }
        return suma;
    }
}

public class Main {

    public static void main(String[] args) {

        int wynik1 = Matematyka.dodaj(143, 320); // wołane Matematyka.dodaj(int, int)
        int wynik2 = Matematyka.dodaj("32", "64");// wołane Matematyka.dodaj(String,String)
        int wynik3 = Matematyka.dodaj(new int[]{1,2,3,4,5});// wołane Matematyka.dodaj(int[])

        System.out.println(wynik1);
        System.out.println(wynik2);
        System.out.println(wynik3);

    }
}

