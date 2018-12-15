package com.javacze;

public class Main {

    public static void main(String[] args) {

        int[][] macierz = new int[5][5];

        for (int i = 0; i < macierz.length; ++i) {
            for (int k = 0; k < macierz[i].length; ++k) {
                if (i == 2) {
                    macierz[i][k] = 1;
                } else {
                    macierz[i][k] = 0;
                }
                System.out.print(macierz[i][k] + " ");
            }
            System.out.print("\n\t tekst \n");
        }
    }
}

