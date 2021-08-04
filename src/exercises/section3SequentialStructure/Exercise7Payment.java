package exercises.section3SequentialStructure;

import java.util.Locale;
import java.util.Scanner;

// Fazer um programa para ler o nome de um(a) funcionário(a), o valor que ele(a) recebe por hora, e a quantidade de horas trabalhadas por ele(a).
// Ao final, mostrar o valor do pagamento do funcionário com uma mensagem explicativa.

public class Exercise7Payment {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Amount paid per hour: ");
        double valueHour = sc.nextDouble();

        System.out.print("Worked hours: ");
        double workedHours = sc.nextDouble();

        double payment = valueHour * workedHours;

        System.out.printf("\nThe payment to %s must be %.2f", name, payment);
        sc.close();
    }
}
