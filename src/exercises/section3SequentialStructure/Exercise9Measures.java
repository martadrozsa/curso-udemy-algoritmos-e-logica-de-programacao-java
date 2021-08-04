package exercises.section3SequentialStructure;

import java.util.Locale;
import java.util.Scanner;

// Fazer um programa para ler três medidas A, B e C.
// Em seguida, calcular e mostrar (imprimir os dados com quatro casas decimais):
//  a) a área do quadrado que tem lado A
//  b) a área do triângulo retângulo que base A e altura B
//  c) a área do trapézio que tem bases A e B, e altura C

public class Exercise9Measures {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the measure A: ");
        double a = sc.nextDouble();

        System.out.print("Enter the measure B: ");
        double b = sc.nextDouble();

        System.out.print("Enter the measure C: ");
        double c = sc.nextDouble();

        double area = Math.pow(a, 2);
        double areaRightTriangle = (a * b) / 2;
        double trapeze = ((a + b) * c) / 2;

        System.out.printf("\nSquare area %.4f ", area);
        System.out.printf("\nRight triangle area %.4f ", areaRightTriangle);
        System.out.printf("\nTrapeze area %.4f ", trapeze);
        sc.close();
    }
}
