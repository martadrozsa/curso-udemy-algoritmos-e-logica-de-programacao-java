package exercises.section5RepetitiveStructures;

import java.util.Scanner;

// Ler um número inteiro N, daí mostrar na tela a tabuada de N para 1 a 10.

public class Exercise9MultiplicationTable {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("For which number do you want the multiplication table? ");
        int num = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            int multiplication = num * i;
            System.out.println(num + " x " + i + " = " + multiplication);
        }
    }
}
