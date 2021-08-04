package exercises.section6Vectors;

import java.util.Locale;
import java.util.Scanner;

// Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela o maior número do vetor (supor não haver empates).
// Mostrar também a posição do maior elemento, considerando a primeira posição como 0 (zero).

public class Exercise5HighestPosition {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers will you enter? ");
        int n = sc.nextInt();

        double[] highestValue = new double[n];

        for (int i = 0; i < highestValue.length; i++) {
            System.out.print("Enter a number: ");
            highestValue[i] = sc.nextDouble();
        }
        double highest = 0;
        int position = 0;
        for (int i = 0; i < highestValue.length; i++){
            double currentValue = highestValue[i];
            if (currentValue > highest){
                highest = currentValue;
                position = i;

            }
        }
        System.out.println("Highest value: " + highest);
        System.out.println("Position of the greatest value: " + position);
        sc.close();
    }
}
