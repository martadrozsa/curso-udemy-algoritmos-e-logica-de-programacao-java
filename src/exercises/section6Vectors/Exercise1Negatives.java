package exercises.section6Vectors;

import java.util.Scanner;

// Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros e armazene-os em um vetor.
// Em seguida, mostrar na tela todos os números negativos lidos.

public class Exercise1Negatives {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers will you enter? ");
        int n = sc.nextInt();

        int[] negativeNumbers = new int[n];

        for (int i = 0; i < negativeNumbers.length; i ++) {
            System.out.print("Enter a number: ");
            negativeNumbers[i] = sc.nextInt();
        }

        System.out.println("Negative numbers: ");
        for (int i = 0; i < negativeNumbers.length; i++) {
            if (negativeNumbers[i] < 0){
                System.out.println(negativeNumbers[i]);
            }
        }
        sc.close();
    }
}
