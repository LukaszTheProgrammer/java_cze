import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String polecenie = scanner.nextLine();

        if (polecenie.equals("czas")) {
            System.out.println(new Date());
        } else if (polecenie.equals("newLine")) {
            System.out.println("");
        } else if (polecenie.equals("liczbaLosowa")) {
            long seed = new Date().getTime();
            int x = new Random(seed).nextInt();
            System.out.println(x);
        } else {
            System.out.println("Nieobslugiwane polecenie!");
        }
    }
}

