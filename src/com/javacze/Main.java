package com.javacze;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rozmiarTablicy = 5;
        String[] imiona = new String[rozmiarTablicy];
        for (int i = 0; i < rozmiarTablicy; i++) {
            System.out.println("Podaj imię:");
            imiona[i] = scanner.nextLine();
        }

        for (String imie: imiona){
            System.out.println("Witaj, "+imie);
        }
    }
}

