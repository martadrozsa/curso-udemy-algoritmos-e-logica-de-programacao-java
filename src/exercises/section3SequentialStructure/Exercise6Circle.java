package exercises.section3SequentialStructure;

import java.util.Locale;
import java.util.Scanner;

// Fazer um programa para ler o valor "r" do raio de um círculo, e depois mostrar o valor da área do círculo com três casas decimais.

public class Exercise6Circle {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value or circle radius: ");
        double circleRadius = sc.nextDouble();

        double area = Math.PI * (Math.pow(circleRadius, 2));

        System.out.printf("\nArea = %.3f", area);
        sc.close();
    }
}
