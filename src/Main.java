import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int operand1 = scanner.nextInt();
        String operacja = scanner.next();
        int operand2 = scanner.nextInt();

        switch (operacja) {
            case "+":
                int wynik = operand1 + operand2;
                System.out.println(wynik);
                break;
            case "*":
                System.out.println(operand1 * operand2);
                break;
            default:
                System.out.println("Operacja nieobsługiwana");
                break;
        }
    }
}

