package com.javacze;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] imiona = new String[3];
        for (int i = 0; i < imiona.length; i++) {
            System.out.println("Podaj imię:");
            imiona[i] = scanner.nextLine();
        }

        for (String imie: imiona){
            System.out.println("Witaj, "+imie);
        }
    }
}

