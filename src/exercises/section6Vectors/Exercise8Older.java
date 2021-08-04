package exercises.section6Vectors;

import java.util.Scanner;

// Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades.
// Os nomes devem ser armazenados em um vetor, e as idades em um outro vetor.
// Depois, mostrar na tela o nome da pessoa mais velha.

public class Exercise8Older {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many people will you enter: ");
        int n = sc.nextInt();

        int[] ages = new int[n];
        String[] names = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Enter the data of %d° person:\n", i + 1);
            sc.nextLine();
            System.out.print("Name: ");
            names[i] = sc.nextLine();
            System.out.print("Age: ");
            ages[i] = sc.nextInt();
        }

        int older = 0;
        int position = 0;
        for (int i = 0; i < n; i++) {
            if (ages[i] > older) {
                older = ages[i];
                position = i;
            }
        }
        System.out.println("Older person: " + names[position]);
    }
}
