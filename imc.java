import java.util.Scanner;

public class CalculadoraIMC {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su peso en kilogramos: ");
        double peso = scanner.nextDouble();

        System.out.print("Ingrese su estatura en metros: ");
        double estatura = scanner.nextDouble();

        double imc = calcularIMC(peso, estatura);

        System.out.println("Su índice de masa corporal (IMC) es: " + imc);

        scanner.close();
    }

    // para calcular el IMC
    public static double calcularIMC(double peso, double estatura) {
        return peso / (estatura * estatura);
    }
}
