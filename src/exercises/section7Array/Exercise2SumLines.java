package exercises.section7Array;

import java.util.Locale;
import java.util.Scanner;

// Fazer um programa para ler dois números inteiros M e N (máximo = 10).
// Em seguida, ler uma matriz de M linhas e N colunas contendo números reais.
// Gerar um vetor de modo que cada elemento do vetor seja a soma dos elementos da linha correspondente da matriz. Mostrar o vetor gerado.

public class Exercise2SumLines {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many rows in the array? ");
        int r = sc.nextInt();
        System.out.print("How many columns in the array? ");
        int c = sc.nextInt();

        double[][] sumLines = new double[r][c];
        double[] sum = new double[r];

        for (int i = 0; i < r; i++){
            System.out.printf("Enter elements of the %d° line:\n", i + 1);
            for (int j = 0; j < c; j++) {
                sumLines[i][j] = sc.nextDouble();
            }
        }

        for (int i = 0; i < r; i++) {
            double sumRow = 0;
            for (int j = 0; j < c; j++){
                sumRow = sumRow + sumLines[i][j];
            }
            sum[i] = sumRow;
        }

        System.out.println("Array: ");
        for (int i = 0; i < r; i++) {
            System.out.printf("%.1f\n", sum[i]);
        }

        sc.close();
    }
}
