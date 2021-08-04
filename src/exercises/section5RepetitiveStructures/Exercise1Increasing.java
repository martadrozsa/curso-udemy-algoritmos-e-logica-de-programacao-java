package exercises.section5RepetitiveStructures;

import java.util.Scanner;

// Leia uma quantidade indeterminada de duplas de valores inteiros X e Y.
// Escreva para cada X e Y uma mensagem que indique se estes valores foram digitados em ordem crescente ou decrescente.
// O programa deve finalizar quando forem digitados dois valores iguais.

public class Exercise1Increasing {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        while(num1 != num2){
            if(num1 > num2){
                System.out.println("Decreasing");
            }else {
                System.out.println("Increasing");
            }
            System.out.print("Enter two numbers: ");
            num1 = sc.nextInt();
            num2 = sc.nextInt();
        }
        sc.close();
    }
}
