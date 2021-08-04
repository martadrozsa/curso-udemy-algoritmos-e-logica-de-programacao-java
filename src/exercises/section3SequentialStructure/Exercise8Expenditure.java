package exercises.section3SequentialStructure;

import java.util.Locale;
import java.util.Scanner;

// Fazer um programa para ler a distância total (em km) percorrida por um carro, bem como o total de combustível gasto por este carro ao percorrer tal distância.
// Seu programa deve mostrar o consumo médio do carro, com três casas decimais.

public class Exercise8Expenditure {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Travelled distance: ");
        double distance = sc.nextDouble();

        System.out.print("Spent fuel: ");
        double fuel = sc.nextDouble();

        double averageConsumption = distance / fuel;

        System.out.printf("\nAverage consumption %.3f ", averageConsumption);

    }
}
