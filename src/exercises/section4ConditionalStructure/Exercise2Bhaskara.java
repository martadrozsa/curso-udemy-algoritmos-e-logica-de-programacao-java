package exercises.section4ConditionalStructure;

import java.util.Locale;
import java.util.Scanner;

// Fazer um programa para ler os três coeficientes de uma equação do segundo grau.
// Usando a fórmula de Baskara, calcular e mostrar os valores das raízes x1 e x2 da equação com quatro casas decimais.
// Se a equação não possuir raízes reais, mostrar uma mensagem.

public class Exercise2Bhaskara {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the coefficient A: ");
        double coefficientA = sc.nextDouble();

        System.out.print("Enter the coefficient B: ");
        double coefficientB = sc.nextDouble();

        System.out.print("Enter the coefficient C: ");
        double coefficientC = sc.nextDouble();

        double delta = (Math.pow(coefficientB, 2) - (4 * coefficientA * coefficientC));


        if(delta > 0){
            double root1 = ((- coefficientB) + Math.sqrt(delta)) / (2 * coefficientA);
            double root2 = ((- coefficientB) - Math.sqrt(delta)) / (2 * coefficientA);
            System.out.printf("\nX1 = %.4f ", root1);
            System.out.printf("\nX2 = %.4f ", root2);
        }else{
            System.out.println("This equation has no real roots");
        }

        sc.close();
    }
}
