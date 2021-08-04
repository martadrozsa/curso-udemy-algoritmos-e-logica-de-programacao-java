package exercises.section6Vectors;

import java.util.Scanner;

// Fazer um programa para ler um vetor de N números inteiros.
// Em seguida, mostrar na tela a média aritmética somente dos números pares lidos, com uma casa decimal.
// Se nenhum número par for digitado, mostrar a mensagem "NENHUM NUMERO PAR"

public class Exercise8AverageEven {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many elements will the array have? ");
        int n = sc.nextInt();

        int[] averageEven = new int[n];

        for (int i = 0; i < averageEven.length; i ++) {
            System.out.print("Enter a number: ");
            averageEven[i] = sc.nextInt();
        }
        int sum = 0;
        int even = 0;
        for (int i = 0; i < averageEven.length; i++) {
            if (averageEven[i] % 2 == 0) {
                sum = sum + averageEven[i];
                even++;
            }
        }

        double average;
        if (even == 0) {
            System.out.println("No even number");
        }
        else {
            average = (double)sum / even;
            System.out.println("Average even: " + average);
        }
        sc.close();
    }
}
