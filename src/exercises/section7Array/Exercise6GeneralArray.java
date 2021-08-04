package exercises.section7Array;

import java.util.Locale;
import java.util.Scanner;

// Ler uma matriz quadrada de ordem N (máximo = 10), contendo números reais. Em seguida, fazer as seguintes ações:
//  a) calcular e imprimir a soma de todos os elementos positivos da matriz.
//  b) fazer a leitura do índice de uma linha da matriz e, daí, imprimir todos os elementos desta linha.
//  c) fazer a leitura do índice de uma coluna da matriz e, daí, imprimir todos os elementos desta coluna.
//  d) imprimir os elementos da diagonal principal da matriz.
//  e) alterar a matriz elevando ao quadrado todos os números negativos da mesma.
// Em seguida imprimir a matriz alterada.

public class Exercise6GeneralArray {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("What is the order of the array: ");
        int n = sc.nextInt();

        double[][] generalArray = new double[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Element [" + i + ", " + j + "]: ");
                generalArray[i][j] = sc.nextDouble();
            }
        }

        double sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(generalArray[i][j] > 0) {
                    sum = sum + generalArray[i][j];
                }
            }
        }

        System.out.printf("\nSum of positives: %.1f\n\n", sum);

        System.out.print("Choose a row: ");
        int row = sc.nextInt();
        System.out.print("Row choose: " );
        for (int j = 0; j < n; j++) {
            System.out.print(generalArray[row][j] + " ");
        }

        System.out.print("\n\nChoose a column: ");
        int column = sc.nextInt();
        System.out.print("Column choose: ");
        for (int i = 0; i < n; i++) {
            System.out.print(generalArray[i][column] + " ");
        }

        System.out.print("\n\nMain diagonal: ");
        for (int i = 0; i < n; i++) {
            System.out.print(generalArray[i][i] + " ");
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(generalArray[i][j] < 0) {
                    generalArray[i][j] = Math.pow(generalArray[i][j], 2);
                }
            }
        }

        System.out.println("\n\nChanged array:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%.1f ", generalArray[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }
}
