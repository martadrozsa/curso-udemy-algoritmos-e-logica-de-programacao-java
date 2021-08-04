package exercises.section5RepetitiveStructures;

import java.util.Scanner;

// Escreva um programa que repita a leitura de uma senha até que ela seja válida.
// Para cada leitura de senha incorreta informada, escrever a mensagem "Senha Invalida! Tente novamente:".
// Quando a senha for informada corretamente deve ser impressa a mensagem "Acesso Permitido" e o algoritmo encerrado.
// Considere que a senha correta é o valor 2002.

public class Exercise3Password {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the password: ");
        int password = sc.nextInt();

        int fixedPassword = 2002;

        while(password != fixedPassword){
            System.out.print("Enter the password: ");
            password = sc.nextInt();
        }
        System.out.println("Access allowed");
    }
}
