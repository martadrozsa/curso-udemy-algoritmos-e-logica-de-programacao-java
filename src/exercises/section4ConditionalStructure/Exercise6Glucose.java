package exercises.section4ConditionalStructure;

import java.util.Locale;
import java.util.Scanner;

// Fazer um programa para ler a quantidade de glicose no sangue de uma pessoa e depois mostrar na tela a classificação desta glicose de acordo com a tabela de referência.

/*      Classificação         Glicose
        Normal              Até 100 mg/dl
        Elevado             Maior que 100 até 140 mg/dl
        Diabetes            Maior de 140 mg/dl
*/


public class Exercise6Glucose {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the glucose measurement: ");
        double glucose  = sc.nextDouble();

        if(glucose <= 100){
            System.out.println("Classification: normal");
        }else if(glucose <= 140){
            System.out.println("Classification: high");
        }else{
            System.out.println("Classification: diabetes");
        }
        sc.close();
    }
}
