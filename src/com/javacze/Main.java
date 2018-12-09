package com.javacze;

class Punkt {

    private int x;
    private int y;

    Punkt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void przesunX(int przesuniecie) {
        this.x = this.x + przesuniecie;
    }

    @Override
    public String toString() {
        return "x=" + x + ", y=" + y;
    }
}


public class Main {

    public static void main(String[] args) {
        Punkt p = new Punkt(5, 6);
        p.przesunX(10);
        System.out.println(p);
    }
}
