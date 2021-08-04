package exercises.section6Vectors;

import java.util.Locale;
import java.util.Scanner;

// Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor.
// Depois, imprimir os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou igual a 6.0 (seis).

public class Exercise9Approved {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc  = new Scanner(System.in);
        System.out.print("How many students will you enter: ");
        int n = sc.nextInt();

        double[] grade1 = new double[n];
        double[] grade2 = new double[n];
        String[] names = new String[n];


        for (int i = 0; i < n; i++) {
            System.out.printf("Enter name, first grade and second grade of %d° student:\n", i + 1);
            sc.nextLine();
            names[i] = sc.nextLine();
            grade1[i] = sc.nextDouble();
            grade2[i] = sc.nextDouble();
        }
        System.out.println("Approved students: ");
        int position = 0;
        for (int i = 0; i < n; i++) {
            double average = (grade1[i] + grade2[i]) / 2;
            position = i;
            if (average >= 6.0) {
                System.out.println(names[position]);
            }
        }
        sc.close();
    }
}
