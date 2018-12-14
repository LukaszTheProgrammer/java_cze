package com.javacze;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        File plik = new File("/Users/lukasz/plik.txt");
        Scanner scanner = new Scanner(plik);

        while(scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }
    }
}

