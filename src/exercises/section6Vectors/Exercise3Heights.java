package exercises.section6Vectors;

import java.util.Locale;
import java.util.Scanner;

// Fazer um programa para ler nome, idade e altura de N pessoas.
// Depois, mostrar na tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos, bem como os nomes dessas pessoas caso houver.

public class Exercise3Heights {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers will you enter? ");
        int n = sc.nextInt();

        String[] names = new String[n];
        int[] ages = new int[n];
        double[] heights = new double[n];

        for (int i = 0; i < heights.length; i++) {
            System.out.printf("Enter the data of %d° person:\n", i + 1);
            sc.nextLine();
            System.out.print("Name: ");
            names[i] = sc.nextLine();
            System.out.print("Age: ");
            ages[i] = sc.nextInt();
            System.out.print("Height: ");
            heights[i] = sc.nextDouble();
        }

        double sum = 0;
        for (int i = 0; i < n; i++){
            sum = sum + heights[i];
        }

        double average = sum / n;
        System.out.printf("Average height: %.2f\n", average);

        double less = 0;
        for (int i = 0; i < n; i++) {
            int currentAge = ages[i];
            if (currentAge < 16) {
                less++;
            }
        }
        double percentage = (less / n) * 100;
        System.out.printf("People under 16: %.1f%%\n", percentage);
        sc.close();

        for (int i = 0; i < n; i++) {
            int currentAge = ages[i];
            if (currentAge < 16) {
                System.out.printf("%s\n", names[i]);
            }
        }
        sc.close();
    }
}
