package exercises.section5RepetitiveStructures;

import java.util.Locale;
import java.util.Scanner;

// Faça um programa que leia as notas referentes às duas avaliações de um aluno.
// Calcule e imprima a média semestral.
// Faça com que o algoritmo só aceite notas válidas (uma nota válida deve pertencer ao intervalo [0,10]).
// Cada nota deve ser validada separadamente.

public class Exercise6GradeValidation {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first grade: ");
        double grade1 = sc.nextDouble();

        while (grade1 < 0 || grade1 > 10){
            System.out.println("Invalid grade. Try again... ");
            grade1 = sc.nextDouble();
        }

        System.out.print("Enter the second grade: ");
        double grade2 = sc.nextDouble();

        while (grade2 < 0 || grade2 > 10){
            System.out.println("Invalid grade. Try again... ");
            grade2 = sc.nextDouble();
        }

        double media = (grade1 + grade2) / 2;
        System.out.printf("Grade = %.2f\n", media);
        sc.close();
    }
}
