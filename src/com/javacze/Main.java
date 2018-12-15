package com.javacze;

public class Main {

    public static void main(String[] args) {
        printMany(1,2,3,4,5,6);
        System.out.println("");
        System.out.println("");
        printOneOrMany(1);
        printOneOrMany(1,2,3,4,5);
    }

    public static void printOneOrMany(int arg0, int... ints){
        System.out.println(arg0);
        printMany(ints);
    }

    public static void printMany(int... ints) {
        for (int i : ints) {
            System.out.println(i);
        }
    }
}

