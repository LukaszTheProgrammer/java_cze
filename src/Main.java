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
        Demo d1 = new Demo();
        System.out.println(Demo.licznik+ " "+d1.x);
        Demo d2 = new Demo();
        System.out.println(Demo.licznik+ " "+d2.x);
        Demo d3 = new Demo();
        System.out.println(Demo.licznik+ " "+d3.x);
        Demo d4 = new Demo();
        System.out.println(Demo.licznik+ " "+d4.x);

    }
}

