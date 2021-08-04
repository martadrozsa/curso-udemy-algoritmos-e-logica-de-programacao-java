package exercises.section4ConditionalStructure;

import java.util.Locale;
import java.util.Scanner;

// Fazer um programa para ler as duas notas que um aluno obteve no primeiro e segundo semestres de uma disciplina anual.
// Em seguida, mostrar a nota final que o aluno obteve (com uma casa decimal) no ano juntamente com um texto explicativo.
// Caso a nota final do aluno seja inferior a 60.00, mostrar a mensagem "REPROVADO".

public class Exercise1Grade {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first grade: ");
        double grade1 = sc.nextDouble();

        System.out.print("Enter the second grade: ");
        double grade2 = sc.nextDouble();

        double finalGrade = grade1 + grade2;

        if(finalGrade > 60.00){
            System.out.printf("\nFinal grade %.2f", finalGrade);
        }else{
            System.out.printf("\nFinal grade %.2f", finalGrade);
            System.out.println("\nFailed");
        }
        sc.close();
    }
}
