package com.javacze;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        File plik = new File("/Users/lukasz/plik.txt");
        Scanner scanner = new Scanner(plik);

        while(scanner.hasNext()){  // zwraca true jeśli w buforze danych znajdują się dane
            System.out.println(scanner.nextLine());
        }
    }
}

