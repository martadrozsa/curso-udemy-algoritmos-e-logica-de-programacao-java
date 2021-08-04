package exercises.section6Vectors;

import java.util.Scanner;

// Faça um programa para ler dois vetores A e B, contendo N elementos cada.
// Em seguida, gere um terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B.
// Imprima o vetor C gerado.

public class Exercise6ArraysSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many values will each array have?? ");
        int n = sc.nextInt();

        int[] vectorA = new int[n];
        int[] vectorB = new int[n];
        int[] vectorC = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the values of array A: ");
            vectorA[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the values of array B: ");
            vectorB[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            vectorC[i] = vectorA[i] + vectorB[i];
        }
        System.out.println("Resulting array:");

        for (int i = 0; i < vectorC.length; i++) {
            System.out.printf("%d\n", vectorC[i]);
        }

        sc.close();
    }
}
