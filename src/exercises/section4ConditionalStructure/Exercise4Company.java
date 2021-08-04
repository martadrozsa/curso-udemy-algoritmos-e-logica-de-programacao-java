package exercises.section4ConditionalStructure;

import java.util.Locale;
import java.util.Scanner;

// Uma operadora de telefonia cobra R$ 50.00 por um plano básico que dá direito a 100 minutos de telefone.
// Cada minuto que exceder a franquia de 100 minutos custa R$ 2.00.
// Fazer um programa para ler a quantidade de minutos que uma pessoa consumiu, daí mostrar o valor a ser pago.

public class Exercise4Company {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of minutes: ");
        double numberMinutes = sc.nextDouble();

        double basicPlan = 50.00;

        if(numberMinutes > 100){
            double exceedingMinutes = ((numberMinutes - 100) * 2.00) + basicPlan;
            System.out.printf("Amount to pay %.2f", exceedingMinutes);
        }else{
            System.out.printf("Amount to pay %.2f", basicPlan);
        }
        sc.close();
    }
}
