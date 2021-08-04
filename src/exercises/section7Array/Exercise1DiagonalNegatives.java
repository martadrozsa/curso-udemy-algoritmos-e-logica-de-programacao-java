package exercises.section7Array;

import java.util.Scanner;

// Fazer um programa para ler um número inteiro N (máximo = 10) e uma matriz quadrada de ordem N contendo números inteiros.
// Em seguida, mostrar a diagonal principal e a quantidade de valores negativos da matriz.

public class Exercise1DiagonalNegatives {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("What is the order of the array: ");
        int n = sc.nextInt();

        int[][] negatives = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Element [" + i + ", " + j + "]: ");
                negatives[i][j] = sc.nextInt();
            }
        }

        System.out.println("Main diagonal:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
            }
            System.out.print(negatives[i][i] + " ");
        }

        System.out.println();
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (negatives[i][j] < 0) {
                    count++;
                }
            }
        }
        System.out.println("Number of negatives: " + count);
        sc.close();
    }
}
