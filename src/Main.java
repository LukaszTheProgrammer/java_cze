import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int operand1 = scanner.nextInt();
        String operacja = scanner.next();
        int operand2 = scanner.nextInt();

        if (operacja.equals("+")) {
            System.out.println(operand1 + operand2);
        } else if (operacja.equals("*")) {
            System.out.println(operand1 * operand2);
        } else {
            System.out.println("Nieobslugiwane polecenie!");
        }
    }
}

