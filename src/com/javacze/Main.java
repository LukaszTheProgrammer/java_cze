package com.javacze;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(new File("/Users/lukasz/liczby_hex.txt"));
        while (scanner.hasNext()) {
            String liczbaHex = scanner.next(); //czytamy kolejne liczby
            Integer liczba = Integer.valueOf(liczbaHex, 16);//konwersja ze Stringa w postaci 16-tkowej do Integera
            System.out.println(liczbaHex + " -> " + liczba);//drukowanie na ekranie wartości liczbowej
            // w systemie 16-tkowym i jej odpowiednika w systemie 10-tnym
        }
    }
}

