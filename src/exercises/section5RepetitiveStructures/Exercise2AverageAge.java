package exercises.section5RepetitiveStructures;

import java.util.Scanner;

// Faça um programa para ler um número indeterminado de dados, contendo cada um, a idade de um indivíduo.
// O último dado, que não entrará nos cálculos, contém um valor de idade negativa.
// Calcular e imprimir a idade média deste grupo de indivíduos.
// Se for entrado um valor negativo na primeira vez, mostrar a mensagem "IMPOSSIVEL CALCULAR".

public class Exercise2AverageAge {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the ages: ");
        int age = sc.nextInt();

        if (age < 0){
            System.out.println("It is not possible to calculate");
        }else{
            int count = 0;
            double totalAge = 0;
            while(age >= 0){
                totalAge = totalAge + age;
                count++;
                age = sc.nextInt();
            }
            double media = totalAge / count;
            System.out.printf("Average = %.2f", media);
        }
        sc.close();
    }
}
