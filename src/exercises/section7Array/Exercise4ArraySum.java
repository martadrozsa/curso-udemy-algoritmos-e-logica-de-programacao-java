package exercises.section7Array;

import java.util.Scanner;

// Fazer um programa para ler duas matrizes de números inteiros A e B, contendo de M linhas e N colunas cada (M e N máximo = 10).
// Depois, gerar uma terceira matriz C onde cada elemento desta é a soma dos elementos correspondentes das matrizes originais. Imprimir na tela a matriz gerada.

public class Exercise4ArraySum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many rows in the array? ");
        int r = sc.nextInt();
        System.out.print("How many columns in the array? ");
        int c = sc.nextInt();

        int[][] sumArrayA = new int[r][c];
        int[][] sumArrayB = new int[r][c];
        int[][] sumArrayC = new int[r][c];

        System.out.println("Enter elements of array A:");
        for (int i = 0; i < r; i++){
            for (int j = 0; j < c; j++) {
                System.out.print("Element [" + i + ", " + j + "]: ");
                sumArrayA[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of array B:");
        for (int i = 0; i < r; i++){
            for (int j = 0; j < c; j++) {
                System.out.print("Element [" + i + ", " + j + "]: ");
                sumArrayB[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                sumArrayC[i][j] = sumArrayA[i][j] + sumArrayB[i][j];
            }
        }

        System.out.println("Sum array:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.printf("%d ", sumArrayC[i][j]);
            }
            System.out.println();
        }
        sc.close();
    }
}
