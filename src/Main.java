
public class Main {

    public static void main(String[] args) {
        int a = Matematyka.wartoscBezwzgledna(120);
        int b = Matematyka.wartoscBezwzgledna(-300);
        int c = Matematyka.wartoscBezwzgledna(-500);

        System.out.println(a); // 120
        System.out.println(b); // 300
        System.out.println(c); // 500

        boolean nieparzysta = Matematyka.czyParzysta(123);
        boolean parzysta = Matematyka.czyParzysta(250);

        System.out.println(nieparzysta); // false
        System.out.println(parzysta);  // true

    }
}

