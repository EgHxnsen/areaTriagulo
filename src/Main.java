import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do lado A: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o tamanho do lado B: ");
        double b = scanner.nextDouble();

        System.out.print("Digite o tamanho de C: ");
        double c = scanner.nextDouble();

        double area = areaDoTriangulo(a, b, c);
        System.out.println("A area do triangulo é: " + area);
    }

    public static double areaDoTriangulo(double a, double b, double c) {
        double s = (a + b + c) ;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}