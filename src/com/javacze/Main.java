package com.javacze;

public class Main {

    public static void main(String[] args) {
        int licznik = -1;

        do{
            System.out.println("Hello: "+licznik);
            licznik = licznik - 1; //licznik--;
        }while(licznik > 0);
    }
}

