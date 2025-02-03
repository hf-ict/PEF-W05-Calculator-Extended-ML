public class Calculator {

    private double a;
    private double b;

    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double sum() {
        return this.a + this.b;
    }

    public double mult() {
        return this.a * this.b;
    }

    public double div() {
        if (b == 0) {
            System.out.println("Fehler: Division durch Null ist nicht erlaubt!");
            return Double.NaN; // Not-a-Number als Fehlerwert
        }
        return a / b;
    }

    // Methode zur Modulo-Operation
    public double mod() {
        if (b == 0) {
            System.out.println("Fehler: Modulo durch Null ist nicht erlaubt!");
            return Double.NaN; // Not-a-Number als Fehlerwert
        }
        return a % b;
    }

    public double pow() {
        if (a < 0 && b < 0) {
            System.out.println("Fehler: Negative Werte sind für die Potenzierung nicht erlaubt!");
            return Double.NaN; // Not-a-Number als Fehlerwert
        }
        return Math.pow(a, b);
    }

    // method to call the correct operation, based on desired function
    public double calculate(String operation) {
        switch (operation) {
            case "sum":
                return sum();
            case "mult":
                return mult();
            case "div":
                return div();
            case "mod":
                return mod();
            case "pow":
                return pow();
            default:
                System.out.println("Fehler: Ungültige Operation!");
                return Double.NaN; // Ungültige Operation
        }
    }

}