import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Geben Sie den Wert für a ein: ");
        double a = scanner.nextDouble();
        System.out.print("Geben Sie den Wert für b ein: ");
        double b = scanner.nextDouble();
        scanner.nextLine();

        // Eingabe der Operation
        System.out.print("Geben Sie die gewünschte Operation ein (sum, mult, div, mod, pow): ");
        String operation = scanner.nextLine();

        Calculator calc = new Calculator(a, b);
        double result = calc.calculate(operation);

        System.out.print("Möchten Sie das Ergebnis runden? (ja/nein): ");
        String round = scanner.nextLine();

        if (round.equals("ja")) {
            System.out.println("Gerundetes Ergebnis: " + Math.round(result));
        } else if (round.equals("nein")) {
            System.out.println("Exaktes Ergebnis: " + result);
        } else {
            System.out.println("Ungültige Eingabe");
        }
    }
}
