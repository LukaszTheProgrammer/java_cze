




public class Main {

    public static void main(String[] args) {
        Punkt p = new Punkt();
        p.x=15;
        System.out.println(p.x);
        System.out.println(p.y);

        Dummy dummy = new Dummy(); //tworzymy obiekt typu Dummy
        //który posiada 5 pól
        Dummy d2;
        dummy.b = true;
        System.out.println(dummy.b);
        System.out.println(dummy.c);
        System.out.println(dummy.s);
        System.out.println(dummy.d);
        System.out.println(dummy.p);
    }

}

class Dummy {
    boolean b; // false by default
    char c; // 0x0000 by default
    String s; // null by default
    Punkt p; // null by default
    double d; // 0.0 by default
}

class Punkt {
    int x;
    int y;
}

