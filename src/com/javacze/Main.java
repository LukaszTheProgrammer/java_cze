package com.javacze;

public class Main {

    public static void main(String[] args) {
        String[] uzytkownicy = new String[]{"Jan", "Aga", "Zenon", "Maria"};
        String drugiUzytkownik = uzytkownicy[1];

        System.out.println(drugiUzytkownik);
        System.out.println(uzytkownicy[1]);
        System.out.println("");

        drugiUzytkownik = "Beata";
        System.out.println(drugiUzytkownik);
        System.out.println(uzytkownicy[1]);
        System.out.println("");

        uzytkownicy[1] = "Alina";
        System.out.println(drugiUzytkownik);
        System.out.println(uzytkownicy[1]);
        System.out.println("");

    }
}

