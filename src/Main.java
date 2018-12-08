




public class Main {

    public static void main(String[] args) {
        Punkt p = new Punkt();
        System.out.println(p.x);
        System.out.println(p.y);

        Dummy dummy = new Dummy();
        System.out.println(dummy.b);
        System.out.println(dummy.c);
        System.out.println(dummy.s);
        System.out.println(dummy.d);
        System.out.println(dummy.p);
    }

}
class Dummy {
    boolean b;
    char c;
    String s;
    Punkt p;
    double d;
}
class Punkt {
    int x;
    int y;
}

