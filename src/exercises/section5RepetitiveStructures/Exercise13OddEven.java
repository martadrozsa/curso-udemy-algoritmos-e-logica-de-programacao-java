package exercises.section5RepetitiveStructures;

import java.util.Scanner;

// Leia um valor inteiro N. Este valor será a quantidade de números inteiros que serão lidos em seguida.
// Para cada valor lido, mostre uma mensagem dizendo se este valor lido é PAR ou IMPAR, e também se é POSITIVO ou NEGATIVO.
// No caso do valor ser igual a zero (0), seu programa deverá imprimir apenas NULO.

public class Exercise13OddEven {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers will you enter? ");
        int x = sc.nextInt();

        for (int i = 0; i < x; i++) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            if (num % 2 == 0 && num > 0) {
                System.out.println("Positive even number");
            }
            else if (num % 2 == 0 && num < 0) {
                System.out.println("Negative even number");
            }
            else if (num % 2 != 0 && num > 0) {
                System.out.println("Positive odd number");
            }
            else if (num % 2 != 0 && num < 0){
                System.out.println("Negative odd number");
            }
            else if (num == 0){
                System.out.println("Null");
            }
        }
        sc.close();
    }
}
