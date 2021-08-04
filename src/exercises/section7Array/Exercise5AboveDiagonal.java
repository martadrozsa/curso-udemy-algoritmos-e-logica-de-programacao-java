package exercises.section7Array;

import java.util.Scanner;

// Ler um inteiro N (máximo = 10) e uma matriz quadrada de ordem N contendo números inteiros.
// Mostrar a soma dos elementos acima da diagonal principal.
// Um exemplo de números acima da diagonal principal é mostrado ao lado (no caso as células com fundo cinza).

public class Exercise5AboveDiagonal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("What is the order of the array: ");
        int n = sc.nextInt();

        int[][] aboveDiagonal = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Element [" + i + ", " + j + "]: ");
                aboveDiagonal[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i < j) {
                    sum = sum + aboveDiagonal[i][j];
                }
            }
        }

        System.out.println("Sum of the elements above the array diagonal: " + sum);
        sc.close();
    }
}
