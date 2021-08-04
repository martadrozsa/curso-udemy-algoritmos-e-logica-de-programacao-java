package exercises.section7Array;

import java.util.Scanner;

// Ler dois números M e N (máximo = 10), e depois ler uma matriz MxN de números inteiros, conforme exemplo.
// Em seguida, mostrar na tela somente os números negativos da matriz.

public class Exercise3EachRow {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("What is the order of the array: ");
        int n = sc.nextInt();

        int[][] largestElement = new int[n][n];
        int [] largestRow = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Element [" + i + ", " + j + "]: ");
                largestElement[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            int largest = largestElement[i][0];
            for (int j = 0; j < n; j++) {
                if (largestElement[i][j] > largest) {
                    largest = largestElement[i][j];
                }
                largestRow[i] = largest;
            }
        }

        System.out.println("Largest element of each row: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d\n", largestRow[i]);
        }

        sc.close();
    }
}
