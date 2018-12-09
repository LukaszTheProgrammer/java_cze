class Demo {

    static int licznik = 0;
    int x = 0;

    public Demo() {
        licznik++;
        x++;
    }
}

public class Main {

    public static void main(String[] args) {
        // 2 -> 4
        // 3 -> 6
        // 4 -> 8

        int wynik = podwajaj(16);  // 32
        System.out.println(wynik);
    }

    static int podwajaj(int liczba){
        return liczba * 2;
    }


}

