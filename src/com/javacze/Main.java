package com.javacze;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        File plik = new File("/Users/lukasz/do_korekty.txt");
        Scanner scanner = new Scanner(plik);
        PrintWriter pw = new PrintWriter("/Users/lukasz/poprawiony.txt");
        while(scanner.hasNext()){  // zwraca true jeśli w buforze danych znajdują
            // się dane
            String line = scanner.nextLine().trim(); //czytamy linię z pliku
            // i wycinamy z niej wiodące i kończące białe znaki
            String firstChar = line.substring(0,1); //zwracamy String będący pierwszym
            // znakiem
            //toUpperCase zwraca napis w którym wszystkie znaki są zamienione na
            // ich duże odpowiedniki
            //w rezultacie dodajemy pierwszy znak zamieniony na duży do reszty linii
            String res = firstChar.toUpperCase() + line.substring(1, line.length());
            if(!res.endsWith(".")){ //jeśli napis nie kończy się kropką
                res = res + "."; //dodajemy kropkę
            }
            pw.println(res);
            System.out.println(res);
        }
        pw.close();
        scanner.close();
    }

}

