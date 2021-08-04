package exercises.section6Vectors;

import java.util.Scanner;

// Faça um programa que leia N números inteiros e armazene-os em um vetor.
// Em seguida, mostre na tela todos os números pares, e também a quantidade de números pares.

public class Exercise4EvenNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers will you enter? ");
        int n = sc.nextInt();

        int[] evenNumbers = new int[n];

        for (int i = 0; i < evenNumbers.length; i++) {
            System.out.print("Enter a number: ");
            evenNumbers[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("Even numbers:");
        int even = 0;
        for (int i = 0; i < evenNumbers.length; i++) {
            int currentAge = evenNumbers[i];
            if (currentAge % 2 ==0) {
                System.out.printf("%d  ", evenNumbers[i]);
                even++;
            }
        }
        System.out.println();
        System.out.println("Amount of even numbers: " + even);
        sc.close();
    }
}
