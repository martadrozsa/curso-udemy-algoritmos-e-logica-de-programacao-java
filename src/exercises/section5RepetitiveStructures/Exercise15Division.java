package exercises.section5RepetitiveStructures;

import java.util.Locale;
import java.util.Scanner;

// Escreva um algoritmo que leia dois números e imprima o resultado da divisão do primeiro pelo segundo.
// Caso não for possível, mostre a mensagem “DIVISAO IMPOSSIVEL”.

public class Exercise15Division {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many cases will you enter? ");
        int x = sc.nextInt();

        double division = 0;
        for (int i = 0; i < x; i ++) {
            System.out.print("Enter the numerator: ");
            int numerator = sc.nextInt();
            System.out.print("Enter the denominator: ");
            double denominator = sc.nextDouble();

            if (denominator == 0) {
                System.out.println("Impossible division");
            }
            else {
                division = numerator / denominator;
                System.out.printf("Division = %.2f\n", division);
            }
        }
    }
}
