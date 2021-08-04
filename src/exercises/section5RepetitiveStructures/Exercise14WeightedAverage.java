package exercises.section5RepetitiveStructures;

import java.util.Locale;
import java.util.Scanner;

// Leia um valor inteiro N, que representa o número de casos de teste que vem a seguir.
// Cada caso de teste consiste de 3 valores reais, para os quais você deverá calcular e mostrar a média ponderada, sendo
// que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5.
// Vale lembrar que a média ponderada é a soma de todos os valores multiplicados pelo seu respectivo peso, dividida pela soma dos pesos.

public class Exercise14WeightedAverage {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many cases will you enter? ");
        int x = sc.nextInt();

        double media = 0;
        for (int i = 0; i < x; i++) {
            System.out.println("Enter three numbers: ");
            double num1 = sc.nextDouble();
            double num2 = sc.nextDouble();
            double num3 = sc.nextDouble();
            media = ((num1 * 2) + (num2 * 3) + (num3 * 5)) / (2 + 3 + 5);
            System.out.printf("Average = %.1f\n", media);
        }
        sc.close();
    }
}
