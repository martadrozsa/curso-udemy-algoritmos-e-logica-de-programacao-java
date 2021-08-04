package exercises.section6Vectors;

import java.util.Locale;
import java.util.Scanner;

// Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
//- Imprimir todos os elementos do vetor
//- Mostrar na tela a soma e a média dos elementos do vetor

public class Exercise2ArraySum {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers will you enter? ");
        int n = sc.nextInt();

        double[] sumNumbers = new double[n];

        for (int i = 0; i < sumNumbers.length; i++) {
            System.out.print("Enter a number: ");
            sumNumbers[i] = sc.nextDouble();
        }
        System.out.println();
        System.out.println("Values = ");
        for (int i = 0; i < sumNumbers.length; i ++) {
            System.out.printf("%.1f ", sumNumbers[i]);
        }
        System.out.println();

        double sum = 0;
        for (int i = 0; i < sumNumbers.length; i++) {
            sum = sum + sumNumbers[i];
        }
        System.out.printf("Sum = %.2f\n", sum);

        double average = sum / n;
        System.out.printf("Average = %.2f\n", average);

        sc.close();
    }
}
