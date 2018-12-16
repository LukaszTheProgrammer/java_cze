package com.javacze;

public class Main {

    public static void main(String[] args) {
        //long startTime = System.currentTimeMillis();
        long suma = 0l;
        for (int i=0; i< 1000; ++i){
            if(i%3==0 || i%5==0){
                suma += i;
            }
        }
        //long endTime = System.currentTimeMillis();
        //long czasRozwiazania = endTime - startTime;
        System.out.println(suma);
        //System.out.println("Całość zajęła "+czasRozwiazania+" ms");
    }
}

