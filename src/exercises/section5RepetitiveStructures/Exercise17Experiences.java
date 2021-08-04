package exercises.section5RepetitiveStructures;

import java.util.Locale;
import java.util.Scanner;

// Maria acabou de iniciar seu curso de graduação na faculdade de medicina e precisa de sua ajuda para organizar os experimentos de um laboratório o qual ela é responsável.
// Ela quer saber no final do ano, quantas cobaias foram utilizadas no laboratório e o percentual de cada tipo de cobaia utilizada.
// Este laboratório em especial utiliza três tipos de cobaias: sapos, ratos e coelhos.
// Para obter estas informações, ela sabe exatamente o número de experimentos que foram realizados, o tipo de cobaia utilizada e a quantidade de cobaias utilizadas em cada experimento.
// Faça um programa que leia um valor inteiro N que indica os vários casos de teste que vem a seguir.
// Cada caso de teste contém um inteiro que representa a quantidade de cobaias utilizadas e uma letra ('C', 'R' ou 'S'), indicando o tipo de cobaia (R: Rato S: Sapo C: Coelho).
// Apresente o total de cobaias utilizadas, o total de cada tipo de cobaia utilizada e o percentual de cada uma em relação ao total de cobaias utilizadas,
// sendo que o percentual deve ser apresentado com dois dígitos após o ponto.

public class Exercise17Experiences {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many test cases will you enter? ");
        int n = sc.nextInt();

        char typeSubjects = '\n';
        int subjectsNumber = 0;
        int typeRabbit = 0;
        int typeMouse = 0;
        int typeFrog = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Number of research subjects: ");
            subjectsNumber = sc.nextInt();
            System.out.print("Type of research subjects: ");
            typeSubjects = sc.next().charAt(0);

            if (typeSubjects == 'R') {
                typeRabbit = typeRabbit + subjectsNumber;
            }
            else if (typeSubjects == 'M') {
                typeMouse = typeMouse + subjectsNumber;
            }
            else if (typeSubjects == 'F') {
                typeFrog = typeFrog + subjectsNumber;
            }
        }

        int totalSubjects = typeRabbit + typeMouse + typeFrog;
        double percentageRabbit = ((double)typeRabbit / totalSubjects) * 100;
        double percentageMouse = ((double)typeMouse / totalSubjects) * 100;
        double percentageFrog = ((double)typeFrog/ totalSubjects) * 100;

        System.out.println("\nFinal Report:");
        System.out.printf("Total: %d research subjects\n", totalSubjects);
        System.out.printf("Total rabbits: %d\n", typeRabbit);
        System.out.printf("Total mice: %d\n", typeMouse);
        System.out.printf("Total frogs: %d\n", typeFrog);
        System.out.printf("Percentage of rabbits: %.2f\n", percentageRabbit);
        System.out.printf("Percentage of mice: %.2f\n", percentageMouse);
        System.out.printf("Percentage of frogs: %.2f\n", percentageFrog);

        sc.close();
    }
}
