import java.util.Scanner;

public class calculadoraImc {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Su peso en kg: ");
        double peso = scanner.nextDouble();

        System.out.print("Su estatura en m: ");
        double estatura = scanner.nextDouble();
        double imc = calcularIMC(peso, estatura);

        String categoria = determinarCategoriaIMC(imc);

        
        System.out.println("Su IMC es: " + imc);
        System.out.println("Categoría de peso: " + categoria);


        scanner.close();
    }

    
    private static double calcularIMC(double peso, double estatura) {
        return peso / (estatura * estatura);
    }

        private static String determinarCategoriaIMC(double imc) {
        if (imc < 18.5) {
            return "Peso insuficiente";
        } else if (imc >= 18.5 && imc <= 24.9) {
            return "Peso normal o saludable";
        } else if (imc >= 25.0 && imc <= 29.9) {
            return "Sobrepeso";
        } else {
            return "Obesidad";
        }
    }
}


