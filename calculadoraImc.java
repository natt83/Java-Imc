import java.util.Scanner;

    // Método para clasificar el IMC
    public static void clasificarIMC(double imc) {
        if (imc < 18.5) {
            System.out.println("Clasificación: Bajo peso");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Clasificación: Peso normal");
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.println("Clasificación: Sobrepeso");
        } else {
            System.out.println("Clasificación: Obesidad");
        }
    }

