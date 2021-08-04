package exercises.section5RepetitiveStructures;

import java.util.Scanner;

//Fazer um programa para ler um número natural N (valor máximo: 15),
// e depois calcular e mostrar o fatorial de N.

public class Exercise16Factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();

        int factorial = 1;

        for (int i = n; i > 0; i--) {
            factorial = factorial * i;
        }

        System.out.println("Factorial = " + factorial);
        sc.close();

    }
}
