package com.javacze;

public class Main {

    public static void main(String[] args) {
        rozwiazanieNaiwne(100000000);
        rozwiazanieUlepszone(100000000);
    }

    private static void rozwiazanieNaiwne(int rozmiarZadania) {
        long startTime = System.currentTimeMillis(); // pobiera aktualny czas w milisekundach jako long
        long suma = 0l;
        for (int i=0; i< rozmiarZadania; ++i){
            if(i%3==0 || i%5==0){ // sprawdzamy czy i jest podzielne przez 3 lub 5
                suma += i; // powiększamy liczbę o wartość i
            }
        }
        System.out.println(suma);
        long endTime = System.currentTimeMillis(); // pobiera aktualny czas w milisekundach
        long czasRozwiazania = endTime - startTime; // otrzymujemy czasRozwiązania poprzez odjęcie czasu pobranego
        // na początku zadania od czasu pobranego na końcu zadania
        System.out.println("Całość zajęła "+czasRozwiazania+" ms");
    }

    private static void rozwiazanieUlepszone(int rozmiarZadania) {
        long startTime = System.currentTimeMillis();
        long suma = 0l;
        for (int i=1; (i*3)< rozmiarZadania; ++i){
                suma += i*3;
        }

        for (int i=1; (i*5)< rozmiarZadania; ++i){
            if(!(i%3==0)) {
                suma += i * 5;
            }
        }
        long endTime = System.currentTimeMillis();

        System.out.println(suma);
        long czasRozwiazania = endTime - startTime;
        System.out.println("Całość zajęła "+czasRozwiazania+" ms");
    }
}

