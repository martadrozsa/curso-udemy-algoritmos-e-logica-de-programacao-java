package exercises.section6Vectors;

import java.util.Locale;
import java.util.Scanner;

// Fazer um programa para ler um número inteiro N e depois um vetor de N números reais.
// Em seguida, mostrar na tela a média aritmética de todos elementos com três casas decimais.
// Depois mostrar todos os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.

public class Exercise7BelowAverage {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("How many elements will the array have? ");
        int n = sc.nextInt();

        double[] average = new double[n];

        for (int i = 0; i < average.length; i++) {
            System.out.print("Enter a number: ");
            average[i] = sc.nextDouble();
        }

        double sum = 0;
        for (int i = 0; i < average.length; i++) {
            sum = sum + average[i];
        }

        double averageArray = sum / n;
        System.out.printf("Average array: %.3f\n", averageArray);

        for (int i = 0; i < average.length; i++) {
            if (average[i] < averageArray) {
                System.out.println(average[i]);
            }
        }
        sc.close();
    }
}
