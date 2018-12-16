package com.javacze;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        printMany("jeden");
        printMany("jeden","dwa");
        printMany("jeden", "dwa", "trzy");
        printMany();
    }

    private static void printMany(String... strings) {
        for(String string: strings){
            System.out.print(string+" ");
        }
        System.out.println("");
    }
}

