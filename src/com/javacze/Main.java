package com.javacze;

public class Main {

    public static void main(String[] args) {
        int licznik = -1;

        while(licznik < 0) {
            System.out.println("Hello: "+licznik);
            licznik = licznik - 1; //licznik--;
            //licznik = licznik +1 == licznik++
        }
    }
}

