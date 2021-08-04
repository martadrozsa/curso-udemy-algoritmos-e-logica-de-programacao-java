package exercises.section3SequentialStructure;

import java.util.Locale;
import java.util.Scanner;

// Fazer um programa para ler as medidas da base e altura de um retângulo.
// Em seguida, mostrar o valor da área, perímetro e diagonal deste retângulo, com quatro casas decimais.

public class Exercise2Rectangle {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base of the rectangle: ");
        double baseRectangle = sc.nextDouble();

        System.out.print("Enter the height of the rectangle: ");
        double heightRectangle = sc.nextDouble();

        double area = baseRectangle * heightRectangle;
        double perimeter = 2 * (baseRectangle + heightRectangle);
        double diagonal = Math.sqrt(Math.pow(baseRectangle, 2) + Math.pow(heightRectangle, 2));

        System.out.printf("\nArea: %.4f", area);
        System.out.printf("\nPerimeter %.4f", perimeter);
        System.out.printf("\nDiagonal %.4f", diagonal);
    }
}
