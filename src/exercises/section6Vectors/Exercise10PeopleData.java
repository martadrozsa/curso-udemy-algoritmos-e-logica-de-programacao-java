package exercises.section6Vectors;

import java.util.Locale;
import java.util.Scanner;

// Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas.
// Fazer um programa que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número de homens.

public class Exercise10PeopleData {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("How many people will you enter: ");
        int n = sc.nextInt();

        double[] height = new double[n];
        char[] gender = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Enter the height of %d° person:\n", i + 1);
            height[i] = sc.nextDouble();
            System.out.printf("Enter the gender of %d° person:\n", i + 1);
            gender[i] = sc.next().charAt(0);
        }

        double highestHeight = height[0];
        double shortestHeight = height[0];
        for (int i = 0; i < n; i++) {
            double currentHighestHeight = height[i];
            if (currentHighestHeight > highestHeight ) {
                highestHeight = currentHighestHeight;
            }
            double currentShortestHeight = height[i];
            if (currentShortestHeight < shortestHeight ) {
                shortestHeight = currentShortestHeight;
            }
        }
        int feminineGender = 0;
        int maleGender = 0;
        double sumFeminine = 0;
        for (int i = 0; i < n; i++) {
            if (gender[i] == 'F') {
                sumFeminine = sumFeminine + height[i];
                feminineGender++;
            }
            else {
                maleGender++;
            }
        }

        double average = sumFeminine / feminineGender;

        System.out.println("Highest Height: " + highestHeight);
        System.out.println("Shortest Height: " + shortestHeight);
        System.out.printf("Average height of women: %.2f\n", average);
        System.out.println("Number of man: " + maleGender);

        sc.close();
    }
}
