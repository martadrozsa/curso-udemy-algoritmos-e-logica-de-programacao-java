package exercises.section4ConditionalStructure;

import java.util.Scanner;

// Fazer um programa para ler dois números inteiros, e dizer se um número é múltiplo do outro.
// Os números podem ser digitados em qualquer ordem.

public class Exercise10Multiple {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two integer numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if(num1 % num2 == 0 || num2 % num1 == 0){
            System.out.println("Are multiple");
        }else{
            System.out.println("Are not multiple");
        }
        sc.close();
    }
}
