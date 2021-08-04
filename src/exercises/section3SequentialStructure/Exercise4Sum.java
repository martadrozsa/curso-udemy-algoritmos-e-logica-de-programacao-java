package exercises.section3SequentialStructure;

import java.util.Scanner;

// Fazer um programa para ler dois valores inteiros X e Y, e depois mostrar na tela o valor da soma destes números.

public class Exercise4Sum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of X: ");
        int x = sc.nextInt();

        System.out.print("Enter the value of Y: ");
        int y = sc.nextInt();

        int sum = x + y;

        System.out.println("Sum = " + sum);
        sc.close();
    }
}
