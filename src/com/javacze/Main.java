package com.javacze;

public class Main {

    public static void main(String[] args) {

        int[][] macierz1 = new int[3][3];
        int[][] macierz2 = new int[][]{{1,2,3}, {4,5,6}, {7,8,9}};
        int[][] macierz3 = new int[][]{{1,2}, {4,5,6}, {7}};

        System.out.println("Listowanie macierzy1:");
        for (int i=0; i< macierz1.length; ++i){
            System.out.print("Rozmiar wiersza numer "+i+": "+macierz1[i].length+" zawartość: ");
            for(int k=0; k< macierz1[i].length; ++k){
                System.out.print(macierz1[i][k]+" ");
            }
            System.out.println("");
        }
        System.out.println("");

        System.out.println("Listowanie macierzy2:");
        for (int i=0; i< macierz2.length; ++i){
            System.out.print("Rozmiar wiersza numer "+i+": "+macierz2[i].length+" zawartość: ");
            for(int k=0; k< macierz2[i].length; ++k){
                System.out.print(macierz2[i][k]+" ");
            }
            System.out.println("");
        }
        System.out.println("");

        System.out.println("Listowanie macierzy3:");
        for (int i=0; i< macierz3.length; ++i){
            System.out.print("Rozmiar wiersza numer "+i+": "+macierz3[i].length+" zawartość: ");
            for(int k=0; k< macierz3[i].length; ++k){
                System.out.print(macierz3[i][k]+" ");
            }
            System.out.println("");
        }
        System.out.println("");

    }
}

