package exercises.section4ConditionalStructure;

import java.util.Locale;
import java.util.Scanner;

// Deseja-se converter uma medida de temperatura da escala Celsius para Fahrenheit ou vice-versa.
// Para isso, você deve construir um programa que leia a letra "C" ou "F" indicando em qual escala vai ser informada uma temperatura.
// Em seguida o programa deve mostrar a temperatura na outra escala com duas casas decimais.

public class Exercise8Temperature {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Select the scale for the temperature (C/F): ");
        char scale = sc.next().charAt(0);

        if(scale == 'F'){
            System.out.print("Enter the temperature in Fahrenheit: ");
            double fahrenheit = sc.nextDouble();
            double celsius = 5.0/9.0 * (fahrenheit - 32.0);
            System.out.printf("Equivalent temperature in Celsius %.2f", celsius);
        }else {
            System.out.print("Enter the temperature in Celsius: ");
            double celsius = sc.nextDouble();
            double fahrenheit = celsius * 9.0 / 5.0 + 32.0;
            System.out.printf("Equivalent temperature in Fahrenheit %.2f", fahrenheit);
        }
        sc.close();
    }
}
