package exercises.section3SequentialStructure;

import java.util.Scanner;

// Fazer um programa para ler uma duração de tempo em segundos, daí imprimir na tela esta duração no formato horas:minutos:segundos.

public class Exercise10LengthTime {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the duration in seconds: ");
        int seconds = sc.nextInt();

        int hour = seconds / 3600;
        int secondsRest = seconds % 3600;
        int minutes = secondsRest / 60;
        int secondsFinal = secondsRest % 60;

        System.out.println(hour + ":" + minutes + ":" + secondsFinal);
        sc.close();

    }
}
