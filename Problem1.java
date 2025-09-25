package mypackage;
import java.util.Scanner;
public class Problem1 {
    double a, b;
    Problem1(double a, double b) {
        this.a = a;
        this.b = b;
    }
    double calculate(String op) {
        return switch (op) {
            case "addition" -> a + b;
            case "subtraction" -> a - b;
            case "multiplication" -> a * b;
            case "division" -> (b != 0) ? a / b : 0;
            default -> Double.NaN;
        };
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a: ");
        double a = sc.nextDouble();
        System.out.print("b: ");
        double b = sc.nextDouble();
        System.out.print("operation(addition/subtraction/multiplication/division): ");
        String op = sc.next();
        Problem1 calc = new Problem1(a, b);
        double result = calc.calculate(op);

        System.out.println(Double.isNaN(result) ? "Invalid op" : result);
    }
}

