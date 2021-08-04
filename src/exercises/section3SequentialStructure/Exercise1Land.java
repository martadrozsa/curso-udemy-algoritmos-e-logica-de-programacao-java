package exercises.section3SequentialStructure;

import java.util.Scanner;
import java.util.Locale;

// Fazer um programa para ler as medidas da largura e comprimento de um terreno retangular com uma casa decimal, bem como o valor do metro quadrado do terreno com duas casas decimais.
// Em seguida, o programa deve mostrar o valor da área do terreno, bem como o valor do preço do terreno, ambos com duas casas decimais.

public class Exercise1Land {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the width of the land: ");
        double width = sc.nextDouble();

        System.out.print("Enter the length of the land: ");
        double length = sc.nextDouble();

        System.out.print("Enter the value of the square meter: ");
        double valueSquareMeter = sc.nextDouble();

        double area = width * length;
        double priceLand = area * valueSquareMeter;

        System.out.printf("\nLand area: %.2f", area);
        System.out.printf("\nLand price: %.2f", priceLand);

        sc.close();

    }
}
